/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 *
 * This file is part of the QuickFIX FIX Engine 
 *
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import javax.sql.DataSource;
import java.sql.*;

class JdbcUtil {

    static void close(SessionID sessionID, Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }

    static void close(SessionID sessionID, PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }

    static void close(SessionID sessionID, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }


    static boolean determineSessionIdSupport(DataSource dataSource, String tableName) throws SQLException {
        Connection connection = dataSource.getConnection();
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            String columnName = "sendersubid";
            return isColumn(metaData, tableName.toUpperCase(), columnName.toUpperCase())
                    || isColumn(metaData, tableName, columnName);
        } finally {
            connection.close();
        }
    }


    private static boolean isColumn(DatabaseMetaData metaData, String tableName, String columnName)
            throws SQLException {
        ResultSet columns = metaData.getColumns(null, null, tableName, columnName);
        try {
            return columns.next();
        } finally {
            columns.close();
        }
    }

    static String getIDWhereClause(boolean isExtendedSessionID) {
        return isExtendedSessionID
                ? ("beginstring=? and sendercompid=? and sendersubid=? and senderlocid=? and "
                + "targetcompid=? and targetsubid=? and targetlocid=? and session_qualifier=? ")
                : "beginstring=? and sendercompid=? and targetcompid=? and session_qualifier=? ";

    }

    static String getIDColumns(boolean isExtendedSessionID) {
        return isExtendedSessionID
                ? "beginstring,sendercompid,sendersubid,senderlocid,targetcompid,targetsubid,targetlocid,session_qualifier"
                : "beginstring,sendercompid,targetcompid,session_qualifier";

    }

    static String getIDPlaceholders(boolean isExtendedSessionID) {
        return isExtendedSessionID ? "?,?,?,?,?,?,?,?" : "?,?,?,?";

    }

    static int setSessionIdParameters(SessionID sessionID, PreparedStatement query, int offset, boolean isExtendedSessionID, String defaultSqlValue) throws SQLException {
        if (isExtendedSessionID) {
            query.setString(offset++, getSqlValue(sessionID.getBeginString(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderSubID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderLocationID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetSubID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetLocationID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSessionQualifier(), defaultSqlValue));
        } else {
            query.setString(offset++, getSqlValue(sessionID.getBeginString(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSessionQualifier(), defaultSqlValue));
        }
        return offset;
    }

    private static String getSqlValue(String javaValue, String defaultSqlValue) {
        return !SessionID.NOT_SET.equals(javaValue) ? javaValue : defaultSqlValue;
    }

}