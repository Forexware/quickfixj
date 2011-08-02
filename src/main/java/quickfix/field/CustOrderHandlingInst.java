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

import quickfix.StringField;


public class CustOrderHandlingInst extends StringField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 1031;
    public static final String ADD_ON_ORDER = "ADD";
    public static final String ALL_OR_NONE = "AON";
    public static final String CASH_NOT_HELD = "CNH";
    public static final String DIRECTED_ORDER = "DIR";
    public static final String EXCHANGE_FOR_PHYSICAL_TRANSACTION = "E.W";
    public static final String FILL_OR_KILL = "FOK";
    public static final String IMBALANCE_ONLY = "IO";
    public static final String IMMEDIATE_OR_CANCEL = "IOC";
    public static final String LIMIT_ON_OPEN = "LOO";
    public static final String LIMIT_ON_CLOSE = "LOC";
    public static final String MARKET_AT_OPEN = "MAO";
    public static final String MARKET_AT_CLOSE = "MAC";
    public static final String MARKET_ON_OPEN = "MOO";
    public static final String MARKET_ON_CLOSE = "MOC";
    public static final String MINIMUM_QUANTITY = "MQT";
    public static final String NOT_HELD = "NH";
    public static final String OVER_THE_DAY = "OVD";
    public static final String PEGGED = "PEG";
    public static final String RESERVE_SIZE_ORDER = "RSV";
    public static final String STOP_STOCK_TRANSACTION = "S.W";
    public static final String SCALE = "SCL";
    public static final String TIME_ORDER = "TMO";
    public static final String TRAILING_STOP = "TS";
    public static final String WORK = "WRK";

    public CustOrderHandlingInst() {
        super(1031);
    }

    public CustOrderHandlingInst(String data) {
        super(1031, data);
    }
}
