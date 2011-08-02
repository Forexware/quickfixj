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
package quickfix.fix50;

import quickfix.Group;
import quickfix.Message;


public class MessageFactory implements quickfix.MessageFactory {
    public Message create(String beginString, String msgType) {
        if (quickfix.fix50.BusinessMessageReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.BusinessMessageReject();
        }

        if (quickfix.fix50.UserRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.UserRequest();
        }

        if (quickfix.fix50.UserResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.UserResponse();
        }

        if (quickfix.fix50.Advertisement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.Advertisement();
        }

        if (quickfix.fix50.News.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.News();
        }

        if (quickfix.fix50.Email.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.Email();
        }

        if (quickfix.fix50.QuoteRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteRequest();
        }

        if (quickfix.fix50.QuoteResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteResponse();
        }

        if (quickfix.fix50.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteRequestReject();
        }

        if (quickfix.fix50.RFQRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.RFQRequest();
        }

        if (quickfix.fix50.Quote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.Quote();
        }

        if (quickfix.fix50.QuoteCancel.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteCancel();
        }

        if (quickfix.fix50.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteStatusRequest();
        }

        if (quickfix.fix50.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.QuoteStatusReport();
        }

        if (quickfix.fix50.MassQuote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MassQuote();
        }

        if (quickfix.fix50.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MassQuoteAcknowledgement();
        }

        if (quickfix.fix50.MarketDataRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MarketDataRequest();
        }

        if (quickfix.fix50.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MarketDataSnapshotFullRefresh();
        }

        if (quickfix.fix50.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MarketDataIncrementalRefresh();
        }

        if (quickfix.fix50.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MarketDataRequestReject();
        }

        if (quickfix.fix50.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityDefinitionRequest();
        }

        if (quickfix.fix50.SecurityDefinition.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityDefinition();
        }

        if (quickfix.fix50.SecurityTypeRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityTypeRequest();
        }

        if (quickfix.fix50.SecurityTypes.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityTypes();
        }

        if (quickfix.fix50.SecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityListRequest();
        }

        if (quickfix.fix50.SecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityList();
        }

        if (quickfix.fix50.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.DerivativeSecurityListRequest();
        }

        if (quickfix.fix50.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.DerivativeSecurityList();
        }

        if (quickfix.fix50.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityStatusRequest();
        }

        if (quickfix.fix50.SecurityStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityStatus();
        }

        if (quickfix.fix50.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradingSessionStatusRequest();
        }

        if (quickfix.fix50.TradingSessionStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradingSessionStatus();
        }

        if (quickfix.fix50.NewOrderSingle.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.NewOrderSingle();
        }

        if (quickfix.fix50.ExecutionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ExecutionReport();
        }

        if (quickfix.fix50.DontKnowTradeDK.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.DontKnowTradeDK();
        }

        if (quickfix.fix50.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderCancelReplaceRequest();
        }

        if (quickfix.fix50.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderCancelRequest();
        }

        if (quickfix.fix50.OrderCancelReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderCancelReject();
        }

        if (quickfix.fix50.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderStatusRequest();
        }

        if (quickfix.fix50.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderMassCancelRequest();
        }

        if (quickfix.fix50.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderMassCancelReport();
        }

        if (quickfix.fix50.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.OrderMassStatusRequest();
        }

        if (quickfix.fix50.NewOrderCross.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.NewOrderCross();
        }

        if (quickfix.fix50.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix50.CrossOrderCancelReplaceRequest();
        }

        if (quickfix.fix50.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CrossOrderCancelRequest();
        }

        if (quickfix.fix50.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.NewOrderMultileg();
        }

        if (quickfix.fix50.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.MultilegOrderCancelReplace();
        }

        if (quickfix.fix50.BidRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.BidRequest();
        }

        if (quickfix.fix50.BidResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.BidResponse();
        }

        if (quickfix.fix50.NewOrderList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.NewOrderList();
        }

        if (quickfix.fix50.ListStrikePrice.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ListStrikePrice();
        }

        if (quickfix.fix50.ListStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ListStatus();
        }

        if (quickfix.fix50.ListExecute.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ListExecute();
        }

        if (quickfix.fix50.ListCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ListCancelRequest();
        }

        if (quickfix.fix50.ListStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ListStatusRequest();
        }

        if (quickfix.fix50.AllocationInstruction.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AllocationInstruction();
        }

        if (quickfix.fix50.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AllocationInstructionAck();
        }

        if (quickfix.fix50.AllocationReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AllocationReport();
        }

        if (quickfix.fix50.AllocationReportAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AllocationReportAck();
        }

        if (quickfix.fix50.Confirmation.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.Confirmation();
        }

        if (quickfix.fix50.Confirmation_Ack.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.Confirmation_Ack();
        }

        if (quickfix.fix50.ConfirmationRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ConfirmationRequest();
        }

        if (quickfix.fix50.SettlementInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SettlementInstructions();
        }

        if (quickfix.fix50.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SettlementInstructionRequest();
        }

        if (quickfix.fix50.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradeCaptureReportRequest();
        }

        if (quickfix.fix50.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradeCaptureReportRequestAck();
        }

        if (quickfix.fix50.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradeCaptureReport();
        }

        if (quickfix.fix50.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradeCaptureReportAck();
        }

        if (quickfix.fix50.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.RegistrationInstructions();
        }

        if (quickfix.fix50.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix50.RegistrationInstructionsResponse();
        }

        if (quickfix.fix50.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.PositionMaintenanceRequest();
        }

        if (quickfix.fix50.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.PositionMaintenanceReport();
        }

        if (quickfix.fix50.RequestForPositions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.RequestForPositions();
        }

        if (quickfix.fix50.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.RequestForPositionsAck();
        }

        if (quickfix.fix50.PositionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.PositionReport();
        }

        if (quickfix.fix50.AssignmentReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AssignmentReport();
        }

        if (quickfix.fix50.CollateralRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralRequest();
        }

        if (quickfix.fix50.CollateralAssignment.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralAssignment();
        }

        if (quickfix.fix50.CollateralResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralResponse();
        }

        if (quickfix.fix50.CollateralReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralReport();
        }

        if (quickfix.fix50.CollateralInquiry.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralInquiry();
        }

        if (quickfix.fix50.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix50.NetworkCounterpartySystemStatusRequest();
        }

        if (quickfix.fix50.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix50.NetworkCounterpartySystemStatusResponse();
        }

        if (quickfix.fix50.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.CollateralInquiryAck();
        }

        if (quickfix.fix50.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ContraryIntentionReport();
        }

        if (quickfix.fix50.SecurityDefinitionUpdateReport.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix50.SecurityDefinitionUpdateReport();
        }

        if (quickfix.fix50.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.SecurityListUpdateReport();
        }

        if (quickfix.fix50.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AdjustedPositionReport();
        }

        if (quickfix.fix50.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.AllocationInstructionAlert();
        }

        if (quickfix.fix50.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.ExecutionAcknowledgement();
        }

        if (quickfix.fix50.TradingSessionList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradingSessionList();
        }

        if (quickfix.fix50.TradingSessionListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.TradingSessionListRequest();
        }

        if (quickfix.fix50.IOI.MSGTYPE.equals(msgType)) {
            return new quickfix.fix50.IOI();
        }

        return new quickfix.fix50.Message();
    }

    public Group create(String beginString, String msgType,
        int correspondingFieldID) {
        if (quickfix.fix50.Advertisement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.Advertisement.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.Advertisement.NoUnderlyings();
            }
        }

        if (quickfix.fix50.News.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix50.News.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.News.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.News.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.News.NoUnderlyings();

            case quickfix.field.NoLinesOfText.FIELD:
                return new quickfix.fix50.News.NoLinesOfText();
            }
        }

        if (quickfix.fix50.Email.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix50.Email.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.Email.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.Email.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.Email.NoLegs();

            case quickfix.field.NoLinesOfText.FIELD:
                return new quickfix.fix50.Email.NoLinesOfText();
            }
        }

        if (quickfix.fix50.QuoteRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.QuoteResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix50.QuoteResponse.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteResponse.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteResponse.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.QuoteResponse.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteResponse.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.QuoteResponse.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.QuoteResponse.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix50.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.RFQRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.RFQRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.RFQRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.RFQRequest.NoRelatedSym.NoLegs();
            }
        }

        if (quickfix.fix50.Quote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix50.Quote.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.Quote.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.Quote.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.Quote.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.Quote.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.Quote.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.Quote.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.Quote.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix50.QuoteCancel.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteCancel.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteCancel.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix50.QuoteCancel.NoQuoteEntries();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteCancel.NoQuoteEntries.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteCancel.NoQuoteEntries.NoLegs();
            }
        }

        if (quickfix.fix50.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteStatusRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteStatusRequest.NoLegs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix50.QuoteStatusReport.NoQuoteQualifiers();
            }
        }

        if (quickfix.fix50.MassQuote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.MassQuote.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.MassQuote.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix50.MassQuote.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix50.MassQuote.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
            }
        }

        if (quickfix.fix50.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.MassQuoteAcknowledgement.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
            }
        }

        if (quickfix.fix50.MarketDataRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntryTypes.FIELD:
                return new quickfix.fix50.MarketDataRequest.NoMDEntryTypes();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.MarketDataRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.MarketDataRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MarketDataRequest.NoRelatedSym.NoLegs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.MarketDataRequest.NoTradingSessions();
            }
        }

        if (quickfix.fix50.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoLegs();

            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoRoutingIDs();
            }
        }

        if (quickfix.fix50.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix50.MarketDataIncrementalRefresh.NoRoutingIDs();
            }
        }

        if (quickfix.fix50.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAltMDSource.FIELD:
                return new quickfix.fix50.MarketDataRequestReject.NoAltMDSource();
            }
        }

        if (quickfix.fix50.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityDefinitionRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityDefinitionRequest.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityDefinition.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityDefinition.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityDefinition.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityTypes.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityTypes.FIELD:
                return new quickfix.fix50.SecurityTypes.NoSecurityTypes();
            }
        }

        if (quickfix.fix50.SecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityListRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityListRequest.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.SecurityList.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityList.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.SecurityList.NoRelatedSym.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityList.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
            }
        }

        if (quickfix.fix50.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            }
        }

        if (quickfix.fix50.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.DerivativeSecurityList.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.DerivativeSecurityList.NoRelatedSym.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityStatusRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityStatusRequest.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.SecurityStatus.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityStatus.NoLegs();
            }
        }

        if (quickfix.fix50.TradingSessionStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            }
        }

        if (quickfix.fix50.NewOrderSingle.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoStipulations();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoStrategyParameters();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.NewOrderSingle.NoTrdRegTimestamps();
            }
        }

        if (quickfix.fix50.ExecutionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.ExecutionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.ExecutionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoContraBrokers.FIELD:
                return new quickfix.fix50.ExecutionReport.NoContraBrokers();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.ExecutionReport.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.ExecutionReport.NoStipulations();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix50.ExecutionReport.NoContAmts();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.ExecutionReport.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.ExecutionReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.ExecutionReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.ExecutionReport.NoMiscFees();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.ExecutionReport.NoStrategyParameters();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.ExecutionReport.NoTrdRegTimestamps();
            }
        }

        if (quickfix.fix50.DontKnowTradeDK.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.DontKnowTradeDK.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.DontKnowTradeDK.NoLegs();
            }
        }

        if (quickfix.fix50.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoUnderlyings();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoStrategyParameters();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.OrderCancelReplaceRequest.NoTrdRegTimestamps();
            }
        }

        if (quickfix.fix50.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderCancelRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.OrderCancelRequest.NoUnderlyings();
            }
        }

        if (quickfix.fix50.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.OrderStatusRequest.NoUnderlyings();
            }
        }

        if (quickfix.fix50.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderMassCancelRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderMassCancelReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.OrderMassStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.NewOrderCross.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.NewOrderCross.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoLegs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.NewOrderCross.NoTradingSessions();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.NewOrderCross.NoStipulations();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.NewOrderCross.NoStrategyParameters();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
            }
        }

        if (quickfix.fix50.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoLegs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoStipulations();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoStrategyParameters();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
            }
        }

        if (quickfix.fix50.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoLegs();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
            }
        }

        if (quickfix.fix50.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoAllocs();

            case quickfix.field.NoNested3PartyIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();

            case quickfix.field.NoNested3PartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegStipulations();

            case quickfix.field.NoLegAllocs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.NewOrderMultileg.NoStrategyParameters();
            }
        }

        if (quickfix.fix50.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs();

            case quickfix.field.NoNested3PartyIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();

            case quickfix.field.NoNested3PartySubIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();

            case quickfix.field.NoLegAllocs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.MultilegOrderCancelReplace.NoStrategyParameters();
            }
        }

        if (quickfix.fix50.BidRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidDescriptors.FIELD:
                return new quickfix.fix50.BidRequest.NoBidDescriptors();

            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix50.BidRequest.NoBidComponents();
            }
        }

        if (quickfix.fix50.BidResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix50.BidResponse.NoBidComponents();
            }
        }

        if (quickfix.fix50.NewOrderList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoStipulations();

            case quickfix.field.NoStrategyParameters.FIELD:
                return new quickfix.fix50.NewOrderList.NoOrders.NoStrategyParameters();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
            }
        }

        if (quickfix.fix50.ListStrikePrice.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoStrikes.FIELD:
                return new quickfix.fix50.ListStrikePrice.NoStrikes();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.ListStrikePrice.NoUnderlyings();
            }
        }

        if (quickfix.fix50.ListStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.ListStatus.NoOrders();
            }
        }

        if (quickfix.fix50.ListCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.ListCancelRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.AllocationInstruction.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoExecs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoLegs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoStipulations();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoAllocs.NoMiscFees();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoAllocs.NoClearingInstructions();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.AllocationInstruction.NoPosAmt();
            }
        }

        if (quickfix.fix50.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.AllocationInstructionAck.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix50.AllocationReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.AllocationReport.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.AllocationReport.NoExecs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.AllocationReport.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.AllocationReport.NoLegs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.AllocationReport.NoStipulations();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.AllocationReport.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.AllocationReport.NoAllocs.NoMiscFees();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix50.AllocationReport.NoAllocs.NoClearingInstructions();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.AllocationReport.NoPosAmt();
            }
        }

        if (quickfix.fix50.AllocationReportAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AllocationReportAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationReportAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.AllocationReportAck.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AllocationReportAck.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix50.Confirmation.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.Confirmation.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.Confirmation.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.Confirmation.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.Confirmation.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.Confirmation.NoTrdRegTimestamps();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.Confirmation.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.Confirmation.NoLegs();

            case quickfix.field.NoCapacities.FIELD:
                return new quickfix.fix50.Confirmation.NoCapacities();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.Confirmation.NoStipulations();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.Confirmation.NoMiscFees();
            }
        }

        if (quickfix.fix50.ConfirmationRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.ConfirmationRequest.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.ConfirmationRequest.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
            }
        }

        if (quickfix.fix50.SettlementInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSettlInst.FIELD:
                return new quickfix.fix50.SettlementInstructions.NoSettlInst();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.SettlementInstructions.NoSettlInst.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.SettlementInstructionRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequest.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequest.NoLegs();
            }
        }

        if (quickfix.fix50.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequestAck.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.TradeCaptureReportRequestAck.NoLegs();
            }
        }

        if (quickfix.fix50.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoUnderlyings();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoPosAmt();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoTrdRegTimestamps();

            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoClearingInstructions();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoContAmts();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoStipulations();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoMiscFees();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoSideTrdRegTS.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoSides.NoSideTrdRegTS();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
            }
        }

        if (quickfix.fix50.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoTrdRegTimestamps();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoPosAmt();

            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoClearingInstructions();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoContAmts();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoStipulations();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoMiscFees();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoSideTrdRegTS.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();

            case quickfix.field.NoRootPartyIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoRootPartyIDs();

            case quickfix.field.NoRootPartySubIDs.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.TradeCaptureReportAck.NoUnderlyings();
            }
        }

        if (quickfix.fix50.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoRegistDtls.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoRegistDtls();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoDistribInsts.FIELD:
                return new quickfix.fix50.RegistrationInstructions.NoDistribInsts();
            }
        }

        if (quickfix.fix50.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructionsResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix50.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoUnderlyings();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoTradingSessions();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.PositionMaintenanceRequest.NoPosAmt();
            }
        }

        if (quickfix.fix50.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoUnderlyings();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoTradingSessions();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.PositionMaintenanceReport.NoPosAmt();
            }
        }

        if (quickfix.fix50.RequestForPositions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.RequestForPositions.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.RequestForPositions.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.RequestForPositions.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.RequestForPositions.NoUnderlyings();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.RequestForPositions.NoTradingSessions();
            }
        }

        if (quickfix.fix50.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.RequestForPositionsAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.RequestForPositionsAck.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.RequestForPositionsAck.NoUnderlyings();
            }
        }

        if (quickfix.fix50.PositionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.PositionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.PositionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.PositionReport.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.PositionReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingAmounts.FIELD:
                return new quickfix.fix50.PositionReport.NoUnderlyings.NoUnderlyingAmounts();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix50.PositionReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.PositionReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.PositionReport.NoPosAmt();
            }
        }

        if (quickfix.fix50.AssignmentReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.AssignmentReport.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.AssignmentReport.NoUnderlyings();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.AssignmentReport.NoPosAmt();
            }
        }

        if (quickfix.fix50.CollateralRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralRequest.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralRequest.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralRequest.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralRequest.NoUnderlyings();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.CollateralRequest.NoTrdRegTimestamps();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.CollateralRequest.NoMiscFees();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CollateralRequest.NoStipulations();
            }
        }

        if (quickfix.fix50.CollateralAssignment.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoUnderlyings();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoTrdRegTimestamps();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoMiscFees();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CollateralAssignment.NoStipulations();
            }
        }

        if (quickfix.fix50.CollateralResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralResponse.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralResponse.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralResponse.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralResponse.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralResponse.NoUnderlyings();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.CollateralResponse.NoTrdRegTimestamps();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.CollateralResponse.NoMiscFees();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CollateralResponse.NoStipulations();
            }
        }

        if (quickfix.fix50.CollateralReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralReport.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralReport.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralReport.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralReport.NoUnderlyings();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.CollateralReport.NoTrdRegTimestamps();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.CollateralReport.NoMiscFees();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CollateralReport.NoStipulations();
            }
        }

        if (quickfix.fix50.CollateralInquiry.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCollInquiryQualifier.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoCollInquiryQualifier();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoUnderlyings();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.CollateralInquiry.NoStipulations();
            }
        }

        if (quickfix.fix50.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCompIDs.FIELD:
                return new quickfix.fix50.NetworkCounterpartySystemStatusRequest.NoCompIDs();
            }
        }

        if (quickfix.fix50.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCompIDs.FIELD:
                return new quickfix.fix50.NetworkCounterpartySystemStatusResponse.NoCompIDs();
            }
        }

        if (quickfix.fix50.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCollInquiryQualifier.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoCollInquiryQualifier();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoTrades();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoLegs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.CollateralInquiryAck.NoUnderlyings();
            }
        }

        if (quickfix.fix50.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.ContraryIntentionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoExpiration.FIELD:
                return new quickfix.fix50.ContraryIntentionReport.NoExpiration();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.ContraryIntentionReport.NoUnderlyings();
            }
        }

        if (quickfix.fix50.SecurityDefinitionUpdateReport.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityDefinitionUpdateReport.NoLegs();
            }
        }

        if (quickfix.fix50.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
            }
        }

        if (quickfix.fix50.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AdjustedPositionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix50.AdjustedPositionReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix50.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoExecs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoLegs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoStipulations();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoPosAmt();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoMiscFees();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
            }
        }

        if (quickfix.fix50.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.ExecutionAcknowledgement.NoUnderlyings();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.ExecutionAcknowledgement.NoLegs();
            }
        }

        if (quickfix.fix50.TradingSessionList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix50.TradingSessionList.NoTradingSessions();
            }
        }

        if (quickfix.fix50.IOI.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix50.IOI.NoUnderlyings();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix50.IOI.NoStipulations();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix50.IOI.NoLegs();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix50.IOI.NoLegs.NoLegStipulations();

            case quickfix.field.NoIOIQualifiers.FIELD:
                return new quickfix.fix50.IOI.NoIOIQualifiers();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix50.IOI.NoRoutingIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix50.IOI.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix50.IOI.NoPartyIDs.NoPartySubIDs();
            }
        }

        return null;
    }
}
