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

import quickfix.IntField;


public class PartyRole extends IntField {
    static final long serialVersionUID = 20050617;
    public static final int FIELD = 452;
    public static final int EXECUTING_FIRM = 1;
    public static final int BROKER_OF_CREDIT = 2;
    public static final int CLIENT_ID = 3;
    public static final int CLEARING_FIRM = 4;
    public static final int INVESTOR_ID = 5;
    public static final int INTRODUCING_FIRM = 6;
    public static final int ENTERING_FIRM = 7;
    public static final int LOCATE_LENDING_FIRM = 8;
    public static final int FUND_MANAGER_CLIENT_ID = 9;
    public static final int SETTLEMENT_LOCATION = 10;
    public static final int ORDER_ORIGINATION_TRADER = 11;
    public static final int EXECUTING_TRADER = 12;
    public static final int ORDER_ORIGINATION_FIRM = 13;
    public static final int GIVEUP_CLEARING_FIRM = 14;
    public static final int CORRESPONDANT_CLEARING_FIRM = 15;
    public static final int EXECUTING_SYSTEM = 16;
    public static final int CONTRA_FIRM = 17;
    public static final int CONTRA_CLEARING_FIRM = 18;
    public static final int SPONSORING_FIRM = 19;
    public static final int UNDERLYING_CONTRA_FIRM = 20;
    public static final int CLEARING_ORGANIZATION = 21;
    public static final int EXCHANGE = 22;
    public static final int CUSTOMER_ACCOUNT = 24;
    public static final int CORRESPONDENT_CLEARING_ORGANIZATION = 25;
    public static final int CORRESPONDENT_BROKER = 26;
    public static final int BUYER_SELLER = 27;
    public static final int CUSTODIAN = 28;
    public static final int INTERMEDIARY = 29;
    public static final int AGENT = 30;
    public static final int SUB_CUSTODIAN = 31;
    public static final int BENEFICIARY = 32;
    public static final int INTERESTED_PARTY = 33;
    public static final int REGULATORY_BODY = 34;
    public static final int LIQUIDITY_PROVIDER = 35;
    public static final int ENTERING_TRADER = 36;
    public static final int CONTRA_TRADER = 37;
    public static final int POSITION_ACCOUNT = 38;
    public static final int CONTRA_INVESTOR_ID = 39;
    public static final int TRANSFER_TO_FIRM = 40;
    public static final int CONTRA_POSITION_ACCOUNT = 41;
    public static final int CONTRA_EXCHANGE = 42;
    public static final int INTERNAL_CARRY_ACCOUNT = 43;
    public static final int ORDER_ENTRY_OPERATOR_ID = 44;
    public static final int SECONDARY_ACCOUNT_NUMBER = 45;
    public static final int FORIEGN_FIRM = 46;
    public static final int THIRD_PARTY_ALLOCATION_FIRM = 47;
    public static final int CLAIMING_ACCOUNT = 48;
    public static final int ASSET_MANAGER = 49;
    public static final int PLEDGOR_ACCOUNT = 50;
    public static final int PLEDGEE_ACCOUNT = 51;
    public static final int LARGE_TRADER_REPORTABLE_ACCOUNT = 52;
    public static final int TRADER_MNEMONIC = 53;
    public static final int SENDER_LOCATION = 54;
    public static final int SESSION_ID = 55;
    public static final int ACCEPTABLE_COUNTERPARTY = 56;
    public static final int UNACCEPTABLE_COUNTERPARTY = 57;
    public static final int ENTERING_UNIT = 58;
    public static final int EXECUTING_UNIT = 59;
    public static final int INTRODUCING_BROKER = 60;
    public static final int QUOTE_ORIGINATOR = 61;
    public static final int REPORT_ORIGINATOR = 62;
    public static final int SYSTEMATIC_INTERNALISER = 63;
    public static final int MULTILATERAL_TRADING_FACILITY = 64;
    public static final int REGULATED_MARKET = 65;
    public static final int MARKET_MAKER = 66;
    public static final int INVESTMENT_FIRM = 67;
    public static final int HOST_COMPETENT_AUTHORITY = 68;
    public static final int HOME_COMPETENT_AUTHORITY = 69;
    public static final int COMPETENT_AUTHORITY_OF_THE_MOST_RELEVANT_MARKET_IN_TERMS_OF_LIQUIDITY =
        70;
    public static final int COMPETENT_AUTHORITY_OF_THE_TRANSACTION = 71;
    public static final int REPORTING_INTERMEDIARY = 72;
    public static final int EXECUTION_VENUE = 73;
    public static final int MARKET_DATA_ENTRY_ORIGINATOR = 74;
    public static final int LOCATION_ID = 75;
    public static final int DESK_ID = 76;
    public static final int MARKET_DATA_MARKET = 77;
    public static final int ALLOCATION_ENTITY = 78;

    public PartyRole() {
        super(452);
    }

    public PartyRole(int data) {
        super(452, data);
    }
}
