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
import quickfix.CharField;


public class TriggerPriceType extends CharField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 1107; 
  public static final char BEST_OFFER = '1'; 
  public static final char LAST_TRADE = '2'; 
  public static final char BEST_BID = '3'; 
  public static final char BEST_BID_OR_LAST_TRADE = '4'; 
  public static final char BEST_OFFER_OR_LAST_TRADE = '5'; 
  public static final char BEST_MID = '6'; 
  
  public TriggerPriceType() 
  { 
    super(1107);
  } 
   
  public TriggerPriceType(char data) 
  { 
     super(1107, data);
  } 
  
  
}

  