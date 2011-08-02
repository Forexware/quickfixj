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
package quickfix.fix42;

import quickfix.Group;
import quickfix.Message;


public class MessageFactory implements quickfix.MessageFactory {
    public Message create(String beginString, String msgType) {
        if (quickfix.fix42.Heartbeat.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Heartbeat();
        }

        if (quickfix.fix42.Logon.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Logon();
        }

        if (quickfix.fix42.TestRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.TestRequest();
        }

        if (quickfix.fix42.ResendRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ResendRequest();
        }

        if (quickfix.fix42.Reject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Reject();
        }

        if (quickfix.fix42.SequenceReset.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SequenceReset();
        }

        if (quickfix.fix42.Logout.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Logout();
        }

        if (quickfix.fix42.Advertisement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Advertisement();
        }

        if (quickfix.fix42.IndicationofInterest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.IndicationofInterest();
        }

        if (quickfix.fix42.News.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.News();
        }

        if (quickfix.fix42.Email.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Email();
        }

        if (quickfix.fix42.QuoteRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.QuoteRequest();
        }

        if (quickfix.fix42.Quote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Quote();
        }

        if (quickfix.fix42.MassQuote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.MassQuote();
        }

        if (quickfix.fix42.QuoteCancel.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.QuoteCancel();
        }

        if (quickfix.fix42.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.QuoteStatusRequest();
        }

        if (quickfix.fix42.QuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.QuoteAcknowledgement();
        }

        if (quickfix.fix42.MarketDataRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.MarketDataRequest();
        }

        if (quickfix.fix42.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.MarketDataSnapshotFullRefresh();
        }

        if (quickfix.fix42.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.MarketDataIncrementalRefresh();
        }

        if (quickfix.fix42.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.MarketDataRequestReject();
        }

        if (quickfix.fix42.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SecurityDefinitionRequest();
        }

        if (quickfix.fix42.SecurityDefinition.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SecurityDefinition();
        }

        if (quickfix.fix42.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SecurityStatusRequest();
        }

        if (quickfix.fix42.SecurityStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SecurityStatus();
        }

        if (quickfix.fix42.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.TradingSessionStatusRequest();
        }

        if (quickfix.fix42.TradingSessionStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.TradingSessionStatus();
        }

        if (quickfix.fix42.NewOrderSingle.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.NewOrderSingle();
        }

        if (quickfix.fix42.ExecutionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ExecutionReport();
        }

        if (quickfix.fix42.DontKnowTrade.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.DontKnowTrade();
        }

        if (quickfix.fix42.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.OrderCancelReplaceRequest();
        }

        if (quickfix.fix42.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.OrderCancelRequest();
        }

        if (quickfix.fix42.OrderCancelReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.OrderCancelReject();
        }

        if (quickfix.fix42.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.OrderStatusRequest();
        }

        if (quickfix.fix42.Allocation.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.Allocation();
        }

        if (quickfix.fix42.AllocationACK.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.AllocationACK();
        }

        if (quickfix.fix42.SettlementInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.SettlementInstructions();
        }

        if (quickfix.fix42.BidRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.BidRequest();
        }

        if (quickfix.fix42.BidResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.BidResponse();
        }

        if (quickfix.fix42.NewOrderList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.NewOrderList();
        }

        if (quickfix.fix42.ListStrikePrice.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ListStrikePrice();
        }

        if (quickfix.fix42.ListStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ListStatus();
        }

        if (quickfix.fix42.ListExecute.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ListExecute();
        }

        if (quickfix.fix42.ListCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ListCancelRequest();
        }

        if (quickfix.fix42.ListStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.ListStatusRequest();
        }

        if (quickfix.fix42.BusinessMessageReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix42.BusinessMessageReject();
        }

        return new quickfix.fix42.Message();
    }

    public Group create(String beginString, String msgType,
        int correspondingFieldID) {
        if (quickfix.fix42.Logon.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMsgTypes.FIELD:
                return new quickfix.fix42.Logon.NoMsgTypes();
            }
        }

        if (quickfix.fix42.IndicationofInterest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoIOIQualifiers.FIELD:
                return new quickfix.fix42.IndicationofInterest.NoIOIQualifiers();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix42.IndicationofInterest.NoRoutingIDs();
            }
        }

        if (quickfix.fix42.News.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix42.News.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.News.NoRelatedSym();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix42.News.LinesOfText();
            }
        }

        if (quickfix.fix42.Email.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix42.Email.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.Email.NoRelatedSym();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix42.Email.LinesOfText();
            }
        }

        if (quickfix.fix42.QuoteRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.QuoteRequest.NoRelatedSym();
            }
        }

        if (quickfix.fix42.MassQuote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix42.MassQuote.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix42.MassQuote.NoQuoteSets.NoQuoteEntries();
            }
        }

        if (quickfix.fix42.QuoteCancel.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix42.QuoteCancel.NoQuoteEntries();
            }
        }

        if (quickfix.fix42.QuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix42.QuoteAcknowledgement.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix42.QuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
            }
        }

        if (quickfix.fix42.MarketDataRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntryTypes.FIELD:
                return new quickfix.fix42.MarketDataRequest.NoMDEntryTypes();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.MarketDataRequest.NoRelatedSym();
            }
        }

        if (quickfix.fix42.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix42.MarketDataSnapshotFullRefresh.NoMDEntries();
            }
        }

        if (quickfix.fix42.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix42.MarketDataIncrementalRefresh.NoMDEntries();
            }
        }

        if (quickfix.fix42.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.SecurityDefinitionRequest.NoRelatedSym();
            }
        }

        if (quickfix.fix42.SecurityDefinition.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix42.SecurityDefinition.NoRelatedSym();
            }
        }

        if (quickfix.fix42.NewOrderSingle.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix42.NewOrderSingle.NoAllocs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix42.NewOrderSingle.NoTradingSessions();
            }
        }

        if (quickfix.fix42.ExecutionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoContraBrokers.FIELD:
                return new quickfix.fix42.ExecutionReport.NoContraBrokers();
            }
        }

        if (quickfix.fix42.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix42.OrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix42.OrderCancelReplaceRequest.NoTradingSessions();
            }
        }

        if (quickfix.fix42.Allocation.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix42.Allocation.NoOrders();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix42.Allocation.NoExecs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix42.Allocation.NoAllocs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix42.Allocation.NoAllocs.NoMiscFees();
            }
        }

        if (quickfix.fix42.BidRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidDescriptors.FIELD:
                return new quickfix.fix42.BidRequest.NoBidDescriptors();

            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix42.BidRequest.NoBidComponents();
            }
        }

        if (quickfix.fix42.BidResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix42.BidResponse.NoBidComponents();
            }
        }

        if (quickfix.fix42.NewOrderList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix42.NewOrderList.NoOrders();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix42.NewOrderList.NoOrders.NoAllocs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix42.NewOrderList.NoOrders.NoTradingSessions();
            }
        }

        if (quickfix.fix42.ListStrikePrice.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoStrikes.FIELD:
                return new quickfix.fix42.ListStrikePrice.NoStrikes();
            }
        }

        if (quickfix.fix42.ListStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix42.ListStatus.NoOrders();
            }
        }

        return null;
    }
}
