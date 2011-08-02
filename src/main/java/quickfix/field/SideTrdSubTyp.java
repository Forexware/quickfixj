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


public class SideTrdSubTyp extends IntField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 1008;
    public static final int CMTA = 0;
    public static final int INTERNAL_TRANSFER = 1;
    public static final int EXTERNAL_TRANSFER = 2;
    public static final int REJECT_FOR_SUBMITTING_TRADE = 3;
    public static final int ADVISORY_FOR_CONTRA_SIDE = 4;
    public static final int OFFSET_DUE_TO_AN_ALLOCATION = 5;
    public static final int ONSET_DUE_TO_AN_ALLOCATION = 6;
    public static final int DIFFERENTIAL_SPREAD = 7;
    public static final int IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = 8;
    public static final int TRANSACTION_FROM_EXERCISE = 9;
    public static final int TRANSACTION_FROM_ASSIGNMENT = 10;

    public SideTrdSubTyp() {
        super(1008);
    }

    public SideTrdSubTyp(int data) {
        super(1008, data);
    }
}
