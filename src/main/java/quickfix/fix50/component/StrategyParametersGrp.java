
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class StrategyParametersGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 957,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public StrategyParametersGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoStrategyParameters value)
  {
    setField(value);
  }

  public quickfix.field.NoStrategyParameters get(quickfix.field.NoStrategyParameters  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrategyParameters getNoStrategyParameters() throws FieldNotFound
  {
    quickfix.field.NoStrategyParameters value = new quickfix.field.NoStrategyParameters();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoStrategyParameters field)
  {
    return isSetField(field);
  }

  public boolean isSetNoStrategyParameters()
  {
    return isSetField(957);
  }
  
  public static class NoStrategyParameters extends Group {
    static final long serialVersionUID = 20050617;
    public NoStrategyParameters() {
        super(957, 958,
            new int[] {958, 959, 960,  0 } );
    }
    
  public void set(quickfix.field.StrategyParameterName value)
  {
    setField(value);
  }

  public quickfix.field.StrategyParameterName get(quickfix.field.StrategyParameterName  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterName getStrategyParameterName() throws FieldNotFound
  {
    quickfix.field.StrategyParameterName value = new quickfix.field.StrategyParameterName();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StrategyParameterName field)
  {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterName()
  {
    return isSetField(958);
  }
  
  public void set(quickfix.field.StrategyParameterType value)
  {
    setField(value);
  }

  public quickfix.field.StrategyParameterType get(quickfix.field.StrategyParameterType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterType getStrategyParameterType() throws FieldNotFound
  {
    quickfix.field.StrategyParameterType value = new quickfix.field.StrategyParameterType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StrategyParameterType field)
  {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterType()
  {
    return isSetField(959);
  }
  
  public void set(quickfix.field.StrategyParameterValue value)
  {
    setField(value);
  }

  public quickfix.field.StrategyParameterValue get(quickfix.field.StrategyParameterValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterValue getStrategyParameterValue() throws FieldNotFound
  {
    quickfix.field.StrategyParameterValue value = new quickfix.field.StrategyParameterValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StrategyParameterValue field)
  {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterValue()
  {
    return isSetField(960);
  }
  
  }
  
}
  