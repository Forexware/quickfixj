package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RootParties extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 1116, };

    public RootParties() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoRootPartyIDs value) {
        setField(value);
    }

    public quickfix.field.NoRootPartyIDs get(
        quickfix.field.NoRootPartyIDs value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoRootPartyIDs getNoRootPartyIDs()
        throws FieldNotFound {
        quickfix.field.NoRootPartyIDs value = new quickfix.field.NoRootPartyIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoRootPartyIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoRootPartyIDs() {
        return isSetField(1116);
    }

    public static class NoRootPartyIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoRootPartyIDs() {
            super(1116, 1117, new int[] { 1117, 1118, 1119, 1120, 0 });
        }

        public void set(quickfix.field.RootPartyID value) {
            setField(value);
        }

        public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RootPartyID getRootPartyID()
            throws FieldNotFound {
            quickfix.field.RootPartyID value = new quickfix.field.RootPartyID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RootPartyID field) {
            return isSetField(field);
        }

        public boolean isSetRootPartyID() {
            return isSetField(1117);
        }

        public void set(quickfix.field.RootPartyIDSource value) {
            setField(value);
        }

        public quickfix.field.RootPartyIDSource get(
            quickfix.field.RootPartyIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RootPartyIDSource getRootPartyIDSource()
            throws FieldNotFound {
            quickfix.field.RootPartyIDSource value = new quickfix.field.RootPartyIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RootPartyIDSource field) {
            return isSetField(field);
        }

        public boolean isSetRootPartyIDSource() {
            return isSetField(1118);
        }

        public void set(quickfix.field.RootPartyRole value) {
            setField(value);
        }

        public quickfix.field.RootPartyRole get(
            quickfix.field.RootPartyRole value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RootPartyRole getRootPartyRole()
            throws FieldNotFound {
            quickfix.field.RootPartyRole value = new quickfix.field.RootPartyRole();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RootPartyRole field) {
            return isSetField(field);
        }

        public boolean isSetRootPartyRole() {
            return isSetField(1119);
        }

        public void set(quickfix.fix50.component.RootSubParties component) {
            setComponent(component);
        }

        public quickfix.fix50.component.RootSubParties get(
            quickfix.fix50.component.RootSubParties component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.RootSubParties getRootSubParties()
            throws FieldNotFound {
            quickfix.fix50.component.RootSubParties component = new quickfix.fix50.component.RootSubParties();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoRootPartySubIDs value) {
            setField(value);
        }

        public quickfix.field.NoRootPartySubIDs get(
            quickfix.field.NoRootPartySubIDs value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoRootPartySubIDs getNoRootPartySubIDs()
            throws FieldNotFound {
            quickfix.field.NoRootPartySubIDs value = new quickfix.field.NoRootPartySubIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoRootPartySubIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoRootPartySubIDs() {
            return isSetField(1120);
        }

        public static class NoRootPartySubIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoRootPartySubIDs() {
                super(1120, 1121, new int[] { 1121, 1122, 0 });
            }

            public void set(quickfix.field.RootPartySubID value) {
                setField(value);
            }

            public quickfix.field.RootPartySubID get(
                quickfix.field.RootPartySubID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.RootPartySubID getRootPartySubID()
                throws FieldNotFound {
                quickfix.field.RootPartySubID value = new quickfix.field.RootPartySubID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.RootPartySubID field) {
                return isSetField(field);
            }

            public boolean isSetRootPartySubID() {
                return isSetField(1121);
            }

            public void set(quickfix.field.RootPartySubIDType value) {
                setField(value);
            }

            public quickfix.field.RootPartySubIDType get(
                quickfix.field.RootPartySubIDType value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.RootPartySubIDType getRootPartySubIDType()
                throws FieldNotFound {
                quickfix.field.RootPartySubIDType value = new quickfix.field.RootPartySubIDType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.RootPartySubIDType field) {
                return isSetField(field);
            }

            public boolean isSetRootPartySubIDType() {
                return isSetField(1122);
            }
        }
    }
}
