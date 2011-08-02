package quickfix.fix43.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class Stipulations extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 232, };

    public Stipulations() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoStipulations value) {
        setField(value);
    }

    public quickfix.field.NoStipulations get(
        quickfix.field.NoStipulations value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoStipulations getNoStipulations()
        throws FieldNotFound {
        quickfix.field.NoStipulations value = new quickfix.field.NoStipulations();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoStipulations field) {
        return isSetField(field);
    }

    public boolean isSetNoStipulations() {
        return isSetField(232);
    }

    public static class NoStipulations extends Group {
        static final long serialVersionUID = 20050617;

        public NoStipulations() {
            super(232, 233, new int[] { 233, 234, 0 });
        }

        public void set(quickfix.field.StipulationType value) {
            setField(value);
        }

        public quickfix.field.StipulationType get(
            quickfix.field.StipulationType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StipulationType getStipulationType()
            throws FieldNotFound {
            quickfix.field.StipulationType value = new quickfix.field.StipulationType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StipulationType field) {
            return isSetField(field);
        }

        public boolean isSetStipulationType() {
            return isSetField(233);
        }

        public void set(quickfix.field.StipulationValue value) {
            setField(value);
        }

        public quickfix.field.StipulationValue get(
            quickfix.field.StipulationValue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StipulationValue getStipulationValue()
            throws FieldNotFound {
            quickfix.field.StipulationValue value = new quickfix.field.StipulationValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StipulationValue field) {
            return isSetField(field);
        }

        public boolean isSetStipulationValue() {
            return isSetField(234);
        }
    }
}
