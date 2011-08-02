package quickfix.fix44.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class NestedParties extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 539, };

    public NestedParties() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoNestedPartyIDs value) {
        setField(value);
    }

    public quickfix.field.NoNestedPartyIDs get(
        quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs()
        throws FieldNotFound {
        quickfix.field.NoNestedPartyIDs value = new quickfix.field.NoNestedPartyIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoNestedPartyIDs() {
        return isSetField(539);
    }

    public static class NoNestedPartyIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoNestedPartyIDs() {
            super(539, 524, new int[] { 524, 525, 538, 804, 0 });
        }

        public void set(quickfix.field.NestedPartyID value) {
            setField(value);
        }

        public quickfix.field.NestedPartyID get(
            quickfix.field.NestedPartyID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NestedPartyID getNestedPartyID()
            throws FieldNotFound {
            quickfix.field.NestedPartyID value = new quickfix.field.NestedPartyID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NestedPartyID field) {
            return isSetField(field);
        }

        public boolean isSetNestedPartyID() {
            return isSetField(524);
        }

        public void set(quickfix.field.NestedPartyIDSource value) {
            setField(value);
        }

        public quickfix.field.NestedPartyIDSource get(
            quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NestedPartyIDSource getNestedPartyIDSource()
            throws FieldNotFound {
            quickfix.field.NestedPartyIDSource value = new quickfix.field.NestedPartyIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NestedPartyIDSource field) {
            return isSetField(field);
        }

        public boolean isSetNestedPartyIDSource() {
            return isSetField(525);
        }

        public void set(quickfix.field.NestedPartyRole value) {
            setField(value);
        }

        public quickfix.field.NestedPartyRole get(
            quickfix.field.NestedPartyRole value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NestedPartyRole getNestedPartyRole()
            throws FieldNotFound {
            quickfix.field.NestedPartyRole value = new quickfix.field.NestedPartyRole();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NestedPartyRole field) {
            return isSetField(field);
        }

        public boolean isSetNestedPartyRole() {
            return isSetField(538);
        }

        public void set(quickfix.field.NoNestedPartySubIDs value) {
            setField(value);
        }

        public quickfix.field.NoNestedPartySubIDs get(
            quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs()
            throws FieldNotFound {
            quickfix.field.NoNestedPartySubIDs value = new quickfix.field.NoNestedPartySubIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoNestedPartySubIDs() {
            return isSetField(804);
        }

        public static class NoNestedPartySubIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoNestedPartySubIDs() {
                super(804, 545, new int[] { 545, 805, 0 });
            }

            public void set(quickfix.field.NestedPartySubID value) {
                setField(value);
            }

            public quickfix.field.NestedPartySubID get(
                quickfix.field.NestedPartySubID value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NestedPartySubID getNestedPartySubID()
                throws FieldNotFound {
                quickfix.field.NestedPartySubID value = new quickfix.field.NestedPartySubID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NestedPartySubID field) {
                return isSetField(field);
            }

            public boolean isSetNestedPartySubID() {
                return isSetField(545);
            }

            public void set(quickfix.field.NestedPartySubIDType value) {
                setField(value);
            }

            public quickfix.field.NestedPartySubIDType get(
                quickfix.field.NestedPartySubIDType value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NestedPartySubIDType getNestedPartySubIDType()
                throws FieldNotFound {
                quickfix.field.NestedPartySubIDType value = new quickfix.field.NestedPartySubIDType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NestedPartySubIDType field) {
                return isSetField(field);
            }

            public boolean isSetNestedPartySubIDType() {
                return isSetField(805);
            }
        }
    }
}
