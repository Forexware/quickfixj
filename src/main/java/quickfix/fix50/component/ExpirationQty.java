package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class ExpirationQty extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 981, };

    public ExpirationQty() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoExpiration value) {
        setField(value);
    }

    public quickfix.field.NoExpiration get(quickfix.field.NoExpiration value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoExpiration getNoExpiration()
        throws FieldNotFound {
        quickfix.field.NoExpiration value = new quickfix.field.NoExpiration();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoExpiration field) {
        return isSetField(field);
    }

    public boolean isSetNoExpiration() {
        return isSetField(981);
    }

    public static class NoExpiration extends Group {
        static final long serialVersionUID = 20050617;

        public NoExpiration() {
            super(981, 982, new int[] { 982, 983, 0 });
        }

        public void set(quickfix.field.ExpType value) {
            setField(value);
        }

        public quickfix.field.ExpType get(quickfix.field.ExpType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ExpType getExpType() throws FieldNotFound {
            quickfix.field.ExpType value = new quickfix.field.ExpType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ExpType field) {
            return isSetField(field);
        }

        public boolean isSetExpType() {
            return isSetField(982);
        }

        public void set(quickfix.field.ExpQty value) {
            setField(value);
        }

        public quickfix.field.ExpQty get(quickfix.field.ExpQty value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ExpQty getExpQty() throws FieldNotFound {
            quickfix.field.ExpQty value = new quickfix.field.ExpQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ExpQty field) {
            return isSetField(field);
        }

        public boolean isSetExpQty() {
            return isSetField(983);
        }
    }
}
