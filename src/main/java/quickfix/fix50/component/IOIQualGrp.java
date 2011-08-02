package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class IOIQualGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 199, };

    public IOIQualGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoIOIQualifiers value) {
        setField(value);
    }

    public quickfix.field.NoIOIQualifiers get(
        quickfix.field.NoIOIQualifiers value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoIOIQualifiers getNoIOIQualifiers()
        throws FieldNotFound {
        quickfix.field.NoIOIQualifiers value = new quickfix.field.NoIOIQualifiers();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoIOIQualifiers field) {
        return isSetField(field);
    }

    public boolean isSetNoIOIQualifiers() {
        return isSetField(199);
    }

    public static class NoIOIQualifiers extends Group {
        static final long serialVersionUID = 20050617;

        public NoIOIQualifiers() {
            super(199, 104, new int[] { 104, 0 });
        }

        public void set(quickfix.field.IOIQualifier value) {
            setField(value);
        }

        public quickfix.field.IOIQualifier get(
            quickfix.field.IOIQualifier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IOIQualifier getIOIQualifier()
            throws FieldNotFound {
            quickfix.field.IOIQualifier value = new quickfix.field.IOIQualifier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IOIQualifier field) {
            return isSetField(field);
        }

        public boolean isSetIOIQualifier() {
            return isSetField(104);
        }
    }
}
