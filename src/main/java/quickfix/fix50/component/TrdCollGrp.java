package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class TrdCollGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 897, };

    public TrdCollGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoTrades value) {
        setField(value);
    }

    public quickfix.field.NoTrades get(quickfix.field.NoTrades value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoTrades getNoTrades() throws FieldNotFound {
        quickfix.field.NoTrades value = new quickfix.field.NoTrades();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoTrades field) {
        return isSetField(field);
    }

    public boolean isSetNoTrades() {
        return isSetField(897);
    }

    public static class NoTrades extends Group {
        static final long serialVersionUID = 20050617;

        public NoTrades() {
            super(897, 571, new int[] { 571, 818, 0 });
        }

        public void set(quickfix.field.TradeReportID value) {
            setField(value);
        }

        public quickfix.field.TradeReportID get(
            quickfix.field.TradeReportID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.TradeReportID getTradeReportID()
            throws FieldNotFound {
            quickfix.field.TradeReportID value = new quickfix.field.TradeReportID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.TradeReportID field) {
            return isSetField(field);
        }

        public boolean isSetTradeReportID() {
            return isSetField(571);
        }

        public void set(quickfix.field.SecondaryTradeReportID value) {
            setField(value);
        }

        public quickfix.field.SecondaryTradeReportID get(
            quickfix.field.SecondaryTradeReportID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecondaryTradeReportID getSecondaryTradeReportID()
            throws FieldNotFound {
            quickfix.field.SecondaryTradeReportID value = new quickfix.field.SecondaryTradeReportID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecondaryTradeReportID field) {
            return isSetField(field);
        }

        public boolean isSetSecondaryTradeReportID() {
            return isSetField(818);
        }
    }
}
