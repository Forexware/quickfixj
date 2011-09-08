
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdAllocGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 78,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public TrdAllocGrp()
  {
    super();
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
  
}
  