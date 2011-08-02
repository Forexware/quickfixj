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

import quickfix.CharField;


public class ExDestinationIDSource extends CharField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 1133;
    public static final char BIC = 'B';
    public static final char GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = 'C';
    public static final char PROPRIETARY = 'D';
    public static final char ISO_COUNTRY_CODE = 'E';
    public static final char MIC = 'G';

    public ExDestinationIDSource() {
        super(1133);
    }

    public ExDestinationIDSource(char data) {
        super(1133, data);
    }
}
