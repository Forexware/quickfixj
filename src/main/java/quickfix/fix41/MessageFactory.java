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
package quickfix.fix41;

import quickfix.Group;
import quickfix.Message;


public class MessageFactory implements quickfix.MessageFactory {
    public Message create(String beginString, String msgType) {
        if (quickfix.fix41.Heartbeat.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Heartbeat();
        }

        if (quickfix.fix41.Logon.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Logon();
        }

        if (quickfix.fix41.TestRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.TestRequest();
        }

        if (quickfix.fix41.ResendRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ResendRequest();
        }

        if (quickfix.fix41.Reject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Reject();
        }

        if (quickfix.fix41.SequenceReset.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.SequenceReset();
        }

        if (quickfix.fix41.Logout.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Logout();
        }

        if (quickfix.fix41.Advertisement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Advertisement();
        }

        if (quickfix.fix41.IndicationofInterest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.IndicationofInterest();
        }

        if (quickfix.fix41.News.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.News();
        }

        if (quickfix.fix41.Email.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Email();
        }

        if (quickfix.fix41.QuoteRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.QuoteRequest();
        }

        if (quickfix.fix41.Quote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Quote();
        }

        if (quickfix.fix41.NewOrderSingle.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.NewOrderSingle();
        }

        if (quickfix.fix41.ExecutionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ExecutionReport();
        }

        if (quickfix.fix41.DontKnowTrade.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.DontKnowTrade();
        }

        if (quickfix.fix41.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.OrderCancelReplaceRequest();
        }

        if (quickfix.fix41.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.OrderCancelRequest();
        }

        if (quickfix.fix41.OrderCancelReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.OrderCancelReject();
        }

        if (quickfix.fix41.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.OrderStatusRequest();
        }

        if (quickfix.fix41.Allocation.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.Allocation();
        }

        if (quickfix.fix41.AllocationACK.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.AllocationACK();
        }

        if (quickfix.fix41.SettlementInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.SettlementInstructions();
        }

        if (quickfix.fix41.NewOrderList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.NewOrderList();
        }

        if (quickfix.fix41.ListStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ListStatus();
        }

        if (quickfix.fix41.ListExecute.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ListExecute();
        }

        if (quickfix.fix41.ListCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ListCancelRequest();
        }

        if (quickfix.fix41.ListStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix41.ListStatusRequest();
        }

        return new quickfix.fix41.Message();
    }

    public Group create(String beginString, String msgType,
        int correspondingFieldID) {
        if (quickfix.fix41.IndicationofInterest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoIOIQualifiers.FIELD:
                return new quickfix.fix41.IndicationofInterest.NoIOIQualifiers();
            }
        }

        if (quickfix.fix41.News.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix41.News.NoRelatedSym();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix41.News.LinesOfText();
            }
        }

        if (quickfix.fix41.Email.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix41.Email.NoRelatedSym();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix41.Email.LinesOfText();
            }
        }

        if (quickfix.fix41.Allocation.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix41.Allocation.NoOrders();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix41.Allocation.NoExecs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix41.Allocation.NoAllocs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix41.Allocation.NoAllocs.NoMiscFees();
            }
        }

        if (quickfix.fix41.ListStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix41.ListStatus.NoOrders();
            }
        }

        return null;
    }
}
