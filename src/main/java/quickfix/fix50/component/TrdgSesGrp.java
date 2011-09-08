
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdgSesGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 386,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public TrdgSesGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoTradingSessions value)
  {
    setField(value);
  }

  public quickfix.field.NoTradingSessions get(quickfix.field.NoTradingSessions  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradingSessions getNoTradingSessions() throws FieldNotFound
  {
    quickfix.field.NoTradingSessions value = new quickfix.field.NoTradingSessions();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoTradingSessions field)
  {
    return isSetField(field);
  }

  public boolean isSetNoTradingSessions()
  {
    return isSetField(386);
  }
  
  public static class NoTradingSessions extends Group {
    static final long serialVersionUID = 20050617;
    public NoTradingSessions() {
        super(386, 336,
            new int[] {336, 625,  0 } );
    }
    
  public void set(quickfix.field.TradingSessionID value)
  {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound
  {
    quickfix.field.TradingSessionID value = new quickfix.field.TradingSessionID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradingSessionID field)
  {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID()
  {
    return isSetField(336);
  }
  
  public void set(quickfix.field.TradingSessionSubID value)
  {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound
  {
    quickfix.field.TradingSessionSubID value = new quickfix.field.TradingSessionSubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field)
  {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID()
  {
    return isSetField(625);
  }
  
  }
  
}
  