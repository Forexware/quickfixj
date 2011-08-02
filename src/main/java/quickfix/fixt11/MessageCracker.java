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
package quickfix.fixt11;

import quickfix.*;

import quickfix.field.*;


public class MessageCracker extends quickfix.fix50.MessageCracker {
    /**
     * Callback for quickfix.Message message
     *
     * @param message
     * @param sessionID
     *
     * @throws FieldNotFound
     * @throws UnsupportedMessageType
     * @throws IncorrectTagValue
     */
    public void onMessage(quickfix.Message message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXHeartbeat message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Heartbeat message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXTestRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(TestRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXResendRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ResendRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXReject message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Reject message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXSequenceReset message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SequenceReset message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXLogout message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Logout message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXLogon message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Logon message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    public void crack(quickfix.Message message, SessionID sessionID)
        throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
        crack11((Message) message, sessionID);
    }

    /**
     * Cracker method for 11 messages
     *
     * @throws FieldNotFound
     * @throws UnsupportedMessageType
     * @throws IncorrectTagValue
     */
    public void crack11(Message message, SessionID sessionID)
        throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
        MsgType msgType = new MsgType();
        message.getHeader().getField(msgType);

        String msgTypeValue = msgType.getValue();

        if (msgTypeValue.equals(Heartbeat.MSGTYPE)) {
            onMessage((Heartbeat) message, sessionID);
        } else if (msgTypeValue.equals(TestRequest.MSGTYPE)) {
            onMessage((TestRequest) message, sessionID);
        } else if (msgTypeValue.equals(ResendRequest.MSGTYPE)) {
            onMessage((ResendRequest) message, sessionID);
        } else if (msgTypeValue.equals(Reject.MSGTYPE)) {
            onMessage((Reject) message, sessionID);
        } else if (msgTypeValue.equals(SequenceReset.MSGTYPE)) {
            onMessage((SequenceReset) message, sessionID);
        } else if (msgTypeValue.equals(Logout.MSGTYPE)) {
            onMessage((Logout) message, sessionID);
        } else if (msgTypeValue.equals(Logon.MSGTYPE)) {
            onMessage((Logon) message, sessionID);
        } else {
            onMessage(message, sessionID);
        }
    }
}
