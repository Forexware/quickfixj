
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class AttrbGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 870,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public AttrbGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoInstrAttrib value)
  {
    setField(value);
  }

  public quickfix.field.NoInstrAttrib get(quickfix.field.NoInstrAttrib  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound
  {
    quickfix.field.NoInstrAttrib value = new quickfix.field.NoInstrAttrib();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoInstrAttrib field)
  {
    return isSetField(field);
  }

  public boolean isSetNoInstrAttrib()
  {
    return isSetField(870);
  }
  
  public static class NoInstrAttrib extends Group {
    static final long serialVersionUID = 20050617;
    public NoInstrAttrib() {
        super(870, 871,
            new int[] {871, 872,  0 } );
    }
    
  public void set(quickfix.field.InstrAttribType value)
  {
    setField(value);
  }

  public quickfix.field.InstrAttribType get(quickfix.field.InstrAttribType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.InstrAttribType getInstrAttribType() throws FieldNotFound
  {
    quickfix.field.InstrAttribType value = new quickfix.field.InstrAttribType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.InstrAttribType field)
  {
    return isSetField(field);
  }

  public boolean isSetInstrAttribType()
  {
    return isSetField(871);
  }
  
  public void set(quickfix.field.InstrAttribValue value)
  {
    setField(value);
  }

  public quickfix.field.InstrAttribValue get(quickfix.field.InstrAttribValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.InstrAttribValue getInstrAttribValue() throws FieldNotFound
  {
    quickfix.field.InstrAttribValue value = new quickfix.field.InstrAttribValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.InstrAttribValue field)
  {
    return isSetField(field);
  }

  public boolean isSetInstrAttribValue()
  {
    return isSetField(872);
  }
  
  }
  
}
  