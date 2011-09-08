
package quickfix.fix43.component;
import quickfix.FieldNotFound;


public class CommissionData extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = { 12, 13, 479, 497,  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public CommissionData()
  {
    super();
  }
  
  public void set(quickfix.field.Commission value)
  {
    setField(value);
  }

  public quickfix.field.Commission get(quickfix.field.Commission  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Commission getCommission() throws FieldNotFound
  {
    quickfix.field.Commission value = new quickfix.field.Commission();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Commission field)
  {
    return isSetField(field);
  }

  public boolean isSetCommission()
  {
    return isSetField(12);
  }
  
  public void set(quickfix.field.CommType value)
  {
    setField(value);
  }

  public quickfix.field.CommType get(quickfix.field.CommType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CommType getCommType() throws FieldNotFound
  {
    quickfix.field.CommType value = new quickfix.field.CommType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CommType field)
  {
    return isSetField(field);
  }

  public boolean isSetCommType()
  {
    return isSetField(13);
  }
  
  public void set(quickfix.field.CommCurrency value)
  {
    setField(value);
  }

  public quickfix.field.CommCurrency get(quickfix.field.CommCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound
  {
    quickfix.field.CommCurrency value = new quickfix.field.CommCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CommCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetCommCurrency()
  {
    return isSetField(479);
  }
  
  public void set(quickfix.field.FundRenewWaiv value)
  {
    setField(value);
  }

  public quickfix.field.FundRenewWaiv get(quickfix.field.FundRenewWaiv  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound
  {
    quickfix.field.FundRenewWaiv value = new quickfix.field.FundRenewWaiv();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.FundRenewWaiv field)
  {
    return isSetField(field);
  }

  public boolean isSetFundRenewWaiv()
  {
    return isSetField(497);
  }
  
}
  