package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RootSubParties extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 1120, };

    public RootSubParties() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
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
            quickfix.field.RootPartySubIDType value) throws FieldNotFound {
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
