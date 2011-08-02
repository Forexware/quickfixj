package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RgstDtlsGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 473, };

    public RgstDtlsGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoRegistDtls value) {
        setField(value);
    }

    public quickfix.field.NoRegistDtls get(quickfix.field.NoRegistDtls value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoRegistDtls getNoRegistDtls()
        throws FieldNotFound {
        quickfix.field.NoRegistDtls value = new quickfix.field.NoRegistDtls();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoRegistDtls field) {
        return isSetField(field);
    }

    public boolean isSetNoRegistDtls() {
        return isSetField(473);
    }

    public static class NoRegistDtls extends Group {
        static final long serialVersionUID = 20050617;

        public NoRegistDtls() {
            super(473, 509,
                new int[] { 509, 511, 474, 482, 539, 522, 486, 475, 0 });
        }

        public void set(quickfix.field.RegistDtls value) {
            setField(value);
        }

        public quickfix.field.RegistDtls get(quickfix.field.RegistDtls value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RegistDtls getRegistDtls()
            throws FieldNotFound {
            quickfix.field.RegistDtls value = new quickfix.field.RegistDtls();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RegistDtls field) {
            return isSetField(field);
        }

        public boolean isSetRegistDtls() {
            return isSetField(509);
        }

        public void set(quickfix.field.RegistEmail value) {
            setField(value);
        }

        public quickfix.field.RegistEmail get(quickfix.field.RegistEmail value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RegistEmail getRegistEmail()
            throws FieldNotFound {
            quickfix.field.RegistEmail value = new quickfix.field.RegistEmail();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RegistEmail field) {
            return isSetField(field);
        }

        public boolean isSetRegistEmail() {
            return isSetField(511);
        }

        public void set(quickfix.field.MailingDtls value) {
            setField(value);
        }

        public quickfix.field.MailingDtls get(quickfix.field.MailingDtls value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MailingDtls getMailingDtls()
            throws FieldNotFound {
            quickfix.field.MailingDtls value = new quickfix.field.MailingDtls();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MailingDtls field) {
            return isSetField(field);
        }

        public boolean isSetMailingDtls() {
            return isSetField(474);
        }

        public void set(quickfix.field.MailingInst value) {
            setField(value);
        }

        public quickfix.field.MailingInst get(quickfix.field.MailingInst value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MailingInst getMailingInst()
            throws FieldNotFound {
            quickfix.field.MailingInst value = new quickfix.field.MailingInst();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MailingInst field) {
            return isSetField(field);
        }

        public boolean isSetMailingInst() {
            return isSetField(482);
        }

        public void set(quickfix.fix50.component.NestedParties component) {
            setComponent(component);
        }

        public quickfix.fix50.component.NestedParties get(
            quickfix.fix50.component.NestedParties component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.NestedParties getNestedParties()
            throws FieldNotFound {
            quickfix.fix50.component.NestedParties component = new quickfix.fix50.component.NestedParties();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoNestedPartyIDs value) {
            setField(value);
        }

        public quickfix.field.NoNestedPartyIDs get(
            quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs()
            throws FieldNotFound {
            quickfix.field.NoNestedPartyIDs value = new quickfix.field.NoNestedPartyIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoNestedPartyIDs() {
            return isSetField(539);
        }

        public void set(quickfix.field.OwnerType value) {
            setField(value);
        }

        public quickfix.field.OwnerType get(quickfix.field.OwnerType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OwnerType getOwnerType()
            throws FieldNotFound {
            quickfix.field.OwnerType value = new quickfix.field.OwnerType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OwnerType field) {
            return isSetField(field);
        }

        public boolean isSetOwnerType() {
            return isSetField(522);
        }

        public void set(quickfix.field.DateOfBirth value) {
            setField(value);
        }

        public quickfix.field.DateOfBirth get(quickfix.field.DateOfBirth value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DateOfBirth getDateOfBirth()
            throws FieldNotFound {
            quickfix.field.DateOfBirth value = new quickfix.field.DateOfBirth();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DateOfBirth field) {
            return isSetField(field);
        }

        public boolean isSetDateOfBirth() {
            return isSetField(486);
        }

        public void set(quickfix.field.InvestorCountryOfResidence value) {
            setField(value);
        }

        public quickfix.field.InvestorCountryOfResidence get(
            quickfix.field.InvestorCountryOfResidence value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InvestorCountryOfResidence getInvestorCountryOfResidence()
            throws FieldNotFound {
            quickfix.field.InvestorCountryOfResidence value = new quickfix.field.InvestorCountryOfResidence();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InvestorCountryOfResidence field) {
            return isSetField(field);
        }

        public boolean isSetInvestorCountryOfResidence() {
            return isSetField(475);
        }

        public static class NoNestedPartyIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoNestedPartyIDs() {
                super(539, 524, new int[] { 524, 525, 538, 804, 0 });
            }

            public void set(quickfix.field.NestedPartyID value) {
                setField(value);
            }

            public quickfix.field.NestedPartyID get(
                quickfix.field.NestedPartyID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NestedPartyID getNestedPartyID()
                throws FieldNotFound {
                quickfix.field.NestedPartyID value = new quickfix.field.NestedPartyID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NestedPartyID field) {
                return isSetField(field);
            }

            public boolean isSetNestedPartyID() {
                return isSetField(524);
            }

            public void set(quickfix.field.NestedPartyIDSource value) {
                setField(value);
            }

            public quickfix.field.NestedPartyIDSource get(
                quickfix.field.NestedPartyIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NestedPartyIDSource getNestedPartyIDSource()
                throws FieldNotFound {
                quickfix.field.NestedPartyIDSource value = new quickfix.field.NestedPartyIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NestedPartyIDSource field) {
                return isSetField(field);
            }

            public boolean isSetNestedPartyIDSource() {
                return isSetField(525);
            }

            public void set(quickfix.field.NestedPartyRole value) {
                setField(value);
            }

            public quickfix.field.NestedPartyRole get(
                quickfix.field.NestedPartyRole value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NestedPartyRole getNestedPartyRole()
                throws FieldNotFound {
                quickfix.field.NestedPartyRole value = new quickfix.field.NestedPartyRole();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NestedPartyRole field) {
                return isSetField(field);
            }

            public boolean isSetNestedPartyRole() {
                return isSetField(538);
            }

            public void set(quickfix.fix50.component.NstdPtysSubGrp component) {
                setComponent(component);
            }

            public quickfix.fix50.component.NstdPtysSubGrp get(
                quickfix.fix50.component.NstdPtysSubGrp component)
                throws FieldNotFound {
                getComponent(component);

                return component;
            }

            public quickfix.fix50.component.NstdPtysSubGrp getNstdPtysSubGrp()
                throws FieldNotFound {
                quickfix.fix50.component.NstdPtysSubGrp component = new quickfix.fix50.component.NstdPtysSubGrp();
                getComponent(component);

                return component;
            }

            public void set(quickfix.field.NoNestedPartySubIDs value) {
                setField(value);
            }

            public quickfix.field.NoNestedPartySubIDs get(
                quickfix.field.NoNestedPartySubIDs value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs()
                throws FieldNotFound {
                quickfix.field.NoNestedPartySubIDs value = new quickfix.field.NoNestedPartySubIDs();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
                return isSetField(field);
            }

            public boolean isSetNoNestedPartySubIDs() {
                return isSetField(804);
            }

            public static class NoNestedPartySubIDs extends Group {
                static final long serialVersionUID = 20050617;

                public NoNestedPartySubIDs() {
                    super(804, 545, new int[] { 545, 805, 0 });
                }

                public void set(quickfix.field.NestedPartySubID value) {
                    setField(value);
                }

                public quickfix.field.NestedPartySubID get(
                    quickfix.field.NestedPartySubID value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.NestedPartySubID getNestedPartySubID()
                    throws FieldNotFound {
                    quickfix.field.NestedPartySubID value = new quickfix.field.NestedPartySubID();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.NestedPartySubID field) {
                    return isSetField(field);
                }

                public boolean isSetNestedPartySubID() {
                    return isSetField(545);
                }

                public void set(quickfix.field.NestedPartySubIDType value) {
                    setField(value);
                }

                public quickfix.field.NestedPartySubIDType get(
                    quickfix.field.NestedPartySubIDType value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.NestedPartySubIDType getNestedPartySubIDType()
                    throws FieldNotFound {
                    quickfix.field.NestedPartySubIDType value = new quickfix.field.NestedPartySubIDType();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.NestedPartySubIDType field) {
                    return isSetField(field);
                }

                public boolean isSetNestedPartySubIDType() {
                    return isSetField(805);
                }
            }
        }
    }
}
