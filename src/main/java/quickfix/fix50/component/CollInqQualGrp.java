package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class CollInqQualGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 938, };

    public CollInqQualGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoCollInquiryQualifier value) {
        setField(value);
    }

    public quickfix.field.NoCollInquiryQualifier get(
        quickfix.field.NoCollInquiryQualifier value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoCollInquiryQualifier getNoCollInquiryQualifier()
        throws FieldNotFound {
        quickfix.field.NoCollInquiryQualifier value = new quickfix.field.NoCollInquiryQualifier();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoCollInquiryQualifier field) {
        return isSetField(field);
    }

    public boolean isSetNoCollInquiryQualifier() {
        return isSetField(938);
    }

    public static class NoCollInquiryQualifier extends Group {
        static final long serialVersionUID = 20050617;

        public NoCollInquiryQualifier() {
            super(938, 896, new int[] { 896, 0 });
        }

        public void set(quickfix.field.CollInquiryQualifier value) {
            setField(value);
        }

        public quickfix.field.CollInquiryQualifier get(
            quickfix.field.CollInquiryQualifier value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CollInquiryQualifier getCollInquiryQualifier()
            throws FieldNotFound {
            quickfix.field.CollInquiryQualifier value = new quickfix.field.CollInquiryQualifier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CollInquiryQualifier field) {
            return isSetField(field);
        }

        public boolean isSetCollInquiryQualifier() {
            return isSetField(896);
        }
    }
}
