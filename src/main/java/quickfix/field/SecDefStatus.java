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


public class SecDefStatus extends IntField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 653; 
  public static final int PENDING_APPROVAL = 0; 
  public static final int APPROVED = 1; 
  public static final int REJECTED = 2; 
  public static final int UNAUTHORIZED_REQUEST = 3; 
  public static final int INVALID_DEFINITION_REQUEST = 4; 
  
  public SecDefStatus() 
  { 
    super(653);
  } 
   
  public SecDefStatus(int data) 
  { 
     super(653, data);
  } 
  
  
}

  