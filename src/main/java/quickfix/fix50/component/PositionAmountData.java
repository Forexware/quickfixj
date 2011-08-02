package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class PositionAmountData extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 753, };

    public PositionAmountData() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoPosAmt value) {
        setField(value);
    }

    public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
        quickfix.field.NoPosAmt value = new quickfix.field.NoPosAmt();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoPosAmt field) {
        return isSetField(field);
    }

    public boolean isSetNoPosAmt() {
        return isSetField(753);
    }

    public static class NoPosAmt extends Group {
        static final long serialVersionUID = 20050617;

        public NoPosAmt() {
            super(753, 707, new int[] { 707, 708, 1055, 0 });
        }

        public void set(quickfix.field.PosAmtType value) {
            setField(value);
        }

        public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PosAmtType getPosAmtType()
            throws FieldNotFound {
            quickfix.field.PosAmtType value = new quickfix.field.PosAmtType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PosAmtType field) {
            return isSetField(field);
        }

        public boolean isSetPosAmtType() {
            return isSetField(707);
        }

        public void set(quickfix.field.PosAmt value) {
            setField(value);
        }

        public quickfix.field.PosAmt get(quickfix.field.PosAmt value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
            quickfix.field.PosAmt value = new quickfix.field.PosAmt();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PosAmt field) {
            return isSetField(field);
        }

        public boolean isSetPosAmt() {
            return isSetField(708);
        }

        public void set(quickfix.field.PositionCurrency value) {
            setField(value);
        }

        public quickfix.field.PositionCurrency get(
            quickfix.field.PositionCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PositionCurrency getPositionCurrency()
            throws FieldNotFound {
            quickfix.field.PositionCurrency value = new quickfix.field.PositionCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PositionCurrency field) {
            return isSetField(field);
        }

        public boolean isSetPositionCurrency() {
            return isSetField(1055);
        }
    }
}
