package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class ContAmtGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 518, };

    public ContAmtGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoContAmts value) {
        setField(value);
    }

    public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
        quickfix.field.NoContAmts value = new quickfix.field.NoContAmts();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoContAmts field) {
        return isSetField(field);
    }

    public boolean isSetNoContAmts() {
        return isSetField(518);
    }

    public static class NoContAmts extends Group {
        static final long serialVersionUID = 20050617;

        public NoContAmts() {
            super(518, 519, new int[] { 519, 520, 521, 0 });
        }

        public void set(quickfix.field.ContAmtType value) {
            setField(value);
        }

        public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContAmtType getContAmtType()
            throws FieldNotFound {
            quickfix.field.ContAmtType value = new quickfix.field.ContAmtType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContAmtType field) {
            return isSetField(field);
        }

        public boolean isSetContAmtType() {
            return isSetField(519);
        }

        public void set(quickfix.field.ContAmtValue value) {
            setField(value);
        }

        public quickfix.field.ContAmtValue get(
            quickfix.field.ContAmtValue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContAmtValue getContAmtValue()
            throws FieldNotFound {
            quickfix.field.ContAmtValue value = new quickfix.field.ContAmtValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContAmtValue field) {
            return isSetField(field);
        }

        public boolean isSetContAmtValue() {
            return isSetField(520);
        }

        public void set(quickfix.field.ContAmtCurr value) {
            setField(value);
        }

        public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContAmtCurr getContAmtCurr()
            throws FieldNotFound {
            quickfix.field.ContAmtCurr value = new quickfix.field.ContAmtCurr();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContAmtCurr field) {
            return isSetField(field);
        }

        public boolean isSetContAmtCurr() {
            return isSetField(521);
        }
    }
}
