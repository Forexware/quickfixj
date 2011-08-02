package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class NstdPtys2SubGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 806, };

    public NstdPtys2SubGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoNested2PartySubIDs value) {
        setField(value);
    }

    public quickfix.field.NoNested2PartySubIDs get(
        quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs()
        throws FieldNotFound {
        quickfix.field.NoNested2PartySubIDs value = new quickfix.field.NoNested2PartySubIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoNested2PartySubIDs() {
        return isSetField(806);
    }

    public static class NoNested2PartySubIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoNested2PartySubIDs() {
            super(806, 760, new int[] { 760, 807, 0 });
        }

        public void set(quickfix.field.Nested2PartySubID value) {
            setField(value);
        }

        public quickfix.field.Nested2PartySubID get(
            quickfix.field.Nested2PartySubID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Nested2PartySubID getNested2PartySubID()
            throws FieldNotFound {
            quickfix.field.Nested2PartySubID value = new quickfix.field.Nested2PartySubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Nested2PartySubID field) {
            return isSetField(field);
        }

        public boolean isSetNested2PartySubID() {
            return isSetField(760);
        }

        public void set(quickfix.field.Nested2PartySubIDType value) {
            setField(value);
        }

        public quickfix.field.Nested2PartySubIDType get(
            quickfix.field.Nested2PartySubIDType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType()
            throws FieldNotFound {
            quickfix.field.Nested2PartySubIDType value = new quickfix.field.Nested2PartySubIDType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
            return isSetField(field);
        }

        public boolean isSetNested2PartySubIDType() {
            return isSetField(807);
        }
    }
}
