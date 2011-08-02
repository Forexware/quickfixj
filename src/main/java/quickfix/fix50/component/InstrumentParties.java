package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class InstrumentParties extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 1018, };

    public InstrumentParties() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoInstrumentParties value) {
        setField(value);
    }

    public quickfix.field.NoInstrumentParties get(
        quickfix.field.NoInstrumentParties value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoInstrumentParties getNoInstrumentParties()
        throws FieldNotFound {
        quickfix.field.NoInstrumentParties value = new quickfix.field.NoInstrumentParties();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoInstrumentParties field) {
        return isSetField(field);
    }

    public boolean isSetNoInstrumentParties() {
        return isSetField(1018);
    }

    public static class NoInstrumentParties extends Group {
        static final long serialVersionUID = 20050617;

        public NoInstrumentParties() {
            super(1018, 1019, new int[] { 1019, 1050, 1051, 1052, 0 });
        }

        public void set(quickfix.field.InstrumentPartyID value) {
            setField(value);
        }

        public quickfix.field.InstrumentPartyID get(
            quickfix.field.InstrumentPartyID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrumentPartyID getInstrumentPartyID()
            throws FieldNotFound {
            quickfix.field.InstrumentPartyID value = new quickfix.field.InstrumentPartyID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrumentPartyID field) {
            return isSetField(field);
        }

        public boolean isSetInstrumentPartyID() {
            return isSetField(1019);
        }

        public void set(quickfix.field.InstrumentPartyIDSource value) {
            setField(value);
        }

        public quickfix.field.InstrumentPartyIDSource get(
            quickfix.field.InstrumentPartyIDSource value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource()
            throws FieldNotFound {
            quickfix.field.InstrumentPartyIDSource value = new quickfix.field.InstrumentPartyIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
            return isSetField(field);
        }

        public boolean isSetInstrumentPartyIDSource() {
            return isSetField(1050);
        }

        public void set(quickfix.field.InstrumentPartyRole value) {
            setField(value);
        }

        public quickfix.field.InstrumentPartyRole get(
            quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrumentPartyRole getInstrumentPartyRole()
            throws FieldNotFound {
            quickfix.field.InstrumentPartyRole value = new quickfix.field.InstrumentPartyRole();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrumentPartyRole field) {
            return isSetField(field);
        }

        public boolean isSetInstrumentPartyRole() {
            return isSetField(1051);
        }

        public void set(quickfix.fix50.component.InstrumentPtysSubGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.InstrumentPtysSubGrp get(
            quickfix.fix50.component.InstrumentPtysSubGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.InstrumentPtysSubGrp getInstrumentPtysSubGrp()
            throws FieldNotFound {
            quickfix.fix50.component.InstrumentPtysSubGrp component = new quickfix.fix50.component.InstrumentPtysSubGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoInstrumentPartySubIDs value) {
            setField(value);
        }

        public quickfix.field.NoInstrumentPartySubIDs get(
            quickfix.field.NoInstrumentPartySubIDs value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs()
            throws FieldNotFound {
            quickfix.field.NoInstrumentPartySubIDs value = new quickfix.field.NoInstrumentPartySubIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoInstrumentPartySubIDs() {
            return isSetField(1052);
        }

        public static class NoInstrumentPartySubIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoInstrumentPartySubIDs() {
                super(1052, 1053, new int[] { 1053, 1054, 0 });
            }

            public void set(quickfix.field.InstrumentPartySubID value) {
                setField(value);
            }

            public quickfix.field.InstrumentPartySubID get(
                quickfix.field.InstrumentPartySubID value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrumentPartySubID getInstrumentPartySubID()
                throws FieldNotFound {
                quickfix.field.InstrumentPartySubID value = new quickfix.field.InstrumentPartySubID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrumentPartySubID field) {
                return isSetField(field);
            }

            public boolean isSetInstrumentPartySubID() {
                return isSetField(1053);
            }

            public void set(quickfix.field.InstrumentPartySubIDType value) {
                setField(value);
            }

            public quickfix.field.InstrumentPartySubIDType get(
                quickfix.field.InstrumentPartySubIDType value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType()
                throws FieldNotFound {
                quickfix.field.InstrumentPartySubIDType value = new quickfix.field.InstrumentPartySubIDType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
                return isSetField(field);
            }

            public boolean isSetInstrumentPartySubIDType() {
                return isSetField(1054);
            }
        }
    }
}
