
package quickfix.fix41;
import quickfix.FieldNotFound;


public class Advertisement extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "7";
  

  public Advertisement()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public Advertisement(quickfix.field.AdvId advId, quickfix.field.AdvTransType advTransType, quickfix.field.Symbol symbol, quickfix.field.AdvSide advSide, quickfix.field.Shares shares) {
    this();
    setField(advId);
    setField(advTransType);
    setField(symbol);
    setField(advSide);
    setField(shares);
  }
    
  public void set(quickfix.field.AdvId value)
  {
    setField(value);
  }

  public quickfix.field.AdvId get(quickfix.field.AdvId  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AdvId getAdvId() throws FieldNotFound
  {
    quickfix.field.AdvId value = new quickfix.field.AdvId();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AdvId field)
  {
    return isSetField(field);
  }

  public boolean isSetAdvId()
  {
    return isSetField(2);
  }
  
  public void set(quickfix.field.AdvTransType value)
  {
    setField(value);
  }

  public quickfix.field.AdvTransType get(quickfix.field.AdvTransType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AdvTransType getAdvTransType() throws FieldNotFound
  {
    quickfix.field.AdvTransType value = new quickfix.field.AdvTransType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AdvTransType field)
  {
    return isSetField(field);
  }

  public boolean isSetAdvTransType()
  {
    return isSetField(5);
  }
  
  public void set(quickfix.field.AdvRefID value)
  {
    setField(value);
  }

  public quickfix.field.AdvRefID get(quickfix.field.AdvRefID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AdvRefID getAdvRefID() throws FieldNotFound
  {
    quickfix.field.AdvRefID value = new quickfix.field.AdvRefID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AdvRefID field)
  {
    return isSetField(field);
  }

  public boolean isSetAdvRefID()
  {
    return isSetField(3);
  }
  
  public void set(quickfix.field.Symbol value)
  {
    setField(value);
  }

  public quickfix.field.Symbol get(quickfix.field.Symbol  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Symbol getSymbol() throws FieldNotFound
  {
    quickfix.field.Symbol value = new quickfix.field.Symbol();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Symbol field)
  {
    return isSetField(field);
  }

  public boolean isSetSymbol()
  {
    return isSetField(55);
  }
  
  public void set(quickfix.field.SymbolSfx value)
  {
    setField(value);
  }

  public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound
  {
    quickfix.field.SymbolSfx value = new quickfix.field.SymbolSfx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SymbolSfx field)
  {
    return isSetField(field);
  }

  public boolean isSetSymbolSfx()
  {
    return isSetField(65);
  }
  
  public void set(quickfix.field.SecurityID value)
  {
    setField(value);
  }

  public quickfix.field.SecurityID get(quickfix.field.SecurityID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityID getSecurityID() throws FieldNotFound
  {
    quickfix.field.SecurityID value = new quickfix.field.SecurityID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityID()
  {
    return isSetField(48);
  }
  
  public void set(quickfix.field.IDSource value)
  {
    setField(value);
  }

  public quickfix.field.IDSource get(quickfix.field.IDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.IDSource getIDSource() throws FieldNotFound
  {
    quickfix.field.IDSource value = new quickfix.field.IDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.IDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetIDSource()
  {
    return isSetField(22);
  }
  
  public void set(quickfix.field.SecurityType value)
  {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound
  {
    quickfix.field.SecurityType value = new quickfix.field.SecurityType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityType field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityType()
  {
    return isSetField(167);
  }
  
  public void set(quickfix.field.MaturityMonthYear value)
  {
    setField(value);
  }

  public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound
  {
    quickfix.field.MaturityMonthYear value = new quickfix.field.MaturityMonthYear();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MaturityMonthYear field)
  {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYear()
  {
    return isSetField(200);
  }
  
  public void set(quickfix.field.MaturityDay value)
  {
    setField(value);
  }

  public quickfix.field.MaturityDay get(quickfix.field.MaturityDay  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityDay getMaturityDay() throws FieldNotFound
  {
    quickfix.field.MaturityDay value = new quickfix.field.MaturityDay();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MaturityDay field)
  {
    return isSetField(field);
  }

  public boolean isSetMaturityDay()
  {
    return isSetField(205);
  }
  
  public void set(quickfix.field.PutOrCall value)
  {
    setField(value);
  }

  public quickfix.field.PutOrCall get(quickfix.field.PutOrCall  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound
  {
    quickfix.field.PutOrCall value = new quickfix.field.PutOrCall();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PutOrCall field)
  {
    return isSetField(field);
  }

  public boolean isSetPutOrCall()
  {
    return isSetField(201);
  }
  
  public void set(quickfix.field.StrikePrice value)
  {
    setField(value);
  }

  public quickfix.field.StrikePrice get(quickfix.field.StrikePrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound
  {
    quickfix.field.StrikePrice value = new quickfix.field.StrikePrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StrikePrice field)
  {
    return isSetField(field);
  }

  public boolean isSetStrikePrice()
  {
    return isSetField(202);
  }
  
  public void set(quickfix.field.OptAttribute value)
  {
    setField(value);
  }

  public quickfix.field.OptAttribute get(quickfix.field.OptAttribute  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound
  {
    quickfix.field.OptAttribute value = new quickfix.field.OptAttribute();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OptAttribute field)
  {
    return isSetField(field);
  }

  public boolean isSetOptAttribute()
  {
    return isSetField(206);
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
  
  public void set(quickfix.field.Issuer value)
  {
    setField(value);
  }

  public quickfix.field.Issuer get(quickfix.field.Issuer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Issuer getIssuer() throws FieldNotFound
  {
    quickfix.field.Issuer value = new quickfix.field.Issuer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Issuer field)
  {
    return isSetField(field);
  }

  public boolean isSetIssuer()
  {
    return isSetField(106);
  }
  
  public void set(quickfix.field.SecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound
  {
    quickfix.field.SecurityDesc value = new quickfix.field.SecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityDesc()
  {
    return isSetField(107);
  }
  
  public void set(quickfix.field.AdvSide value)
  {
    setField(value);
  }

  public quickfix.field.AdvSide get(quickfix.field.AdvSide  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AdvSide getAdvSide() throws FieldNotFound
  {
    quickfix.field.AdvSide value = new quickfix.field.AdvSide();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AdvSide field)
  {
    return isSetField(field);
  }

  public boolean isSetAdvSide()
  {
    return isSetField(4);
  }
  
  public void set(quickfix.field.Shares value)
  {
    setField(value);
  }

  public quickfix.field.Shares get(quickfix.field.Shares  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Shares getShares() throws FieldNotFound
  {
    quickfix.field.Shares value = new quickfix.field.Shares();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Shares field)
  {
    return isSetField(field);
  }

  public boolean isSetShares()
  {
    return isSetField(53);
  }
  
  public void set(quickfix.field.Price value)
  {
    setField(value);
  }

  public quickfix.field.Price get(quickfix.field.Price  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Price getPrice() throws FieldNotFound
  {
    quickfix.field.Price value = new quickfix.field.Price();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Price field)
  {
    return isSetField(field);
  }

  public boolean isSetPrice()
  {
    return isSetField(44);
  }
  
  public void set(quickfix.field.Currency value)
  {
    setField(value);
  }

  public quickfix.field.Currency get(quickfix.field.Currency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Currency getCurrency() throws FieldNotFound
  {
    quickfix.field.Currency value = new quickfix.field.Currency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Currency field)
  {
    return isSetField(field);
  }

  public boolean isSetCurrency()
  {
    return isSetField(15);
  }
  
  public void set(quickfix.field.TradeDate value)
  {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound
  {
    quickfix.field.TradeDate value = new quickfix.field.TradeDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeDate field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeDate()
  {
    return isSetField(75);
  }
  
  public void set(quickfix.field.TransactTime value)
  {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound
  {
    quickfix.field.TransactTime value = new quickfix.field.TransactTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TransactTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTransactTime()
  {
    return isSetField(60);
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
  
  public void set(quickfix.field.URLLink value)
  {
    setField(value);
  }

  public quickfix.field.URLLink get(quickfix.field.URLLink  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.URLLink getURLLink() throws FieldNotFound
  {
    quickfix.field.URLLink value = new quickfix.field.URLLink();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.URLLink field)
  {
    return isSetField(field);
  }

  public boolean isSetURLLink()
  {
    return isSetField(149);
  }
  
  public void set(quickfix.field.LastMkt value)
  {
    setField(value);
  }

  public quickfix.field.LastMkt get(quickfix.field.LastMkt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastMkt getLastMkt() throws FieldNotFound
  {
    quickfix.field.LastMkt value = new quickfix.field.LastMkt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastMkt field)
  {
    return isSetField(field);
  }

  public boolean isSetLastMkt()
  {
    return isSetField(30);
  }
  
}
  