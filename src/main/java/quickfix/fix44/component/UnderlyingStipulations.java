
package quickfix.fix44.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class UnderlyingStipulations extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 887,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public UnderlyingStipulations()
  {
    super();
  }
  
  public void set(quickfix.field.NoUnderlyingStips value)
  {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound
  {
    quickfix.field.NoUnderlyingStips value = new quickfix.field.NoUnderlyingStips();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoUnderlyingStips field)
  {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStips()
  {
    return isSetField(887);
  }
  
  public static class NoUnderlyingStips extends Group {
    static final long serialVersionUID = 20050617;
    public NoUnderlyingStips() {
        super(887, 888,
            new int[] {888, 889,  0 } );
    }
    
  public void set(quickfix.field.UnderlyingStipType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound
  {
    quickfix.field.UnderlyingStipType value = new quickfix.field.UnderlyingStipType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStipType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipType()
  {
    return isSetField(888);
  }
  
  public void set(quickfix.field.UnderlyingStipValue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound
  {
    quickfix.field.UnderlyingStipValue value = new quickfix.field.UnderlyingStipValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStipValue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipValue()
  {
    return isSetField(889);
  }
  
  }
  
}
  