
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class MDFullGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";

  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 268,  };
  protected int[] getGroupFields() { return componentGroups; }


  public MDFullGrp()
  {
    super();
  }

  public void set(quickfix.field.NoMDEntries value)
  {
    setField(value);
  }

  public quickfix.field.NoMDEntries get(quickfix.field.NoMDEntries  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDEntries getNoMDEntries() throws FieldNotFound
  {
    quickfix.field.NoMDEntries value = new quickfix.field.NoMDEntries();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoMDEntries field)
  {
    return isSetField(field);
  }

  public boolean isSetNoMDEntries()
  {
    return isSetField(268);
  }

  public static class NoMDEntries extends Group {
    static final long serialVersionUID = 20050617;
    public NoMDEntries() {
        super(268, 269,
                new int[] {269, 278, 270, 15, 271, 272, 273, 274, 275, 336, 625, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 299, 288, 289, 346, 290, 546, 811, 58, 354, 355, 1023, 528, 1024, 332, 333, 1020, 63, 64, 1070, 83, 1048, 1026, 1027, 453, 198, 40, 0 } );
    }

  public void set(quickfix.field.MDEntryType value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound
  {
    quickfix.field.MDEntryType value = new quickfix.field.MDEntryType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryType field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryType()
  {
    return isSetField(269);
  }

  public void set(quickfix.field.MDEntryPx value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryPx get(quickfix.field.MDEntryPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryPx getMDEntryPx() throws FieldNotFound
  {
    quickfix.field.MDEntryPx value = new quickfix.field.MDEntryPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryPx field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryPx()
  {
    return isSetField(270);
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

  public void set(quickfix.field.MDEntrySize value)
  {
    setField(value);
  }

  public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound
  {
    quickfix.field.MDEntrySize value = new quickfix.field.MDEntrySize();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntrySize field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntrySize()
  {
    return isSetField(271);
  }

  public void set(quickfix.field.MDEntryDate value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryDate get(quickfix.field.MDEntryDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryDate getMDEntryDate() throws FieldNotFound
  {
    quickfix.field.MDEntryDate value = new quickfix.field.MDEntryDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryDate field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryDate()
  {
    return isSetField(272);
  }

  public void set(quickfix.field.MDEntryTime value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryTime get(quickfix.field.MDEntryTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryTime getMDEntryTime() throws FieldNotFound
  {
    quickfix.field.MDEntryTime value = new quickfix.field.MDEntryTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryTime field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryTime()
  {
    return isSetField(273);
  }

  public void set(quickfix.field.TickDirection value)
  {
    setField(value);
  }

  public quickfix.field.TickDirection get(quickfix.field.TickDirection  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TickDirection getTickDirection() throws FieldNotFound
  {
    quickfix.field.TickDirection value = new quickfix.field.TickDirection();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TickDirection field)
  {
    return isSetField(field);
  }

  public boolean isSetTickDirection()
  {
    return isSetField(274);
  }

  public void set(quickfix.field.MDMkt value)
  {
    setField(value);
  }

  public quickfix.field.MDMkt get(quickfix.field.MDMkt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDMkt getMDMkt() throws FieldNotFound
  {
    quickfix.field.MDMkt value = new quickfix.field.MDMkt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDMkt field)
  {
    return isSetField(field);
  }

  public boolean isSetMDMkt()
  {
    return isSetField(275);
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

  public void set(quickfix.field.QuoteCondition value)
  {
    setField(value);
  }

  public quickfix.field.QuoteCondition get(quickfix.field.QuoteCondition  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteCondition getQuoteCondition() throws FieldNotFound
  {
    quickfix.field.QuoteCondition value = new quickfix.field.QuoteCondition();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.QuoteCondition field)
  {
    return isSetField(field);
  }

  public boolean isSetQuoteCondition()
  {
    return isSetField(276);
  }

  public void set(quickfix.field.TradeCondition value)
  {
    setField(value);
  }

  public quickfix.field.TradeCondition get(quickfix.field.TradeCondition  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeCondition getTradeCondition() throws FieldNotFound
  {
    quickfix.field.TradeCondition value = new quickfix.field.TradeCondition();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeCondition field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeCondition()
  {
    return isSetField(277);
  }

  public void set(quickfix.field.MDEntryOriginator value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryOriginator get(quickfix.field.MDEntryOriginator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryOriginator getMDEntryOriginator() throws FieldNotFound
  {
    quickfix.field.MDEntryOriginator value = new quickfix.field.MDEntryOriginator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryOriginator field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryOriginator()
  {
    return isSetField(282);
  }

  public void set(quickfix.field.LocationID value)
  {
    setField(value);
  }

  public quickfix.field.LocationID get(quickfix.field.LocationID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LocationID getLocationID() throws FieldNotFound
  {
    quickfix.field.LocationID value = new quickfix.field.LocationID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LocationID field)
  {
    return isSetField(field);
  }

  public boolean isSetLocationID()
  {
    return isSetField(283);
  }

  public void set(quickfix.field.DeskID value)
  {
    setField(value);
  }

  public quickfix.field.DeskID get(quickfix.field.DeskID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DeskID getDeskID() throws FieldNotFound
  {
    quickfix.field.DeskID value = new quickfix.field.DeskID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DeskID field)
  {
    return isSetField(field);
  }

  public boolean isSetDeskID()
  {
    return isSetField(284);
  }

  public void set(quickfix.field.OpenCloseSettlFlag value)
  {
    setField(value);
  }

  public quickfix.field.OpenCloseSettlFlag get(quickfix.field.OpenCloseSettlFlag  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound
  {
    quickfix.field.OpenCloseSettlFlag value = new quickfix.field.OpenCloseSettlFlag();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OpenCloseSettlFlag field)
  {
    return isSetField(field);
  }

  public boolean isSetOpenCloseSettlFlag()
  {
    return isSetField(286);
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

  public void set(quickfix.field.ExpireDate value)
  {
    setField(value);
  }

  public quickfix.field.ExpireDate get(quickfix.field.ExpireDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound
  {
    quickfix.field.ExpireDate value = new quickfix.field.ExpireDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExpireDate field)
  {
    return isSetField(field);
  }

  public boolean isSetExpireDate()
  {
    return isSetField(432);
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

  public void set(quickfix.field.MinQty value)
  {
    setField(value);
  }

  public quickfix.field.MinQty get(quickfix.field.MinQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MinQty getMinQty() throws FieldNotFound
  {
    quickfix.field.MinQty value = new quickfix.field.MinQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MinQty field)
  {
    return isSetField(field);
  }

  public boolean isSetMinQty()
  {
    return isSetField(110);
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

  public void set(quickfix.field.SellerDays value)
  {
    setField(value);
  }

  public quickfix.field.SellerDays get(quickfix.field.SellerDays  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SellerDays getSellerDays() throws FieldNotFound
  {
    quickfix.field.SellerDays value = new quickfix.field.SellerDays();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SellerDays field)
  {
    return isSetField(field);
  }

  public boolean isSetSellerDays()
  {
    return isSetField(287);
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

  public void set(quickfix.field.QuoteEntryID value)
  {
    setField(value);
  }

  public quickfix.field.QuoteEntryID get(quickfix.field.QuoteEntryID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteEntryID getQuoteEntryID() throws FieldNotFound
  {
    quickfix.field.QuoteEntryID value = new quickfix.field.QuoteEntryID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.QuoteEntryID field)
  {
    return isSetField(field);
  }

  public boolean isSetQuoteEntryID()
  {
    return isSetField(299);
  }

  public void set(quickfix.field.MDEntryBuyer value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryBuyer get(quickfix.field.MDEntryBuyer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound
  {
    quickfix.field.MDEntryBuyer value = new quickfix.field.MDEntryBuyer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryBuyer field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryBuyer()
  {
    return isSetField(288);
  }

  public void set(quickfix.field.MDEntrySeller value)
  {
    setField(value);
  }

  public quickfix.field.MDEntrySeller get(quickfix.field.MDEntrySeller  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySeller getMDEntrySeller() throws FieldNotFound
  {
    quickfix.field.MDEntrySeller value = new quickfix.field.MDEntrySeller();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntrySeller field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntrySeller()
  {
    return isSetField(289);
  }

  public void set(quickfix.field.NumberOfOrders value)
  {
    setField(value);
  }

  public quickfix.field.NumberOfOrders get(quickfix.field.NumberOfOrders  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NumberOfOrders getNumberOfOrders() throws FieldNotFound
  {
    quickfix.field.NumberOfOrders value = new quickfix.field.NumberOfOrders();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NumberOfOrders field)
  {
    return isSetField(field);
  }

  public boolean isSetNumberOfOrders()
  {
    return isSetField(346);
  }

  public void set(quickfix.field.MDEntryPositionNo value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryPositionNo get(quickfix.field.MDEntryPositionNo  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound
  {
    quickfix.field.MDEntryPositionNo value = new quickfix.field.MDEntryPositionNo();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryPositionNo field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryPositionNo()
  {
    return isSetField(290);
  }

  public void set(quickfix.field.Scope value)
  {
    setField(value);
  }

  public quickfix.field.Scope get(quickfix.field.Scope  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Scope getScope() throws FieldNotFound
  {
    quickfix.field.Scope value = new quickfix.field.Scope();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Scope field)
  {
    return isSetField(field);
  }

  public boolean isSetScope()
  {
    return isSetField(546);
  }

  public void set(quickfix.field.PriceDelta value)
  {
    setField(value);
  }

  public quickfix.field.PriceDelta get(quickfix.field.PriceDelta  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound
  {
    quickfix.field.PriceDelta value = new quickfix.field.PriceDelta();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PriceDelta field)
  {
    return isSetField(field);
  }

  public boolean isSetPriceDelta()
  {
    return isSetField(811);
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

  public void set(quickfix.field.MDPriceLevel value)
  {
    setField(value);
  }

  public quickfix.field.MDPriceLevel get(quickfix.field.MDPriceLevel  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDPriceLevel getMDPriceLevel() throws FieldNotFound
  {
    quickfix.field.MDPriceLevel value = new quickfix.field.MDPriceLevel();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDPriceLevel field)
  {
    return isSetField(field);
  }

  public boolean isSetMDPriceLevel()
  {
    return isSetField(1023);
  }

  public void set(quickfix.field.OrderCapacity value)
  {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound
  {
    quickfix.field.OrderCapacity value = new quickfix.field.OrderCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity()
  {
    return isSetField(528);
  }

  public void set(quickfix.field.MDOriginType value)
  {
    setField(value);
  }

  public quickfix.field.MDOriginType get(quickfix.field.MDOriginType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDOriginType getMDOriginType() throws FieldNotFound
  {
    quickfix.field.MDOriginType value = new quickfix.field.MDOriginType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDOriginType field)
  {
    return isSetField(field);
  }

  public boolean isSetMDOriginType()
  {
    return isSetField(1024);
  }

  public void set(quickfix.field.HighPx value)
  {
    setField(value);
  }

  public quickfix.field.HighPx get(quickfix.field.HighPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.HighPx getHighPx() throws FieldNotFound
  {
    quickfix.field.HighPx value = new quickfix.field.HighPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.HighPx field)
  {
    return isSetField(field);
  }

  public boolean isSetHighPx()
  {
    return isSetField(332);
  }

  public void set(quickfix.field.LowPx value)
  {
    setField(value);
  }

  public quickfix.field.LowPx get(quickfix.field.LowPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LowPx getLowPx() throws FieldNotFound
  {
    quickfix.field.LowPx value = new quickfix.field.LowPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LowPx field)
  {
    return isSetField(field);
  }

  public boolean isSetLowPx()
  {
    return isSetField(333);
  }

  public void set(quickfix.field.TradeVolume value)
  {
    setField(value);
  }

  public quickfix.field.TradeVolume get(quickfix.field.TradeVolume  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeVolume getTradeVolume() throws FieldNotFound
  {
    quickfix.field.TradeVolume value = new quickfix.field.TradeVolume();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeVolume field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeVolume()
  {
    return isSetField(1020);
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

  public void set(quickfix.field.MDQuoteType value)
  {
    setField(value);
  }

  public quickfix.field.MDQuoteType get(quickfix.field.MDQuoteType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDQuoteType getMDQuoteType() throws FieldNotFound
  {
    quickfix.field.MDQuoteType value = new quickfix.field.MDQuoteType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDQuoteType field)
  {
    return isSetField(field);
  }

  public boolean isSetMDQuoteType()
  {
    return isSetField(1070);
  }

  public void set(quickfix.field.RptSeq value)
  {
    setField(value);
  }

  public quickfix.field.RptSeq get(quickfix.field.RptSeq  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RptSeq getRptSeq() throws FieldNotFound
  {
    quickfix.field.RptSeq value = new quickfix.field.RptSeq();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RptSeq field)
  {
    return isSetField(field);
  }

  public boolean isSetRptSeq()
  {
    return isSetField(83);
  }

  public void set(quickfix.field.DealingCapacity value)
  {
    setField(value);
  }

  public quickfix.field.DealingCapacity get(quickfix.field.DealingCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DealingCapacity getDealingCapacity() throws FieldNotFound
  {
    quickfix.field.DealingCapacity value = new quickfix.field.DealingCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DealingCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetDealingCapacity()
  {
    return isSetField(1048);
  }

  public void set(quickfix.field.MDEntrySpotRate value)
  {
    setField(value);
  }

  public quickfix.field.MDEntrySpotRate get(quickfix.field.MDEntrySpotRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySpotRate getMDEntrySpotRate() throws FieldNotFound
  {
    quickfix.field.MDEntrySpotRate value = new quickfix.field.MDEntrySpotRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntrySpotRate field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntrySpotRate()
  {
    return isSetField(1026);
  }

  public void set(quickfix.field.MDEntryForwardPoints value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryForwardPoints get(quickfix.field.MDEntryForwardPoints  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryForwardPoints getMDEntryForwardPoints() throws FieldNotFound
  {
    quickfix.field.MDEntryForwardPoints value = new quickfix.field.MDEntryForwardPoints();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryForwardPoints field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryForwardPoints()
  {
    return isSetField(1027);
  }

  public void set(quickfix.field.MDEntryID value)
  {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound
  {
    quickfix.field.MDEntryID value = new quickfix.field.MDEntryID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MDEntryID field)
  {
    return isSetField(field);
  }

  public boolean isSetMDEntryID()
  {
    return isSetField(278);
  }

  public void set(quickfix.fix50.component.Parties component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.Parties get(quickfix.fix50.component.Parties  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.Parties getParties() throws FieldNotFound
  {
    quickfix.fix50.component.Parties component = new quickfix.fix50.component.Parties();
    getComponent(component);
    return component;
  }


  public void set(quickfix.field.NoPartyIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound
  {
    quickfix.field.NoPartyIDs value = new quickfix.field.NoPartyIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoPartyIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs()
  {
    return isSetField(453);
  }

  public static class NoPartyIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoPartyIDs() {
        super(453, 448,
            new int[] {448, 447, 452, 802,  0 } );
    }

  public void set(quickfix.field.PartyID value)
  {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound
  {
    quickfix.field.PartyID value = new quickfix.field.PartyID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyID field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyID()
  {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value)
  {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound
  {
    quickfix.field.PartyIDSource value = new quickfix.field.PartyIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource()
  {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value)
  {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound
  {
    quickfix.field.PartyRole value = new quickfix.field.PartyRole();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartyRole field)
  {
    return isSetField(field);
  }

  public boolean isSetPartyRole()
  {
    return isSetField(452);
  }

  public void set(quickfix.fix50.component.PtysSubGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.PtysSubGrp get(quickfix.fix50.component.PtysSubGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound
  {
    quickfix.fix50.component.PtysSubGrp component = new quickfix.fix50.component.PtysSubGrp();
    getComponent(component);
    return component;
  }


  public void set(quickfix.field.NoPartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoPartySubIDs value = new quickfix.field.NoPartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs()
  {
    return isSetField(802);
  }

  public static class NoPartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoPartySubIDs() {
        super(802, 523,
            new int[] {523, 803,  0 } );
    }

  public void set(quickfix.field.PartySubID value)
  {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound
  {
    quickfix.field.PartySubID value = new quickfix.field.PartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetPartySubID()
  {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound
  {
    quickfix.field.PartySubIDType value = new quickfix.field.PartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType()
  {
    return isSetField(803);
  }

  }

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

  }

}
  