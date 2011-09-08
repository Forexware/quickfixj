
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class ExecAllocGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 124,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public ExecAllocGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoExecs value)
  {
    setField(value);
  }

  public quickfix.field.NoExecs get(quickfix.field.NoExecs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecs getNoExecs() throws FieldNotFound
  {
    quickfix.field.NoExecs value = new quickfix.field.NoExecs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoExecs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoExecs()
  {
    return isSetField(124);
  }
  
  public static class NoExecs extends Group {
    static final long serialVersionUID = 20050617;
    public NoExecs() {
        super(124, 32,
            new int[] {32, 17, 527, 31, 669, 29, 1003, 1041,  0 } );
    }
    
  public void set(quickfix.field.LastQty value)
  {
    setField(value);
  }

  public quickfix.field.LastQty get(quickfix.field.LastQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastQty getLastQty() throws FieldNotFound
  {
    quickfix.field.LastQty value = new quickfix.field.LastQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastQty field)
  {
    return isSetField(field);
  }

  public boolean isSetLastQty()
  {
    return isSetField(32);
  }
  
  public void set(quickfix.field.ExecID value)
  {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound
  {
    quickfix.field.ExecID value = new quickfix.field.ExecID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecID field)
  {
    return isSetField(field);
  }

  public boolean isSetExecID()
  {
    return isSetField(17);
  }
  
  public void set(quickfix.field.SecondaryExecID value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound
  {
    quickfix.field.SecondaryExecID value = new quickfix.field.SecondaryExecID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryExecID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryExecID()
  {
    return isSetField(527);
  }
  
  public void set(quickfix.field.LastPx value)
  {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound
  {
    quickfix.field.LastPx value = new quickfix.field.LastPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastPx field)
  {
    return isSetField(field);
  }

  public boolean isSetLastPx()
  {
    return isSetField(31);
  }
  
  public void set(quickfix.field.LastParPx value)
  {
    setField(value);
  }

  public quickfix.field.LastParPx get(quickfix.field.LastParPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastParPx getLastParPx() throws FieldNotFound
  {
    quickfix.field.LastParPx value = new quickfix.field.LastParPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastParPx field)
  {
    return isSetField(field);
  }

  public boolean isSetLastParPx()
  {
    return isSetField(669);
  }
  
  public void set(quickfix.field.LastCapacity value)
  {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound
  {
    quickfix.field.LastCapacity value = new quickfix.field.LastCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetLastCapacity()
  {
    return isSetField(29);
  }
  
  public void set(quickfix.field.TradeID value)
  {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound
  {
    quickfix.field.TradeID value = new quickfix.field.TradeID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeID field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeID()
  {
    return isSetField(1003);
  }
  
  public void set(quickfix.field.FirmTradeID value)
  {
    setField(value);
  }

  public quickfix.field.FirmTradeID get(quickfix.field.FirmTradeID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeID getFirmTradeID() throws FieldNotFound
  {
    quickfix.field.FirmTradeID value = new quickfix.field.FirmTradeID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.FirmTradeID field)
  {
    return isSetField(field);
  }

  public boolean isSetFirmTradeID()
  {
    return isSetField(1041);
  }
  
  }
  
}
  