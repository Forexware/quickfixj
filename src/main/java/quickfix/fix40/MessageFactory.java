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

package quickfix.fix40;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory
{
  public Message create( String beginString, String msgType ) {
  
       if(quickfix.fix40.Heartbeat.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Heartbeat();
       }
     
       if(quickfix.fix40.Logon.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Logon();
       }
     
       if(quickfix.fix40.TestRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.TestRequest();
       }
     
       if(quickfix.fix40.ResendRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ResendRequest();
       }
     
       if(quickfix.fix40.Reject.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Reject();
       }
     
       if(quickfix.fix40.SequenceReset.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.SequenceReset();
       }
     
       if(quickfix.fix40.Logout.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Logout();
       }
     
       if(quickfix.fix40.Advertisement.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Advertisement();
       }
     
       if(quickfix.fix40.IndicationofInterest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.IndicationofInterest();
       }
     
       if(quickfix.fix40.News.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.News();
       }
     
       if(quickfix.fix40.Email.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Email();
       }
     
       if(quickfix.fix40.QuoteRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.QuoteRequest();
       }
     
       if(quickfix.fix40.Quote.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Quote();
       }
     
       if(quickfix.fix40.NewOrderSingle.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.NewOrderSingle();
       }
     
       if(quickfix.fix40.ExecutionReport.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ExecutionReport();
       }
     
       if(quickfix.fix40.DontKnowTrade.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.DontKnowTrade();
       }
     
       if(quickfix.fix40.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.OrderCancelReplaceRequest();
       }
     
       if(quickfix.fix40.OrderCancelRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.OrderCancelRequest();
       }
     
       if(quickfix.fix40.OrderCancelReject.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.OrderCancelReject();
       }
     
       if(quickfix.fix40.OrderStatusRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.OrderStatusRequest();
       }
     
       if(quickfix.fix40.Allocation.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.Allocation();
       }
     
       if(quickfix.fix40.AllocationACK.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.AllocationACK();
       }
     
       if(quickfix.fix40.NewOrderList.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.NewOrderList();
       }
     
       if(quickfix.fix40.ListStatus.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ListStatus();
       }
     
       if(quickfix.fix40.ListExecute.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ListExecute();
       }
     
       if(quickfix.fix40.ListCancelRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ListCancelRequest();
       }
     
       if(quickfix.fix40.ListStatusRequest.MSGTYPE.equals(msgType)) {
         return new quickfix.fix40.ListStatusRequest();
       }
     
  return new quickfix.fix40.Message();
  }

     public Group create(String beginString, String msgType, int correspondingFieldID) {
         
       if(quickfix.fix40.News.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix40.News.LinesOfText();
		 
         }
       }
     
       if(quickfix.fix40.Email.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix40.Email.LinesOfText();
		 
         }
       }
     
       if(quickfix.fix40.ExecutionReport.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix40.ExecutionReport.NoMiscFees();
		 
         }
       }
     
       if(quickfix.fix40.Allocation.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix40.Allocation.NoOrders();
		 
           case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix40.Allocation.NoExecs();
		 
           case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix40.Allocation.NoMiscFees();
		 
           case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix40.Allocation.NoAllocs();
		 
           case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix40.Allocation.NoAllocs.NoDlvyInst();
		 
         }
       }
     
       if(quickfix.fix40.ListStatus.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         
           case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix40.ListStatus.NoOrders();
		 
         }
       }
     
        return null;
     }
}

  