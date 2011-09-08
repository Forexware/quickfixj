
package quickfix.fix43.component;
import quickfix.FieldNotFound;


public class YieldData extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 235, 236,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public YieldData()
  {
    super();
  }
  
  public void set(quickfix.field.YieldType value)
  {
    setField(value);
  }

  public quickfix.field.YieldType get(quickfix.field.YieldType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.YieldType getYieldType() throws FieldNotFound
  {
    quickfix.field.YieldType value = new quickfix.field.YieldType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.YieldType field)
  {
    return isSetField(field);
  }

  public boolean isSetYieldType()
  {
    return isSetField(235);
  }
  
  public void set(quickfix.field.Yield value)
  {
    setField(value);
  }

  public quickfix.field.Yield get(quickfix.field.Yield  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Yield getYield() throws FieldNotFound
  {
    quickfix.field.Yield value = new quickfix.field.Yield();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Yield field)
  {
    return isSetField(field);
  }

  public boolean isSetYield()
  {
    return isSetField(236);
  }
  
}
  