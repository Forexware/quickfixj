
package quickfix.fix41;
import quickfix.FieldNotFound;


public class ExecutionReport extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "8";
  

  public ExecutionReport()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public ExecutionReport(quickfix.field.OrderID orderID, quickfix.field.ExecID execID, quickfix.field.ExecTransType execTransType, quickfix.field.ExecType execType, quickfix.field.OrdStatus ordStatus, quickfix.field.Symbol symbol, quickfix.field.Side side, quickfix.field.OrderQty orderQty, quickfix.field.LastShares lastShares, quickfix.field.LastPx lastPx, quickfix.field.LeavesQty leavesQty, quickfix.field.CumQty cumQty, quickfix.field.AvgPx avgPx) {
    this();
    setField(orderID);
    setField(execID);
    setField(execTransType);
    setField(execType);
    setField(ordStatus);
    setField(symbol);
    setField(side);
    setField(orderQty);
    setField(lastShares);
    setField(lastPx);
    setField(leavesQty);
    setField(cumQty);
    setField(avgPx);
  }
    
  public void set(quickfix.field.OrderID value)
  {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound
  {
    quickfix.field.OrderID value = new quickfix.field.OrderID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderID field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderID()
  {
    return isSetField(37);
  }
  
  public void set(quickfix.field.SecondaryOrderID value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound
  {
    quickfix.field.SecondaryOrderID value = new quickfix.field.SecondaryOrderID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryOrderID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryOrderID()
  {
    return isSetField(198);
  }
  
  public void set(quickfix.field.ClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound
  {
    quickfix.field.ClOrdID value = new quickfix.field.ClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetClOrdID()
  {
    return isSetField(11);
  }
  
  public void set(quickfix.field.OrigClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound
  {
    quickfix.field.OrigClOrdID value = new quickfix.field.OrigClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrigClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID()
  {
    return isSetField(41);
  }
  
  public void set(quickfix.field.ClientID value)
  {
    setField(value);
  }

  public quickfix.field.ClientID get(quickfix.field.ClientID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClientID getClientID() throws FieldNotFound
  {
    quickfix.field.ClientID value = new quickfix.field.ClientID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClientID field)
  {
    return isSetField(field);
  }

  public boolean isSetClientID()
  {
    return isSetField(109);
  }
  
  public void set(quickfix.field.ExecBroker value)
  {
    setField(value);
  }

  public quickfix.field.ExecBroker get(quickfix.field.ExecBroker  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecBroker getExecBroker() throws FieldNotFound
  {
    quickfix.field.ExecBroker value = new quickfix.field.ExecBroker();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecBroker field)
  {
    return isSetField(field);
  }

  public boolean isSetExecBroker()
  {
    return isSetField(76);
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
  
  public void set(quickfix.field.ExecID value)
  {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound
  {
    quickfix.field.ExecID value = new quickfix.field.ExecID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecID field)
  {
    return isSetField(field);
  }

  public boolean isSetExecID()
  {
    return isSetField(17);
  }
  
  public void set(quickfix.field.ExecTransType value)
  {
    setField(value);
  }

  public quickfix.field.ExecTransType get(quickfix.field.ExecTransType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecTransType getExecTransType() throws FieldNotFound
  {
    quickfix.field.ExecTransType value = new quickfix.field.ExecTransType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecTransType field)
  {
    return isSetField(field);
  }

  public boolean isSetExecTransType()
  {
    return isSetField(20);
  }
  
  public void set(quickfix.field.ExecRefID value)
  {
    setField(value);
  }

  public quickfix.field.ExecRefID get(quickfix.field.ExecRefID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecRefID getExecRefID() throws FieldNotFound
  {
    quickfix.field.ExecRefID value = new quickfix.field.ExecRefID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecRefID field)
  {
    return isSetField(field);
  }

  public boolean isSetExecRefID()
  {
    return isSetField(19);
  }
  
  public void set(quickfix.field.ExecType value)
  {
    setField(value);
  }

  public quickfix.field.ExecType get(quickfix.field.ExecType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecType getExecType() throws FieldNotFound
  {
    quickfix.field.ExecType value = new quickfix.field.ExecType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecType field)
  {
    return isSetField(field);
  }

  public boolean isSetExecType()
  {
    return isSetField(150);
  }
  
  public void set(quickfix.field.OrdStatus value)
  {
    setField(value);
  }

  public quickfix.field.OrdStatus get(quickfix.field.OrdStatus  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound
  {
    quickfix.field.OrdStatus value = new quickfix.field.OrdStatus();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrdStatus field)
  {
    return isSetField(field);
  }

  public boolean isSetOrdStatus()
  {
    return isSetField(39);
  }
  
  public void set(quickfix.field.OrdRejReason value)
  {
    setField(value);
  }

  public quickfix.field.OrdRejReason get(quickfix.field.OrdRejReason  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound
  {
    quickfix.field.OrdRejReason value = new quickfix.field.OrdRejReason();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrdRejReason field)
  {
    return isSetField(field);
  }

  public boolean isSetOrdRejReason()
  {
    return isSetField(103);
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
  
  public void set(quickfix.field.SettlmntTyp value)
  {
    setField(value);
  }

  public quickfix.field.SettlmntTyp get(quickfix.field.SettlmntTyp  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound
  {
    quickfix.field.SettlmntTyp value = new quickfix.field.SettlmntTyp();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlmntTyp field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlmntTyp()
  {
    return isSetField(63);
  }
  
  public void set(quickfix.field.FutSettDate value)
  {
    setField(value);
  }

  public quickfix.field.FutSettDate get(quickfix.field.FutSettDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound
  {
    quickfix.field.FutSettDate value = new quickfix.field.FutSettDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.FutSettDate field)
  {
    return isSetField(field);
  }

  public boolean isSetFutSettDate()
  {
    return isSetField(64);
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
  
  public void set(quickfix.field.OrderQty value)
  {
    setField(value);
  }

  public quickfix.field.OrderQty get(quickfix.field.OrderQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderQty getOrderQty() throws FieldNotFound
  {
    quickfix.field.OrderQty value = new quickfix.field.OrderQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderQty field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderQty()
  {
    return isSetField(38);
  }
  
  public void set(quickfix.field.OrdType value)
  {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound
  {
    quickfix.field.OrdType value = new quickfix.field.OrdType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrdType field)
  {
    return isSetField(field);
  }

  public boolean isSetOrdType()
  {
    return isSetField(40);
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
  
  public void set(quickfix.field.StopPx value)
  {
    setField(value);
  }

  public quickfix.field.StopPx get(quickfix.field.StopPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StopPx getStopPx() throws FieldNotFound
  {
    quickfix.field.StopPx value = new quickfix.field.StopPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StopPx field)
  {
    return isSetField(field);
  }

  public boolean isSetStopPx()
  {
    return isSetField(99);
  }
  
  public void set(quickfix.field.PegDifference value)
  {
    setField(value);
  }

  public quickfix.field.PegDifference get(quickfix.field.PegDifference  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PegDifference getPegDifference() throws FieldNotFound
  {
    quickfix.field.PegDifference value = new quickfix.field.PegDifference();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PegDifference field)
  {
    return isSetField(field);
  }

  public boolean isSetPegDifference()
  {
    return isSetField(211);
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
  
  public void set(quickfix.field.TimeInForce value)
  {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound
  {
    quickfix.field.TimeInForce value = new quickfix.field.TimeInForce();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TimeInForce field)
  {
    return isSetField(field);
  }

  public boolean isSetTimeInForce()
  {
    return isSetField(59);
  }
  
  public void set(quickfix.field.ExpireTime value)
  {
    setField(value);
  }

  public quickfix.field.ExpireTime get(quickfix.field.ExpireTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound
  {
    quickfix.field.ExpireTime value = new quickfix.field.ExpireTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExpireTime field)
  {
    return isSetField(field);
  }

  public boolean isSetExpireTime()
  {
    return isSetField(126);
  }
  
  public void set(quickfix.field.ExecInst value)
  {
    setField(value);
  }

  public quickfix.field.ExecInst get(quickfix.field.ExecInst  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInst getExecInst() throws FieldNotFound
  {
    quickfix.field.ExecInst value = new quickfix.field.ExecInst();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecInst field)
  {
    return isSetField(field);
  }

  public boolean isSetExecInst()
  {
    return isSetField(18);
  }
  
  public void set(quickfix.field.Rule80A value)
  {
    setField(value);
  }

  public quickfix.field.Rule80A get(quickfix.field.Rule80A  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Rule80A getRule80A() throws FieldNotFound
  {
    quickfix.field.Rule80A value = new quickfix.field.Rule80A();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Rule80A field)
  {
    return isSetField(field);
  }

  public boolean isSetRule80A()
  {
    return isSetField(47);
  }
  
  public void set(quickfix.field.LastShares value)
  {
    setField(value);
  }

  public quickfix.field.LastShares get(quickfix.field.LastShares  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastShares getLastShares() throws FieldNotFound
  {
    quickfix.field.LastShares value = new quickfix.field.LastShares();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastShares field)
  {
    return isSetField(field);
  }

  public boolean isSetLastShares()
  {
    return isSetField(32);
  }
  
  public void set(quickfix.field.LastPx value)
  {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound
  {
    quickfix.field.LastPx value = new quickfix.field.LastPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastPx field)
  {
    return isSetField(field);
  }

  public boolean isSetLastPx()
  {
    return isSetField(31);
  }
  
  public void set(quickfix.field.LastSpotRate value)
  {
    setField(value);
  }

  public quickfix.field.LastSpotRate get(quickfix.field.LastSpotRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastSpotRate getLastSpotRate() throws FieldNotFound
  {
    quickfix.field.LastSpotRate value = new quickfix.field.LastSpotRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastSpotRate field)
  {
    return isSetField(field);
  }

  public boolean isSetLastSpotRate()
  {
    return isSetField(194);
  }
  
  public void set(quickfix.field.LastForwardPoints value)
  {
    setField(value);
  }

  public quickfix.field.LastForwardPoints get(quickfix.field.LastForwardPoints  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastForwardPoints getLastForwardPoints() throws FieldNotFound
  {
    quickfix.field.LastForwardPoints value = new quickfix.field.LastForwardPoints();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastForwardPoints field)
  {
    return isSetField(field);
  }

  public boolean isSetLastForwardPoints()
  {
    return isSetField(195);
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
  
  public void set(quickfix.field.LastCapacity value)
  {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound
  {
    quickfix.field.LastCapacity value = new quickfix.field.LastCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LastCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetLastCapacity()
  {
    return isSetField(29);
  }
  
  public void set(quickfix.field.LeavesQty value)
  {
    setField(value);
  }

  public quickfix.field.LeavesQty get(quickfix.field.LeavesQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound
  {
    quickfix.field.LeavesQty value = new quickfix.field.LeavesQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LeavesQty field)
  {
    return isSetField(field);
  }

  public boolean isSetLeavesQty()
  {
    return isSetField(151);
  }
  
  public void set(quickfix.field.CumQty value)
  {
    setField(value);
  }

  public quickfix.field.CumQty get(quickfix.field.CumQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CumQty getCumQty() throws FieldNotFound
  {
    quickfix.field.CumQty value = new quickfix.field.CumQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CumQty field)
  {
    return isSetField(field);
  }

  public boolean isSetCumQty()
  {
    return isSetField(14);
  }
  
  public void set(quickfix.field.AvgPx value)
  {
    setField(value);
  }

  public quickfix.field.AvgPx get(quickfix.field.AvgPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AvgPx getAvgPx() throws FieldNotFound
  {
    quickfix.field.AvgPx value = new quickfix.field.AvgPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AvgPx field)
  {
    return isSetField(field);
  }

  public boolean isSetAvgPx()
  {
    return isSetField(6);
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
  
  public void set(quickfix.field.ReportToExch value)
  {
    setField(value);
  }

  public quickfix.field.ReportToExch get(quickfix.field.ReportToExch  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ReportToExch getReportToExch() throws FieldNotFound
  {
    quickfix.field.ReportToExch value = new quickfix.field.ReportToExch();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ReportToExch field)
  {
    return isSetField(field);
  }

  public boolean isSetReportToExch()
  {
    return isSetField(113);
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
  
  public void set(quickfix.field.SettlCurrAmt value)
  {
    setField(value);
  }

  public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound
  {
    quickfix.field.SettlCurrAmt value = new quickfix.field.SettlCurrAmt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlCurrAmt field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlCurrAmt()
  {
    return isSetField(119);
  }
  
  public void set(quickfix.field.SettlCurrency value)
  {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound
  {
    quickfix.field.SettlCurrency value = new quickfix.field.SettlCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency()
  {
    return isSetField(120);
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
  
}
  