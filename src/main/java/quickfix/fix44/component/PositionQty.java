
package quickfix.fix44.component;
import quickfix.FieldNotFound;

import quickfix.Group;

public class PositionQty extends quickfix.MessageComponent
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "";
  
  private int[] componentFields = {  };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = { 702,  };
  protected int[] getGroupFields() { return componentGroups; }
  

  public PositionQty()
  {
    super();
  }
  
  public void set(quickfix.field.NoPositions value)
  {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound
  {
    quickfix.field.NoPositions value = new quickfix.field.NoPositions();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.NoPositions field)
  {
    return isSetField(field);
  }

  public boolean isSetNoPositions()
  {
    return isSetField(702);
  }
  
  public static class NoPositions extends Group {
    static final long serialVersionUID = 20050617;
    public NoPositions() {
        super(702, 703,
            new int[] {703, 704, 705, 706, 539,  0 } );
    }
    
  public void set(quickfix.field.PosType value)
  {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound
  {
    quickfix.field.PosType value = new quickfix.field.PosType();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PosType field)
  {
    return isSetField(field);
  }

  public boolean isSetPosType()
  {
    return isSetField(703);
  }
  
  public void set(quickfix.field.LongQty value)
  {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound
  {
    quickfix.field.LongQty value = new quickfix.field.LongQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.LongQty field)
  {
    return isSetField(field);
  }

  public boolean isSetLongQty()
  {
    return isSetField(704);
  }
  
  public void set(quickfix.field.ShortQty value)
  {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound
  {
    quickfix.field.ShortQty value = new quickfix.field.ShortQty();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ShortQty field)
  {
    return isSetField(field);
  }

  public boolean isSetShortQty()
  {
    return isSetField(705);
  }
  
  public void set(quickfix.field.PosQtyStatus value)
  {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound
  {
    quickfix.field.PosQtyStatus value = new quickfix.field.PosQtyStatus();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.PosQtyStatus field)
  {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus()
  {
    return isSetField(706);
  }
  
  public void set(quickfix.fix44.component.NestedParties component)
  {
    setComponent(component);
  }

  public quickfix.fix44.component.NestedParties get(quickfix.fix44.component.NestedParties  component) throws FieldNotFound
  {
    getComponent(component);
    return component;
  }

  public quickfix.fix44.component.NestedParties getNestedParties() throws FieldNotFound
  {
    quickfix.fix44.component.NestedParties component = new quickfix.fix44.component.NestedParties();
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
  
  }
  
}
  