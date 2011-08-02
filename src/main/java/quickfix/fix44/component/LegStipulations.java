package quickfix.fix44.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class LegStipulations extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 683, };

    public LegStipulations() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoLegStipulations value) {
        setField(value);
    }

    public quickfix.field.NoLegStipulations get(
        quickfix.field.NoLegStipulations value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoLegStipulations getNoLegStipulations()
        throws FieldNotFound {
        quickfix.field.NoLegStipulations value = new quickfix.field.NoLegStipulations();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoLegStipulations field) {
        return isSetField(field);
    }

    public boolean isSetNoLegStipulations() {
        return isSetField(683);
    }

    public static class NoLegStipulations extends Group {
        static final long serialVersionUID = 20050617;

        public NoLegStipulations() {
            super(683, 688, new int[] { 688, 689, 0 });
        }

        public void set(quickfix.field.LegStipulationType value) {
            setField(value);
        }

        public quickfix.field.LegStipulationType get(
            quickfix.field.LegStipulationType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegStipulationType getLegStipulationType()
            throws FieldNotFound {
            quickfix.field.LegStipulationType value = new quickfix.field.LegStipulationType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegStipulationType field) {
            return isSetField(field);
        }

        public boolean isSetLegStipulationType() {
            return isSetField(688);
        }

        public void set(quickfix.field.LegStipulationValue value) {
            setField(value);
        }

        public quickfix.field.LegStipulationValue get(
            quickfix.field.LegStipulationValue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegStipulationValue getLegStipulationValue()
            throws FieldNotFound {
            quickfix.field.LegStipulationValue value = new quickfix.field.LegStipulationValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegStipulationValue field) {
            return isSetField(field);
        }

        public boolean isSetLegStipulationValue() {
            return isSetField(689);
        }
    }
}
