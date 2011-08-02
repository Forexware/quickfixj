package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RoutingGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 215, };

    public RoutingGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoRoutingIDs value) {
        setField(value);
    }

    public quickfix.field.NoRoutingIDs get(quickfix.field.NoRoutingIDs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoRoutingIDs getNoRoutingIDs()
        throws FieldNotFound {
        quickfix.field.NoRoutingIDs value = new quickfix.field.NoRoutingIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoRoutingIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoRoutingIDs() {
        return isSetField(215);
    }

    public static class NoRoutingIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoRoutingIDs() {
            super(215, 216, new int[] { 216, 217, 0 });
        }

        public void set(quickfix.field.RoutingType value) {
            setField(value);
        }

        public quickfix.field.RoutingType get(quickfix.field.RoutingType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RoutingType getRoutingType()
            throws FieldNotFound {
            quickfix.field.RoutingType value = new quickfix.field.RoutingType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RoutingType field) {
            return isSetField(field);
        }

        public boolean isSetRoutingType() {
            return isSetField(216);
        }

        public void set(quickfix.field.RoutingID value) {
            setField(value);
        }

        public quickfix.field.RoutingID get(quickfix.field.RoutingID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RoutingID getRoutingID()
            throws FieldNotFound {
            quickfix.field.RoutingID value = new quickfix.field.RoutingID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RoutingID field) {
            return isSetField(field);
        }

        public boolean isSetRoutingID() {
            return isSetField(217);
        }
    }
}
