
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlPtysSubGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 801,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public SettlPtysSubGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoSettlPartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoSettlPartySubIDs value = new quickfix.field.NoSettlPartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSettlPartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSettlPartySubIDs()
  {
    return isSetField(801);
  }
  
  public static class NoSettlPartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoSettlPartySubIDs() {
        super(801, 785,
            new int[] {785, 786,  0 } );
    }
    
  public void set(quickfix.field.SettlPartySubID value)
  {
    setField(value);
  }

  public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound
  {
    quickfix.field.SettlPartySubID value = new quickfix.field.SettlPartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlPartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubID()
  {
    return isSetField(785);
  }
  
  public void set(quickfix.field.SettlPartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound
  {
    quickfix.field.SettlPartySubIDType value = new quickfix.field.SettlPartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlPartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlPartySubIDType()
  {
    return isSetField(786);
  }
  
  }
  
}
  