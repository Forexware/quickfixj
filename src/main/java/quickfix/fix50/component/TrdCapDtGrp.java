package quickfix.fix50.component;

import quickfix.FieldNotFound;


public class TrdCapDtGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = { 580, };
    private int[] componentGroups = {  };

    public TrdCapDtGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoDates value) {
        setField(value);
    }

    public quickfix.field.NoDates get(quickfix.field.NoDates value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoDates getNoDates() throws FieldNotFound {
        quickfix.field.NoDates value = new quickfix.field.NoDates();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoDates field) {
        return isSetField(field);
    }

    public boolean isSetNoDates() {
        return isSetField(580);
    }
}
