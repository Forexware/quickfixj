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

/**
 * Class for storing JDBC setting constants shared by both the log and message
 * store classes.
 *  
 */
public class JdbcSetting {
    /**
     * Defines the table name for the messages table. Default is "messages".
     * If you use a different name, you must set up your database accordingly.
     */
    public static final String SETTING_JDBC_STORE_MESSAGES_TABLE_NAME = "JdbcStoreMessagesTableName";

    /**
     * Defines the table name for the session table. Default is "sessions".
     * If you use a different name, you must set up your database accordingly.
     */
    public static final String SETTING_JDBC_STORE_SESSIONS_TABLE_NAME = "JdbcStoreSessionsTableName";

    /**
     * Flag for controlling logging of heartbeat messages.
     */
    public static final String SETTING_JDBC_LOG_HEARTBEATS = "JdbcLogHeartBeats";

    /**
     * Specifies name of table for logging outgoing messages
     */
    public static final String SETTING_LOG_OUTGOING_TABLE = "JdbcLogOutgoingTable";
    
    /**
     * Specifies name of table for logging incoming messages
     */
    public static final String SETTING_LOG_INCOMING_TABLE = "JdbcLogIncomingTable";
    
    /**
     * Specifies name of table for logging events
     */
    public static final String SETTING_LOG_EVENT_TABLE = "JdbcLogEventTable";
    
    /**
     * Specified the default value for session ID properties that have not been set. This
     * is primarily for Oracle which treats empty strings as SQL NULLs.
     */
    public static final String SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE = "JdbcSessionIdDefaultPropertyValue";
}