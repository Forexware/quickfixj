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
import quickfix.DecimalField;


public class TriggerNewQty extends DecimalField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 1112; 
  
  public TriggerNewQty() 
  { 
    super(1112);
  } 
   
  public TriggerNewQty(java.math.BigDecimal data) 
  { 
     super(1112, data);
  } 
  
  
  public TriggerNewQty(double data) 
  { 
     super(1112, new java.math.BigDecimal(data));
  } 
  
}

  