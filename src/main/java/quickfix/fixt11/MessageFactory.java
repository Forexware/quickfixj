/* -*- Generated Java -*- */
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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory
{
  public Message create( String beginString, String msgType ) {
  
       if(quickfix.fixt11.Heartbeat.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.Heartbeat();
       }
     
       if(quickfix.fixt11.TestRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.TestRequest();
       }
     
       if(quickfix.fixt11.ResendRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.ResendRequest();
       }
     
       if(quickfix.fixt11.Reject.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.Reject();
       }
     
       if(quickfix.fixt11.SequenceReset.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.SequenceReset();
       }
     
       if(quickfix.fixt11.Logout.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.Logout();
       }
     
       if(quickfix.fixt11.Logon.MSGTYPE.equals(msgType)) {
         return new quickfix.fixt11.Logon();
       }
     
  return new quickfix.fixt11.Message();
  }

     public Group create(String beginString, String msgType, int correspondingFieldID) {
         
       if(quickfix.fixt11.Logon.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.NoMsgTypes.FIELD:
                return new quickfix.fixt11.Logon.NoMsgTypes();
		 
         }
       }
     
        return null;
     }
}

  