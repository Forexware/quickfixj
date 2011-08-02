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
package quickfix.field;

import quickfix.IntField;


public class TradeReportType extends IntField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 856;
    public static final int SUBMIT = 0;
    public static final int ALLEGED = 1;
    public static final int ACCEPT = 2;
    public static final int DECLINE = 3;
    public static final int ADDENDUM = 4;
    public static final int NO_WAS = 5;
    public static final int TRADE_REPORT_CANCEL = 6;
    public static final int LOCKED_IN_TRADE_BREAK = 7;
    public static final int DEFAULTED = 8;
    public static final int INVALID_CMTA = 9;
    public static final int PENDED = 10;
    public static final int ALLEGED_NEW = 11;
    public static final int ALLEGED_ADDENDUM = 12;
    public static final int ALLEGED_NO_WAS = 13;
    public static final int ALLEGED_TRADE_REPORT_CANCEL = 14;
    public static final int ALLEGED2 = 15;

    public TradeReportType() {
        super(856);
    }

    public TradeReportType(int data) {
        super(856, data);
    }
}
