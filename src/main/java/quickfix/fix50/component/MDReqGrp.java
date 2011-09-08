
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class MDReqGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 267,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public MDReqGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoMDEntryTypes value)
  {
    setField(value);
  }

  public quickfix.field.NoMDEntryTypes get(quickfix.field.NoMDEntryTypes  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDEntryTypes getNoMDEntryTypes() throws FieldNotFound
  {
    quickfix.field.NoMDEntryTypes value = new quickfix.field.NoMDEntryTypes();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoMDEntryTypes field)
  {
    return isSetField(field);
  }

  public boolean isSetNoMDEntryTypes()
  {
    return isSetField(267);
  }
  
  public static class NoMDEntryTypes extends Group {
    static final long serialVersionUID = 20050617;
    public NoMDEntryTypes() {
        super(267, 269,
            new int[] {269,  0 } );
    }
    
  public void set(quickfix.field.MDEntryType value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound
  {
    quickfix.field.MDEntryType value = new quickfix.field.MDEntryType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryType field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryType()
  {
    return isSetField(269);
  }
  
  }
  
}
  