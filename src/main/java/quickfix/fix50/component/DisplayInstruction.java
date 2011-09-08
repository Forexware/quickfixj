
package quickfix.fix50.component;
import quickfix.FieldNotFound;


public class DisplayInstruction extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 1082, 1083, 1084, 1085, 1086, 1087, 1088, 1138,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public DisplayInstruction()
  {
    super();
  }
  
  public void set(quickfix.field.SecondaryDisplayQty value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryDisplayQty get(quickfix.field.SecondaryDisplayQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryDisplayQty getSecondaryDisplayQty() throws FieldNotFound
  {
    quickfix.field.SecondaryDisplayQty value = new quickfix.field.SecondaryDisplayQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryDisplayQty field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryDisplayQty()
  {
    return isSetField(1082);
  }
  
  public void set(quickfix.field.DisplayWhen value)
  {
    setField(value);
  }

  public quickfix.field.DisplayWhen get(quickfix.field.DisplayWhen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayWhen getDisplayWhen() throws FieldNotFound
  {
    quickfix.field.DisplayWhen value = new quickfix.field.DisplayWhen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayWhen field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayWhen()
  {
    return isSetField(1083);
  }
  
  public void set(quickfix.field.DisplayMethod value)
  {
    setField(value);
  }

  public quickfix.field.DisplayMethod get(quickfix.field.DisplayMethod  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayMethod getDisplayMethod() throws FieldNotFound
  {
    quickfix.field.DisplayMethod value = new quickfix.field.DisplayMethod();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayMethod field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayMethod()
  {
    return isSetField(1084);
  }
  
  public void set(quickfix.field.DisplayLowQty value)
  {
    setField(value);
  }

  public quickfix.field.DisplayLowQty get(quickfix.field.DisplayLowQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayLowQty getDisplayLowQty() throws FieldNotFound
  {
    quickfix.field.DisplayLowQty value = new quickfix.field.DisplayLowQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayLowQty field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayLowQty()
  {
    return isSetField(1085);
  }
  
  public void set(quickfix.field.DisplayHighQty value)
  {
    setField(value);
  }

  public quickfix.field.DisplayHighQty get(quickfix.field.DisplayHighQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayHighQty getDisplayHighQty() throws FieldNotFound
  {
    quickfix.field.DisplayHighQty value = new quickfix.field.DisplayHighQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayHighQty field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayHighQty()
  {
    return isSetField(1086);
  }
  
  public void set(quickfix.field.DisplayMinIncr value)
  {
    setField(value);
  }

  public quickfix.field.DisplayMinIncr get(quickfix.field.DisplayMinIncr  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayMinIncr getDisplayMinIncr() throws FieldNotFound
  {
    quickfix.field.DisplayMinIncr value = new quickfix.field.DisplayMinIncr();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayMinIncr field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayMinIncr()
  {
    return isSetField(1087);
  }
  
  public void set(quickfix.field.RefreshQty value)
  {
    setField(value);
  }

  public quickfix.field.RefreshQty get(quickfix.field.RefreshQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RefreshQty getRefreshQty() throws FieldNotFound
  {
    quickfix.field.RefreshQty value = new quickfix.field.RefreshQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RefreshQty field)
  {
    return isSetField(field);
  }

  public boolean isSetRefreshQty()
  {
    return isSetField(1088);
  }
  
  public void set(quickfix.field.DisplayQty value)
  {
    setField(value);
  }

  public quickfix.field.DisplayQty get(quickfix.field.DisplayQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayQty getDisplayQty() throws FieldNotFound
  {
    quickfix.field.DisplayQty value = new quickfix.field.DisplayQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DisplayQty field)
  {
    return isSetField(field);
  }

  public boolean isSetDisplayQty()
  {
    return isSetField(1138);
  }
  
}
  