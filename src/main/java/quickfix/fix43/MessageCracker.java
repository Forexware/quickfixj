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

import quickfix.*;

import quickfix.field.*;


public class MessageCracker extends quickfix.fix42.MessageCracker {
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
    * Callback for FIXBusinessMessageReject message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(BusinessMessageReject message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        //
    }

    /**
    * Callback for FIXAdvertisement message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Advertisement message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXIndicationOfInterest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(IndicationOfInterest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXNews message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(News message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXEmail message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Email message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuoteRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(QuoteRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuoteRequestReject message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(QuoteRequestReject message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXRFQRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(RFQRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuote message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Quote message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuoteCancel message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(QuoteCancel message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuoteStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(QuoteStatusRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXQuoteStatusReport message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(QuoteStatusReport message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMassQuote message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MassQuote message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMassQuoteAcknowledgement message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MassQuoteAcknowledgement message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMarketDataRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MarketDataRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMarketDataSnapshotFullRefresh message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MarketDataSnapshotFullRefresh message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMarketDataIncrementalRefresh message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MarketDataIncrementalRefresh message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMarketDataRequestReject message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MarketDataRequestReject message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityDefinitionRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityDefinitionRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityDefinition message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityDefinition message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityTypeRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityTypeRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityTypes message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityTypes message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityListRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityListRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityList message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityList message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXDerivativeSecurityListRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(DerivativeSecurityListRequest message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXDerivativeSecurityList message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(DerivativeSecurityList message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityStatusRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSecurityStatus message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SecurityStatus message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXTradingSessionStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(TradingSessionStatusRequest message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXTradingSessionStatus message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(TradingSessionStatus message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXNewOrderSingle message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(NewOrderSingle message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXExecutionReport message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ExecutionReport message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXDontKnowTrade message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(DontKnowTrade message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderCancelReplaceRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderCancelReplaceRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderCancelRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderCancelRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderCancelReject message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderCancelReject message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderStatusRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderMassCancelRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderMassCancelRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderMassCancelReport message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderMassCancelReport message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXOrderMassStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(OrderMassStatusRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXNewOrderCross message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(NewOrderCross message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXCrossOrderCancelReplaceRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(CrossOrderCancelReplaceRequest message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXCrossOrderCancelRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(CrossOrderCancelRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXNewOrderMultileg message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(NewOrderMultileg message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXMultilegOrderCancelReplaceRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(MultilegOrderCancelReplaceRequest message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXBidRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(BidRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXBidResponse message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(BidResponse message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXNewOrderList message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(NewOrderList message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXListStrikePrice message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ListStrikePrice message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXListExecute message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ListExecute message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXListCancelRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ListCancelRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXListStatusRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ListStatusRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXListStatus message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(ListStatus message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXAllocation message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(Allocation message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXAllocationACK message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(AllocationACK message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXSettlementInstructions message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(SettlementInstructions message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXTradeCaptureReportRequest message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(TradeCaptureReportRequest message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXTradeCaptureReport message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(TradeCaptureReport message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXRegistrationInstructions message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(RegistrationInstructions message, SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    /**
    * Callback for FIXRegistrationInstructionsResponse message
    *
    * @param message
    * @param sessionID
    *
    * @throws FieldNotFound
    * @throws UnsupportedMessageType
    * @throws IncorrectTagValue
    */
    public void onMessage(RegistrationInstructionsResponse message,
        SessionID sessionID)
        throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        throw new UnsupportedMessageType();
    }

    public void crack(quickfix.Message message, SessionID sessionID)
        throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
        crack43((Message) message, sessionID);
    }

    /**
     * Cracker method for 43 messages
     *
     * @throws FieldNotFound
     * @throws UnsupportedMessageType
     * @throws IncorrectTagValue
     */
    public void crack43(Message message, SessionID sessionID)
        throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
        MsgType msgType = new MsgType();
        message.getHeader().getField(msgType);

        String msgTypeValue = msgType.getValue();

        if (msgTypeValue.equals(Heartbeat.MSGTYPE)) {
            onMessage((Heartbeat) message, sessionID);
        } else if (msgTypeValue.equals(Logon.MSGTYPE)) {
            onMessage((Logon) message, sessionID);
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
        } else if (msgTypeValue.equals(BusinessMessageReject.MSGTYPE)) {
            onMessage((BusinessMessageReject) message, sessionID);
        } else if (msgTypeValue.equals(Advertisement.MSGTYPE)) {
            onMessage((Advertisement) message, sessionID);
        } else if (msgTypeValue.equals(IndicationOfInterest.MSGTYPE)) {
            onMessage((IndicationOfInterest) message, sessionID);
        } else if (msgTypeValue.equals(News.MSGTYPE)) {
            onMessage((News) message, sessionID);
        } else if (msgTypeValue.equals(Email.MSGTYPE)) {
            onMessage((Email) message, sessionID);
        } else if (msgTypeValue.equals(QuoteRequest.MSGTYPE)) {
            onMessage((QuoteRequest) message, sessionID);
        } else if (msgTypeValue.equals(QuoteRequestReject.MSGTYPE)) {
            onMessage((QuoteRequestReject) message, sessionID);
        } else if (msgTypeValue.equals(RFQRequest.MSGTYPE)) {
            onMessage((RFQRequest) message, sessionID);
        } else if (msgTypeValue.equals(Quote.MSGTYPE)) {
            onMessage((Quote) message, sessionID);
        } else if (msgTypeValue.equals(QuoteCancel.MSGTYPE)) {
            onMessage((QuoteCancel) message, sessionID);
        } else if (msgTypeValue.equals(QuoteStatusRequest.MSGTYPE)) {
            onMessage((QuoteStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(QuoteStatusReport.MSGTYPE)) {
            onMessage((QuoteStatusReport) message, sessionID);
        } else if (msgTypeValue.equals(MassQuote.MSGTYPE)) {
            onMessage((MassQuote) message, sessionID);
        } else if (msgTypeValue.equals(MassQuoteAcknowledgement.MSGTYPE)) {
            onMessage((MassQuoteAcknowledgement) message, sessionID);
        } else if (msgTypeValue.equals(MarketDataRequest.MSGTYPE)) {
            onMessage((MarketDataRequest) message, sessionID);
        } else if (msgTypeValue.equals(MarketDataSnapshotFullRefresh.MSGTYPE)) {
            onMessage((MarketDataSnapshotFullRefresh) message, sessionID);
        } else if (msgTypeValue.equals(MarketDataIncrementalRefresh.MSGTYPE)) {
            onMessage((MarketDataIncrementalRefresh) message, sessionID);
        } else if (msgTypeValue.equals(MarketDataRequestReject.MSGTYPE)) {
            onMessage((MarketDataRequestReject) message, sessionID);
        } else if (msgTypeValue.equals(SecurityDefinitionRequest.MSGTYPE)) {
            onMessage((SecurityDefinitionRequest) message, sessionID);
        } else if (msgTypeValue.equals(SecurityDefinition.MSGTYPE)) {
            onMessage((SecurityDefinition) message, sessionID);
        } else if (msgTypeValue.equals(SecurityTypeRequest.MSGTYPE)) {
            onMessage((SecurityTypeRequest) message, sessionID);
        } else if (msgTypeValue.equals(SecurityTypes.MSGTYPE)) {
            onMessage((SecurityTypes) message, sessionID);
        } else if (msgTypeValue.equals(SecurityListRequest.MSGTYPE)) {
            onMessage((SecurityListRequest) message, sessionID);
        } else if (msgTypeValue.equals(SecurityList.MSGTYPE)) {
            onMessage((SecurityList) message, sessionID);
        } else if (msgTypeValue.equals(DerivativeSecurityListRequest.MSGTYPE)) {
            onMessage((DerivativeSecurityListRequest) message, sessionID);
        } else if (msgTypeValue.equals(DerivativeSecurityList.MSGTYPE)) {
            onMessage((DerivativeSecurityList) message, sessionID);
        } else if (msgTypeValue.equals(SecurityStatusRequest.MSGTYPE)) {
            onMessage((SecurityStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(SecurityStatus.MSGTYPE)) {
            onMessage((SecurityStatus) message, sessionID);
        } else if (msgTypeValue.equals(TradingSessionStatusRequest.MSGTYPE)) {
            onMessage((TradingSessionStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(TradingSessionStatus.MSGTYPE)) {
            onMessage((TradingSessionStatus) message, sessionID);
        } else if (msgTypeValue.equals(NewOrderSingle.MSGTYPE)) {
            onMessage((NewOrderSingle) message, sessionID);
        } else if (msgTypeValue.equals(ExecutionReport.MSGTYPE)) {
            onMessage((ExecutionReport) message, sessionID);
        } else if (msgTypeValue.equals(DontKnowTrade.MSGTYPE)) {
            onMessage((DontKnowTrade) message, sessionID);
        } else if (msgTypeValue.equals(OrderCancelReplaceRequest.MSGTYPE)) {
            onMessage((OrderCancelReplaceRequest) message, sessionID);
        } else if (msgTypeValue.equals(OrderCancelRequest.MSGTYPE)) {
            onMessage((OrderCancelRequest) message, sessionID);
        } else if (msgTypeValue.equals(OrderCancelReject.MSGTYPE)) {
            onMessage((OrderCancelReject) message, sessionID);
        } else if (msgTypeValue.equals(OrderStatusRequest.MSGTYPE)) {
            onMessage((OrderStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(OrderMassCancelRequest.MSGTYPE)) {
            onMessage((OrderMassCancelRequest) message, sessionID);
        } else if (msgTypeValue.equals(OrderMassCancelReport.MSGTYPE)) {
            onMessage((OrderMassCancelReport) message, sessionID);
        } else if (msgTypeValue.equals(OrderMassStatusRequest.MSGTYPE)) {
            onMessage((OrderMassStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(NewOrderCross.MSGTYPE)) {
            onMessage((NewOrderCross) message, sessionID);
        } else if (msgTypeValue.equals(CrossOrderCancelReplaceRequest.MSGTYPE)) {
            onMessage((CrossOrderCancelReplaceRequest) message, sessionID);
        } else if (msgTypeValue.equals(CrossOrderCancelRequest.MSGTYPE)) {
            onMessage((CrossOrderCancelRequest) message, sessionID);
        } else if (msgTypeValue.equals(NewOrderMultileg.MSGTYPE)) {
            onMessage((NewOrderMultileg) message, sessionID);
        } else if (msgTypeValue.equals(
                    MultilegOrderCancelReplaceRequest.MSGTYPE)) {
            onMessage((MultilegOrderCancelReplaceRequest) message, sessionID);
        } else if (msgTypeValue.equals(BidRequest.MSGTYPE)) {
            onMessage((BidRequest) message, sessionID);
        } else if (msgTypeValue.equals(BidResponse.MSGTYPE)) {
            onMessage((BidResponse) message, sessionID);
        } else if (msgTypeValue.equals(NewOrderList.MSGTYPE)) {
            onMessage((NewOrderList) message, sessionID);
        } else if (msgTypeValue.equals(ListStrikePrice.MSGTYPE)) {
            onMessage((ListStrikePrice) message, sessionID);
        } else if (msgTypeValue.equals(ListExecute.MSGTYPE)) {
            onMessage((ListExecute) message, sessionID);
        } else if (msgTypeValue.equals(ListCancelRequest.MSGTYPE)) {
            onMessage((ListCancelRequest) message, sessionID);
        } else if (msgTypeValue.equals(ListStatusRequest.MSGTYPE)) {
            onMessage((ListStatusRequest) message, sessionID);
        } else if (msgTypeValue.equals(ListStatus.MSGTYPE)) {
            onMessage((ListStatus) message, sessionID);
        } else if (msgTypeValue.equals(Allocation.MSGTYPE)) {
            onMessage((Allocation) message, sessionID);
        } else if (msgTypeValue.equals(AllocationACK.MSGTYPE)) {
            onMessage((AllocationACK) message, sessionID);
        } else if (msgTypeValue.equals(SettlementInstructions.MSGTYPE)) {
            onMessage((SettlementInstructions) message, sessionID);
        } else if (msgTypeValue.equals(TradeCaptureReportRequest.MSGTYPE)) {
            onMessage((TradeCaptureReportRequest) message, sessionID);
        } else if (msgTypeValue.equals(TradeCaptureReport.MSGTYPE)) {
            onMessage((TradeCaptureReport) message, sessionID);
        } else if (msgTypeValue.equals(RegistrationInstructions.MSGTYPE)) {
            onMessage((RegistrationInstructions) message, sessionID);
        } else if (msgTypeValue.equals(RegistrationInstructionsResponse.MSGTYPE)) {
            onMessage((RegistrationInstructionsResponse) message, sessionID);
        } else {
            onMessage(message, sessionID);
        }
    }
}
