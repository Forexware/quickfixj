package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class PtysSubGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 802, };

    public PtysSubGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoPartySubIDs value) {
        setField(value);
    }

    public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoPartySubIDs getNoPartySubIDs()
        throws FieldNotFound {
        quickfix.field.NoPartySubIDs value = new quickfix.field.NoPartySubIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoPartySubIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoPartySubIDs() {
        return isSetField(802);
    }

    public static class NoPartySubIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoPartySubIDs() {
            super(802, 523, new int[] { 523, 803, 0 });
        }

        public void set(quickfix.field.PartySubID value) {
            setField(value);
        }

        public quickfix.field.PartySubID get(quickfix.field.PartySubID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartySubID getPartySubID()
            throws FieldNotFound {
            quickfix.field.PartySubID value = new quickfix.field.PartySubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartySubID field) {
            return isSetField(field);
        }

        public boolean isSetPartySubID() {
            return isSetField(523);
        }

        public void set(quickfix.field.PartySubIDType value) {
            setField(value);
        }

        public quickfix.field.PartySubIDType get(
            quickfix.field.PartySubIDType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartySubIDType getPartySubIDType()
            throws FieldNotFound {
            quickfix.field.PartySubIDType value = new quickfix.field.PartySubIDType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartySubIDType field) {
            return isSetField(field);
        }

        public boolean isSetPartySubIDType() {
            return isSetField(803);
        }
    }
}
