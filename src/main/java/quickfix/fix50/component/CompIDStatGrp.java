package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class CompIDStatGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 936, };

    public CompIDStatGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoCompIDs value) {
        setField(value);
    }

    public quickfix.field.NoCompIDs get(quickfix.field.NoCompIDs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoCompIDs getNoCompIDs() throws FieldNotFound {
        quickfix.field.NoCompIDs value = new quickfix.field.NoCompIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoCompIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoCompIDs() {
        return isSetField(936);
    }

    public static class NoCompIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoCompIDs() {
            super(936, 930, new int[] { 930, 931, 283, 284, 928, 929, 0 });
        }

        public void set(quickfix.field.RefCompID value) {
            setField(value);
        }

        public quickfix.field.RefCompID get(quickfix.field.RefCompID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefCompID getRefCompID()
            throws FieldNotFound {
            quickfix.field.RefCompID value = new quickfix.field.RefCompID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefCompID field) {
            return isSetField(field);
        }

        public boolean isSetRefCompID() {
            return isSetField(930);
        }

        public void set(quickfix.field.RefSubID value) {
            setField(value);
        }

        public quickfix.field.RefSubID get(quickfix.field.RefSubID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefSubID getRefSubID() throws FieldNotFound {
            quickfix.field.RefSubID value = new quickfix.field.RefSubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefSubID field) {
            return isSetField(field);
        }

        public boolean isSetRefSubID() {
            return isSetField(931);
        }

        public void set(quickfix.field.LocationID value) {
            setField(value);
        }

        public quickfix.field.LocationID get(quickfix.field.LocationID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LocationID getLocationID()
            throws FieldNotFound {
            quickfix.field.LocationID value = new quickfix.field.LocationID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LocationID field) {
            return isSetField(field);
        }

        public boolean isSetLocationID() {
            return isSetField(283);
        }

        public void set(quickfix.field.DeskID value) {
            setField(value);
        }

        public quickfix.field.DeskID get(quickfix.field.DeskID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DeskID getDeskID() throws FieldNotFound {
            quickfix.field.DeskID value = new quickfix.field.DeskID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DeskID field) {
            return isSetField(field);
        }

        public boolean isSetDeskID() {
            return isSetField(284);
        }

        public void set(quickfix.field.StatusValue value) {
            setField(value);
        }

        public quickfix.field.StatusValue get(quickfix.field.StatusValue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StatusValue getStatusValue()
            throws FieldNotFound {
            quickfix.field.StatusValue value = new quickfix.field.StatusValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StatusValue field) {
            return isSetField(field);
        }

        public boolean isSetStatusValue() {
            return isSetField(928);
        }

        public void set(quickfix.field.StatusText value) {
            setField(value);
        }

        public quickfix.field.StatusText get(quickfix.field.StatusText value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StatusText getStatusText()
            throws FieldNotFound {
            quickfix.field.StatusText value = new quickfix.field.StatusText();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StatusText field) {
            return isSetField(field);
        }

        public boolean isSetStatusText() {
            return isSetField(929);
        }
    }
}
