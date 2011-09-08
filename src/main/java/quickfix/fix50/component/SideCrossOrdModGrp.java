
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class SideCrossOrdModGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 552,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public SideCrossOrdModGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoSides value)
  {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound
  {
    quickfix.field.NoSides value = new quickfix.field.NoSides();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSides field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSides()
  {
    return isSetField(552);
  }
  
  public static class NoSides extends Group {
    static final long serialVersionUID = 20050617;
    public NoSides() {
        super(552, 54,
            new int[] {54, 11, 526, 583, 453, 229, 75, 1, 660, 581, 589, 590, 591, 70, 78, 854, 38, 152, 516, 468, 469, 12, 13, 479, 497, 528, 529, 582, 121, 120, 775, 58, 354, 355, 77, 203, 544, 635, 377, 659, 962, 1091,  0 } );
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
  
  public void set(quickfix.field.ClOrdLinkID value)
  {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound
  {
    quickfix.field.ClOrdLinkID value = new quickfix.field.ClOrdLinkID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field)
  {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID()
  {
    return isSetField(583);
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
  
  public void set(quickfix.field.TradeOriginationDate value)
  {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound
  {
    quickfix.field.TradeOriginationDate value = new quickfix.field.TradeOriginationDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate()
  {
    return isSetField(229);
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
  
  public void set(quickfix.field.AccountType value)
  {
    setField(value);
  }

  public quickfix.field.AccountType get(quickfix.field.AccountType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AccountType getAccountType() throws FieldNotFound
  {
    quickfix.field.AccountType value = new quickfix.field.AccountType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AccountType field)
  {
    return isSetField(field);
  }

  public boolean isSetAccountType()
  {
    return isSetField(581);
  }
  
  public void set(quickfix.field.DayBookingInst value)
  {
    setField(value);
  }

  public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound
  {
    quickfix.field.DayBookingInst value = new quickfix.field.DayBookingInst();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.DayBookingInst field)
  {
    return isSetField(field);
  }

  public boolean isSetDayBookingInst()
  {
    return isSetField(589);
  }
  
  public void set(quickfix.field.BookingUnit value)
  {
    setField(value);
  }

  public quickfix.field.BookingUnit get(quickfix.field.BookingUnit  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound
  {
    quickfix.field.BookingUnit value = new quickfix.field.BookingUnit();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BookingUnit field)
  {
    return isSetField(field);
  }

  public boolean isSetBookingUnit()
  {
    return isSetField(590);
  }
  
  public void set(quickfix.field.PreallocMethod value)
  {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound
  {
    quickfix.field.PreallocMethod value = new quickfix.field.PreallocMethod();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PreallocMethod field)
  {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod()
  {
    return isSetField(591);
  }
  
  public void set(quickfix.field.AllocID value)
  {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound
  {
    quickfix.field.AllocID value = new quickfix.field.AllocID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocID field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocID()
  {
    return isSetField(70);
  }
  
  public void set(quickfix.fix50.component.PreAllocGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.PreAllocGrp get(quickfix.fix50.component.PreAllocGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.PreAllocGrp getPreAllocGrp() throws FieldNotFound
  {
    quickfix.fix50.component.PreAllocGrp component = new quickfix.fix50.component.PreAllocGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoAllocs value)
  {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound
  {
    quickfix.field.NoAllocs value = new quickfix.field.NoAllocs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoAllocs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoAllocs()
  {
    return isSetField(78);
  }
  
  public static class NoAllocs extends Group {
    static final long serialVersionUID = 20050617;
    public NoAllocs() {
        super(78, 79,
            new int[] {79, 661, 736, 467, 539, 80,  0 } );
    }
    
  public void set(quickfix.field.AllocAccount value)
  {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound
  {
    quickfix.field.AllocAccount value = new quickfix.field.AllocAccount();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocAccount field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocAccount()
  {
    return isSetField(79);
  }
  
  public void set(quickfix.field.AllocAcctIDSource value)
  {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound
  {
    quickfix.field.AllocAcctIDSource value = new quickfix.field.AllocAcctIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource()
  {
    return isSetField(661);
  }
  
  public void set(quickfix.field.AllocSettlCurrency value)
  {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound
  {
    quickfix.field.AllocSettlCurrency value = new quickfix.field.AllocSettlCurrency();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency()
  {
    return isSetField(736);
  }
  
  public void set(quickfix.field.IndividualAllocID value)
  {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound
  {
    quickfix.field.IndividualAllocID value = new quickfix.field.IndividualAllocID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.IndividualAllocID field)
  {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID()
  {
    return isSetField(467);
  }
  
  public void set(quickfix.fix50.component.NestedParties component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.NestedParties get(quickfix.fix50.component.NestedParties  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.NestedParties getNestedParties() throws FieldNotFound
  {
    quickfix.fix50.component.NestedParties component = new quickfix.fix50.component.NestedParties();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoNestedPartyIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound
  {
    quickfix.field.NoNestedPartyIDs value = new quickfix.field.NoNestedPartyIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs()
  {
    return isSetField(539);
  }
  
  public static class NoNestedPartyIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoNestedPartyIDs() {
        super(539, 524,
            new int[] {524, 525, 538, 804,  0 } );
    }
    
  public void set(quickfix.field.NestedPartyID value)
  {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound
  {
    quickfix.field.NestedPartyID value = new quickfix.field.NestedPartyID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NestedPartyID field)
  {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID()
  {
    return isSetField(524);
  }
  
  public void set(quickfix.field.NestedPartyIDSource value)
  {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound
  {
    quickfix.field.NestedPartyIDSource value = new quickfix.field.NestedPartyIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource()
  {
    return isSetField(525);
  }
  
  public void set(quickfix.field.NestedPartyRole value)
  {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound
  {
    quickfix.field.NestedPartyRole value = new quickfix.field.NestedPartyRole();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NestedPartyRole field)
  {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole()
  {
    return isSetField(538);
  }
  
  public void set(quickfix.fix50.component.NstdPtysSubGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.NstdPtysSubGrp get(quickfix.fix50.component.NstdPtysSubGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound
  {
    quickfix.fix50.component.NstdPtysSubGrp component = new quickfix.fix50.component.NstdPtysSubGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoNestedPartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoNestedPartySubIDs value = new quickfix.field.NoNestedPartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs()
  {
    return isSetField(804);
  }
  
  public static class NoNestedPartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoNestedPartySubIDs() {
        super(804, 545,
            new int[] {545, 805,  0 } );
    }
    
  public void set(quickfix.field.NestedPartySubID value)
  {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound
  {
    quickfix.field.NestedPartySubID value = new quickfix.field.NestedPartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NestedPartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID()
  {
    return isSetField(545);
  }
  
  public void set(quickfix.field.NestedPartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound
  {
    quickfix.field.NestedPartySubIDType value = new quickfix.field.NestedPartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType()
  {
    return isSetField(805);
  }
  
  }
  
  }
  
  public void set(quickfix.field.AllocQty value)
  {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound
  {
    quickfix.field.AllocQty value = new quickfix.field.AllocQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocQty field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocQty()
  {
    return isSetField(80);
  }
  
  }
  
  public void set(quickfix.field.QtyType value)
  {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound
  {
    quickfix.field.QtyType value = new quickfix.field.QtyType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.QtyType field)
  {
    return isSetField(field);
  }

  public boolean isSetQtyType()
  {
    return isSetField(854);
  }
  
  public void set(quickfix.fix50.component.OrderQtyData component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.OrderQtyData get(quickfix.fix50.component.OrderQtyData  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.OrderQtyData getOrderQtyData() throws FieldNotFound
  {
    quickfix.fix50.component.OrderQtyData component = new quickfix.fix50.component.OrderQtyData();
    getComponent(component);
    return component;
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
  
  public void set(quickfix.field.CashOrderQty value)
  {
    setField(value);
  }

  public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound
  {
    quickfix.field.CashOrderQty value = new quickfix.field.CashOrderQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CashOrderQty field)
  {
    return isSetField(field);
  }

  public boolean isSetCashOrderQty()
  {
    return isSetField(152);
  }
  
  public void set(quickfix.field.OrderPercent value)
  {
    setField(value);
  }

  public quickfix.field.OrderPercent get(quickfix.field.OrderPercent  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound
  {
    quickfix.field.OrderPercent value = new quickfix.field.OrderPercent();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderPercent field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderPercent()
  {
    return isSetField(516);
  }
  
  public void set(quickfix.field.RoundingDirection value)
  {
    setField(value);
  }

  public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound
  {
    quickfix.field.RoundingDirection value = new quickfix.field.RoundingDirection();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RoundingDirection field)
  {
    return isSetField(field);
  }

  public boolean isSetRoundingDirection()
  {
    return isSetField(468);
  }
  
  public void set(quickfix.field.RoundingModulus value)
  {
    setField(value);
  }

  public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound
  {
    quickfix.field.RoundingModulus value = new quickfix.field.RoundingModulus();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.RoundingModulus field)
  {
    return isSetField(field);
  }

  public boolean isSetRoundingModulus()
  {
    return isSetField(469);
  }
  
  public void set(quickfix.fix50.component.CommissionData component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.CommissionData get(quickfix.fix50.component.CommissionData  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.CommissionData getCommissionData() throws FieldNotFound
  {
    quickfix.fix50.component.CommissionData component = new quickfix.fix50.component.CommissionData();
    getComponent(component);
    return component;
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
  
  public void set(quickfix.field.OrderRestrictions value)
  {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound
  {
    quickfix.field.OrderRestrictions value = new quickfix.field.OrderRestrictions();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderRestrictions field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions()
  {
    return isSetField(529);
  }
  
  public void set(quickfix.field.CustOrderCapacity value)
  {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound
  {
    quickfix.field.CustOrderCapacity value = new quickfix.field.CustOrderCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity()
  {
    return isSetField(582);
  }
  
  public void set(quickfix.field.ForexReq value)
  {
    setField(value);
  }

  public quickfix.field.ForexReq get(quickfix.field.ForexReq  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ForexReq getForexReq() throws FieldNotFound
  {
    quickfix.field.ForexReq value = new quickfix.field.ForexReq();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ForexReq field)
  {
    return isSetField(field);
  }

  public boolean isSetForexReq()
  {
    return isSetField(121);
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
  
  public void set(quickfix.field.BookingType value)
  {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound
  {
    quickfix.field.BookingType value = new quickfix.field.BookingType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BookingType field)
  {
    return isSetField(field);
  }

  public boolean isSetBookingType()
  {
    return isSetField(775);
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
  
  public void set(quickfix.field.PositionEffect value)
  {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound
  {
    quickfix.field.PositionEffect value = new quickfix.field.PositionEffect();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PositionEffect field)
  {
    return isSetField(field);
  }

  public boolean isSetPositionEffect()
  {
    return isSetField(77);
  }
  
  public void set(quickfix.field.CoveredOrUncovered value)
  {
    setField(value);
  }

  public quickfix.field.CoveredOrUncovered get(quickfix.field.CoveredOrUncovered  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound
  {
    quickfix.field.CoveredOrUncovered value = new quickfix.field.CoveredOrUncovered();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CoveredOrUncovered field)
  {
    return isSetField(field);
  }

  public boolean isSetCoveredOrUncovered()
  {
    return isSetField(203);
  }
  
  public void set(quickfix.field.CashMargin value)
  {
    setField(value);
  }

  public quickfix.field.CashMargin get(quickfix.field.CashMargin  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.CashMargin getCashMargin() throws FieldNotFound
  {
    quickfix.field.CashMargin value = new quickfix.field.CashMargin();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.CashMargin field)
  {
    return isSetField(field);
  }

  public boolean isSetCashMargin()
  {
    return isSetField(544);
  }
  
  public void set(quickfix.field.ClearingFeeIndicator value)
  {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound
  {
    quickfix.field.ClearingFeeIndicator value = new quickfix.field.ClearingFeeIndicator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field)
  {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator()
  {
    return isSetField(635);
  }
  
  public void set(quickfix.field.SolicitedFlag value)
  {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound
  {
    quickfix.field.SolicitedFlag value = new quickfix.field.SolicitedFlag();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SolicitedFlag field)
  {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag()
  {
    return isSetField(377);
  }
  
  public void set(quickfix.field.SideComplianceID value)
  {
    setField(value);
  }

  public quickfix.field.SideComplianceID get(quickfix.field.SideComplianceID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideComplianceID getSideComplianceID() throws FieldNotFound
  {
    quickfix.field.SideComplianceID value = new quickfix.field.SideComplianceID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideComplianceID field)
  {
    return isSetField(field);
  }

  public boolean isSetSideComplianceID()
  {
    return isSetField(659);
  }
  
  public void set(quickfix.field.SideTimeInForce value)
  {
    setField(value);
  }

  public quickfix.field.SideTimeInForce get(quickfix.field.SideTimeInForce  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTimeInForce getSideTimeInForce() throws FieldNotFound
  {
    quickfix.field.SideTimeInForce value = new quickfix.field.SideTimeInForce();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTimeInForce field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTimeInForce()
  {
    return isSetField(962);
  }
  
  public void set(quickfix.field.PreTradeAnonymity value)
  {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound
  {
    quickfix.field.PreTradeAnonymity value = new quickfix.field.PreTradeAnonymity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field)
  {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity()
  {
    return isSetField(1091);
  }
  
  }
  
}
  