
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class BidCompReqGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 420,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public BidCompReqGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoBidComponents value)
  {
    setField(value);
  }

  public quickfix.field.NoBidComponents get(quickfix.field.NoBidComponents  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoBidComponents getNoBidComponents() throws FieldNotFound
  {
    quickfix.field.NoBidComponents value = new quickfix.field.NoBidComponents();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoBidComponents field)
  {
    return isSetField(field);
  }

  public boolean isSetNoBidComponents()
  {
    return isSetField(420);
  }
  
  public static class NoBidComponents extends Group {
    static final long serialVersionUID = 20050617;
    public NoBidComponents() {
        super(420, 66,
            new int[] {66, 54, 336, 625, 430, 63, 64, 1, 660,  0 } );
    }
    
  public void set(quickfix.field.ListID value)
  {
    setField(value);
  }

  public quickfix.field.ListID get(quickfix.field.ListID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ListID getListID() throws FieldNotFound
  {
    quickfix.field.ListID value = new quickfix.field.ListID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ListID field)
  {
    return isSetField(field);
  }

  public boolean isSetListID()
  {
    return isSetField(66);
  }
  
  public void set(quickfix.field.Side value)
  {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound
  {
    quickfix.field.Side value = new quickfix.field.Side();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Side field)
  {
    return isSetField(field);
  }

  public boolean isSetSide()
  {
    return isSetField(54);
  }
  
  public void set(quickfix.field.TradingSessionID value)
  {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound
  {
    quickfix.field.TradingSessionID value = new quickfix.field.TradingSessionID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradingSessionID field)
  {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID()
  {
    return isSetField(336);
  }
  
  public void set(quickfix.field.TradingSessionSubID value)
  {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound
  {
    quickfix.field.TradingSessionSubID value = new quickfix.field.TradingSessionSubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field)
  {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID()
  {
    return isSetField(625);
  }
  
  public void set(quickfix.field.NetGrossInd value)
  {
    setField(value);
  }

  public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound
  {
    quickfix.field.NetGrossInd value = new quickfix.field.NetGrossInd();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NetGrossInd field)
  {
    return isSetField(field);
  }

  public boolean isSetNetGrossInd()
  {
    return isSetField(430);
  }
  
  public void set(quickfix.field.SettlType value)
  {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound
  {
    quickfix.field.SettlType value = new quickfix.field.SettlType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlType field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlType()
  {
    return isSetField(63);
  }
  
  public void set(quickfix.field.SettlDate value)
  {
    setField(value);
  }

  public quickfix.field.SettlDate get(quickfix.field.SettlDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlDate getSettlDate() throws FieldNotFound
  {
    quickfix.field.SettlDate value = new quickfix.field.SettlDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlDate field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlDate()
  {
    return isSetField(64);
  }
  
  public void set(quickfix.field.Account value)
  {
    setField(value);
  }

  public quickfix.field.Account get(quickfix.field.Account  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Account getAccount() throws FieldNotFound
  {
    quickfix.field.Account value = new quickfix.field.Account();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Account field)
  {
    return isSetField(field);
  }

  public boolean isSetAccount()
  {
    return isSetField(1);
  }
  
  public void set(quickfix.field.AcctIDSource value)
  {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound
  {
    quickfix.field.AcctIDSource value = new quickfix.field.AcctIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AcctIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource()
  {
    return isSetField(660);
  }
  
  }
  
}
  