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
import quickfix.StringField;


public class MatchType extends StringField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 574; 
  public static final String ONE_PARTY_TRADE_REPORT = "1"; 
  public static final String TWO_PARTY_TRADE_REPORT = "2"; 
  public static final String CONFIRMED_TRADE_REPORT = "3"; 
  public static final String AUTO_MATCH = "4"; 
  public static final String CROSS_AUCTION = "5"; 
  public static final String COUNTER_ORDER_SELECTION = "6"; 
  public static final String CALL_AUCTION = "7"; 
  public static final String EXACT_PLUS_FOUR_BADGES_AND_EXECUTION_TIME = "A1"; 
  public static final String EXACT_PLUS_FOUR_BADGES = "A2"; 
  public static final String EXACT_PLUS_TWO_BADGES_AND_EXECUTION_TIME = "A3"; 
  public static final String EXACT_PLUS_TWO_BADGES = "A4"; 
  public static final String EXACT_PLUS_EXECUTION_TIME = "A5"; 
  public static final String ACT_ACCEPTED_TRADE = "M3"; 
  public static final String ACT_DEFAULT_TRADE = "M4"; 
  public static final String ACT_DEFAULT_AFTER_M2 = "M5"; 
  public static final String ACT_M6_MATCH = "M6"; 
  public static final String COMPARED_RECORDS_RESULTING_FROM_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS_PAIR_OFFS = "AQ"; 
  public static final String EXACT_MATCH_ON_TRADE_DATE_STOCK_SYMBOL_QUANTITY_PRICE_TRADE_TYPE_AND_SPECIAL_TRADE_INDICATOR_MINUS_BADGES_AND_TIMES_ACT_M1_MATCH = "M1"; 
  public static final String SUMMARIZED_MATCH_MINUS_BADGES_AND_TIMES_ACT_M2_MATCH = "M2"; 
  public static final String OCS_LOCKED_IN_NON_ACT = "MT"; 
  public static final String SUMMARIZED_MATCH_USING_A1_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIED = "S1"; 
  public static final String SUMMARIZED_MATCH_USING_A2_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = "S2"; 
  public static final String SUMMARIZED_MATCH_USING_A3_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = "S3"; 
  public static final String SUMMARIZED_MATCH_USING_A4_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = "S4"; 
  public static final String SUMMARIZED_MATCH_USING_A5_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = "S5"; 
  public static final String ONE_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = "60"; 
  public static final String TWO_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = "61"; 
  public static final String CONTINUOUS_AUTO_MATCH = "62"; 
  public static final String CROSS_AUCTION2 = "63"; 
  public static final String COUNTER_ORDER_SELECTION2 = "64"; 
  public static final String CALL_AUCTION2 = "65"; 
  
  public MatchType() 
  { 
    super(574);
  } 
   
  public MatchType(String data) 
  { 
     super(574, data);
  } 
  
  
}

  