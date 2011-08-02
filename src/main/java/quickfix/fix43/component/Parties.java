package quickfix.fix43.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class Parties extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 453, };

    public Parties() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoPartyIDs value) {
        setField(value);
    }

    public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
        quickfix.field.NoPartyIDs value = new quickfix.field.NoPartyIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoPartyIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoPartyIDs() {
        return isSetField(453);
    }

    public static class NoPartyIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoPartyIDs() {
            super(453, 448, new int[] { 448, 447, 452, 523, 0 });
        }

        public void set(quickfix.field.PartyID value) {
            setField(value);
        }

        public quickfix.field.PartyID get(quickfix.field.PartyID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyID getPartyID() throws FieldNotFound {
            quickfix.field.PartyID value = new quickfix.field.PartyID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyID field) {
            return isSetField(field);
        }

        public boolean isSetPartyID() {
            return isSetField(448);
        }

        public void set(quickfix.field.PartyIDSource value) {
            setField(value);
        }

        public quickfix.field.PartyIDSource get(
            quickfix.field.PartyIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyIDSource getPartyIDSource()
            throws FieldNotFound {
            quickfix.field.PartyIDSource value = new quickfix.field.PartyIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyIDSource field) {
            return isSetField(field);
        }

        public boolean isSetPartyIDSource() {
            return isSetField(447);
        }

        public void set(quickfix.field.PartyRole value) {
            setField(value);
        }

        public quickfix.field.PartyRole get(quickfix.field.PartyRole value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyRole getPartyRole()
            throws FieldNotFound {
            quickfix.field.PartyRole value = new quickfix.field.PartyRole();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyRole field) {
            return isSetField(field);
        }

        public boolean isSetPartyRole() {
            return isSetField(452);
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
    }
}
