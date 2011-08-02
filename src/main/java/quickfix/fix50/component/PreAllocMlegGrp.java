package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class PreAllocMlegGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 78, };

    public PreAllocMlegGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoAllocs value) {
        setField(value);
    }

    public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
        quickfix.field.NoAllocs value = new quickfix.field.NoAllocs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoAllocs field) {
        return isSetField(field);
    }

    public boolean isSetNoAllocs() {
        return isSetField(78);
    }

    public static class NoAllocs extends Group {
        static final long serialVersionUID = 20050617;

        public NoAllocs() {
            super(78, 79, new int[] { 79, 661, 736, 467, 948, 80, 0 });
        }

        public void set(quickfix.field.AllocAccount value) {
            setField(value);
        }

        public quickfix.field.AllocAccount get(
            quickfix.field.AllocAccount value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocAccount getAllocAccount()
            throws FieldNotFound {
            quickfix.field.AllocAccount value = new quickfix.field.AllocAccount();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocAccount field) {
            return isSetField(field);
        }

        public boolean isSetAllocAccount() {
            return isSetField(79);
        }

        public void set(quickfix.field.AllocAcctIDSource value) {
            setField(value);
        }

        public quickfix.field.AllocAcctIDSource get(
            quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocAcctIDSource getAllocAcctIDSource()
            throws FieldNotFound {
            quickfix.field.AllocAcctIDSource value = new quickfix.field.AllocAcctIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocAcctIDSource field) {
            return isSetField(field);
        }

        public boolean isSetAllocAcctIDSource() {
            return isSetField(661);
        }

        public void set(quickfix.field.AllocSettlCurrency value) {
            setField(value);
        }

        public quickfix.field.AllocSettlCurrency get(
            quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocSettlCurrency getAllocSettlCurrency()
            throws FieldNotFound {
            quickfix.field.AllocSettlCurrency value = new quickfix.field.AllocSettlCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocSettlCurrency field) {
            return isSetField(field);
        }

        public boolean isSetAllocSettlCurrency() {
            return isSetField(736);
        }

        public void set(quickfix.field.IndividualAllocID value) {
            setField(value);
        }

        public quickfix.field.IndividualAllocID get(
            quickfix.field.IndividualAllocID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IndividualAllocID getIndividualAllocID()
            throws FieldNotFound {
            quickfix.field.IndividualAllocID value = new quickfix.field.IndividualAllocID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IndividualAllocID field) {
            return isSetField(field);
        }

        public boolean isSetIndividualAllocID() {
            return isSetField(467);
        }

        public void set(quickfix.fix50.component.NestedParties3 component) {
            setComponent(component);
        }

        public quickfix.fix50.component.NestedParties3 get(
            quickfix.fix50.component.NestedParties3 component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.NestedParties3 getNestedParties3()
            throws FieldNotFound {
            quickfix.fix50.component.NestedParties3 component = new quickfix.fix50.component.NestedParties3();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoNested3PartyIDs value) {
            setField(value);
        }

        public quickfix.field.NoNested3PartyIDs get(
            quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs()
            throws FieldNotFound {
            quickfix.field.NoNested3PartyIDs value = new quickfix.field.NoNested3PartyIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoNested3PartyIDs() {
            return isSetField(948);
        }

        public void set(quickfix.field.AllocQty value) {
            setField(value);
        }

        public quickfix.field.AllocQty get(quickfix.field.AllocQty value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
            quickfix.field.AllocQty value = new quickfix.field.AllocQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocQty field) {
            return isSetField(field);
        }

        public boolean isSetAllocQty() {
            return isSetField(80);
        }

        public static class NoNested3PartyIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoNested3PartyIDs() {
                super(948, 949, new int[] { 949, 950, 951, 952, 0 });
            }

            public void set(quickfix.field.Nested3PartyID value) {
                setField(value);
            }

            public quickfix.field.Nested3PartyID get(
                quickfix.field.Nested3PartyID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.Nested3PartyID getNested3PartyID()
                throws FieldNotFound {
                quickfix.field.Nested3PartyID value = new quickfix.field.Nested3PartyID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.Nested3PartyID field) {
                return isSetField(field);
            }

            public boolean isSetNested3PartyID() {
                return isSetField(949);
            }

            public void set(quickfix.field.Nested3PartyIDSource value) {
                setField(value);
            }

            public quickfix.field.Nested3PartyIDSource get(
                quickfix.field.Nested3PartyIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource()
                throws FieldNotFound {
                quickfix.field.Nested3PartyIDSource value = new quickfix.field.Nested3PartyIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
                return isSetField(field);
            }

            public boolean isSetNested3PartyIDSource() {
                return isSetField(950);
            }

            public void set(quickfix.field.Nested3PartyRole value) {
                setField(value);
            }

            public quickfix.field.Nested3PartyRole get(
                quickfix.field.Nested3PartyRole value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.Nested3PartyRole getNested3PartyRole()
                throws FieldNotFound {
                quickfix.field.Nested3PartyRole value = new quickfix.field.Nested3PartyRole();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.Nested3PartyRole field) {
                return isSetField(field);
            }

            public boolean isSetNested3PartyRole() {
                return isSetField(951);
            }

            public void set(quickfix.fix50.component.NstdPtys3SubGrp component) {
                setComponent(component);
            }

            public quickfix.fix50.component.NstdPtys3SubGrp get(
                quickfix.fix50.component.NstdPtys3SubGrp component)
                throws FieldNotFound {
                getComponent(component);

                return component;
            }

            public quickfix.fix50.component.NstdPtys3SubGrp getNstdPtys3SubGrp()
                throws FieldNotFound {
                quickfix.fix50.component.NstdPtys3SubGrp component = new quickfix.fix50.component.NstdPtys3SubGrp();
                getComponent(component);

                return component;
            }

            public void set(quickfix.field.NoNested3PartySubIDs value) {
                setField(value);
            }

            public quickfix.field.NoNested3PartySubIDs get(
                quickfix.field.NoNested3PartySubIDs value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs()
                throws FieldNotFound {
                quickfix.field.NoNested3PartySubIDs value = new quickfix.field.NoNested3PartySubIDs();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
                return isSetField(field);
            }

            public boolean isSetNoNested3PartySubIDs() {
                return isSetField(952);
            }

            public static class NoNested3PartySubIDs extends Group {
                static final long serialVersionUID = 20050617;

                public NoNested3PartySubIDs() {
                    super(952, 953, new int[] { 953, 954, 0 });
                }

                public void set(quickfix.field.Nested3PartySubID value) {
                    setField(value);
                }

                public quickfix.field.Nested3PartySubID get(
                    quickfix.field.Nested3PartySubID value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.Nested3PartySubID getNested3PartySubID()
                    throws FieldNotFound {
                    quickfix.field.Nested3PartySubID value = new quickfix.field.Nested3PartySubID();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.Nested3PartySubID field) {
                    return isSetField(field);
                }

                public boolean isSetNested3PartySubID() {
                    return isSetField(953);
                }

                public void set(quickfix.field.Nested3PartySubIDType value) {
                    setField(value);
                }

                public quickfix.field.Nested3PartySubIDType get(
                    quickfix.field.Nested3PartySubIDType value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType()
                    throws FieldNotFound {
                    quickfix.field.Nested3PartySubIDType value = new quickfix.field.Nested3PartySubIDType();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
                    return isSetField(field);
                }

                public boolean isSetNested3PartySubIDType() {
                    return isSetField(954);
                }
            }
        }
    }
}
