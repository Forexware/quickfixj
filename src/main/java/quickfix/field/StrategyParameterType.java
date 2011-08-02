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


public class StrategyParameterType extends IntField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 959;
    public static final int INT = 1;
    public static final int LENGTH = 2;
    public static final int NUMINGROUP = 3;
    public static final int SEQNUM = 4;
    public static final int TAGNUM = 5;
    public static final int FLOAT = 6;
    public static final int QTY = 7;
    public static final int PRICE = 8;
    public static final int PRICEOFFSET = 9;
    public static final int AMT = 10;
    public static final int PERCENTAGE = 11;
    public static final int CHAR = 12;
    public static final int BOOLEAN = 13;
    public static final int STRING = 14;
    public static final int MULTIPLECHARVALUE = 15;
    public static final int CURRENCY = 16;
    public static final int EXCHANGE = 17;
    public static final int MONTH_YEAR = 18;
    public static final int UTCTIMESTAMP = 19;
    public static final int UTCTIMEONLY = 20;
    public static final int LOCALMKTTIME = 21;
    public static final int UTCDATE = 22;
    public static final int DATA = 23;
    public static final int MULTIPLESTRINGVALUE = 24;

    public StrategyParameterType() {
        super(959);
    }

    public StrategyParameterType(int data) {
        super(959, data);
    }
}
