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


public class UnitofMeasure extends StringField 
{ 
  static final long serialVersionUID = 20050617;

  public static final int FIELD = 996; 
  public static final String MEGAWATT_HOURS = "MWh"; 
  public static final String ONE_MILLION_BTU = "MMBtu"; 
  public static final String BARRELS = "Bbl"; 
  public static final String GALLONS = "Gal"; 
  public static final String METRIC_TONS = "t"; 
  public static final String TONS = "tn"; 
  public static final String MILLION_BARRELS = "MMbbl"; 
  public static final String POUNDS = "lbs"; 
  public static final String TROY_OUNCES = "oz_tr"; 
  public static final String US_DOLLARS = "USD"; 
  public static final String BILLION_CUBIC_FEET = "Bcf"; 
  public static final String BUSHELS = "Bu"; 
  
  public UnitofMeasure() 
  { 
    super(996);
  } 
   
  public UnitofMeasure(String data) 
  { 
     super(996, data);
  } 
  
  
}

  