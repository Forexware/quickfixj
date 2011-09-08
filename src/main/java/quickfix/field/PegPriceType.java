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


public class PegPriceType extends IntField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 1094; 
  public static final int LAST_PEG = 1; 
  public static final int MID_PRICE_PEG = 2; 
  public static final int OPENING_PEG = 3; 
  public static final int MARKET_PEG = 4; 
  public static final int PRIMARY_PEG = 5; 
  public static final int FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = 6; 
  public static final int PEG_TO_VWAP = 7; 
  public static final int TRAILING_STOP_PEG = 8; 
  public static final int PEG_TO_LIMIT_PRICE = 9; 
  
  public PegPriceType() 
  { 
    super(1094);
  } 
   
  public PegPriceType(int data) 
  { 
     super(1094, data);
  } 
  
  
}

  