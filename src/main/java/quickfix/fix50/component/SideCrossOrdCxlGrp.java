
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class SideCrossOrdCxlGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 552,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public SideCrossOrdCxlGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoSides value)
  {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound
  {
    quickfix.field.NoSides value = new quickfix.field.NoSides();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSides field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSides()
  {
    return isSetField(552);
  }
  
  public static class NoSides extends Group {
    static final long serialVersionUID = 20050617;
    public NoSides() {
        super(552, 54,
            new int[] {54, 41, 11, 526, 583, 586, 453, 229, 75, 38, 152, 516, 468, 469, 376, 58, 354, 355,  0 } );
    }
    
  public void set(quickfix.field.Side value)
  {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound
  {
    quickfix.field.Side value = new quickfix.field.Side();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Side field)
  {
    return isSetField(field);
  }

  public boolean isSetSide()
  {
    return isSetField(54);
  }
  
  public void set(quickfix.field.OrigClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound
  {
    quickfix.field.OrigClOrdID value = new quickfix.field.OrigClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrigClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID()
  {
    return isSetField(41);
  }
  
  public void set(quickfix.field.ClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound
  {
    quickfix.field.ClOrdID value = new quickfix.field.ClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetClOrdID()
  {
    return isSetField(11);
  }
  
  public void set(quickfix.field.SecondaryClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound
  {
    quickfix.field.SecondaryClOrdID value = new quickfix.field.SecondaryClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID()
  {
    return isSetField(526);
  }
  
  public void set(quickfix.field.ClOrdLinkID value)
  {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound
  {
    quickfix.field.ClOrdLinkID value = new quickfix.field.ClOrdLinkID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field)
  {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID()
  {
    return isSetField(583);
  }
  
  public void set(quickfix.field.OrigOrdModTime value)
  {
    setField(value);
  }

  public quickfix.field.OrigOrdModTime get(quickfix.field.OrigOrdModTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound
  {
    quickfix.field.OrigOrdModTime value = new quickfix.field.OrigOrdModTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrigOrdModTime field)
  {
    return isSetField(field);
  }

  public boolean isSetOrigOrdModTime()
  {
    return isSetField(586);
  }
  
  public void set(quickfix.fix50.component.Parties component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.Parties get(quickfix.fix50.component.Parties  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.Parties getParties() throws FieldNotFound
  {
    quickfix.fix50.component.Parties component = new quickfix.fix50.component.Parties();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoPartyIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound
  {
    quickfix.field.NoPartyIDs value = new quickfix.field.NoPartyIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoPartyIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs()
  {
    return isSetField(453);
  }
  
  public static class NoPartyIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoPartyIDs() {
        super(453, 448,
            new int[] {448, 447, 452, 802,  0 } );
    }
    
  public void set(quickfix.field.PartyID value)
  {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound
  {
    quickfix.field.PartyID value = new quickfix.field.PartyID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyID field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyID()
  {
    return isSetField(448);
  }
  
  public void set(quickfix.field.PartyIDSource value)
  {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound
  {
    quickfix.field.PartyIDSource value = new quickfix.field.PartyIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource()
  {
    return isSetField(447);
  }
  
  public void set(quickfix.field.PartyRole value)
  {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound
  {
    quickfix.field.PartyRole value = new quickfix.field.PartyRole();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyRole field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyRole()
  {
    return isSetField(452);
  }
  
  public void set(quickfix.fix50.component.PtysSubGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.PtysSubGrp get(quickfix.fix50.component.PtysSubGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound
  {
    quickfix.fix50.component.PtysSubGrp component = new quickfix.fix50.component.PtysSubGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoPartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoPartySubIDs value = new quickfix.field.NoPartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs()
  {
    return isSetField(802);
  }
  
  public static class NoPartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoPartySubIDs() {
        super(802, 523,
            new int[] {523, 803,  0 } );
    }
    
  public void set(quickfix.field.PartySubID value)
  {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound
  {
    quickfix.field.PartySubID value = new quickfix.field.PartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetPartySubID()
  {
    return isSetField(523);
  }
  
  public void set(quickfix.field.PartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound
  {
    quickfix.field.PartySubIDType value = new quickfix.field.PartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType()
  {
    return isSetField(803);
  }
  
  }
  
  }
  
  public void set(quickfix.field.TradeOriginationDate value)
  {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound
  {
    quickfix.field.TradeOriginationDate value = new quickfix.field.TradeOriginationDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate()
  {
    return isSetField(229);
  }
  
  public void set(quickfix.field.TradeDate value)
  {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound
  {
    quickfix.field.TradeDate value = new quickfix.field.TradeDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeDate field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeDate()
  {
    return isSetField(75);
  }
  
  public void set(quickfix.fix50.component.OrderQtyData component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.OrderQtyData get(quickfix.fix50.component.OrderQtyData  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.OrderQtyData getOrderQtyData() throws FieldNotFound
  {
    quickfix.fix50.component.OrderQtyData component = new quickfix.fix50.component.OrderQtyData();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.OrderQty value)
  {
    setField(value);
  }

  public quickfix.field.OrderQty get(quickfix.field.OrderQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty getOrderQty() throws FieldNotFound
  {
    quickfix.field.OrderQty value = new quickfix.field.OrderQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderQty field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderQty()
  {
    return isSetField(38);
  }
  
  public void set(quickfix.field.CashOrderQty value)
  {
    setField(value);
  }

  public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound
  {
    quickfix.field.CashOrderQty value = new quickfix.field.CashOrderQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CashOrderQty field)
  {
    return isSetField(field);
  }

  public boolean isSetCashOrderQty()
  {
    return isSetField(152);
  }
  
  public void set(quickfix.field.OrderPercent value)
  {
    setField(value);
  }

  public quickfix.field.OrderPercent get(quickfix.field.OrderPercent  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound
  {
    quickfix.field.OrderPercent value = new quickfix.field.OrderPercent();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderPercent field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderPercent()
  {
    return isSetField(516);
  }
  
  public void set(quickfix.field.RoundingDirection value)
  {
    setField(value);
  }

  public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound
  {
    quickfix.field.RoundingDirection value = new quickfix.field.RoundingDirection();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RoundingDirection field)
  {
    return isSetField(field);
  }

  public boolean isSetRoundingDirection()
  {
    return isSetField(468);
  }
  
  public void set(quickfix.field.RoundingModulus value)
  {
    setField(value);
  }

  public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound
  {
    quickfix.field.RoundingModulus value = new quickfix.field.RoundingModulus();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RoundingModulus field)
  {
    return isSetField(field);
  }

  public boolean isSetRoundingModulus()
  {
    return isSetField(469);
  }
  
  public void set(quickfix.field.ComplianceID value)
  {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound
  {
    quickfix.field.ComplianceID value = new quickfix.field.ComplianceID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ComplianceID field)
  {
    return isSetField(field);
  }

  public boolean isSetComplianceID()
  {
    return isSetField(376);
  }
  
  public void set(quickfix.field.Text value)
  {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound
  {
    quickfix.field.Text value = new quickfix.field.Text();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Text field)
  {
    return isSetField(field);
  }

  public boolean isSetText()
  {
    return isSetField(58);
  }
  
  public void set(quickfix.field.EncodedTextLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound
  {
    quickfix.field.EncodedTextLen value = new quickfix.field.EncodedTextLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedTextLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen()
  {
    return isSetField(354);
  }
  
  public void set(quickfix.field.EncodedText value)
  {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound
  {
    quickfix.field.EncodedText value = new quickfix.field.EncodedText();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedText field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedText()
  {
    return isSetField(355);
  }
  
  }
  
}
  