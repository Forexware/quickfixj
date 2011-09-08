
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdCapRptAckSideGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 552,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public TrdCapRptAckSideGrp()
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
            new int[] {54, 37, 198, 11, 526, 66, 453, 1, 660, 581, 81, 575, 576, 578, 579, 821, 15, 376, 377, 528, 529, 582, 40, 18, 483, 336, 625, 943, 12, 13, 479, 497, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 120, 155, 156, 77, 752, 518, 232, 136, 825, 826, 591, 70, 78, 1093, 1072, 1057, 1009, 1005, 1006, 1007, 83, 1008, 1016,  0 } );
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
  
  public void set(quickfix.field.ProcessCode value)
  {
    setField(value);
  }

  public quickfix.field.ProcessCode get(quickfix.field.ProcessCode  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound
  {
    quickfix.field.ProcessCode value = new quickfix.field.ProcessCode();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ProcessCode field)
  {
    return isSetField(field);
  }

  public boolean isSetProcessCode()
  {
    return isSetField(81);
  }
  
  public void set(quickfix.field.OddLot value)
  {
    setField(value);
  }

  public quickfix.field.OddLot get(quickfix.field.OddLot  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OddLot getOddLot() throws FieldNotFound
  {
    quickfix.field.OddLot value = new quickfix.field.OddLot();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OddLot field)
  {
    return isSetField(field);
  }

  public boolean isSetOddLot()
  {
    return isSetField(575);
  }
  
  public void set(quickfix.fix50.component.ClrInstGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.ClrInstGrp get(quickfix.fix50.component.ClrInstGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.ClrInstGrp getClrInstGrp() throws FieldNotFound
  {
    quickfix.fix50.component.ClrInstGrp component = new quickfix.fix50.component.ClrInstGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoClearingInstructions value)
  {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound
  {
    quickfix.field.NoClearingInstructions value = new quickfix.field.NoClearingInstructions();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field)
  {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions()
  {
    return isSetField(576);
  }
  
  public static class NoClearingInstructions extends Group {
    static final long serialVersionUID = 20050617;
    public NoClearingInstructions() {
        super(576, 577,
            new int[] {577,  0 } );
    }
    
  public void set(quickfix.field.ClearingInstruction value)
  {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound
  {
    quickfix.field.ClearingInstruction value = new quickfix.field.ClearingInstruction();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClearingInstruction field)
  {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction()
  {
    return isSetField(577);
  }
  
  }
  
  public void set(quickfix.field.TradeInputSource value)
  {
    setField(value);
  }

  public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound
  {
    quickfix.field.TradeInputSource value = new quickfix.field.TradeInputSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeInputSource field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeInputSource()
  {
    return isSetField(578);
  }
  
  public void set(quickfix.field.TradeInputDevice value)
  {
    setField(value);
  }

  public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound
  {
    quickfix.field.TradeInputDevice value = new quickfix.field.TradeInputDevice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeInputDevice field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeInputDevice()
  {
    return isSetField(579);
  }
  
  public void set(quickfix.field.OrderInputDevice value)
  {
    setField(value);
  }

  public quickfix.field.OrderInputDevice get(quickfix.field.OrderInputDevice  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderInputDevice getOrderInputDevice() throws FieldNotFound
  {
    quickfix.field.OrderInputDevice value = new quickfix.field.OrderInputDevice();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderInputDevice field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderInputDevice()
  {
    return isSetField(821);
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
  
  public void set(quickfix.field.ComplianceID value)
  {
    setField(value);
  }

  public quickfix.field.ComplianceID get(quickfix.field.ComplianceID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound
  {
    quickfix.field.ComplianceID value = new quickfix.field.ComplianceID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ComplianceID field)
  {
    return isSetField(field);
  }

  public boolean isSetComplianceID()
  {
    return isSetField(376);
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
  
  public void set(quickfix.field.TransBkdTime value)
  {
    setField(value);
  }

  public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound
  {
    quickfix.field.TransBkdTime value = new quickfix.field.TransBkdTime();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TransBkdTime field)
  {
    return isSetField(field);
  }

  public boolean isSetTransBkdTime()
  {
    return isSetField(483);
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
  
  public void set(quickfix.field.TimeBracket value)
  {
    setField(value);
  }

  public quickfix.field.TimeBracket get(quickfix.field.TimeBracket  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound
  {
    quickfix.field.TimeBracket value = new quickfix.field.TimeBracket();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TimeBracket field)
  {
    return isSetField(field);
  }

  public boolean isSetTimeBracket()
  {
    return isSetField(943);
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
  
  public void set(quickfix.field.NumDaysInterest value)
  {
    setField(value);
  }

  public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound
  {
    quickfix.field.NumDaysInterest value = new quickfix.field.NumDaysInterest();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NumDaysInterest field)
  {
    return isSetField(field);
  }

  public boolean isSetNumDaysInterest()
  {
    return isSetField(157);
  }
  
  public void set(quickfix.field.ExDate value)
  {
    setField(value);
  }

  public quickfix.field.ExDate get(quickfix.field.ExDate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExDate getExDate() throws FieldNotFound
  {
    quickfix.field.ExDate value = new quickfix.field.ExDate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExDate field)
  {
    return isSetField(field);
  }

  public boolean isSetExDate()
  {
    return isSetField(230);
  }
  
  public void set(quickfix.field.AccruedInterestRate value)
  {
    setField(value);
  }

  public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound
  {
    quickfix.field.AccruedInterestRate value = new quickfix.field.AccruedInterestRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AccruedInterestRate field)
  {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestRate()
  {
    return isSetField(158);
  }
  
  public void set(quickfix.field.AccruedInterestAmt value)
  {
    setField(value);
  }

  public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound
  {
    quickfix.field.AccruedInterestAmt value = new quickfix.field.AccruedInterestAmt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AccruedInterestAmt field)
  {
    return isSetField(field);
  }

  public boolean isSetAccruedInterestAmt()
  {
    return isSetField(159);
  }
  
  public void set(quickfix.field.InterestAtMaturity value)
  {
    setField(value);
  }

  public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound
  {
    quickfix.field.InterestAtMaturity value = new quickfix.field.InterestAtMaturity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.InterestAtMaturity field)
  {
    return isSetField(field);
  }

  public boolean isSetInterestAtMaturity()
  {
    return isSetField(738);
  }
  
  public void set(quickfix.field.EndAccruedInterestAmt value)
  {
    setField(value);
  }

  public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound
  {
    quickfix.field.EndAccruedInterestAmt value = new quickfix.field.EndAccruedInterestAmt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EndAccruedInterestAmt field)
  {
    return isSetField(field);
  }

  public boolean isSetEndAccruedInterestAmt()
  {
    return isSetField(920);
  }
  
  public void set(quickfix.field.StartCash value)
  {
    setField(value);
  }

  public quickfix.field.StartCash get(quickfix.field.StartCash  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StartCash getStartCash() throws FieldNotFound
  {
    quickfix.field.StartCash value = new quickfix.field.StartCash();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StartCash field)
  {
    return isSetField(field);
  }

  public boolean isSetStartCash()
  {
    return isSetField(921);
  }
  
  public void set(quickfix.field.EndCash value)
  {
    setField(value);
  }

  public quickfix.field.EndCash get(quickfix.field.EndCash  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EndCash getEndCash() throws FieldNotFound
  {
    quickfix.field.EndCash value = new quickfix.field.EndCash();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EndCash field)
  {
    return isSetField(field);
  }

  public boolean isSetEndCash()
  {
    return isSetField(922);
  }
  
  public void set(quickfix.field.Concession value)
  {
    setField(value);
  }

  public quickfix.field.Concession get(quickfix.field.Concession  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Concession getConcession() throws FieldNotFound
  {
    quickfix.field.Concession value = new quickfix.field.Concession();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Concession field)
  {
    return isSetField(field);
  }

  public boolean isSetConcession()
  {
    return isSetField(238);
  }
  
  public void set(quickfix.field.TotalTakedown value)
  {
    setField(value);
  }

  public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound
  {
    quickfix.field.TotalTakedown value = new quickfix.field.TotalTakedown();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TotalTakedown field)
  {
    return isSetField(field);
  }

  public boolean isSetTotalTakedown()
  {
    return isSetField(237);
  }
  
  public void set(quickfix.field.NetMoney value)
  {
    setField(value);
  }

  public quickfix.field.NetMoney get(quickfix.field.NetMoney  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NetMoney getNetMoney() throws FieldNotFound
  {
    quickfix.field.NetMoney value = new quickfix.field.NetMoney();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NetMoney field)
  {
    return isSetField(field);
  }

  public boolean isSetNetMoney()
  {
    return isSetField(118);
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
  
  public void set(quickfix.field.SettlCurrFxRate value)
  {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound
  {
    quickfix.field.SettlCurrFxRate value = new quickfix.field.SettlCurrFxRate();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlCurrFxRate field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRate()
  {
    return isSetField(155);
  }
  
  public void set(quickfix.field.SettlCurrFxRateCalc value)
  {
    setField(value);
  }

  public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound
  {
    quickfix.field.SettlCurrFxRateCalc value = new quickfix.field.SettlCurrFxRateCalc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SettlCurrFxRateCalc field)
  {
    return isSetField(field);
  }

  public boolean isSetSettlCurrFxRateCalc()
  {
    return isSetField(156);
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
  
  public void set(quickfix.field.SideMultiLegReportingType value)
  {
    setField(value);
  }

  public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound
  {
    quickfix.field.SideMultiLegReportingType value = new quickfix.field.SideMultiLegReportingType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideMultiLegReportingType field)
  {
    return isSetField(field);
  }

  public boolean isSetSideMultiLegReportingType()
  {
    return isSetField(752);
  }
  
  public void set(quickfix.fix50.component.ContAmtGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.ContAmtGrp get(quickfix.fix50.component.ContAmtGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.ContAmtGrp getContAmtGrp() throws FieldNotFound
  {
    quickfix.fix50.component.ContAmtGrp component = new quickfix.fix50.component.ContAmtGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoContAmts value)
  {
    setField(value);
  }

  public quickfix.field.NoContAmts get(quickfix.field.NoContAmts  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound
  {
    quickfix.field.NoContAmts value = new quickfix.field.NoContAmts();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoContAmts field)
  {
    return isSetField(field);
  }

  public boolean isSetNoContAmts()
  {
    return isSetField(518);
  }
  
  public static class NoContAmts extends Group {
    static final long serialVersionUID = 20050617;
    public NoContAmts() {
        super(518, 519,
            new int[] {519, 520, 521,  0 } );
    }
    
  public void set(quickfix.field.ContAmtType value)
  {
    setField(value);
  }

  public quickfix.field.ContAmtType get(quickfix.field.ContAmtType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound
  {
    quickfix.field.ContAmtType value = new quickfix.field.ContAmtType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ContAmtType field)
  {
    return isSetField(field);
  }

  public boolean isSetContAmtType()
  {
    return isSetField(519);
  }
  
  public void set(quickfix.field.ContAmtValue value)
  {
    setField(value);
  }

  public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound
  {
    quickfix.field.ContAmtValue value = new quickfix.field.ContAmtValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ContAmtValue field)
  {
    return isSetField(field);
  }

  public boolean isSetContAmtValue()
  {
    return isSetField(520);
  }
  
  public void set(quickfix.field.ContAmtCurr value)
  {
    setField(value);
  }

  public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound
  {
    quickfix.field.ContAmtCurr value = new quickfix.field.ContAmtCurr();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ContAmtCurr field)
  {
    return isSetField(field);
  }

  public boolean isSetContAmtCurr()
  {
    return isSetField(521);
  }
  
  }
  
  public void set(quickfix.fix50.component.Stipulations component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.Stipulations get(quickfix.fix50.component.Stipulations  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.Stipulations getStipulations() throws FieldNotFound
  {
    quickfix.fix50.component.Stipulations component = new quickfix.fix50.component.Stipulations();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoStipulations value)
  {
    setField(value);
  }

  public quickfix.field.NoStipulations get(quickfix.field.NoStipulations  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound
  {
    quickfix.field.NoStipulations value = new quickfix.field.NoStipulations();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoStipulations field)
  {
    return isSetField(field);
  }

  public boolean isSetNoStipulations()
  {
    return isSetField(232);
  }
  
  public static class NoStipulations extends Group {
    static final long serialVersionUID = 20050617;
    public NoStipulations() {
        super(232, 233,
            new int[] {233, 234,  0 } );
    }
    
  public void set(quickfix.field.StipulationType value)
  {
    setField(value);
  }

  public quickfix.field.StipulationType get(quickfix.field.StipulationType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationType getStipulationType() throws FieldNotFound
  {
    quickfix.field.StipulationType value = new quickfix.field.StipulationType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StipulationType field)
  {
    return isSetField(field);
  }

  public boolean isSetStipulationType()
  {
    return isSetField(233);
  }
  
  public void set(quickfix.field.StipulationValue value)
  {
    setField(value);
  }

  public quickfix.field.StipulationValue get(quickfix.field.StipulationValue  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound
  {
    quickfix.field.StipulationValue value = new quickfix.field.StipulationValue();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.StipulationValue field)
  {
    return isSetField(field);
  }

  public boolean isSetStipulationValue()
  {
    return isSetField(234);
  }
  
  }
  
  public void set(quickfix.fix50.component.MiscFeesGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.MiscFeesGrp get(quickfix.fix50.component.MiscFeesGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.MiscFeesGrp getMiscFeesGrp() throws FieldNotFound
  {
    quickfix.fix50.component.MiscFeesGrp component = new quickfix.fix50.component.MiscFeesGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoMiscFees value)
  {
    setField(value);
  }

  public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound
  {
    quickfix.field.NoMiscFees value = new quickfix.field.NoMiscFees();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoMiscFees field)
  {
    return isSetField(field);
  }

  public boolean isSetNoMiscFees()
  {
    return isSetField(136);
  }
  
  public static class NoMiscFees extends Group {
    static final long serialVersionUID = 20050617;
    public NoMiscFees() {
        super(136, 137,
            new int[] {137, 138, 139, 891,  0 } );
    }
    
  public void set(quickfix.field.MiscFeeAmt value)
  {
    setField(value);
  }

  public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound
  {
    quickfix.field.MiscFeeAmt value = new quickfix.field.MiscFeeAmt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MiscFeeAmt field)
  {
    return isSetField(field);
  }

  public boolean isSetMiscFeeAmt()
  {
    return isSetField(137);
  }
  
  public void set(quickfix.field.MiscFeeCurr value)
  {
    setField(value);
  }

  public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound
  {
    quickfix.field.MiscFeeCurr value = new quickfix.field.MiscFeeCurr();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MiscFeeCurr field)
  {
    return isSetField(field);
  }

  public boolean isSetMiscFeeCurr()
  {
    return isSetField(138);
  }
  
  public void set(quickfix.field.MiscFeeType value)
  {
    setField(value);
  }

  public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound
  {
    quickfix.field.MiscFeeType value = new quickfix.field.MiscFeeType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MiscFeeType field)
  {
    return isSetField(field);
  }

  public boolean isSetMiscFeeType()
  {
    return isSetField(139);
  }
  
  public void set(quickfix.field.MiscFeeBasis value)
  {
    setField(value);
  }

  public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound
  {
    quickfix.field.MiscFeeBasis value = new quickfix.field.MiscFeeBasis();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.MiscFeeBasis field)
  {
    return isSetField(field);
  }

  public boolean isSetMiscFeeBasis()
  {
    return isSetField(891);
  }
  
  }
  
  public void set(quickfix.field.ExchangeRule value)
  {
    setField(value);
  }

  public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound
  {
    quickfix.field.ExchangeRule value = new quickfix.field.ExchangeRule();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExchangeRule field)
  {
    return isSetField(field);
  }

  public boolean isSetExchangeRule()
  {
    return isSetField(825);
  }
  
  public void set(quickfix.field.TradeAllocIndicator value)
  {
    setField(value);
  }

  public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound
  {
    quickfix.field.TradeAllocIndicator value = new quickfix.field.TradeAllocIndicator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.TradeAllocIndicator field)
  {
    return isSetField(field);
  }

  public boolean isSetTradeAllocIndicator()
  {
    return isSetField(826);
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
  
  public void set(quickfix.fix50.component.TrdAllocGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.TrdAllocGrp get(quickfix.fix50.component.TrdAllocGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.TrdAllocGrp getTrdAllocGrp() throws FieldNotFound
  {
    quickfix.fix50.component.TrdAllocGrp component = new quickfix.fix50.component.TrdAllocGrp();
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
            new int[] {79, 661, 736, 467, 756, 80, 993, 1002, 989, 1136,  0 } );
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
  
  public void set(quickfix.fix50.component.NestedParties2 component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.NestedParties2 get(quickfix.fix50.component.NestedParties2  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.NestedParties2 getNestedParties2() throws FieldNotFound
  {
    quickfix.fix50.component.NestedParties2 component = new quickfix.fix50.component.NestedParties2();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoNested2PartyIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound
  {
    quickfix.field.NoNested2PartyIDs value = new quickfix.field.NoNested2PartyIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs()
  {
    return isSetField(756);
  }
  
  public static class NoNested2PartyIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoNested2PartyIDs() {
        super(756, 757,
            new int[] {757, 758, 759, 806,  0 } );
    }
    
  public void set(quickfix.field.Nested2PartyID value)
  {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound
  {
    quickfix.field.Nested2PartyID value = new quickfix.field.Nested2PartyID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Nested2PartyID field)
  {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID()
  {
    return isSetField(757);
  }
  
  public void set(quickfix.field.Nested2PartyIDSource value)
  {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound
  {
    quickfix.field.Nested2PartyIDSource value = new quickfix.field.Nested2PartyIDSource();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field)
  {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource()
  {
    return isSetField(758);
  }
  
  public void set(quickfix.field.Nested2PartyRole value)
  {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound
  {
    quickfix.field.Nested2PartyRole value = new quickfix.field.Nested2PartyRole();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field)
  {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole()
  {
    return isSetField(759);
  }
  
  public void set(quickfix.fix50.component.NstdPtys2SubGrp component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.NstdPtys2SubGrp get(quickfix.fix50.component.NstdPtys2SubGrp  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.NstdPtys2SubGrp getNstdPtys2SubGrp() throws FieldNotFound
  {
    quickfix.fix50.component.NstdPtys2SubGrp component = new quickfix.fix50.component.NstdPtys2SubGrp();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoNested2PartySubIDs value)
  {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound
  {
    quickfix.field.NoNested2PartySubIDs value = new quickfix.field.NoNested2PartySubIDs();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field)
  {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs()
  {
    return isSetField(806);
  }
  
  public static class NoNested2PartySubIDs extends Group {
    static final long serialVersionUID = 20050617;
    public NoNested2PartySubIDs() {
        super(806, 760,
            new int[] {760, 807,  0 } );
    }
    
  public void set(quickfix.field.Nested2PartySubID value)
  {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound
  {
    quickfix.field.Nested2PartySubID value = new quickfix.field.Nested2PartySubID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field)
  {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID()
  {
    return isSetField(760);
  }
  
  public void set(quickfix.field.Nested2PartySubIDType value)
  {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound
  {
    quickfix.field.Nested2PartySubIDType value = new quickfix.field.Nested2PartySubIDType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field)
  {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType()
  {
    return isSetField(807);
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
  
  public void set(quickfix.field.AllocCustomerCapacity value)
  {
    setField(value);
  }

  public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound
  {
    quickfix.field.AllocCustomerCapacity value = new quickfix.field.AllocCustomerCapacity();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocCustomerCapacity field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocCustomerCapacity()
  {
    return isSetField(993);
  }
  
  public void set(quickfix.field.AllocMethod value)
  {
    setField(value);
  }

  public quickfix.field.AllocMethod get(quickfix.field.AllocMethod  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound
  {
    quickfix.field.AllocMethod value = new quickfix.field.AllocMethod();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocMethod field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocMethod()
  {
    return isSetField(1002);
  }
  
  public void set(quickfix.field.SecondaryIndividualAllocID value)
  {
    setField(value);
  }

  public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound
  {
    quickfix.field.SecondaryIndividualAllocID value = new quickfix.field.SecondaryIndividualAllocID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecondaryIndividualAllocID field)
  {
    return isSetField(field);
  }

  public boolean isSetSecondaryIndividualAllocID()
  {
    return isSetField(989);
  }
  
  public void set(quickfix.field.AllocClearingFeeIndicator value)
  {
    setField(value);
  }

  public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound
  {
    quickfix.field.AllocClearingFeeIndicator value = new quickfix.field.AllocClearingFeeIndicator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AllocClearingFeeIndicator field)
  {
    return isSetField(field);
  }

  public boolean isSetAllocClearingFeeIndicator()
  {
    return isSetField(1136);
  }
  
  }
  
  public void set(quickfix.field.LotType value)
  {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound
  {
    quickfix.field.LotType value = new quickfix.field.LotType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LotType field)
  {
    return isSetField(field);
  }

  public boolean isSetLotType()
  {
    return isSetField(1093);
  }
  
  public void set(quickfix.field.SideGrossTradeAmt value)
  {
    setField(value);
  }

  public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound
  {
    quickfix.field.SideGrossTradeAmt value = new quickfix.field.SideGrossTradeAmt();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideGrossTradeAmt field)
  {
    return isSetField(field);
  }

  public boolean isSetSideGrossTradeAmt()
  {
    return isSetField(1072);
  }
  
  public void set(quickfix.field.AggressorIndicator value)
  {
    setField(value);
  }

  public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound
  {
    quickfix.field.AggressorIndicator value = new quickfix.field.AggressorIndicator();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.AggressorIndicator field)
  {
    return isSetField(field);
  }

  public boolean isSetAggressorIndicator()
  {
    return isSetField(1057);
  }
  
  public void set(quickfix.field.SideQty value)
  {
    setField(value);
  }

  public quickfix.field.SideQty get(quickfix.field.SideQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideQty getSideQty() throws FieldNotFound
  {
    quickfix.field.SideQty value = new quickfix.field.SideQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideQty field)
  {
    return isSetField(field);
  }

  public boolean isSetSideQty()
  {
    return isSetField(1009);
  }
  
  public void set(quickfix.field.SideTradeReportID value)
  {
    setField(value);
  }

  public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound
  {
    quickfix.field.SideTradeReportID value = new quickfix.field.SideTradeReportID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTradeReportID field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTradeReportID()
  {
    return isSetField(1005);
  }
  
  public void set(quickfix.field.SideFillStationCd value)
  {
    setField(value);
  }

  public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound
  {
    quickfix.field.SideFillStationCd value = new quickfix.field.SideFillStationCd();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideFillStationCd field)
  {
    return isSetField(field);
  }

  public boolean isSetSideFillStationCd()
  {
    return isSetField(1006);
  }
  
  public void set(quickfix.field.SideReasonCd value)
  {
    setField(value);
  }

  public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound
  {
    quickfix.field.SideReasonCd value = new quickfix.field.SideReasonCd();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideReasonCd field)
  {
    return isSetField(field);
  }

  public boolean isSetSideReasonCd()
  {
    return isSetField(1007);
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
  
  public void set(quickfix.field.SideTrdSubTyp value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound
  {
    quickfix.field.SideTrdSubTyp value = new quickfix.field.SideTrdSubTyp();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdSubTyp field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdSubTyp()
  {
    return isSetField(1008);
  }
  
  public void set(quickfix.fix50.component.SideTrdRegTS component)
  {
    setComponent(component);
  }

  public quickfix.fix50.component.SideTrdRegTS get(quickfix.fix50.component.SideTrdRegTS  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix50.component.SideTrdRegTS getSideTrdRegTS() throws FieldNotFound
  {
    quickfix.fix50.component.SideTrdRegTS component = new quickfix.fix50.component.SideTrdRegTS();
    getComponent(component);
    return component;
  }

  
  public void set(quickfix.field.NoSideTrdRegTS value)
  {
    setField(value);
  }

  public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound
  {
    quickfix.field.NoSideTrdRegTS value = new quickfix.field.NoSideTrdRegTS();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoSideTrdRegTS field)
  {
    return isSetField(field);
  }

  public boolean isSetNoSideTrdRegTS()
  {
    return isSetField(1016);
  }
  
  public static class NoSideTrdRegTS extends Group {
    static final long serialVersionUID = 20050617;
    public NoSideTrdRegTS() {
        super(1016, 1012,
            new int[] {1012, 1013, 1014,  0 } );
    }
    
  public void set(quickfix.field.SideTrdRegTimestamp value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestamp value = new quickfix.field.SideTrdRegTimestamp();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestamp field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestamp()
  {
    return isSetField(1012);
  }
  
  public void set(quickfix.field.SideTrdRegTimestampType value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestampType value = new quickfix.field.SideTrdRegTimestampType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampType field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampType()
  {
    return isSetField(1013);
  }
  
  public void set(quickfix.field.SideTrdRegTimestampSrc value)
  {
    setField(value);
  }

  public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound
  {
    quickfix.field.SideTrdRegTimestampSrc value = new quickfix.field.SideTrdRegTimestampSrc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field)
  {
    return isSetField(field);
  }

  public boolean isSetSideTrdRegTimestampSrc()
  {
    return isSetField(1014);
  }
  
  }
  
  }
  
}
  