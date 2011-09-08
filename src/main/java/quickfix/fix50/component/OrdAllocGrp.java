
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class OrdAllocGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 73,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public OrdAllocGrp()
  {
    super();
  }
  
  public void set(quickfix.field.NoOrders value)
  {
    setField(value);
  }

  public quickfix.field.NoOrders get(quickfix.field.NoOrders  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrders getNoOrders() throws FieldNotFound
  {
    quickfix.field.NoOrders value = new quickfix.field.NoOrders();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoOrders field)
  {
    return isSetField(field);
  }

  public boolean isSetNoOrders()
  {
    return isSetField(73);
  }
  
  public static class NoOrders extends Group {
    static final long serialVersionUID = 20050617;
    public NoOrders() {
        super(73, 11,
            new int[] {11, 37, 198, 526, 66, 756, 38, 799, 800,  0 } );
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
  
  public void set(quickfix.field.OrderAvgPx value)
  {
    setField(value);
  }

  public quickfix.field.OrderAvgPx get(quickfix.field.OrderAvgPx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAvgPx getOrderAvgPx() throws FieldNotFound
  {
    quickfix.field.OrderAvgPx value = new quickfix.field.OrderAvgPx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderAvgPx field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderAvgPx()
  {
    return isSetField(799);
  }
  
  public void set(quickfix.field.OrderBookingQty value)
  {
    setField(value);
  }

  public quickfix.field.OrderBookingQty get(quickfix.field.OrderBookingQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderBookingQty getOrderBookingQty() throws FieldNotFound
  {
    quickfix.field.OrderBookingQty value = new quickfix.field.OrderBookingQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderBookingQty field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderBookingQty()
  {
    return isSetField(800);
  }
  
  }
  
}
  