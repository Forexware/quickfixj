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


public class CorporateAction extends StringField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 292; 
  public static final char EX_DIVIDEND = 'A'; 
  public static final char EX_DISTRIBUTION = 'B'; 
  public static final char EX_RIGHTS = 'C'; 
  public static final char NEW = 'D'; 
  public static final char EX_INTEREST = 'E'; 
  public static final char CASH_DIVIDEND = 'F'; 
  public static final char STOCK_DIVIDEND = 'G'; 
  public static final char NON_INTEGER_STOCK_SPLIT = 'H'; 
  public static final char REVERSE_STOCK_SPLIT = 'I'; 
  public static final char STANDARD_INTEGER_STOCK_SPLIT = 'J'; 
  public static final char POSITION_CONSOLIDATION = 'K'; 
  public static final char LIQUIDATION_REORGANIZATION = 'L'; 
  public static final char MERGER_REORGANIZATION = 'M'; 
  public static final char RIGHTS_OFFERING = 'N'; 
  public static final char SHAREHOLDER_MEETING = 'O'; 
  public static final char SPINOFF = 'P'; 
  public static final char TENDER_OFFER = 'Q'; 
  public static final char WARRANT = 'R'; 
  public static final char SPECIAL_ACTION = 'S'; 
  public static final char SYMBOL_CONVERSION = 'T'; 
  public static final char CUSIP = 'U'; 
  public static final char LEAP_ROLLOVER = 'V'; 
  
  public CorporateAction() 
  { 
    super(292);
  } 
   
  public CorporateAction(String data) 
  { 
     super(292, data);
  } 
  
  
}

  