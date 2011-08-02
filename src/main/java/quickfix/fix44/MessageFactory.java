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
package quickfix.fix44;

import quickfix.Group;
import quickfix.Message;


public class MessageFactory implements quickfix.MessageFactory {
    public Message create(String beginString, String msgType) {
        if (quickfix.fix44.Heartbeat.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Heartbeat();
        }

        if (quickfix.fix44.Logon.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Logon();
        }

        if (quickfix.fix44.TestRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TestRequest();
        }

        if (quickfix.fix44.ResendRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ResendRequest();
        }

        if (quickfix.fix44.Reject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Reject();
        }

        if (quickfix.fix44.SequenceReset.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SequenceReset();
        }

        if (quickfix.fix44.Logout.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Logout();
        }

        if (quickfix.fix44.BusinessMessageReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.BusinessMessageReject();
        }

        if (quickfix.fix44.UserRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.UserRequest();
        }

        if (quickfix.fix44.UserResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.UserResponse();
        }

        if (quickfix.fix44.Advertisement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Advertisement();
        }

        if (quickfix.fix44.IndicationOfInterest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.IndicationOfInterest();
        }

        if (quickfix.fix44.News.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.News();
        }

        if (quickfix.fix44.Email.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Email();
        }

        if (quickfix.fix44.QuoteRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteRequest();
        }

        if (quickfix.fix44.QuoteResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteResponse();
        }

        if (quickfix.fix44.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteRequestReject();
        }

        if (quickfix.fix44.RFQRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.RFQRequest();
        }

        if (quickfix.fix44.Quote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Quote();
        }

        if (quickfix.fix44.QuoteCancel.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteCancel();
        }

        if (quickfix.fix44.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteStatusRequest();
        }

        if (quickfix.fix44.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.QuoteStatusReport();
        }

        if (quickfix.fix44.MassQuote.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MassQuote();
        }

        if (quickfix.fix44.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MassQuoteAcknowledgement();
        }

        if (quickfix.fix44.MarketDataRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MarketDataRequest();
        }

        if (quickfix.fix44.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MarketDataSnapshotFullRefresh();
        }

        if (quickfix.fix44.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MarketDataIncrementalRefresh();
        }

        if (quickfix.fix44.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.MarketDataRequestReject();
        }

        if (quickfix.fix44.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityDefinitionRequest();
        }

        if (quickfix.fix44.SecurityDefinition.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityDefinition();
        }

        if (quickfix.fix44.SecurityTypeRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityTypeRequest();
        }

        if (quickfix.fix44.SecurityTypes.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityTypes();
        }

        if (quickfix.fix44.SecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityListRequest();
        }

        if (quickfix.fix44.SecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityList();
        }

        if (quickfix.fix44.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.DerivativeSecurityListRequest();
        }

        if (quickfix.fix44.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.DerivativeSecurityList();
        }

        if (quickfix.fix44.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityStatusRequest();
        }

        if (quickfix.fix44.SecurityStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SecurityStatus();
        }

        if (quickfix.fix44.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradingSessionStatusRequest();
        }

        if (quickfix.fix44.TradingSessionStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradingSessionStatus();
        }

        if (quickfix.fix44.NewOrderSingle.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NewOrderSingle();
        }

        if (quickfix.fix44.ExecutionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ExecutionReport();
        }

        if (quickfix.fix44.DontKnowTrade.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.DontKnowTrade();
        }

        if (quickfix.fix44.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderCancelReplaceRequest();
        }

        if (quickfix.fix44.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderCancelRequest();
        }

        if (quickfix.fix44.OrderCancelReject.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderCancelReject();
        }

        if (quickfix.fix44.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderStatusRequest();
        }

        if (quickfix.fix44.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderMassCancelRequest();
        }

        if (quickfix.fix44.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderMassCancelReport();
        }

        if (quickfix.fix44.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.OrderMassStatusRequest();
        }

        if (quickfix.fix44.NewOrderCross.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NewOrderCross();
        }

        if (quickfix.fix44.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix44.CrossOrderCancelReplaceRequest();
        }

        if (quickfix.fix44.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CrossOrderCancelRequest();
        }

        if (quickfix.fix44.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NewOrderMultileg();
        }

        if (quickfix.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix44.MultilegOrderCancelReplaceRequest();
        }

        if (quickfix.fix44.BidRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.BidRequest();
        }

        if (quickfix.fix44.BidResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.BidResponse();
        }

        if (quickfix.fix44.NewOrderList.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NewOrderList();
        }

        if (quickfix.fix44.ListStrikePrice.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ListStrikePrice();
        }

        if (quickfix.fix44.ListStatus.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ListStatus();
        }

        if (quickfix.fix44.ListExecute.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ListExecute();
        }

        if (quickfix.fix44.ListCancelRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ListCancelRequest();
        }

        if (quickfix.fix44.ListStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ListStatusRequest();
        }

        if (quickfix.fix44.AllocationInstruction.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.AllocationInstruction();
        }

        if (quickfix.fix44.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.AllocationInstructionAck();
        }

        if (quickfix.fix44.AllocationReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.AllocationReport();
        }

        if (quickfix.fix44.AllocationReportAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.AllocationReportAck();
        }

        if (quickfix.fix44.Confirmation.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.Confirmation();
        }

        if (quickfix.fix44.ConfirmationAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ConfirmationAck();
        }

        if (quickfix.fix44.ConfirmationRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.ConfirmationRequest();
        }

        if (quickfix.fix44.SettlementInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SettlementInstructions();
        }

        if (quickfix.fix44.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.SettlementInstructionRequest();
        }

        if (quickfix.fix44.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradeCaptureReportRequest();
        }

        if (quickfix.fix44.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradeCaptureReportRequestAck();
        }

        if (quickfix.fix44.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradeCaptureReport();
        }

        if (quickfix.fix44.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.TradeCaptureReportAck();
        }

        if (quickfix.fix44.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.RegistrationInstructions();
        }

        if (quickfix.fix44.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            return new quickfix.fix44.RegistrationInstructionsResponse();
        }

        if (quickfix.fix44.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.PositionMaintenanceRequest();
        }

        if (quickfix.fix44.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.PositionMaintenanceReport();
        }

        if (quickfix.fix44.RequestForPositions.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.RequestForPositions();
        }

        if (quickfix.fix44.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.RequestForPositionsAck();
        }

        if (quickfix.fix44.PositionReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.PositionReport();
        }

        if (quickfix.fix44.AssignmentReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.AssignmentReport();
        }

        if (quickfix.fix44.CollateralRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralRequest();
        }

        if (quickfix.fix44.CollateralAssignment.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralAssignment();
        }

        if (quickfix.fix44.CollateralResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralResponse();
        }

        if (quickfix.fix44.CollateralReport.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralReport();
        }

        if (quickfix.fix44.CollateralInquiry.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralInquiry();
        }

        if (quickfix.fix44.NetworkStatusRequest.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NetworkStatusRequest();
        }

        if (quickfix.fix44.NetworkStatusResponse.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.NetworkStatusResponse();
        }

        if (quickfix.fix44.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
            return new quickfix.fix44.CollateralInquiryAck();
        }

        return new quickfix.fix44.Message();
    }

    public Group create(String beginString, String msgType,
        int correspondingFieldID) {
        if (quickfix.fix44.Logon.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMsgTypes.FIELD:
                return new quickfix.fix44.Logon.NoMsgTypes();
            }
        }

        if (quickfix.fix44.Advertisement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.Advertisement.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.Advertisement.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.Advertisement.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.Advertisement.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.Advertisement.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.Advertisement.NoEvents();
            }
        }

        if (quickfix.fix44.IndicationOfInterest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoLegs.NoLegStipulations();

            case quickfix.field.NoIOIQualifiers.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoIOIQualifiers();

            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoRoutingIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.IndicationOfInterest.NoStipulations();
            }
        }

        if (quickfix.fix44.News.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix44.News.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.News.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.News.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.News.NoRelatedSym.NoEvents();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.News.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.News.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.News.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.News.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix44.News.LinesOfText();
            }
        }

        if (quickfix.fix44.Email.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRoutingIDs.FIELD:
                return new quickfix.fix44.Email.NoRoutingIDs();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.Email.NoRelatedSym();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.Email.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.Email.NoRelatedSym.NoEvents();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.Email.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.Email.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.Email.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.Email.NoLegs.NoLegSecurityAltID();

            case quickfix.field.LinesOfText.FIELD:
                return new quickfix.fix44.Email.LinesOfText();
            }
        }

        if (quickfix.fix44.QuoteRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoStipulations();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.QuoteResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix44.QuoteResponse.NoQuoteQualifiers();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteResponse.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteResponse.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteResponse.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteResponse.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.QuoteResponse.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteResponse.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteResponse.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteResponse.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.QuoteResponse.NoStipulations();
            }
        }

        if (quickfix.fix44.QuoteRequestReject.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoStipulations();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteRequestReject.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.RFQRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.RFQRequest.NoRelatedSym.NoEvents();
            }
        }

        if (quickfix.fix44.Quote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix44.Quote.NoQuoteQualifiers();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.Quote.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.Quote.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.Quote.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.Quote.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.Quote.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.Quote.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.Quote.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.Quote.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.Quote.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.Quote.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.Quote.NoStipulations();
            }
        }

        if (quickfix.fix44.QuoteCancel.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoEvents();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteCancel.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteCancel.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoEvents();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.QuoteStatusReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoQuoteQualifiers.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoQuoteQualifiers();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.QuoteStatusReport.NoStipulations();
            }
        }

        if (quickfix.fix44.MassQuote.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoEvents();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.MassQuote.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.MassQuote.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoQuoteSets.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets();

            case quickfix.field.NoQuoteEntries.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoEvents();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.MarketDataRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntryTypes.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoMDEntryTypes();

            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoEvents();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.MarketDataRequest.NoTradingSessions();
            }
        }

        if (quickfix.fix44.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoMDEntries();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoEvents();
            }
        }

        if (quickfix.fix44.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoMDEntries.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoEvents();
            }
        }

        if (quickfix.fix44.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAltMDSource.FIELD:
                return new quickfix.fix44.MarketDataRequestReject.NoAltMDSource();
            }
        }

        if (quickfix.fix44.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityDefinitionRequest.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.SecurityDefinition.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityDefinition.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.SecurityTypes.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityTypes.FIELD:
                return new quickfix.fix44.SecurityTypes.NoSecurityTypes();
            }
        }

        if (quickfix.fix44.SecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityListRequest.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.SecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoInstrAttrib();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.SecurityList.NoRelatedSym.NoStipulations();
            }
        }

        if (quickfix.fix44.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRelatedSym.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoInstrAttrib();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.DerivativeSecurityList.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityStatusRequest.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.SecurityStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.SecurityStatus.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatus.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.SecurityStatus.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatus.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.SecurityStatus.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.SecurityStatus.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.SecurityStatus.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.NewOrderSingle.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.NewOrderSingle.NoStipulations();
            }
        }

        if (quickfix.fix44.ExecutionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoContraBrokers.FIELD:
                return new quickfix.fix44.ExecutionReport.NoContraBrokers();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.ExecutionReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.ExecutionReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix44.ExecutionReport.NoContAmts();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.ExecutionReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.ExecutionReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.ExecutionReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.ExecutionReport.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.ExecutionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.ExecutionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.ExecutionReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.ExecutionReport.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.ExecutionReport.NoStipulations();
            }
        }

        if (quickfix.fix44.DontKnowTrade.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.DontKnowTrade.NoEvents();
            }
        }

        if (quickfix.fix44.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderCancelReplaceRequest.NoEvents();
            }
        }

        if (quickfix.fix44.OrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderCancelRequest.NoEvents();
            }
        }

        if (quickfix.fix44.OrderStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderStatusRequest.NoEvents();
            }
        }

        if (quickfix.fix44.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassCancelRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderMassCancelRequest.NoEvents();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAffectedOrders.FIELD:
                return new quickfix.fix44.OrderMassCancelReport.NoAffectedOrders();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassCancelReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderMassCancelReport.NoEvents();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassCancelReport.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.OrderMassStatusRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassStatusRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.OrderMassStatusRequest.NoEvents();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.NewOrderCross.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.NewOrderCross.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderCross.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.NewOrderCross.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderCross.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.NewOrderCross.NoTradingSessions();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderCross.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.NewOrderCross.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.NewOrderCross.NoStipulations();
            }
        }

        if (quickfix.fix44.CrossOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoStipulations();
            }
        }

        if (quickfix.fix44.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoSides();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CrossOrderCancelRequest.NoEvents();
            }
        }

        if (quickfix.fix44.NewOrderMultileg.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoAllocs();

            case quickfix.field.NoNested3PartyIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();

            case quickfix.field.NoNested3PartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs();

            case quickfix.field.NoLegAllocs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.NewOrderMultileg.NoEvents();
            }
        }

        if (quickfix.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs();

            case quickfix.field.NoNested3PartyIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs();

            case quickfix.field.NoNested3PartySubIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs();

            case quickfix.field.NoLegAllocs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoEvents();
            }
        }

        if (quickfix.fix44.BidRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidDescriptors.FIELD:
                return new quickfix.fix44.BidRequest.NoBidDescriptors();

            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix44.BidRequest.NoBidComponents();
            }
        }

        if (quickfix.fix44.BidResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoBidComponents.FIELD:
                return new quickfix.fix44.BidResponse.NoBidComponents();
            }
        }

        if (quickfix.fix44.NewOrderList.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoTradingSessions();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoEvents();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.NewOrderList.NoOrders.NoStipulations();
            }
        }

        if (quickfix.fix44.ListStrikePrice.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoStrikes.FIELD:
                return new quickfix.fix44.ListStrikePrice.NoStrikes();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.ListStrikePrice.NoStrikes.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.ListStrikePrice.NoStrikes.NoEvents();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.ListStrikePrice.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.ListStrikePrice.NoUnderlyings.NoUnderlyingSecurityAltID();
            }
        }

        if (quickfix.fix44.ListStatus.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.ListStatus.NoOrders();
            }
        }

        if (quickfix.fix44.AllocationInstruction.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoExecs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoMiscFees();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoInstrAttrib();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.AllocationInstruction.NoStipulations();
            }
        }

        if (quickfix.fix44.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.AllocationInstructionAck.NoAllocs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.AllocationInstructionAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.AllocationReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.AllocationReport.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.AllocationReport.NoExecs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.AllocationReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.AllocationReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoMiscFees();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoClearingInstructions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.AllocationReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.AllocationReport.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.AllocationReport.NoInstrAttrib();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.AllocationReport.NoStipulations();
            }
        }

        if (quickfix.fix44.AllocationReportAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.AllocationReportAck.NoAllocs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.AllocationReportAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.Confirmation.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.Confirmation.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.Confirmation.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.Confirmation.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.Confirmation.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.Confirmation.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoCapacities.FIELD:
                return new quickfix.fix44.Confirmation.NoCapacities();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.Confirmation.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.Confirmation.NoTrdRegTimestamps();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.Confirmation.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.Confirmation.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.Confirmation.NoInstrAttrib();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.Confirmation.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.Confirmation.NoStipulations();
            }
        }

        if (quickfix.fix44.ConfirmationRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoOrders.FIELD:
                return new quickfix.fix44.ConfirmationRequest.NoOrders();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
            }
        }

        if (quickfix.fix44.SettlementInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoSettlInst.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
            }
        }

        if (quickfix.fix44.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.SettlementInstructionRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoDates.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoDates();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoEvents();

            case quickfix.field.NoInstrAttrib.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequest.NoInstrAttrib();
            }
        }

        if (quickfix.fix44.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.TradeCaptureReportRequestAck.NoEvents();
            }
        }

        if (quickfix.fix44.TradeCaptureReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoSides.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides();

            case quickfix.field.NoClearingInstructions.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoClearingInstructions();

            case quickfix.field.NoContAmts.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoContAmts();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoMiscFees();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSides.NoStipulations();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoEvents();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoPosAmt();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.TradeCaptureReport.NoTrdRegTimestamps();
            }
        }

        if (quickfix.fix44.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoLegStipulations.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoLegStipulations();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoAllocs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoAllocs();

            case quickfix.field.NoNested2PartyIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs();

            case quickfix.field.NoNested2PartySubIDs.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoEvents();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.TradeCaptureReportAck.NoTrdRegTimestamps();
            }
        }

        if (quickfix.fix44.RegistrationInstructions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoRegistDtls.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoRegistDtls();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoDistribInsts.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoDistribInsts();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.RegistrationInstructionsResponse.MSGTYPE.equals(
                    msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructionsResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
            }
        }

        if (quickfix.fix44.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoEvents();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
            }
        }

        if (quickfix.fix44.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoEvents();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix44.PositionMaintenanceReport.NoPosAmt();
            }
        }

        if (quickfix.fix44.RequestForPositions.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.RequestForPositions.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositions.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.RequestForPositions.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositions.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoTradingSessions.FIELD:
                return new quickfix.fix44.RequestForPositions.NoTradingSessions();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.RequestForPositions.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.RequestForPositions.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositions.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.RequestForPositions.NoEvents();
            }
        }

        if (quickfix.fix44.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.RequestForPositionsAck.NoEvents();
            }
        }

        if (quickfix.fix44.PositionReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoLegs.FIELD:
                return new quickfix.fix44.PositionReport.NoLegs();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.PositionReport.NoLegs.NoLegSecurityAltID();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.PositionReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.PositionReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.PositionReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.PositionReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.PositionReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.PositionReport.NoEvents();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix44.PositionReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.PositionReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix44.PositionReport.NoPosAmt();
            }
        }

        if (quickfix.fix44.AssignmentReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.AssignmentReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.AssignmentReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.AssignmentReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.AssignmentReport.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.AssignmentReport.NoLegSecurityAltID();

            case quickfix.field.NoPositions.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPositions();

            case quickfix.field.NoNestedPartyIDs.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs();

            case quickfix.field.NoNestedPartySubIDs.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();

            case quickfix.field.NoPosAmt.FIELD:
                return new quickfix.fix44.AssignmentReport.NoPosAmt();
            }
        }

        if (quickfix.fix44.CollateralRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralRequest.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralRequest.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralRequest.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralRequest.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.CollateralRequest.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralRequest.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralRequest.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralRequest.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralRequest.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralRequest.NoLegSecurityAltID();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.CollateralRequest.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CollateralRequest.NoStipulations();
            }
        }

        if (quickfix.fix44.CollateralAssignment.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoLegSecurityAltID();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoStipulations();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
            }
        }

        if (quickfix.fix44.CollateralResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralResponse.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralResponse.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralResponse.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralResponse.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.CollateralResponse.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralResponse.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralResponse.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralResponse.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralResponse.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralResponse.NoLegSecurityAltID();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.CollateralResponse.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CollateralResponse.NoStipulations();
            }
        }

        if (quickfix.fix44.CollateralReport.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralReport.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralReport.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralReport.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralReport.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoMiscFees.FIELD:
                return new quickfix.fix44.CollateralReport.NoMiscFees();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralReport.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralReport.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralReport.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralReport.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralReport.NoLegSecurityAltID();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.CollateralReport.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CollateralReport.NoStipulations();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.CollateralReport.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
            }
        }

        if (quickfix.fix44.CollateralInquiry.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCollInquiryQualifier.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoCollInquiryQualifier();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoLegSecurityAltID();

            case quickfix.field.NoTrdRegTimestamps.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoTrdRegTimestamps();

            case quickfix.field.NoStipulations.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoStipulations();

            case quickfix.field.NoDlvyInst.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoDlvyInst();

            case quickfix.field.NoSettlPartyIDs.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs();

            case quickfix.field.NoSettlPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
            }
        }

        if (quickfix.fix44.NetworkStatusRequest.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCompIDs.FIELD:
                return new quickfix.fix44.NetworkStatusRequest.NoCompIDs();
            }
        }

        if (quickfix.fix44.NetworkStatusResponse.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCompIDs.FIELD:
                return new quickfix.fix44.NetworkStatusResponse.NoCompIDs();
            }
        }

        if (quickfix.fix44.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
            switch (correspondingFieldID) {
            case quickfix.field.NoCollInquiryQualifier.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoCollInquiryQualifier();

            case quickfix.field.NoExecs.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoExecs();

            case quickfix.field.NoTrades.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoTrades();

            case quickfix.field.NoUnderlyings.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoUnderlyings();

            case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoUnderlyings.NoUnderlyingSecurityAltID();

            case quickfix.field.NoPartyIDs.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoPartyIDs();

            case quickfix.field.NoPartySubIDs.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();

            case quickfix.field.NoSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoSecurityAltID();

            case quickfix.field.NoEvents.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoEvents();

            case quickfix.field.NoLegSecurityAltID.FIELD:
                return new quickfix.fix44.CollateralInquiryAck.NoLegSecurityAltID();
            }
        }

        return null;
    }
}
