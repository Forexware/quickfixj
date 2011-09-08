
package quickfix.fix50.component;
import quickfix.FieldNotFound;


public class LegSecAltIDGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 604,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public LegSecAltIDGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoLegSecurityAltID value)
  {
    setField(value);
  }

  public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound
  {
    quickfix.field.NoLegSecurityAltID value = new quickfix.field.NoLegSecurityAltID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoLegSecurityAltID field)
  {
    return isSetField(field);
  }

  public boolean isSetNoLegSecurityAltID()
  {
    return isSetField(604);
  }
  
}
  