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


public class MDElementName extends IntField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 5450; 
  public static final int BEST_BID = 1; 
  public static final int BEST_OFFER = 2; 
  public static final int PAID = 11; 
  public static final int GIVEN = 12; 
  public static final int DEALABLE_BID = 45; 
  public static final int DEALABLE_OFFER = 46; 
  public static final int LOCAL_BID = 47; 
  public static final int LOCAL_OFFER = 48; 
  public static final int DEALABLE_REGULAR_BID = 49; 
  public static final int DEALABLE_REGULAR_OFFER = 50; 
  public static final int DEALABLE_OUTSIDE_BID = 51; 
  public static final int DEALABLE_OUTSIDE_OFFER = 52; 
  public static final int DEALABLE_PLUS_BID = 53; 
  public static final int DEALABLE_PLUS_OFFER = 54; 
  
  public MDElementName() 
  { 
    super(5450);
  } 
   
  public MDElementName(int data) 
  { 
     super(5450, data);
  } 
  
  
}

  