package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class ExecsGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 124, };

    public ExecsGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoExecs value) {
        setField(value);
    }

    public quickfix.field.NoExecs get(quickfix.field.NoExecs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
        quickfix.field.NoExecs value = new quickfix.field.NoExecs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoExecs field) {
        return isSetField(field);
    }

    public boolean isSetNoExecs() {
        return isSetField(124);
    }

    public static class NoExecs extends Group {
        static final long serialVersionUID = 20050617;

        public NoExecs() {
            super(124, 17, new int[] { 17, 0 });
        }

        public void set(quickfix.field.ExecID value) {
            setField(value);
        }

        public quickfix.field.ExecID get(quickfix.field.ExecID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ExecID getExecID() throws FieldNotFound {
            quickfix.field.ExecID value = new quickfix.field.ExecID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ExecID field) {
            return isSetField(field);
        }

        public boolean isSetExecID() {
            return isSetField(17);
        }
    }
}
