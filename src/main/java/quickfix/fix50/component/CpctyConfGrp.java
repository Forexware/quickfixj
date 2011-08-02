package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class CpctyConfGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 862, };

    public CpctyConfGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoCapacities value) {
        setField(value);
    }

    public quickfix.field.NoCapacities get(quickfix.field.NoCapacities value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoCapacities getNoCapacities()
        throws FieldNotFound {
        quickfix.field.NoCapacities value = new quickfix.field.NoCapacities();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoCapacities field) {
        return isSetField(field);
    }

    public boolean isSetNoCapacities() {
        return isSetField(862);
    }

    public static class NoCapacities extends Group {
        static final long serialVersionUID = 20050617;

        public NoCapacities() {
            super(862, 528, new int[] { 528, 529, 863, 0 });
        }

        public void set(quickfix.field.OrderCapacity value) {
            setField(value);
        }

        public quickfix.field.OrderCapacity get(
            quickfix.field.OrderCapacity value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OrderCapacity getOrderCapacity()
            throws FieldNotFound {
            quickfix.field.OrderCapacity value = new quickfix.field.OrderCapacity();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OrderCapacity field) {
            return isSetField(field);
        }

        public boolean isSetOrderCapacity() {
            return isSetField(528);
        }

        public void set(quickfix.field.OrderRestrictions value) {
            setField(value);
        }

        public quickfix.field.OrderRestrictions get(
            quickfix.field.OrderRestrictions value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OrderRestrictions getOrderRestrictions()
            throws FieldNotFound {
            quickfix.field.OrderRestrictions value = new quickfix.field.OrderRestrictions();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OrderRestrictions field) {
            return isSetField(field);
        }

        public boolean isSetOrderRestrictions() {
            return isSetField(529);
        }

        public void set(quickfix.field.OrderCapacityQty value) {
            setField(value);
        }

        public quickfix.field.OrderCapacityQty get(
            quickfix.field.OrderCapacityQty value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OrderCapacityQty getOrderCapacityQty()
            throws FieldNotFound {
            quickfix.field.OrderCapacityQty value = new quickfix.field.OrderCapacityQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OrderCapacityQty field) {
            return isSetField(field);
        }

        public boolean isSetOrderCapacityQty() {
            return isSetField(863);
        }
    }
}
