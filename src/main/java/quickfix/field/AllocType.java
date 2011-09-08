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


public class AllocType extends IntField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 626; 
  public static final int CALCULATED = 1; 
  public static final int PRELIMINARY = 2; 
  public static final int SELLSIDE_CALCULATED_USING_PRELIMINARY = 3; 
  public static final int SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = 4; 
  public static final int READY_TO_BOOK_SINGLE_ORDER = 5; 
  public static final int BUYSIDE_READY_TO_BOOK = 6; 
  public static final int WAREHOUSE_INSTRUCTION = 7; 
  public static final int REQUEST_TO_INTERMEDIARY = 8; 
  public static final int ACCEPT = 9; 
  public static final int REJECT = 10; 
  public static final int ACCEPT_PENDING = 11; 
  public static final int INCOMPLETE_GROUP = 12; 
  public static final int COMPLETE_GROUP = 13; 
  public static final int REVERSAL_PENDING = 14; 
  
  public AllocType() 
  { 
    super(626);
  } 
   
  public AllocType(int data) 
  { 
     super(626, data);
  } 
  
  
}

  