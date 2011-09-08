
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class UndlyInstrumentParties extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 1058,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public UndlyInstrumentParties()
  {
    super();
  }
  
  public void set(quickfix.field.NoUndlyInstrumentParties value)
  {
    setField(value);
  }

  public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound
  {
    quickfix.field.NoUndlyInstrumentParties value = new quickfix.field.NoUndlyInstrumentParties();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoUndlyInstrumentParties field)
  {
    return isSetField(field);
  }

  public boolean isSetNoUndlyInstrumentParties()
  {
    return isSetField(1058);
  }
  
  public static class NoUndlyInstrumentParties extends Group {
    static final long serialVersionUID = 20050617;
    public NoUndlyInstrumentParties() {
        super(1058, 1059,
            new int[] {1059, 1060, 1061, 1062,  0 } );
    }
    
  public void set(quickfix.field.UndlyInstrumentPartyID value)
  {
    setField(value);
  }

  public quickfix.field.UndlyInstrumentPartyID get(quickfix.field.UndlyInstrumentPartyID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UndlyInstrumentPartyID getUndlyInstrumentPartyID() throws FieldNotFound
  {
    quickfix.field.UndlyInstrumentPartyID value = new quickfix.field.UndlyInstrumentPartyID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UndlyInstrumentPartyID field)
  {
    return isSetField(field);
  }

  public boolean isSetUndlyInstrumentPartyID()
  {
    return isSetField(1059);
  }
  
  public void set(quickfix.field.UndlyInstrumentPartyIDSource value)
  {
    setField(value);
  }

  public quickfix.field.UndlyInstrumentPartyIDSource get(quickfix.field.UndlyInstrumentPartyIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UndlyInstrumentPartyIDSource getUndlyInstrumentPartyIDSource() throws FieldNotFound
  {
    quickfix.field.UndlyInstrumentPartyIDSource value = new quickfix.field.UndlyInstrumentPartyIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UndlyInstrumentPartyIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetUndlyInstrumentPartyIDSource()
  {
    return isSetField(1060);
  }
  
  public void set(quickfix.field.UndlyInstrumentPartyRole value)
  {
    setField(value);
  }

  public quickfix.field.UndlyInstrumentPartyRole get(quickfix.field.UndlyInstrumentPartyRole  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UndlyInstrumentPartyRole getUndlyInstrumentPartyRole() throws FieldNotFound
  {
    quickfix.field.UndlyInstrumentPartyRole value = new quickfix.field.UndlyInstrumentPartyRole();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UndlyInstrumentPartyRole field)
  {
    return isSetField(field);
  }

  public boolean isSetUndlyInstrumentPartyRole()
  {
    return isSetField(1061);
  }
  
  public void set(quickfix.fix50.component.UndlyInstrumentPtysSubGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.UndlyInstrumentPtysSubGrp get(quickfix.fix50.component.UndlyInstrumentPtysSubGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrp() throws FieldNotFound
  {
    quickfix.fix50.component.UndlyInstrumentPtysSubGrp component = new quickfix.fix50.component.UndlyInstrumentPtysSubGrp();
    getComponent(component);
    return component;
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
  
}
  