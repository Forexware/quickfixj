
package quickfix.fix44;
import quickfix.FieldNotFound;

import quickfix.Group;

public class OrderMassCancelRequest extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "q";
  

  public OrderMassCancelRequest()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public OrderMassCancelRequest(quickfix.field.ClOrdID clOrdID, quickfix.field.MassCancelRequestType massCancelRequestType, quickfix.field.TransactTime transactTime) {
    this();
    setField(clOrdID);
    setField(massCancelRequestType);
    setField(transactTime);
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
  
  public void set(quickfix.field.SecondaryClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound
  {
    quickfix.field.SecondaryClOrdID value = new quickfix.field.SecondaryClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID()
  {
    return isSetField(526);
  }
  
  public void set(quickfix.field.MassCancelRequestType value)
  {
    setField(value);
  }

  public quickfix.field.MassCancelRequestType get(quickfix.field.MassCancelRequestType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MassCancelRequestType getMassCancelRequestType() throws FieldNotFound
  {
    quickfix.field.MassCancelRequestType value = new quickfix.field.MassCancelRequestType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MassCancelRequestType field)
  {
    return isSetField(field);
  }

  public boolean isSetMassCancelRequestType()
  {
    return isSetField(530);
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
  
  public void set(quickfix.fix44.component.Instrument component)
  {
    setComponent(component);
  }

  public quickfix.fix44.component.Instrument get(quickfix.fix44.component.Instrument  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix44.component.Instrument getInstrument() throws FieldNotFound
  {
    quickfix.fix44.component.Instrument component = new quickfix.fix44.component.Instrument();
    getComponent(component);
    return component;
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
  
  public void set(quickfix.field.SecurityIDSource value)
  {
    setField(value);
  }

  public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound
  {
    quickfix.field.SecurityIDSource value = new quickfix.field.SecurityIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityIDSource()
  {
    return isSetField(22);
  }
  
  public void set(quickfix.field.NoSecurityAltID value)
  {
    setField(value);
  }

  public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound
  {
    quickfix.field.NoSecurityAltID value = new quickfix.field.NoSecurityAltID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSecurityAltID field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSecurityAltID()
  {
    return isSetField(454);
  }
  
  public static class NoSecurityAltID extends Group {
    static final long serialVersionUID = 20050617;
    public NoSecurityAltID() {
        super(454, 455,
            new int[] {455, 456,  0 } );
    }
    
  public void set(quickfix.field.SecurityAltID value)
  {
    setField(value);
  }

  public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound
  {
    quickfix.field.SecurityAltID value = new quickfix.field.SecurityAltID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityAltID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityAltID()
  {
    return isSetField(455);
  }
  
  public void set(quickfix.field.SecurityAltIDSource value)
  {
    setField(value);
  }

  public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound
  {
    quickfix.field.SecurityAltIDSource value = new quickfix.field.SecurityAltIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityAltIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityAltIDSource()
  {
    return isSetField(456);
  }
  
  }
  
  public void set(quickfix.field.Product value)
  {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound
  {
    quickfix.field.Product value = new quickfix.field.Product();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Product field)
  {
    return isSetField(field);
  }

  public boolean isSetProduct()
  {
    return isSetField(460);
  }
  
  public void set(quickfix.field.CFICode value)
  {
    setField(value);
  }

  public quickfix.field.CFICode get(quickfix.field.CFICode  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CFICode getCFICode() throws FieldNotFound
  {
    quickfix.field.CFICode value = new quickfix.field.CFICode();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CFICode field)
  {
    return isSetField(field);
  }

  public boolean isSetCFICode()
  {
    return isSetField(461);
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
  
  public void set(quickfix.field.SecuritySubType value)
  {
    setField(value);
  }

  public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound
  {
    quickfix.field.SecuritySubType value = new quickfix.field.SecuritySubType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecuritySubType field)
  {
    return isSetField(field);
  }

  public boolean isSetSecuritySubType()
  {
    return isSetField(762);
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
  
  public void set(quickfix.field.MaturityDate value)
  {
    setField(value);
  }

  public quickfix.field.MaturityDate get(quickfix.field.MaturityDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound
  {
    quickfix.field.MaturityDate value = new quickfix.field.MaturityDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MaturityDate field)
  {
    return isSetField(field);
  }

  public boolean isSetMaturityDate()
  {
    return isSetField(541);
  }
  
  public void set(quickfix.field.CouponPaymentDate value)
  {
    setField(value);
  }

  public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound
  {
    quickfix.field.CouponPaymentDate value = new quickfix.field.CouponPaymentDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CouponPaymentDate field)
  {
    return isSetField(field);
  }

  public boolean isSetCouponPaymentDate()
  {
    return isSetField(224);
  }
  
  public void set(quickfix.field.IssueDate value)
  {
    setField(value);
  }

  public quickfix.field.IssueDate get(quickfix.field.IssueDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.IssueDate getIssueDate() throws FieldNotFound
  {
    quickfix.field.IssueDate value = new quickfix.field.IssueDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.IssueDate field)
  {
    return isSetField(field);
  }

  public boolean isSetIssueDate()
  {
    return isSetField(225);
  }
  
  public void set(quickfix.field.RepoCollateralSecurityType value)
  {
    setField(value);
  }

  public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound
  {
    quickfix.field.RepoCollateralSecurityType value = new quickfix.field.RepoCollateralSecurityType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RepoCollateralSecurityType field)
  {
    return isSetField(field);
  }

  public boolean isSetRepoCollateralSecurityType()
  {
    return isSetField(239);
  }
  
  public void set(quickfix.field.RepurchaseTerm value)
  {
    setField(value);
  }

  public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound
  {
    quickfix.field.RepurchaseTerm value = new quickfix.field.RepurchaseTerm();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RepurchaseTerm field)
  {
    return isSetField(field);
  }

  public boolean isSetRepurchaseTerm()
  {
    return isSetField(226);
  }
  
  public void set(quickfix.field.RepurchaseRate value)
  {
    setField(value);
  }

  public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound
  {
    quickfix.field.RepurchaseRate value = new quickfix.field.RepurchaseRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RepurchaseRate field)
  {
    return isSetField(field);
  }

  public boolean isSetRepurchaseRate()
  {
    return isSetField(227);
  }
  
  public void set(quickfix.field.Factor value)
  {
    setField(value);
  }

  public quickfix.field.Factor get(quickfix.field.Factor  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Factor getFactor() throws FieldNotFound
  {
    quickfix.field.Factor value = new quickfix.field.Factor();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Factor field)
  {
    return isSetField(field);
  }

  public boolean isSetFactor()
  {
    return isSetField(228);
  }
  
  public void set(quickfix.field.CreditRating value)
  {
    setField(value);
  }

  public quickfix.field.CreditRating get(quickfix.field.CreditRating  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CreditRating getCreditRating() throws FieldNotFound
  {
    quickfix.field.CreditRating value = new quickfix.field.CreditRating();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CreditRating field)
  {
    return isSetField(field);
  }

  public boolean isSetCreditRating()
  {
    return isSetField(255);
  }
  
  public void set(quickfix.field.InstrRegistry value)
  {
    setField(value);
  }

  public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound
  {
    quickfix.field.InstrRegistry value = new quickfix.field.InstrRegistry();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.InstrRegistry field)
  {
    return isSetField(field);
  }

  public boolean isSetInstrRegistry()
  {
    return isSetField(543);
  }
  
  public void set(quickfix.field.CountryOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound
  {
    quickfix.field.CountryOfIssue value = new quickfix.field.CountryOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CountryOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetCountryOfIssue()
  {
    return isSetField(470);
  }
  
  public void set(quickfix.field.StateOrProvinceOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound
  {
    quickfix.field.StateOrProvinceOfIssue value = new quickfix.field.StateOrProvinceOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StateOrProvinceOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetStateOrProvinceOfIssue()
  {
    return isSetField(471);
  }
  
  public void set(quickfix.field.LocaleOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound
  {
    quickfix.field.LocaleOfIssue value = new quickfix.field.LocaleOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LocaleOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetLocaleOfIssue()
  {
    return isSetField(472);
  }
  
  public void set(quickfix.field.RedemptionDate value)
  {
    setField(value);
  }

  public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound
  {
    quickfix.field.RedemptionDate value = new quickfix.field.RedemptionDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RedemptionDate field)
  {
    return isSetField(field);
  }

  public boolean isSetRedemptionDate()
  {
    return isSetField(240);
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
  
  public void set(quickfix.field.StrikeCurrency value)
  {
    setField(value);
  }

  public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound
  {
    quickfix.field.StrikeCurrency value = new quickfix.field.StrikeCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StrikeCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetStrikeCurrency()
  {
    return isSetField(947);
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
  
  public void set(quickfix.field.ContractMultiplier value)
  {
    setField(value);
  }

  public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound
  {
    quickfix.field.ContractMultiplier value = new quickfix.field.ContractMultiplier();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ContractMultiplier field)
  {
    return isSetField(field);
  }

  public boolean isSetContractMultiplier()
  {
    return isSetField(231);
  }
  
  public void set(quickfix.field.CouponRate value)
  {
    setField(value);
  }

  public quickfix.field.CouponRate get(quickfix.field.CouponRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CouponRate getCouponRate() throws FieldNotFound
  {
    quickfix.field.CouponRate value = new quickfix.field.CouponRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CouponRate field)
  {
    return isSetField(field);
  }

  public boolean isSetCouponRate()
  {
    return isSetField(223);
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
  
  public void set(quickfix.field.EncodedIssuerLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound
  {
    quickfix.field.EncodedIssuerLen value = new quickfix.field.EncodedIssuerLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedIssuerLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedIssuerLen()
  {
    return isSetField(348);
  }
  
  public void set(quickfix.field.EncodedIssuer value)
  {
    setField(value);
  }

  public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound
  {
    quickfix.field.EncodedIssuer value = new quickfix.field.EncodedIssuer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedIssuer field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedIssuer()
  {
    return isSetField(349);
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
  
  public void set(quickfix.field.EncodedSecurityDescLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound
  {
    quickfix.field.EncodedSecurityDescLen value = new quickfix.field.EncodedSecurityDescLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedSecurityDescLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedSecurityDescLen()
  {
    return isSetField(350);
  }
  
  public void set(quickfix.field.EncodedSecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound
  {
    quickfix.field.EncodedSecurityDesc value = new quickfix.field.EncodedSecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedSecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedSecurityDesc()
  {
    return isSetField(351);
  }
  
  public void set(quickfix.field.Pool value)
  {
    setField(value);
  }

  public quickfix.field.Pool get(quickfix.field.Pool  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Pool getPool() throws FieldNotFound
  {
    quickfix.field.Pool value = new quickfix.field.Pool();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Pool field)
  {
    return isSetField(field);
  }

  public boolean isSetPool()
  {
    return isSetField(691);
  }
  
  public void set(quickfix.field.ContractSettlMonth value)
  {
    setField(value);
  }

  public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound
  {
    quickfix.field.ContractSettlMonth value = new quickfix.field.ContractSettlMonth();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ContractSettlMonth field)
  {
    return isSetField(field);
  }

  public boolean isSetContractSettlMonth()
  {
    return isSetField(667);
  }
  
  public void set(quickfix.field.CPProgram value)
  {
    setField(value);
  }

  public quickfix.field.CPProgram get(quickfix.field.CPProgram  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CPProgram getCPProgram() throws FieldNotFound
  {
    quickfix.field.CPProgram value = new quickfix.field.CPProgram();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CPProgram field)
  {
    return isSetField(field);
  }

  public boolean isSetCPProgram()
  {
    return isSetField(875);
  }
  
  public void set(quickfix.field.CPRegType value)
  {
    setField(value);
  }

  public quickfix.field.CPRegType get(quickfix.field.CPRegType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CPRegType getCPRegType() throws FieldNotFound
  {
    quickfix.field.CPRegType value = new quickfix.field.CPRegType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CPRegType field)
  {
    return isSetField(field);
  }

  public boolean isSetCPRegType()
  {
    return isSetField(876);
  }
  
  public void set(quickfix.field.NoEvents value)
  {
    setField(value);
  }

  public quickfix.field.NoEvents get(quickfix.field.NoEvents  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoEvents getNoEvents() throws FieldNotFound
  {
    quickfix.field.NoEvents value = new quickfix.field.NoEvents();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoEvents field)
  {
    return isSetField(field);
  }

  public boolean isSetNoEvents()
  {
    return isSetField(864);
  }
  
  public static class NoEvents extends Group {
    static final long serialVersionUID = 20050617;
    public NoEvents() {
        super(864, 865,
            new int[] {865, 866, 867, 868,  0 } );
    }
    
  public void set(quickfix.field.EventType value)
  {
    setField(value);
  }

  public quickfix.field.EventType get(quickfix.field.EventType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EventType getEventType() throws FieldNotFound
  {
    quickfix.field.EventType value = new quickfix.field.EventType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EventType field)
  {
    return isSetField(field);
  }

  public boolean isSetEventType()
  {
    return isSetField(865);
  }
  
  public void set(quickfix.field.EventDate value)
  {
    setField(value);
  }

  public quickfix.field.EventDate get(quickfix.field.EventDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EventDate getEventDate() throws FieldNotFound
  {
    quickfix.field.EventDate value = new quickfix.field.EventDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EventDate field)
  {
    return isSetField(field);
  }

  public boolean isSetEventDate()
  {
    return isSetField(866);
  }
  
  public void set(quickfix.field.EventPx value)
  {
    setField(value);
  }

  public quickfix.field.EventPx get(quickfix.field.EventPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EventPx getEventPx() throws FieldNotFound
  {
    quickfix.field.EventPx value = new quickfix.field.EventPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EventPx field)
  {
    return isSetField(field);
  }

  public boolean isSetEventPx()
  {
    return isSetField(867);
  }
  
  public void set(quickfix.field.EventText value)
  {
    setField(value);
  }

  public quickfix.field.EventText get(quickfix.field.EventText  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EventText getEventText() throws FieldNotFound
  {
    quickfix.field.EventText value = new quickfix.field.EventText();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EventText field)
  {
    return isSetField(field);
  }

  public boolean isSetEventText()
  {
    return isSetField(868);
  }
  
  }
  
  public void set(quickfix.field.DatedDate value)
  {
    setField(value);
  }

  public quickfix.field.DatedDate get(quickfix.field.DatedDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DatedDate getDatedDate() throws FieldNotFound
  {
    quickfix.field.DatedDate value = new quickfix.field.DatedDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DatedDate field)
  {
    return isSetField(field);
  }

  public boolean isSetDatedDate()
  {
    return isSetField(873);
  }
  
  public void set(quickfix.field.InterestAccrualDate value)
  {
    setField(value);
  }

  public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound
  {
    quickfix.field.InterestAccrualDate value = new quickfix.field.InterestAccrualDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.InterestAccrualDate field)
  {
    return isSetField(field);
  }

  public boolean isSetInterestAccrualDate()
  {
    return isSetField(874);
  }
  
  public void set(quickfix.fix44.component.UnderlyingInstrument component)
  {
    setComponent(component);
  }

  public quickfix.fix44.component.UnderlyingInstrument get(quickfix.fix44.component.UnderlyingInstrument  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix44.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound
  {
    quickfix.fix44.component.UnderlyingInstrument component = new quickfix.fix44.component.UnderlyingInstrument();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.UnderlyingSymbol value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound
  {
    quickfix.field.UnderlyingSymbol value = new quickfix.field.UnderlyingSymbol();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSymbol field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSymbol()
  {
    return isSetField(311);
  }
  
  public void set(quickfix.field.UnderlyingSymbolSfx value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound
  {
    quickfix.field.UnderlyingSymbolSfx value = new quickfix.field.UnderlyingSymbolSfx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSymbolSfx field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSymbolSfx()
  {
    return isSetField(312);
  }
  
  public void set(quickfix.field.UnderlyingSecurityID value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityID value = new quickfix.field.UnderlyingSecurityID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityID field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityID()
  {
    return isSetField(309);
  }
  
  public void set(quickfix.field.UnderlyingSecurityIDSource value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityIDSource value = new quickfix.field.UnderlyingSecurityIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityIDSource()
  {
    return isSetField(305);
  }
  
  public void set(quickfix.field.NoUnderlyingSecurityAltID value)
  {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound
  {
    quickfix.field.NoUnderlyingSecurityAltID value = new quickfix.field.NoUnderlyingSecurityAltID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field)
  {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSecurityAltID()
  {
    return isSetField(457);
  }
  
  public static class NoUnderlyingSecurityAltID extends Group {
    static final long serialVersionUID = 20050617;
    public NoUnderlyingSecurityAltID() {
        super(457, 458,
            new int[] {458, 459,  0 } );
    }
    
  public void set(quickfix.field.UnderlyingSecurityAltID value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityAltID value = new quickfix.field.UnderlyingSecurityAltID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltID field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltID()
  {
    return isSetField(458);
  }
  
  public void set(quickfix.field.UnderlyingSecurityAltIDSource value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityAltIDSource value = new quickfix.field.UnderlyingSecurityAltIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityAltIDSource()
  {
    return isSetField(459);
  }
  
  }
  
  public void set(quickfix.field.UnderlyingProduct value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound
  {
    quickfix.field.UnderlyingProduct value = new quickfix.field.UnderlyingProduct();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingProduct field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProduct()
  {
    return isSetField(462);
  }
  
  public void set(quickfix.field.UnderlyingCFICode value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound
  {
    quickfix.field.UnderlyingCFICode value = new quickfix.field.UnderlyingCFICode();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCFICode field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCFICode()
  {
    return isSetField(463);
  }
  
  public void set(quickfix.field.UnderlyingSecurityType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityType value = new quickfix.field.UnderlyingSecurityType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityType()
  {
    return isSetField(310);
  }
  
  public void set(quickfix.field.UnderlyingSecuritySubType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecuritySubType value = new quickfix.field.UnderlyingSecuritySubType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecuritySubType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecuritySubType()
  {
    return isSetField(763);
  }
  
  public void set(quickfix.field.UnderlyingMaturityMonthYear value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound
  {
    quickfix.field.UnderlyingMaturityMonthYear value = new quickfix.field.UnderlyingMaturityMonthYear();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaturityMonthYear()
  {
    return isSetField(313);
  }
  
  public void set(quickfix.field.UnderlyingMaturityDate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound
  {
    quickfix.field.UnderlyingMaturityDate value = new quickfix.field.UnderlyingMaturityDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingMaturityDate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaturityDate()
  {
    return isSetField(542);
  }
  
  public void set(quickfix.field.UnderlyingCouponPaymentDate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound
  {
    quickfix.field.UnderlyingCouponPaymentDate value = new quickfix.field.UnderlyingCouponPaymentDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponPaymentDate()
  {
    return isSetField(241);
  }
  
  public void set(quickfix.field.UnderlyingIssueDate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound
  {
    quickfix.field.UnderlyingIssueDate value = new quickfix.field.UnderlyingIssueDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingIssueDate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIssueDate()
  {
    return isSetField(242);
  }
  
  public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound
  {
    quickfix.field.UnderlyingRepoCollateralSecurityType value = new quickfix.field.UnderlyingRepoCollateralSecurityType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepoCollateralSecurityType()
  {
    return isSetField(243);
  }
  
  public void set(quickfix.field.UnderlyingRepurchaseTerm value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound
  {
    quickfix.field.UnderlyingRepurchaseTerm value = new quickfix.field.UnderlyingRepurchaseTerm();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepurchaseTerm()
  {
    return isSetField(244);
  }
  
  public void set(quickfix.field.UnderlyingRepurchaseRate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound
  {
    quickfix.field.UnderlyingRepurchaseRate value = new quickfix.field.UnderlyingRepurchaseRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRepurchaseRate()
  {
    return isSetField(245);
  }
  
  public void set(quickfix.field.UnderlyingFactor value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound
  {
    quickfix.field.UnderlyingFactor value = new quickfix.field.UnderlyingFactor();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingFactor field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingFactor()
  {
    return isSetField(246);
  }
  
  public void set(quickfix.field.UnderlyingCreditRating value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound
  {
    quickfix.field.UnderlyingCreditRating value = new quickfix.field.UnderlyingCreditRating();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCreditRating field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCreditRating()
  {
    return isSetField(256);
  }
  
  public void set(quickfix.field.UnderlyingInstrRegistry value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound
  {
    quickfix.field.UnderlyingInstrRegistry value = new quickfix.field.UnderlyingInstrRegistry();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingInstrRegistry field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingInstrRegistry()
  {
    return isSetField(595);
  }
  
  public void set(quickfix.field.UnderlyingCountryOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound
  {
    quickfix.field.UnderlyingCountryOfIssue value = new quickfix.field.UnderlyingCountryOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCountryOfIssue()
  {
    return isSetField(592);
  }
  
  public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound
  {
    quickfix.field.UnderlyingStateOrProvinceOfIssue value = new quickfix.field.UnderlyingStateOrProvinceOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStateOrProvinceOfIssue()
  {
    return isSetField(593);
  }
  
  public void set(quickfix.field.UnderlyingLocaleOfIssue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound
  {
    quickfix.field.UnderlyingLocaleOfIssue value = new quickfix.field.UnderlyingLocaleOfIssue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingLocaleOfIssue()
  {
    return isSetField(594);
  }
  
  public void set(quickfix.field.UnderlyingRedemptionDate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound
  {
    quickfix.field.UnderlyingRedemptionDate value = new quickfix.field.UnderlyingRedemptionDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingRedemptionDate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRedemptionDate()
  {
    return isSetField(247);
  }
  
  public void set(quickfix.field.UnderlyingStrikePrice value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound
  {
    quickfix.field.UnderlyingStrikePrice value = new quickfix.field.UnderlyingStrikePrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStrikePrice field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikePrice()
  {
    return isSetField(316);
  }
  
  public void set(quickfix.field.UnderlyingStrikeCurrency value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound
  {
    quickfix.field.UnderlyingStrikeCurrency value = new quickfix.field.UnderlyingStrikeCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStrikeCurrency()
  {
    return isSetField(941);
  }
  
  public void set(quickfix.field.UnderlyingOptAttribute value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound
  {
    quickfix.field.UnderlyingOptAttribute value = new quickfix.field.UnderlyingOptAttribute();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingOptAttribute field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptAttribute()
  {
    return isSetField(317);
  }
  
  public void set(quickfix.field.UnderlyingContractMultiplier value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound
  {
    quickfix.field.UnderlyingContractMultiplier value = new quickfix.field.UnderlyingContractMultiplier();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingContractMultiplier field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingContractMultiplier()
  {
    return isSetField(436);
  }
  
  public void set(quickfix.field.UnderlyingCouponRate value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound
  {
    quickfix.field.UnderlyingCouponRate value = new quickfix.field.UnderlyingCouponRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCouponRate field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCouponRate()
  {
    return isSetField(435);
  }
  
  public void set(quickfix.field.UnderlyingSecurityExchange value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityExchange value = new quickfix.field.UnderlyingSecurityExchange();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityExchange field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityExchange()
  {
    return isSetField(308);
  }
  
  public void set(quickfix.field.UnderlyingIssuer value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound
  {
    quickfix.field.UnderlyingIssuer value = new quickfix.field.UnderlyingIssuer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingIssuer field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingIssuer()
  {
    return isSetField(306);
  }
  
  public void set(quickfix.field.EncodedUnderlyingIssuerLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound
  {
    quickfix.field.EncodedUnderlyingIssuerLen value = new quickfix.field.EncodedUnderlyingIssuerLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingIssuerLen()
  {
    return isSetField(362);
  }
  
  public void set(quickfix.field.EncodedUnderlyingIssuer value)
  {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound
  {
    quickfix.field.EncodedUnderlyingIssuer value = new quickfix.field.EncodedUnderlyingIssuer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingIssuer()
  {
    return isSetField(363);
  }
  
  public void set(quickfix.field.UnderlyingSecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound
  {
    quickfix.field.UnderlyingSecurityDesc value = new quickfix.field.UnderlyingSecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityDesc()
  {
    return isSetField(307);
  }
  
  public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value)
  {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound
  {
    quickfix.field.EncodedUnderlyingSecurityDescLen value = new quickfix.field.EncodedUnderlyingSecurityDescLen();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingSecurityDescLen()
  {
    return isSetField(364);
  }
  
  public void set(quickfix.field.EncodedUnderlyingSecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound
  {
    quickfix.field.EncodedUnderlyingSecurityDesc value = new quickfix.field.EncodedUnderlyingSecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingSecurityDesc()
  {
    return isSetField(365);
  }
  
  public void set(quickfix.field.UnderlyingCPProgram value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound
  {
    quickfix.field.UnderlyingCPProgram value = new quickfix.field.UnderlyingCPProgram();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCPProgram field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCPProgram()
  {
    return isSetField(877);
  }
  
  public void set(quickfix.field.UnderlyingCPRegType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound
  {
    quickfix.field.UnderlyingCPRegType value = new quickfix.field.UnderlyingCPRegType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCPRegType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCPRegType()
  {
    return isSetField(878);
  }
  
  public void set(quickfix.field.UnderlyingCurrency value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound
  {
    quickfix.field.UnderlyingCurrency value = new quickfix.field.UnderlyingCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCurrency()
  {
    return isSetField(318);
  }
  
  public void set(quickfix.field.UnderlyingQty value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound
  {
    quickfix.field.UnderlyingQty value = new quickfix.field.UnderlyingQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingQty field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingQty()
  {
    return isSetField(879);
  }
  
  public void set(quickfix.field.UnderlyingPx value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound
  {
    quickfix.field.UnderlyingPx value = new quickfix.field.UnderlyingPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingPx field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPx()
  {
    return isSetField(810);
  }
  
  public void set(quickfix.field.UnderlyingDirtyPrice value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound
  {
    quickfix.field.UnderlyingDirtyPrice value = new quickfix.field.UnderlyingDirtyPrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingDirtyPrice field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDirtyPrice()
  {
    return isSetField(882);
  }
  
  public void set(quickfix.field.UnderlyingEndPrice value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound
  {
    quickfix.field.UnderlyingEndPrice value = new quickfix.field.UnderlyingEndPrice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingEndPrice field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEndPrice()
  {
    return isSetField(883);
  }
  
  public void set(quickfix.field.UnderlyingStartValue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound
  {
    quickfix.field.UnderlyingStartValue value = new quickfix.field.UnderlyingStartValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStartValue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStartValue()
  {
    return isSetField(884);
  }
  
  public void set(quickfix.field.UnderlyingCurrentValue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound
  {
    quickfix.field.UnderlyingCurrentValue value = new quickfix.field.UnderlyingCurrentValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingCurrentValue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCurrentValue()
  {
    return isSetField(885);
  }
  
  public void set(quickfix.field.UnderlyingEndValue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound
  {
    quickfix.field.UnderlyingEndValue value = new quickfix.field.UnderlyingEndValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingEndValue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingEndValue()
  {
    return isSetField(886);
  }
  
  public void set(quickfix.fix44.component.UnderlyingStipulations component)
  {
    setComponent(component);
  }

  public quickfix.fix44.component.UnderlyingStipulations get(quickfix.fix44.component.UnderlyingStipulations  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix44.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound
  {
    quickfix.fix44.component.UnderlyingStipulations component = new quickfix.fix44.component.UnderlyingStipulations();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoUnderlyingStips value)
  {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound
  {
    quickfix.field.NoUnderlyingStips value = new quickfix.field.NoUnderlyingStips();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoUnderlyingStips field)
  {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStips()
  {
    return isSetField(887);
  }
  
  public static class NoUnderlyingStips extends Group {
    static final long serialVersionUID = 20050617;
    public NoUnderlyingStips() {
        super(887, 888,
            new int[] {888, 889,  0 } );
    }
    
  public void set(quickfix.field.UnderlyingStipType value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound
  {
    quickfix.field.UnderlyingStipType value = new quickfix.field.UnderlyingStipType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStipType field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipType()
  {
    return isSetField(888);
  }
  
  public void set(quickfix.field.UnderlyingStipValue value)
  {
    setField(value);
  }

  public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound
  {
    quickfix.field.UnderlyingStipValue value = new quickfix.field.UnderlyingStipValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.UnderlyingStipValue field)
  {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStipValue()
  {
    return isSetField(889);
  }
  
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
  