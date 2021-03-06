
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdSessLstGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 386,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public TrdSessLstGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoTradingSessions value)
  {
    setField(value);
  }

  public quickfix.field.NoTradingSessions get(quickfix.field.NoTradingSessions  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradingSessions getNoTradingSessions() throws FieldNotFound
  {
    quickfix.field.NoTradingSessions value = new quickfix.field.NoTradingSessions();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoTradingSessions field)
  {
    return isSetField(field);
  }

  public boolean isSetNoTradingSessions()
  {
    return isSetField(386);
  }
  
  public static class NoTradingSessions extends Group {
    static final long serialVersionUID = 20050617;
    public NoTradingSessions() {
        super(386, 336,
            new int[] {336, 625, 207, 338, 339, 325, 340, 567, 341, 342, 343, 344, 345, 387, 58, 354, 355,  0 } );
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
  
  public void set(quickfix.field.SecurityExchange value)
  {
    setField(value);
  }

  public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound
  {
    quickfix.field.SecurityExchange value = new quickfix.field.SecurityExchange();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityExchange field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityExchange()
  {
    return isSetField(207);
  }
  
  public void set(quickfix.field.TradSesMethod value)
  {
    setField(value);
  }

  public quickfix.field.TradSesMethod get(quickfix.field.TradSesMethod  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesMethod getTradSesMethod() throws FieldNotFound
  {
    quickfix.field.TradSesMethod value = new quickfix.field.TradSesMethod();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesMethod field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesMethod()
  {
    return isSetField(338);
  }
  
  public void set(quickfix.field.TradSesMode value)
  {
    setField(value);
  }

  public quickfix.field.TradSesMode get(quickfix.field.TradSesMode  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesMode getTradSesMode() throws FieldNotFound
  {
    quickfix.field.TradSesMode value = new quickfix.field.TradSesMode();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesMode field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesMode()
  {
    return isSetField(339);
  }
  
  public void set(quickfix.field.UnsolicitedIndicator value)
  {
    setField(value);
  }

  public quickfix.field.UnsolicitedIndicator get(quickfix.field.UnsolicitedIndicator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound
  {
    quickfix.field.UnsolicitedIndicator value = new quickfix.field.UnsolicitedIndicator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnsolicitedIndicator field)
  {
    return isSetField(field);
  }

  public boolean isSetUnsolicitedIndicator()
  {
    return isSetField(325);
  }
  
  public void set(quickfix.field.TradSesStatus value)
  {
    setField(value);
  }

  public quickfix.field.TradSesStatus get(quickfix.field.TradSesStatus  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesStatus getTradSesStatus() throws FieldNotFound
  {
    quickfix.field.TradSesStatus value = new quickfix.field.TradSesStatus();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesStatus field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesStatus()
  {
    return isSetField(340);
  }
  
  public void set(quickfix.field.TradSesStatusRejReason value)
  {
    setField(value);
  }

  public quickfix.field.TradSesStatusRejReason get(quickfix.field.TradSesStatusRejReason  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesStatusRejReason getTradSesStatusRejReason() throws FieldNotFound
  {
    quickfix.field.TradSesStatusRejReason value = new quickfix.field.TradSesStatusRejReason();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesStatusRejReason field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesStatusRejReason()
  {
    return isSetField(567);
  }
  
  public void set(quickfix.field.TradSesStartTime value)
  {
    setField(value);
  }

  public quickfix.field.TradSesStartTime get(quickfix.field.TradSesStartTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesStartTime getTradSesStartTime() throws FieldNotFound
  {
    quickfix.field.TradSesStartTime value = new quickfix.field.TradSesStartTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesStartTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesStartTime()
  {
    return isSetField(341);
  }
  
  public void set(quickfix.field.TradSesOpenTime value)
  {
    setField(value);
  }

  public quickfix.field.TradSesOpenTime get(quickfix.field.TradSesOpenTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound
  {
    quickfix.field.TradSesOpenTime value = new quickfix.field.TradSesOpenTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesOpenTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesOpenTime()
  {
    return isSetField(342);
  }
  
  public void set(quickfix.field.TradSesPreCloseTime value)
  {
    setField(value);
  }

  public quickfix.field.TradSesPreCloseTime get(quickfix.field.TradSesPreCloseTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound
  {
    quickfix.field.TradSesPreCloseTime value = new quickfix.field.TradSesPreCloseTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesPreCloseTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesPreCloseTime()
  {
    return isSetField(343);
  }
  
  public void set(quickfix.field.TradSesCloseTime value)
  {
    setField(value);
  }

  public quickfix.field.TradSesCloseTime get(quickfix.field.TradSesCloseTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound
  {
    quickfix.field.TradSesCloseTime value = new quickfix.field.TradSesCloseTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesCloseTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesCloseTime()
  {
    return isSetField(344);
  }
  
  public void set(quickfix.field.TradSesEndTime value)
  {
    setField(value);
  }

  public quickfix.field.TradSesEndTime get(quickfix.field.TradSesEndTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradSesEndTime getTradSesEndTime() throws FieldNotFound
  {
    quickfix.field.TradSesEndTime value = new quickfix.field.TradSesEndTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradSesEndTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTradSesEndTime()
  {
    return isSetField(345);
  }
  
  public void set(quickfix.field.TotalVolumeTraded value)
  {
    setField(value);
  }

  public quickfix.field.TotalVolumeTraded get(quickfix.field.TotalVolumeTraded  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound
  {
    quickfix.field.TotalVolumeTraded value = new quickfix.field.TotalVolumeTraded();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TotalVolumeTraded field)
  {
    return isSetField(field);
  }

  public boolean isSetTotalVolumeTraded()
  {
    return isSetField(387);
  }
  
  public void set(quickfix.field.Text value)
  {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound
  {
    quickfix.field.Text value = new quickfix.field.Text();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Text field)
  {
    return isSetField(field);
  }

  public boolean isSetText()
  {
    return isSetField(58);
  }
  
  public void set(quickfix.field.EncodedTextLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound
  {
    quickfix.field.EncodedTextLen value = new quickfix.field.EncodedTextLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedTextLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen()
  {
    return isSetField(354);
  }
  
  public void set(quickfix.field.EncodedText value)
  {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound
  {
    quickfix.field.EncodedText value = new quickfix.field.EncodedText();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedText field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedText()
  {
    return isSetField(355);
  }
  
  }
  
}
  