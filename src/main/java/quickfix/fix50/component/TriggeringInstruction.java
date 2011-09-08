
package quickfix.fix50.component;
import quickfix.FieldNotFound;


public class TriggeringInstruction extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public TriggeringInstruction()
  {
    super();
  }
  
  public void set(quickfix.field.TriggerType value)
  {
    setField(value);
  }

  public quickfix.field.TriggerType get(quickfix.field.TriggerType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerType getTriggerType() throws FieldNotFound
  {
    quickfix.field.TriggerType value = new quickfix.field.TriggerType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerType field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerType()
  {
    return isSetField(1100);
  }
  
  public void set(quickfix.field.TriggerAction value)
  {
    setField(value);
  }

  public quickfix.field.TriggerAction get(quickfix.field.TriggerAction  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerAction getTriggerAction() throws FieldNotFound
  {
    quickfix.field.TriggerAction value = new quickfix.field.TriggerAction();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerAction field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerAction()
  {
    return isSetField(1101);
  }
  
  public void set(quickfix.field.TriggerPrice value)
  {
    setField(value);
  }

  public quickfix.field.TriggerPrice get(quickfix.field.TriggerPrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerPrice getTriggerPrice() throws FieldNotFound
  {
    quickfix.field.TriggerPrice value = new quickfix.field.TriggerPrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerPrice field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerPrice()
  {
    return isSetField(1102);
  }
  
  public void set(quickfix.field.TriggerSymbol value)
  {
    setField(value);
  }

  public quickfix.field.TriggerSymbol get(quickfix.field.TriggerSymbol  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerSymbol getTriggerSymbol() throws FieldNotFound
  {
    quickfix.field.TriggerSymbol value = new quickfix.field.TriggerSymbol();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerSymbol field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerSymbol()
  {
    return isSetField(1103);
  }
  
  public void set(quickfix.field.TriggerSecurityID value)
  {
    setField(value);
  }

  public quickfix.field.TriggerSecurityID get(quickfix.field.TriggerSecurityID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerSecurityID getTriggerSecurityID() throws FieldNotFound
  {
    quickfix.field.TriggerSecurityID value = new quickfix.field.TriggerSecurityID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerSecurityID field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerSecurityID()
  {
    return isSetField(1104);
  }
  
  public void set(quickfix.field.TriggerSecurityIDSource value)
  {
    setField(value);
  }

  public quickfix.field.TriggerSecurityIDSource get(quickfix.field.TriggerSecurityIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerSecurityIDSource getTriggerSecurityIDSource() throws FieldNotFound
  {
    quickfix.field.TriggerSecurityIDSource value = new quickfix.field.TriggerSecurityIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerSecurityIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerSecurityIDSource()
  {
    return isSetField(1105);
  }
  
  public void set(quickfix.field.TriggerSecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.TriggerSecurityDesc get(quickfix.field.TriggerSecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerSecurityDesc getTriggerSecurityDesc() throws FieldNotFound
  {
    quickfix.field.TriggerSecurityDesc value = new quickfix.field.TriggerSecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerSecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerSecurityDesc()
  {
    return isSetField(1106);
  }
  
  public void set(quickfix.field.TriggerPriceType value)
  {
    setField(value);
  }

  public quickfix.field.TriggerPriceType get(quickfix.field.TriggerPriceType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerPriceType getTriggerPriceType() throws FieldNotFound
  {
    quickfix.field.TriggerPriceType value = new quickfix.field.TriggerPriceType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerPriceType field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerPriceType()
  {
    return isSetField(1107);
  }
  
  public void set(quickfix.field.TriggerPriceTypeScope value)
  {
    setField(value);
  }

  public quickfix.field.TriggerPriceTypeScope get(quickfix.field.TriggerPriceTypeScope  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerPriceTypeScope getTriggerPriceTypeScope() throws FieldNotFound
  {
    quickfix.field.TriggerPriceTypeScope value = new quickfix.field.TriggerPriceTypeScope();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerPriceTypeScope field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerPriceTypeScope()
  {
    return isSetField(1108);
  }
  
  public void set(quickfix.field.TriggerPriceDirection value)
  {
    setField(value);
  }

  public quickfix.field.TriggerPriceDirection get(quickfix.field.TriggerPriceDirection  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerPriceDirection getTriggerPriceDirection() throws FieldNotFound
  {
    quickfix.field.TriggerPriceDirection value = new quickfix.field.TriggerPriceDirection();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerPriceDirection field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerPriceDirection()
  {
    return isSetField(1109);
  }
  
  public void set(quickfix.field.TriggerNewPrice value)
  {
    setField(value);
  }

  public quickfix.field.TriggerNewPrice get(quickfix.field.TriggerNewPrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerNewPrice getTriggerNewPrice() throws FieldNotFound
  {
    quickfix.field.TriggerNewPrice value = new quickfix.field.TriggerNewPrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerNewPrice field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerNewPrice()
  {
    return isSetField(1110);
  }
  
  public void set(quickfix.field.TriggerOrderType value)
  {
    setField(value);
  }

  public quickfix.field.TriggerOrderType get(quickfix.field.TriggerOrderType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerOrderType getTriggerOrderType() throws FieldNotFound
  {
    quickfix.field.TriggerOrderType value = new quickfix.field.TriggerOrderType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerOrderType field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerOrderType()
  {
    return isSetField(1111);
  }
  
  public void set(quickfix.field.TriggerNewQty value)
  {
    setField(value);
  }

  public quickfix.field.TriggerNewQty get(quickfix.field.TriggerNewQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerNewQty getTriggerNewQty() throws FieldNotFound
  {
    quickfix.field.TriggerNewQty value = new quickfix.field.TriggerNewQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerNewQty field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerNewQty()
  {
    return isSetField(1112);
  }
  
  public void set(quickfix.field.TriggerTradingSessionID value)
  {
    setField(value);
  }

  public quickfix.field.TriggerTradingSessionID get(quickfix.field.TriggerTradingSessionID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerTradingSessionID getTriggerTradingSessionID() throws FieldNotFound
  {
    quickfix.field.TriggerTradingSessionID value = new quickfix.field.TriggerTradingSessionID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerTradingSessionID field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerTradingSessionID()
  {
    return isSetField(1113);
  }
  
  public void set(quickfix.field.TriggerTradingSessionSubID value)
  {
    setField(value);
  }

  public quickfix.field.TriggerTradingSessionSubID get(quickfix.field.TriggerTradingSessionSubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TriggerTradingSessionSubID getTriggerTradingSessionSubID() throws FieldNotFound
  {
    quickfix.field.TriggerTradingSessionSubID value = new quickfix.field.TriggerTradingSessionSubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TriggerTradingSessionSubID field)
  {
    return isSetField(field);
  }

  public boolean isSetTriggerTradingSessionSubID()
  {
    return isSetField(1114);
  }
  
}
  