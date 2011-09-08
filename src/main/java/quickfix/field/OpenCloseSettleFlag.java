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


public class OpenCloseSettleFlag extends StringField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 286; 
  public static final char DAILY_OPEN = '0'; 
  public static final char SESSION_OPEN = '1'; 
  public static final char DELIVERY_SETTLEMENT_PRICE = '2'; 
  public static final char EXPECTED_PRICE = '3'; 
  public static final char PRICE_FROM_PREVIOUS_BUSINESS_DAY = '4'; 
  
  public OpenCloseSettleFlag() 
  { 
    super(286);
  } 
   
  public OpenCloseSettleFlag(String data) 
  { 
     super(286, data);
  } 
  
  
}

  