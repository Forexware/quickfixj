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


public class OrderCategory extends CharField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 1115; 
  public static final char ORDER = '1'; 
  public static final char QUOTE = '2'; 
  public static final char PRIVATELY_NEGOTIATED_TRADE = '3'; 
  public static final char MULTILEG_ORDER = '4'; 
  public static final char LINKED_ORDER = '5'; 
  public static final char QUOTE_REQUEST = '6'; 
  public static final char IMPLIED_ORDER = '7'; 
  public static final char CROSS_ORDER = '8'; 
  
  public OrderCategory() 
  { 
    super(1115);
  } 
   
  public OrderCategory(char data) 
  { 
     super(1115, data);
  } 
  
  
}

  