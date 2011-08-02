package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class ContraGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 382, };

    public ContraGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoContraBrokers value) {
        setField(value);
    }

    public quickfix.field.NoContraBrokers get(
        quickfix.field.NoContraBrokers value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoContraBrokers getNoContraBrokers()
        throws FieldNotFound {
        quickfix.field.NoContraBrokers value = new quickfix.field.NoContraBrokers();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoContraBrokers field) {
        return isSetField(field);
    }

    public boolean isSetNoContraBrokers() {
        return isSetField(382);
    }

    public static class NoContraBrokers extends Group {
        static final long serialVersionUID = 20050617;

        public NoContraBrokers() {
            super(382, 375, new int[] { 375, 337, 437, 438, 655, 0 });
        }

        public void set(quickfix.field.ContraBroker value) {
            setField(value);
        }

        public quickfix.field.ContraBroker get(
            quickfix.field.ContraBroker value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContraBroker getContraBroker()
            throws FieldNotFound {
            quickfix.field.ContraBroker value = new quickfix.field.ContraBroker();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContraBroker field) {
            return isSetField(field);
        }

        public boolean isSetContraBroker() {
            return isSetField(375);
        }

        public void set(quickfix.field.ContraTrader value) {
            setField(value);
        }

        public quickfix.field.ContraTrader get(
            quickfix.field.ContraTrader value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContraTrader getContraTrader()
            throws FieldNotFound {
            quickfix.field.ContraTrader value = new quickfix.field.ContraTrader();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContraTrader field) {
            return isSetField(field);
        }

        public boolean isSetContraTrader() {
            return isSetField(337);
        }

        public void set(quickfix.field.ContraTradeQty value) {
            setField(value);
        }

        public quickfix.field.ContraTradeQty get(
            quickfix.field.ContraTradeQty value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContraTradeQty getContraTradeQty()
            throws FieldNotFound {
            quickfix.field.ContraTradeQty value = new quickfix.field.ContraTradeQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContraTradeQty field) {
            return isSetField(field);
        }

        public boolean isSetContraTradeQty() {
            return isSetField(437);
        }

        public void set(quickfix.field.ContraTradeTime value) {
            setField(value);
        }

        public quickfix.field.ContraTradeTime get(
            quickfix.field.ContraTradeTime value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContraTradeTime getContraTradeTime()
            throws FieldNotFound {
            quickfix.field.ContraTradeTime value = new quickfix.field.ContraTradeTime();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContraTradeTime field) {
            return isSetField(field);
        }

        public boolean isSetContraTradeTime() {
            return isSetField(438);
        }

        public void set(quickfix.field.ContraLegRefID value) {
            setField(value);
        }

        public quickfix.field.ContraLegRefID get(
            quickfix.field.ContraLegRefID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContraLegRefID getContraLegRefID()
            throws FieldNotFound {
            quickfix.field.ContraLegRefID value = new quickfix.field.ContraLegRefID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContraLegRefID field) {
            return isSetField(field);
        }

        public boolean isSetContraLegRefID() {
            return isSetField(655);
        }
    }
}
