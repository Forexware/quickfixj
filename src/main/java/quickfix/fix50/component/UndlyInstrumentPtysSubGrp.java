
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class UndlyInstrumentPtysSubGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 1062,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public UndlyInstrumentPtysSubGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoUndlyInstrumentPartySubIDs value = new quickfix.field.NoUndlyInstrumentPartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentPartySubIDs()
  {
    return isSetField(1062);
  }
  
  public static class NoUndlyInstrumentPartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoUndlyInstrumentPartySubIDs() {
        super(1062, 1063,
            new int[] {1063, 1064,  0 } );
    }
    
  public void set(quickfix.field.UndlyInstrumentPartySubID value)
  {
    setField(value);
  }

  public quickfix.field.UndlyInstrumentPartySubID get(quickfix.field.UndlyInstrumentPartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UndlyInstrumentPartySubID getUndlyInstrumentPartySubID() throws FieldNotFound
  {
    quickfix.field.UndlyInstrumentPartySubID value = new quickfix.field.UndlyInstrumentPartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UndlyInstrumentPartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetUndlyInstrumentPartySubID()
  {
    return isSetField(1063);
  }
  
  public void set(quickfix.field.UndlyInstrumentPartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.UndlyInstrumentPartySubIDType get(quickfix.field.UndlyInstrumentPartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UndlyInstrumentPartySubIDType getUndlyInstrumentPartySubIDType() throws FieldNotFound
  {
    quickfix.field.UndlyInstrumentPartySubIDType value = new quickfix.field.UndlyInstrumentPartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UndlyInstrumentPartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetUndlyInstrumentPartySubIDType()
  {
    return isSetField(1064);
  }
  
  }
  
}
  