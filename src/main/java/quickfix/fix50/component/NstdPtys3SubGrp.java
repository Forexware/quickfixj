package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class NstdPtys3SubGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 952, };

    public NstdPtys3SubGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoNested3PartySubIDs value) {
        setField(value);
    }

    public quickfix.field.NoNested3PartySubIDs get(
        quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs()
        throws FieldNotFound {
        quickfix.field.NoNested3PartySubIDs value = new quickfix.field.NoNested3PartySubIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoNested3PartySubIDs() {
        return isSetField(952);
    }

    public static class NoNested3PartySubIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoNested3PartySubIDs() {
            super(952, 953, new int[] { 953, 954, 0 });
        }

        public void set(quickfix.field.Nested3PartySubID value) {
            setField(value);
        }

        public quickfix.field.Nested3PartySubID get(
            quickfix.field.Nested3PartySubID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Nested3PartySubID getNested3PartySubID()
            throws FieldNotFound {
            quickfix.field.Nested3PartySubID value = new quickfix.field.Nested3PartySubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Nested3PartySubID field) {
            return isSetField(field);
        }

        public boolean isSetNested3PartySubID() {
            return isSetField(953);
        }

        public void set(quickfix.field.Nested3PartySubIDType value) {
            setField(value);
        }

        public quickfix.field.Nested3PartySubIDType get(
            quickfix.field.Nested3PartySubIDType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType()
            throws FieldNotFound {
            quickfix.field.Nested3PartySubIDType value = new quickfix.field.Nested3PartySubIDType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
            return isSetField(field);
        }

        public boolean isSetNested3PartySubIDType() {
            return isSetField(954);
        }
    }
}
