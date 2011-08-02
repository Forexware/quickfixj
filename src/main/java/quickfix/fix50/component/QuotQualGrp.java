package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class QuotQualGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 735, };

    public QuotQualGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoQuoteQualifiers value) {
        setField(value);
    }

    public quickfix.field.NoQuoteQualifiers get(
        quickfix.field.NoQuoteQualifiers value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoQuoteQualifiers getNoQuoteQualifiers()
        throws FieldNotFound {
        quickfix.field.NoQuoteQualifiers value = new quickfix.field.NoQuoteQualifiers();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoQuoteQualifiers field) {
        return isSetField(field);
    }

    public boolean isSetNoQuoteQualifiers() {
        return isSetField(735);
    }

    public static class NoQuoteQualifiers extends Group {
        static final long serialVersionUID = 20050617;

        public NoQuoteQualifiers() {
            super(735, 695, new int[] { 695, 0 });
        }

        public void set(quickfix.field.QuoteQualifier value) {
            setField(value);
        }

        public quickfix.field.QuoteQualifier get(
            quickfix.field.QuoteQualifier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.QuoteQualifier getQuoteQualifier()
            throws FieldNotFound {
            quickfix.field.QuoteQualifier value = new quickfix.field.QuoteQualifier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.QuoteQualifier field) {
            return isSetField(field);
        }

        public boolean isSetQuoteQualifier() {
            return isSetField(695);
        }
    }
}
