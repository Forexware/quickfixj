package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RgstDistInstGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 510, };

    public RgstDistInstGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoDistribInsts value) {
        setField(value);
    }

    public quickfix.field.NoDistribInsts get(
        quickfix.field.NoDistribInsts value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoDistribInsts getNoDistribInsts()
        throws FieldNotFound {
        quickfix.field.NoDistribInsts value = new quickfix.field.NoDistribInsts();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoDistribInsts field) {
        return isSetField(field);
    }

    public boolean isSetNoDistribInsts() {
        return isSetField(510);
    }

    public static class NoDistribInsts extends Group {
        static final long serialVersionUID = 20050617;

        public NoDistribInsts() {
            super(510, 477,
                new int[] { 477, 512, 478, 498, 499, 500, 501, 502, 0 });
        }

        public void set(quickfix.field.DistribPaymentMethod value) {
            setField(value);
        }

        public quickfix.field.DistribPaymentMethod get(
            quickfix.field.DistribPaymentMethod value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DistribPaymentMethod getDistribPaymentMethod()
            throws FieldNotFound {
            quickfix.field.DistribPaymentMethod value = new quickfix.field.DistribPaymentMethod();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DistribPaymentMethod field) {
            return isSetField(field);
        }

        public boolean isSetDistribPaymentMethod() {
            return isSetField(477);
        }

        public void set(quickfix.field.DistribPercentage value) {
            setField(value);
        }

        public quickfix.field.DistribPercentage get(
            quickfix.field.DistribPercentage value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DistribPercentage getDistribPercentage()
            throws FieldNotFound {
            quickfix.field.DistribPercentage value = new quickfix.field.DistribPercentage();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DistribPercentage field) {
            return isSetField(field);
        }

        public boolean isSetDistribPercentage() {
            return isSetField(512);
        }

        public void set(quickfix.field.CashDistribCurr value) {
            setField(value);
        }

        public quickfix.field.CashDistribCurr get(
            quickfix.field.CashDistribCurr value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribCurr getCashDistribCurr()
            throws FieldNotFound {
            quickfix.field.CashDistribCurr value = new quickfix.field.CashDistribCurr();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribCurr field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribCurr() {
            return isSetField(478);
        }

        public void set(quickfix.field.CashDistribAgentName value) {
            setField(value);
        }

        public quickfix.field.CashDistribAgentName get(
            quickfix.field.CashDistribAgentName value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribAgentName getCashDistribAgentName()
            throws FieldNotFound {
            quickfix.field.CashDistribAgentName value = new quickfix.field.CashDistribAgentName();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribAgentName field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribAgentName() {
            return isSetField(498);
        }

        public void set(quickfix.field.CashDistribAgentCode value) {
            setField(value);
        }

        public quickfix.field.CashDistribAgentCode get(
            quickfix.field.CashDistribAgentCode value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribAgentCode getCashDistribAgentCode()
            throws FieldNotFound {
            quickfix.field.CashDistribAgentCode value = new quickfix.field.CashDistribAgentCode();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribAgentCode field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribAgentCode() {
            return isSetField(499);
        }

        public void set(quickfix.field.CashDistribAgentAcctNumber value) {
            setField(value);
        }

        public quickfix.field.CashDistribAgentAcctNumber get(
            quickfix.field.CashDistribAgentAcctNumber value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber()
            throws FieldNotFound {
            quickfix.field.CashDistribAgentAcctNumber value = new quickfix.field.CashDistribAgentAcctNumber();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribAgentAcctNumber field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribAgentAcctNumber() {
            return isSetField(500);
        }

        public void set(quickfix.field.CashDistribPayRef value) {
            setField(value);
        }

        public quickfix.field.CashDistribPayRef get(
            quickfix.field.CashDistribPayRef value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribPayRef getCashDistribPayRef()
            throws FieldNotFound {
            quickfix.field.CashDistribPayRef value = new quickfix.field.CashDistribPayRef();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribPayRef field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribPayRef() {
            return isSetField(501);
        }

        public void set(quickfix.field.CashDistribAgentAcctName value) {
            setField(value);
        }

        public quickfix.field.CashDistribAgentAcctName get(
            quickfix.field.CashDistribAgentAcctName value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CashDistribAgentAcctName getCashDistribAgentAcctName()
            throws FieldNotFound {
            quickfix.field.CashDistribAgentAcctName value = new quickfix.field.CashDistribAgentAcctName();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CashDistribAgentAcctName field) {
            return isSetField(field);
        }

        public boolean isSetCashDistribAgentAcctName() {
            return isSetField(502);
        }
    }
}
