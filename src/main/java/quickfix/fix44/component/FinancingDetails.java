package quickfix.fix44.component;

import quickfix.FieldNotFound;


public class FinancingDetails extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {
            913, 914, 915, 918, 788, 916, 917, 919, 898,
        };
    private int[] componentGroups = {  };

    public FinancingDetails() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.AgreementDesc value) {
        setField(value);
    }

    public quickfix.field.AgreementDesc get(quickfix.field.AgreementDesc value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.AgreementDesc getAgreementDesc()
        throws FieldNotFound {
        quickfix.field.AgreementDesc value = new quickfix.field.AgreementDesc();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.AgreementDesc field) {
        return isSetField(field);
    }

    public boolean isSetAgreementDesc() {
        return isSetField(913);
    }

    public void set(quickfix.field.AgreementID value) {
        setField(value);
    }

    public quickfix.field.AgreementID get(quickfix.field.AgreementID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.AgreementID getAgreementID()
        throws FieldNotFound {
        quickfix.field.AgreementID value = new quickfix.field.AgreementID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.AgreementID field) {
        return isSetField(field);
    }

    public boolean isSetAgreementID() {
        return isSetField(914);
    }

    public void set(quickfix.field.AgreementDate value) {
        setField(value);
    }

    public quickfix.field.AgreementDate get(quickfix.field.AgreementDate value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.AgreementDate getAgreementDate()
        throws FieldNotFound {
        quickfix.field.AgreementDate value = new quickfix.field.AgreementDate();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.AgreementDate field) {
        return isSetField(field);
    }

    public boolean isSetAgreementDate() {
        return isSetField(915);
    }

    public void set(quickfix.field.AgreementCurrency value) {
        setField(value);
    }

    public quickfix.field.AgreementCurrency get(
        quickfix.field.AgreementCurrency value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.AgreementCurrency getAgreementCurrency()
        throws FieldNotFound {
        quickfix.field.AgreementCurrency value = new quickfix.field.AgreementCurrency();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.AgreementCurrency field) {
        return isSetField(field);
    }

    public boolean isSetAgreementCurrency() {
        return isSetField(918);
    }

    public void set(quickfix.field.TerminationType value) {
        setField(value);
    }

    public quickfix.field.TerminationType get(
        quickfix.field.TerminationType value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TerminationType getTerminationType()
        throws FieldNotFound {
        quickfix.field.TerminationType value = new quickfix.field.TerminationType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TerminationType field) {
        return isSetField(field);
    }

    public boolean isSetTerminationType() {
        return isSetField(788);
    }

    public void set(quickfix.field.StartDate value) {
        setField(value);
    }

    public quickfix.field.StartDate get(quickfix.field.StartDate value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.StartDate getStartDate() throws FieldNotFound {
        quickfix.field.StartDate value = new quickfix.field.StartDate();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.StartDate field) {
        return isSetField(field);
    }

    public boolean isSetStartDate() {
        return isSetField(916);
    }

    public void set(quickfix.field.EndDate value) {
        setField(value);
    }

    public quickfix.field.EndDate get(quickfix.field.EndDate value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EndDate getEndDate() throws FieldNotFound {
        quickfix.field.EndDate value = new quickfix.field.EndDate();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EndDate field) {
        return isSetField(field);
    }

    public boolean isSetEndDate() {
        return isSetField(917);
    }

    public void set(quickfix.field.DeliveryType value) {
        setField(value);
    }

    public quickfix.field.DeliveryType get(quickfix.field.DeliveryType value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.DeliveryType getDeliveryType()
        throws FieldNotFound {
        quickfix.field.DeliveryType value = new quickfix.field.DeliveryType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.DeliveryType field) {
        return isSetField(field);
    }

    public boolean isSetDeliveryType() {
        return isSetField(919);
    }

    public void set(quickfix.field.MarginRatio value) {
        setField(value);
    }

    public quickfix.field.MarginRatio get(quickfix.field.MarginRatio value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.MarginRatio getMarginRatio()
        throws FieldNotFound {
        quickfix.field.MarginRatio value = new quickfix.field.MarginRatio();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.MarginRatio field) {
        return isSetField(field);
    }

    public boolean isSetMarginRatio() {
        return isSetField(898);
    }
}
