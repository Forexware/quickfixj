package quickfix.fix50.component;

import quickfix.FieldNotFound;


public class AffectedOrdGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = { 534, };
    private int[] componentGroups = {  };

    public AffectedOrdGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoAffectedOrders value) {
        setField(value);
    }

    public quickfix.field.NoAffectedOrders get(
        quickfix.field.NoAffectedOrders value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoAffectedOrders getNoAffectedOrders()
        throws FieldNotFound {
        quickfix.field.NoAffectedOrders value = new quickfix.field.NoAffectedOrders();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoAffectedOrders field) {
        return isSetField(field);
    }

    public boolean isSetNoAffectedOrders() {
        return isSetField(534);
    }
}
