package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class UndSecAltIDGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 457, };

    public UndSecAltIDGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
        setField(value);
    }

    public quickfix.field.NoUnderlyingSecurityAltID get(
        quickfix.field.NoUnderlyingSecurityAltID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID()
        throws FieldNotFound {
        quickfix.field.NoUnderlyingSecurityAltID value = new quickfix.field.NoUnderlyingSecurityAltID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
        return isSetField(field);
    }

    public boolean isSetNoUnderlyingSecurityAltID() {
        return isSetField(457);
    }

    public static class NoUnderlyingSecurityAltID extends Group {
        static final long serialVersionUID = 20050617;

        public NoUnderlyingSecurityAltID() {
            super(457, 458, new int[] { 458, 459, 0 });
        }

        public void set(quickfix.field.UnderlyingSecurityAltID value) {
            setField(value);
        }

        public quickfix.field.UnderlyingSecurityAltID get(
            quickfix.field.UnderlyingSecurityAltID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID()
            throws FieldNotFound {
            quickfix.field.UnderlyingSecurityAltID value = new quickfix.field.UnderlyingSecurityAltID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
            return isSetField(field);
        }

        public boolean isSetUnderlyingSecurityAltID() {
            return isSetField(458);
        }

        public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
            setField(value);
        }

        public quickfix.field.UnderlyingSecurityAltIDSource get(
            quickfix.field.UnderlyingSecurityAltIDSource value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource()
            throws FieldNotFound {
            quickfix.field.UnderlyingSecurityAltIDSource value = new quickfix.field.UnderlyingSecurityAltIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
            return isSetField(field);
        }

        public boolean isSetUnderlyingSecurityAltIDSource() {
            return isSetField(459);
        }
    }
}
