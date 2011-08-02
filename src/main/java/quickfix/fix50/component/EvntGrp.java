package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class EvntGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 864, };

    public EvntGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoEvents value) {
        setField(value);
    }

    public quickfix.field.NoEvents get(quickfix.field.NoEvents value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
        quickfix.field.NoEvents value = new quickfix.field.NoEvents();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoEvents field) {
        return isSetField(field);
    }

    public boolean isSetNoEvents() {
        return isSetField(864);
    }

    public static class NoEvents extends Group {
        static final long serialVersionUID = 20050617;

        public NoEvents() {
            super(864, 865, new int[] { 865, 866, 867, 868, 0 });
        }

        public void set(quickfix.field.EventType value) {
            setField(value);
        }

        public quickfix.field.EventType get(quickfix.field.EventType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EventType getEventType()
            throws FieldNotFound {
            quickfix.field.EventType value = new quickfix.field.EventType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EventType field) {
            return isSetField(field);
        }

        public boolean isSetEventType() {
            return isSetField(865);
        }

        public void set(quickfix.field.EventDate value) {
            setField(value);
        }

        public quickfix.field.EventDate get(quickfix.field.EventDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EventDate getEventDate()
            throws FieldNotFound {
            quickfix.field.EventDate value = new quickfix.field.EventDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EventDate field) {
            return isSetField(field);
        }

        public boolean isSetEventDate() {
            return isSetField(866);
        }

        public void set(quickfix.field.EventPx value) {
            setField(value);
        }

        public quickfix.field.EventPx get(quickfix.field.EventPx value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EventPx getEventPx() throws FieldNotFound {
            quickfix.field.EventPx value = new quickfix.field.EventPx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EventPx field) {
            return isSetField(field);
        }

        public boolean isSetEventPx() {
            return isSetField(867);
        }

        public void set(quickfix.field.EventText value) {
            setField(value);
        }

        public quickfix.field.EventText get(quickfix.field.EventText value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EventText getEventText()
            throws FieldNotFound {
            quickfix.field.EventText value = new quickfix.field.EventText();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EventText field) {
            return isSetField(field);
        }

        public boolean isSetEventText() {
            return isSetField(868);
        }
    }
}
