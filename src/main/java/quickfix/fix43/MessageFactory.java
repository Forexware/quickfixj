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
package quickfix.fix43;

import quickfix.Group;
import quickfix.Message;


public class MessageFactory implements quickfix.MessageFactory {
    public Message create(String beginString, String msgType) {
        if (quickfix.fix43.Heartbeat.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Heartbeat();
        }

        if (quickfix.fix43.Logon.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Logon();
        }

        if (quickfix.fix43.TestRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.TestRequest();
        }

        if (quickfix.fix43.ResendRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ResendRequest();
        }

        if (quickfix.fix43.Reject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Reject();
        }

        if (quickfix.fix43.SequenceReset.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SequenceReset();
        }

        if (quickfix.fix43.Logout.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Logout();
        }

        if (quickfix.fix43.BusinessMessageReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.BusinessMessageReject();
        }

        if (quickfix.fix43.Advertisement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Advertisement();
        }

        if (quickfix.fix43.IndicationOfInterest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.IndicationOfInterest();
        }

        if (quickfix.fix43.News.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.News();
        }

        if (quickfix.fix43.Email.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Email();
        }

        if (quickfix.fix43.QuoteRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.QuoteRequest();
        }

        if (quickfix.fix43.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.QuoteRequestReject();
        }

        if (quickfix.fix43.RFQRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.RFQRequest();
        }

        if (quickfix.fix43.Quote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Quote();
        }

        if (quickfix.fix43.QuoteCancel.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.QuoteCancel();
        }

        if (quickfix.fix43.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.QuoteStatusRequest();
        }

        if (quickfix.fix43.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.QuoteStatusReport();
        }

        if (quickfix.fix43.MassQuote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MassQuote();
        }

        if (quickfix.fix43.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MassQuoteAcknowledgement();
        }

        if (quickfix.fix43.MarketDataRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MarketDataRequest();
        }

        if (quickfix.fix43.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MarketDataSnapshotFullRefresh();
        }

        if (quickfix.fix43.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MarketDataIncrementalRefresh();
        }

        if (quickfix.fix43.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.MarketDataRequestReject();
        }

        if (quickfix.fix43.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityDefinitionRequest();
        }

        if (quickfix.fix43.SecurityDefinition.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityDefinition();
        }

        if (quickfix.fix43.SecurityTypeRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityTypeRequest();
        }

        if (quickfix.fix43.SecurityTypes.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityTypes();
        }

        if (quickfix.fix43.SecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityListRequest();
        }

        if (quickfix.fix43.SecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityList();
        }

        if (quickfix.fix43.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.DerivativeSecurityListRequest();
        }

        if (quickfix.fix43.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.DerivativeSecurityList();
        }

        if (quickfix.fix43.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityStatusRequest();
        }

        if (quickfix.fix43.SecurityStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SecurityStatus();
        }

        if (quickfix.fix43.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.TradingSessionStatusRequest();
        }

        if (quickfix.fix43.TradingSessionStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.TradingSessionStatus();
        }

        if (quickfix.fix43.NewOrderSingle.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.NewOrderSingle();
        }

        if (quickfix.fix43.ExecutionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ExecutionReport();
        }

        if (quickfix.fix43.DontKnowTrade.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.DontKnowTrade();
        }

        if (quickfix.fix43.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderCancelReplaceRequest();
        }

        if (quickfix.fix43.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderCancelRequest();
        }

        if (quickfix.fix43.OrderCancelReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderCancelReject();
        }

        if (quickfix.fix43.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderStatusRequest();
        }

        if (quickfix.fix43.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderMassCancelRequest();
        }

        if (quickfix.fix43.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderMassCancelReport();
        }

        if (quickfix.fix43.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.OrderMassStatusRequest();
        }

        if (quickfix.fix43.NewOrderCross.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.NewOrderCross();
        }

        if (quickfix.fix43.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix43.CrossOrderCancelReplaceRequest();
        }

        if (quickfix.fix43.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.CrossOrderCancelRequest();
        }

        if (quickfix.fix43.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.NewOrderMultileg();
        }

        if (quickfix.fix43.MultilegOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix43.MultilegOrderCancelReplaceRequest();
        }

        if (quickfix.fix43.BidRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.BidRequest();
        }

        if (quickfix.fix43.BidResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.BidResponse();
        }

        if (quickfix.fix43.NewOrderList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.NewOrderList();
        }

        if (quickfix.fix43.ListStrikePrice.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ListStrikePrice();
        }

        if (quickfix.fix43.ListExecute.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ListExecute();
        }

        if (quickfix.fix43.ListCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ListCancelRequest();
        }

        if (quickfix.fix43.ListStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ListStatusRequest();
        }

        if (quickfix.fix43.ListStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.ListStatus();
        }

        if (quickfix.fix43.Allocation.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.Allocation();
        }

        if (quickfix.fix43.AllocationACK.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.AllocationACK();
        }

        if (quickfix.fix43.SettlementInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.SettlementInstructions();
        }

        if (quickfix.fix43.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.TradeCaptureReportRequest();
        }

        if (quickfix.fix43.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.TradeCaptureReport();
        }

        if (quickfix.fix43.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix43.RegistrationInstructions();
        }

        if (quickfix.fix43.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix43.RegistrationInstructionsResponse();
        }

        return new quickfix.fix43.Message();
    }

    public Group create(String beginString, String msgType,
        int correspondingFieldID) {
        if (quickfix.fix43.Logon.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMsgTypes.FIELD:
                return new quickfix.fix43.Logon.NoMsgTypes();
            }
        }

        if (quickfix.fix43.Advertisement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.Advertisement.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.IndicationOfInterest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoIOIQualifiers.FIELD:
                return new quickfix.fix43.IndicationOfInterest.NoIOIQualifiers();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix43.IndicationOfInterest.NoRoutingIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.IndicationOfInterest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.News.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix43.News.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.News.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.News.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix43.News.LinesOfText();
            }
        }

        if (quickfix.fix43.Email.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix43.Email.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.Email.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.Email.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix43.Email.LinesOfText();
            }
        }

        if (quickfix.fix43.QuoteRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.QuoteRequest.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.QuoteRequest.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.QuoteRequest.NoRelatedSym.NoStipulations();
            }
        }

        if (quickfix.fix43.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.QuoteRequestReject.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.QuoteRequestReject.NoRelatedSym.NoStipulations();
            }
        }

        if (quickfix.fix43.RFQRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.RFQRequest.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.RFQRequest.NoRelatedSym.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.Quote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.Quote.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.Quote.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.QuoteCancel.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix43.QuoteCancel.NoQuoteEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.QuoteCancel.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.QuoteCancel.NoPartyIDs();
            }
        }

        if (quickfix.fix43.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.QuoteStatusRequest.NoSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.QuoteStatusRequest.NoPartyIDs();
            }
        }

        if (quickfix.fix43.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.QuoteStatusReport.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.QuoteStatusReport.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.MassQuote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix43.MassQuote.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix43.MassQuote.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.MassQuote.NoPartyIDs();
            }
        }

        if (quickfix.fix43.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.MassQuoteAcknowledgement.NoPartyIDs();
            }
        }

        if (quickfix.fix43.MarketDataRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntryTypes.FIELD:
                return new quickfix.fix43.MarketDataRequest.NoMDEntryTypes();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.MarketDataRequest.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MarketDataRequest.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.MarketDataRequest.NoTradingSessions();
            }
        }

        if (quickfix.fix43.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix43.MarketDataSnapshotFullRefresh.NoMDEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MarketDataSnapshotFullRefresh.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix43.MarketDataIncrementalRefresh.NoMDEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.SecurityDefinitionRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityDefinitionRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityDefinition.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.SecurityDefinition.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityDefinition.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityDefinition.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityTypes.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityTypes.FIELD:
                return new quickfix.fix43.SecurityTypes.NoSecurityTypes();
            }
        }

        if (quickfix.fix43.SecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityListRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.SecurityList.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.SecurityList.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityList.NoRelatedSym.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix43.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.DerivativeSecurityList.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityStatusRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.SecurityStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.SecurityStatus.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.NewOrderSingle.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.NewOrderSingle.NoStipulations();
            }
        }

        if (quickfix.fix43.ExecutionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoContraBrokers.FIELD:
                return new quickfix.fix43.ExecutionReport.NoContraBrokers();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix43.ExecutionReport.NoContAmts();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.ExecutionReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.ExecutionReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.ExecutionReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.ExecutionReport.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.ExecutionReport.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.ExecutionReport.NoStipulations();
            }
        }

        if (quickfix.fix43.DontKnowTrade.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.DontKnowTrade.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.OrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.OrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.OrderCancelReplaceRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderCancelReplaceRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.OrderCancelRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderCancelRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.OrderStatusRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderStatusRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassCancelRequest.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAffectedOrders.FIELD:
                return new quickfix.fix43.OrderMassCancelReport.NoAffectedOrders();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassCancelReport.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassCancelReport.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix43.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.OrderMassStatusRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassStatusRequest.NoSecurityAltID();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix43.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix43.NewOrderCross.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix43.NewOrderCross.NoSides();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.NewOrderCross.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderCross.NoSides.NoPartyIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.NewOrderCross.NoTradingSessions();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.NewOrderCross.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.NewOrderCross.NoStipulations();
            }
        }

        if (quickfix.fix43.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoStipulations();
            }
        }

        if (quickfix.fix43.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix43.CrossOrderCancelRequest.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.CrossOrderCancelRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.CrossOrderCancelRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoAllocs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoTradingSessions();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.NewOrderMultileg.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.MultilegOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.BidRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidDescriptors.FIELD:
                return new quickfix.fix43.BidRequest.NoBidDescriptors();

            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix43.BidRequest.NoBidComponents();
            }
        }

        if (quickfix.fix43.BidResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix43.BidResponse.NoBidComponents();
            }
        }

        if (quickfix.fix43.NewOrderList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoSecurityAltID();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix43.NewOrderList.NoOrders.NoStipulations();
            }
        }

        if (quickfix.fix43.ListStrikePrice.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoStrikes.FIELD:
                return new quickfix.fix43.ListStrikePrice.NoStrikes();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.ListStrikePrice.NoStrikes.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.ListStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix43.ListStatus.NoOrders();
            }
        }

        if (quickfix.fix43.Allocation.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix43.Allocation.NoOrders();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix43.Allocation.NoExecs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix43.Allocation.NoAllocs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix43.Allocation.NoAllocs.NoMiscFees();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.Allocation.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.Allocation.NoSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.Allocation.NoPartyIDs();
            }
        }

        if (quickfix.fix43.AllocationACK.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.AllocationACK.NoPartyIDs();
            }
        }

        if (quickfix.fix43.SettlementInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.SettlementInstructions.NoPartyIDs();
            }
        }

        if (quickfix.fix43.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoDates.FIELD:
                return new quickfix.fix43.TradeCaptureReportRequest.NoDates();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.TradeCaptureReportRequest.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.TradeCaptureReportRequest.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSides();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSides.NoClearingInstructions();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSides.NoContAmts();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSides.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSides.NoPartyIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix43.TradeCaptureReport.NoSecurityAltID();
            }
        }

        if (quickfix.fix43.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRegistDtls.FIELD:
                return new quickfix.fix43.RegistrationInstructions.NoRegistDtls();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix43.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();

            case quickfix.field.NoDistribInsts.FIELD:
                return new quickfix.fix43.RegistrationInstructions.NoDistribInsts();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.RegistrationInstructions.NoPartyIDs();
            }
        }

        if (quickfix.fix43.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix43.RegistrationInstructionsResponse.NoPartyIDs();
            }
        }

        return null;
    }
}
