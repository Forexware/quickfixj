
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class SideTrdRegTS extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 1016,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public SideTrdRegTS()
  {
    super();
  }
  
  public void set(quickfix.field.NoSideTrdRegTS value)
  {
    setField(value);
  }

  public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound
  {
    quickfix.field.NoSideTrdRegTS value = new quickfix.field.NoSideTrdRegTS();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSideTrdRegTS field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSideTrdRegTS()
  {
    return isSetField(1016);
  }
  
  public static class NoSideTrdRegTS extends Group {
    static final long serialVersionUID = 20050617;
    public NoSideTrdRegTS() {
        super(1016, 1012,
            new int[] {1012, 1013, 1014,  0 } );
    }
    
  public void set(quickfix.field.SideTrdRegTimestamp value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestamp value = new quickfix.field.SideTrdRegTimestamp();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestamp field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestamp()
  {
    return isSetField(1012);
  }
  
  public void set(quickfix.field.SideTrdRegTimestampType value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestampType value = new quickfix.field.SideTrdRegTimestampType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampType field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampType()
  {
    return isSetField(1013);
  }
  
  public void set(quickfix.field.SideTrdRegTimestampSrc value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestampSrc value = new quickfix.field.SideTrdRegTimestampSrc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampSrc()
  {
    return isSetField(1014);
  }
  
  }
  
}
  