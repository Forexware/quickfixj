package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class ClrInstGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 576, };

    public ClrInstGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoClearingInstructions value) {
        setField(value);
    }

    public quickfix.field.NoClearingInstructions get(
        quickfix.field.NoClearingInstructions value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoClearingInstructions getNoClearingInstructions()
        throws FieldNotFound {
        quickfix.field.NoClearingInstructions value = new quickfix.field.NoClearingInstructions();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoClearingInstructions field) {
        return isSetField(field);
    }

    public boolean isSetNoClearingInstructions() {
        return isSetField(576);
    }

    public static class NoClearingInstructions extends Group {
        static final long serialVersionUID = 20050617;

        public NoClearingInstructions() {
            super(576, 577, new int[] { 577, 0 });
        }

        public void set(quickfix.field.ClearingInstruction value) {
            setField(value);
        }

        public quickfix.field.ClearingInstruction get(
            quickfix.field.ClearingInstruction value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ClearingInstruction getClearingInstruction()
            throws FieldNotFound {
            quickfix.field.ClearingInstruction value = new quickfix.field.ClearingInstruction();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ClearingInstruction field) {
            return isSetField(field);
        }

        public boolean isSetClearingInstruction() {
            return isSetField(577);
        }
    }
}
