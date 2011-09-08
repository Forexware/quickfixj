
package quickfix.fix50.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class PreAllocGrp extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 78,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public PreAllocGrp()
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
  
}
  