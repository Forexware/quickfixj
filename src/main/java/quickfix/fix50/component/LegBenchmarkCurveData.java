
package quickfix.fix50.component;
import quickfix.FieldNotFound;


public class LegBenchmarkCurveData extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 676, 677, 678, 679, 680,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public LegBenchmarkCurveData()
  {
    super();
  }
  
  public void set(quickfix.field.LegBenchmarkCurveCurrency value)
  {
    setField(value);
  }

  public quickfix.field.LegBenchmarkCurveCurrency get(quickfix.field.LegBenchmarkCurveCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LegBenchmarkCurveCurrency getLegBenchmarkCurveCurrency() throws FieldNotFound
  {
    quickfix.field.LegBenchmarkCurveCurrency value = new quickfix.field.LegBenchmarkCurveCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LegBenchmarkCurveCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetLegBenchmarkCurveCurrency()
  {
    return isSetField(676);
  }
  
  public void set(quickfix.field.LegBenchmarkCurveName value)
  {
    setField(value);
  }

  public quickfix.field.LegBenchmarkCurveName get(quickfix.field.LegBenchmarkCurveName  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LegBenchmarkCurveName getLegBenchmarkCurveName() throws FieldNotFound
  {
    quickfix.field.LegBenchmarkCurveName value = new quickfix.field.LegBenchmarkCurveName();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LegBenchmarkCurveName field)
  {
    return isSetField(field);
  }

  public boolean isSetLegBenchmarkCurveName()
  {
    return isSetField(677);
  }
  
  public void set(quickfix.field.LegBenchmarkCurvePoint value)
  {
    setField(value);
  }

  public quickfix.field.LegBenchmarkCurvePoint get(quickfix.field.LegBenchmarkCurvePoint  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LegBenchmarkCurvePoint getLegBenchmarkCurvePoint() throws FieldNotFound
  {
    quickfix.field.LegBenchmarkCurvePoint value = new quickfix.field.LegBenchmarkCurvePoint();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LegBenchmarkCurvePoint field)
  {
    return isSetField(field);
  }

  public boolean isSetLegBenchmarkCurvePoint()
  {
    return isSetField(678);
  }
  
  public void set(quickfix.field.LegBenchmarkPrice value)
  {
    setField(value);
  }

  public quickfix.field.LegBenchmarkPrice get(quickfix.field.LegBenchmarkPrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LegBenchmarkPrice getLegBenchmarkPrice() throws FieldNotFound
  {
    quickfix.field.LegBenchmarkPrice value = new quickfix.field.LegBenchmarkPrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LegBenchmarkPrice field)
  {
    return isSetField(field);
  }

  public boolean isSetLegBenchmarkPrice()
  {
    return isSetField(679);
  }
  
  public void set(quickfix.field.LegBenchmarkPriceType value)
  {
    setField(value);
  }

  public quickfix.field.LegBenchmarkPriceType get(quickfix.field.LegBenchmarkPriceType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LegBenchmarkPriceType getLegBenchmarkPriceType() throws FieldNotFound
  {
    quickfix.field.LegBenchmarkPriceType value = new quickfix.field.LegBenchmarkPriceType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LegBenchmarkPriceType field)
  {
    return isSetField(field);
  }

  public boolean isSetLegBenchmarkPriceType()
  {
    return isSetField(680);
  }
  
}
  