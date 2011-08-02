package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class MiscFeesGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 136, };

    public MiscFeesGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoMiscFees value) {
        setField(value);
    }

    public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
        quickfix.field.NoMiscFees value = new quickfix.field.NoMiscFees();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoMiscFees field) {
        return isSetField(field);
    }

    public boolean isSetNoMiscFees() {
        return isSetField(136);
    }

    public static class NoMiscFees extends Group {
        static final long serialVersionUID = 20050617;

        public NoMiscFees() {
            super(136, 137, new int[] { 137, 138, 139, 891, 0 });
        }

        public void set(quickfix.field.MiscFeeAmt value) {
            setField(value);
        }

        public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MiscFeeAmt getMiscFeeAmt()
            throws FieldNotFound {
            quickfix.field.MiscFeeAmt value = new quickfix.field.MiscFeeAmt();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MiscFeeAmt field) {
            return isSetField(field);
        }

        public boolean isSetMiscFeeAmt() {
            return isSetField(137);
        }

        public void set(quickfix.field.MiscFeeCurr value) {
            setField(value);
        }

        public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MiscFeeCurr getMiscFeeCurr()
            throws FieldNotFound {
            quickfix.field.MiscFeeCurr value = new quickfix.field.MiscFeeCurr();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MiscFeeCurr field) {
            return isSetField(field);
        }

        public boolean isSetMiscFeeCurr() {
            return isSetField(138);
        }

        public void set(quickfix.field.MiscFeeType value) {
            setField(value);
        }

        public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MiscFeeType getMiscFeeType()
            throws FieldNotFound {
            quickfix.field.MiscFeeType value = new quickfix.field.MiscFeeType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MiscFeeType field) {
            return isSetField(field);
        }

        public boolean isSetMiscFeeType() {
            return isSetField(139);
        }

        public void set(quickfix.field.MiscFeeBasis value) {
            setField(value);
        }

        public quickfix.field.MiscFeeBasis get(
            quickfix.field.MiscFeeBasis value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MiscFeeBasis getMiscFeeBasis()
            throws FieldNotFound {
            quickfix.field.MiscFeeBasis value = new quickfix.field.MiscFeeBasis();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MiscFeeBasis field) {
            return isSetField(field);
        }

        public boolean isSetMiscFeeBasis() {
            return isSetField(891);
        }
    }
}
