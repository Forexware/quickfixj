
package quickfix.fix43.component;
import quickfix.FieldNotFound;


public class SpreadOrBenchmarkCurveData extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 218, 220, 221, 222,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public SpreadOrBenchmarkCurveData()
  {
    super();
  }
  
  public void set(quickfix.field.Spread value)
  {
    setField(value);
  }

  public quickfix.field.Spread get(quickfix.field.Spread  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Spread getSpread() throws FieldNotFound
  {
    quickfix.field.Spread value = new quickfix.field.Spread();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Spread field)
  {
    return isSetField(field);
  }

  public boolean isSetSpread()
  {
    return isSetField(218);
  }
  
  public void set(quickfix.field.BenchmarkCurveCurrency value)
  {
    setField(value);
  }

  public quickfix.field.BenchmarkCurveCurrency get(quickfix.field.BenchmarkCurveCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound
  {
    quickfix.field.BenchmarkCurveCurrency value = new quickfix.field.BenchmarkCurveCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BenchmarkCurveCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetBenchmarkCurveCurrency()
  {
    return isSetField(220);
  }
  
  public void set(quickfix.field.BenchmarkCurveName value)
  {
    setField(value);
  }

  public quickfix.field.BenchmarkCurveName get(quickfix.field.BenchmarkCurveName  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound
  {
    quickfix.field.BenchmarkCurveName value = new quickfix.field.BenchmarkCurveName();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BenchmarkCurveName field)
  {
    return isSetField(field);
  }

  public boolean isSetBenchmarkCurveName()
  {
    return isSetField(221);
  }
  
  public void set(quickfix.field.BenchmarkCurvePoint value)
  {
    setField(value);
  }

  public quickfix.field.BenchmarkCurvePoint get(quickfix.field.BenchmarkCurvePoint  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound
  {
    quickfix.field.BenchmarkCurvePoint value = new quickfix.field.BenchmarkCurvePoint();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BenchmarkCurvePoint field)
  {
    return isSetField(field);
  }

  public boolean isSetBenchmarkCurvePoint()
  {
    return isSetField(222);
  }
  
}
  