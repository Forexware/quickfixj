package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class AllocGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 78, };

    public AllocGrp() {
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
            super(78, 79,
                new int[] {
                    79, 661, 573, 366, 80, 467, 81, 539, 208, 209, 161, 360, 361,
                    12, 13, 479, 497, 153, 154, 119, 737, 120, 736, 155, 156,
                    742, 741, 136, 576, 780, 172, 169, 170, 171, 85, 989, 1002,
                    993, 992, 1047, 635, 0
                });
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

        public void set(quickfix.field.MatchStatus value) {
            setField(value);
        }

        public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MatchStatus getMatchStatus()
            throws FieldNotFound {
            quickfix.field.MatchStatus value = new quickfix.field.MatchStatus();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MatchStatus field) {
            return isSetField(field);
        }

        public boolean isSetMatchStatus() {
            return isSetField(573);
        }

        public void set(quickfix.field.AllocPrice value) {
            setField(value);
        }

        public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocPrice getAllocPrice()
            throws FieldNotFound {
            quickfix.field.AllocPrice value = new quickfix.field.AllocPrice();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocPrice field) {
            return isSetField(field);
        }

        public boolean isSetAllocPrice() {
            return isSetField(366);
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

        public void set(quickfix.field.ProcessCode value) {
            setField(value);
        }

        public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ProcessCode getProcessCode()
            throws FieldNotFound {
            quickfix.field.ProcessCode value = new quickfix.field.ProcessCode();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ProcessCode field) {
            return isSetField(field);
        }

        public boolean isSetProcessCode() {
            return isSetField(81);
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

        public void set(quickfix.field.NotifyBrokerOfCredit value) {
            setField(value);
        }

        public quickfix.field.NotifyBrokerOfCredit get(
            quickfix.field.NotifyBrokerOfCredit value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit()
            throws FieldNotFound {
            quickfix.field.NotifyBrokerOfCredit value = new quickfix.field.NotifyBrokerOfCredit();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NotifyBrokerOfCredit field) {
            return isSetField(field);
        }

        public boolean isSetNotifyBrokerOfCredit() {
            return isSetField(208);
        }

        public void set(quickfix.field.AllocHandlInst value) {
            setField(value);
        }

        public quickfix.field.AllocHandlInst get(
            quickfix.field.AllocHandlInst value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocHandlInst getAllocHandlInst()
            throws FieldNotFound {
            quickfix.field.AllocHandlInst value = new quickfix.field.AllocHandlInst();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocHandlInst field) {
            return isSetField(field);
        }

        public boolean isSetAllocHandlInst() {
            return isSetField(209);
        }

        public void set(quickfix.field.AllocText value) {
            setField(value);
        }

        public quickfix.field.AllocText get(quickfix.field.AllocText value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocText getAllocText()
            throws FieldNotFound {
            quickfix.field.AllocText value = new quickfix.field.AllocText();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocText field) {
            return isSetField(field);
        }

        public boolean isSetAllocText() {
            return isSetField(161);
        }

        public void set(quickfix.field.EncodedAllocTextLen value) {
            setField(value);
        }

        public quickfix.field.EncodedAllocTextLen get(
            quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen()
            throws FieldNotFound {
            quickfix.field.EncodedAllocTextLen value = new quickfix.field.EncodedAllocTextLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedAllocTextLen() {
            return isSetField(360);
        }

        public void set(quickfix.field.EncodedAllocText value) {
            setField(value);
        }

        public quickfix.field.EncodedAllocText get(
            quickfix.field.EncodedAllocText value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedAllocText getEncodedAllocText()
            throws FieldNotFound {
            quickfix.field.EncodedAllocText value = new quickfix.field.EncodedAllocText();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedAllocText field) {
            return isSetField(field);
        }

        public boolean isSetEncodedAllocText() {
            return isSetField(361);
        }

        public void set(quickfix.fix50.component.CommissionData component) {
            setComponent(component);
        }

        public quickfix.fix50.component.CommissionData get(
            quickfix.fix50.component.CommissionData component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.CommissionData getCommissionData()
            throws FieldNotFound {
            quickfix.fix50.component.CommissionData component = new quickfix.fix50.component.CommissionData();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.Commission value) {
            setField(value);
        }

        public quickfix.field.Commission get(quickfix.field.Commission value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Commission getCommission()
            throws FieldNotFound {
            quickfix.field.Commission value = new quickfix.field.Commission();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Commission field) {
            return isSetField(field);
        }

        public boolean isSetCommission() {
            return isSetField(12);
        }

        public void set(quickfix.field.CommType value) {
            setField(value);
        }

        public quickfix.field.CommType get(quickfix.field.CommType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CommType getCommType() throws FieldNotFound {
            quickfix.field.CommType value = new quickfix.field.CommType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CommType field) {
            return isSetField(field);
        }

        public boolean isSetCommType() {
            return isSetField(13);
        }

        public void set(quickfix.field.CommCurrency value) {
            setField(value);
        }

        public quickfix.field.CommCurrency get(
            quickfix.field.CommCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CommCurrency getCommCurrency()
            throws FieldNotFound {
            quickfix.field.CommCurrency value = new quickfix.field.CommCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CommCurrency field) {
            return isSetField(field);
        }

        public boolean isSetCommCurrency() {
            return isSetField(479);
        }

        public void set(quickfix.field.FundRenewWaiv value) {
            setField(value);
        }

        public quickfix.field.FundRenewWaiv get(
            quickfix.field.FundRenewWaiv value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.FundRenewWaiv getFundRenewWaiv()
            throws FieldNotFound {
            quickfix.field.FundRenewWaiv value = new quickfix.field.FundRenewWaiv();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.FundRenewWaiv field) {
            return isSetField(field);
        }

        public boolean isSetFundRenewWaiv() {
            return isSetField(497);
        }

        public void set(quickfix.field.AllocAvgPx value) {
            setField(value);
        }

        public quickfix.field.AllocAvgPx get(quickfix.field.AllocAvgPx value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocAvgPx getAllocAvgPx()
            throws FieldNotFound {
            quickfix.field.AllocAvgPx value = new quickfix.field.AllocAvgPx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocAvgPx field) {
            return isSetField(field);
        }

        public boolean isSetAllocAvgPx() {
            return isSetField(153);
        }

        public void set(quickfix.field.AllocNetMoney value) {
            setField(value);
        }

        public quickfix.field.AllocNetMoney get(
            quickfix.field.AllocNetMoney value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocNetMoney getAllocNetMoney()
            throws FieldNotFound {
            quickfix.field.AllocNetMoney value = new quickfix.field.AllocNetMoney();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocNetMoney field) {
            return isSetField(field);
        }

        public boolean isSetAllocNetMoney() {
            return isSetField(154);
        }

        public void set(quickfix.field.SettlCurrAmt value) {
            setField(value);
        }

        public quickfix.field.SettlCurrAmt get(
            quickfix.field.SettlCurrAmt value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlCurrAmt getSettlCurrAmt()
            throws FieldNotFound {
            quickfix.field.SettlCurrAmt value = new quickfix.field.SettlCurrAmt();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlCurrAmt field) {
            return isSetField(field);
        }

        public boolean isSetSettlCurrAmt() {
            return isSetField(119);
        }

        public void set(quickfix.field.AllocSettlCurrAmt value) {
            setField(value);
        }

        public quickfix.field.AllocSettlCurrAmt get(
            quickfix.field.AllocSettlCurrAmt value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocSettlCurrAmt getAllocSettlCurrAmt()
            throws FieldNotFound {
            quickfix.field.AllocSettlCurrAmt value = new quickfix.field.AllocSettlCurrAmt();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocSettlCurrAmt field) {
            return isSetField(field);
        }

        public boolean isSetAllocSettlCurrAmt() {
            return isSetField(737);
        }

        public void set(quickfix.field.SettlCurrency value) {
            setField(value);
        }

        public quickfix.field.SettlCurrency get(
            quickfix.field.SettlCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlCurrency getSettlCurrency()
            throws FieldNotFound {
            quickfix.field.SettlCurrency value = new quickfix.field.SettlCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlCurrency field) {
            return isSetField(field);
        }

        public boolean isSetSettlCurrency() {
            return isSetField(120);
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

        public void set(quickfix.field.SettlCurrFxRate value) {
            setField(value);
        }

        public quickfix.field.SettlCurrFxRate get(
            quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlCurrFxRate getSettlCurrFxRate()
            throws FieldNotFound {
            quickfix.field.SettlCurrFxRate value = new quickfix.field.SettlCurrFxRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlCurrFxRate field) {
            return isSetField(field);
        }

        public boolean isSetSettlCurrFxRate() {
            return isSetField(155);
        }

        public void set(quickfix.field.SettlCurrFxRateCalc value) {
            setField(value);
        }

        public quickfix.field.SettlCurrFxRateCalc get(
            quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc()
            throws FieldNotFound {
            quickfix.field.SettlCurrFxRateCalc value = new quickfix.field.SettlCurrFxRateCalc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
            return isSetField(field);
        }

        public boolean isSetSettlCurrFxRateCalc() {
            return isSetField(156);
        }

        public void set(quickfix.field.AllocAccruedInterestAmt value) {
            setField(value);
        }

        public quickfix.field.AllocAccruedInterestAmt get(
            quickfix.field.AllocAccruedInterestAmt value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocAccruedInterestAmt getAllocAccruedInterestAmt()
            throws FieldNotFound {
            quickfix.field.AllocAccruedInterestAmt value = new quickfix.field.AllocAccruedInterestAmt();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocAccruedInterestAmt field) {
            return isSetField(field);
        }

        public boolean isSetAllocAccruedInterestAmt() {
            return isSetField(742);
        }

        public void set(quickfix.field.AllocInterestAtMaturity value) {
            setField(value);
        }

        public quickfix.field.AllocInterestAtMaturity get(
            quickfix.field.AllocInterestAtMaturity value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocInterestAtMaturity getAllocInterestAtMaturity()
            throws FieldNotFound {
            quickfix.field.AllocInterestAtMaturity value = new quickfix.field.AllocInterestAtMaturity();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocInterestAtMaturity field) {
            return isSetField(field);
        }

        public boolean isSetAllocInterestAtMaturity() {
            return isSetField(741);
        }

        public void set(quickfix.fix50.component.MiscFeesGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.MiscFeesGrp get(
            quickfix.fix50.component.MiscFeesGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.MiscFeesGrp getMiscFeesGrp()
            throws FieldNotFound {
            quickfix.fix50.component.MiscFeesGrp component = new quickfix.fix50.component.MiscFeesGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoMiscFees value) {
            setField(value);
        }

        public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoMiscFees getNoMiscFees()
            throws FieldNotFound {
            quickfix.field.NoMiscFees value = new quickfix.field.NoMiscFees();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoMiscFees field) {
            return isSetField(field);
        }

        public boolean isSetNoMiscFees() {
            return isSetField(136);
        }

        public void set(quickfix.fix50.component.ClrInstGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.ClrInstGrp get(
            quickfix.fix50.component.ClrInstGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.ClrInstGrp getClrInstGrp()
            throws FieldNotFound {
            quickfix.fix50.component.ClrInstGrp component = new quickfix.fix50.component.ClrInstGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoClearingInstructions value) {
            setField(value);
        }

        public quickfix.field.NoClearingInstructions get(
            quickfix.field.NoClearingInstructions value)
            throws FieldNotFound {
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

        public void set(quickfix.field.AllocSettlInstType value) {
            setField(value);
        }

        public quickfix.field.AllocSettlInstType get(
            quickfix.field.AllocSettlInstType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocSettlInstType getAllocSettlInstType()
            throws FieldNotFound {
            quickfix.field.AllocSettlInstType value = new quickfix.field.AllocSettlInstType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocSettlInstType field) {
            return isSetField(field);
        }

        public boolean isSetAllocSettlInstType() {
            return isSetField(780);
        }

        public void set(
            quickfix.fix50.component.SettlInstructionsData component) {
            setComponent(component);
        }

        public quickfix.fix50.component.SettlInstructionsData get(
            quickfix.fix50.component.SettlInstructionsData component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.SettlInstructionsData getSettlInstructionsData()
            throws FieldNotFound {
            quickfix.fix50.component.SettlInstructionsData component = new quickfix.fix50.component.SettlInstructionsData();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.SettlDeliveryType value) {
            setField(value);
        }

        public quickfix.field.SettlDeliveryType get(
            quickfix.field.SettlDeliveryType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlDeliveryType getSettlDeliveryType()
            throws FieldNotFound {
            quickfix.field.SettlDeliveryType value = new quickfix.field.SettlDeliveryType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlDeliveryType field) {
            return isSetField(field);
        }

        public boolean isSetSettlDeliveryType() {
            return isSetField(172);
        }

        public void set(quickfix.field.StandInstDbType value) {
            setField(value);
        }

        public quickfix.field.StandInstDbType get(
            quickfix.field.StandInstDbType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StandInstDbType getStandInstDbType()
            throws FieldNotFound {
            quickfix.field.StandInstDbType value = new quickfix.field.StandInstDbType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StandInstDbType field) {
            return isSetField(field);
        }

        public boolean isSetStandInstDbType() {
            return isSetField(169);
        }

        public void set(quickfix.field.StandInstDbName value) {
            setField(value);
        }

        public quickfix.field.StandInstDbName get(
            quickfix.field.StandInstDbName value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StandInstDbName getStandInstDbName()
            throws FieldNotFound {
            quickfix.field.StandInstDbName value = new quickfix.field.StandInstDbName();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StandInstDbName field) {
            return isSetField(field);
        }

        public boolean isSetStandInstDbName() {
            return isSetField(170);
        }

        public void set(quickfix.field.StandInstDbID value) {
            setField(value);
        }

        public quickfix.field.StandInstDbID get(
            quickfix.field.StandInstDbID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StandInstDbID getStandInstDbID()
            throws FieldNotFound {
            quickfix.field.StandInstDbID value = new quickfix.field.StandInstDbID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StandInstDbID field) {
            return isSetField(field);
        }

        public boolean isSetStandInstDbID() {
            return isSetField(171);
        }

        public void set(quickfix.fix50.component.DlvyInstGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.DlvyInstGrp get(
            quickfix.fix50.component.DlvyInstGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.DlvyInstGrp getDlvyInstGrp()
            throws FieldNotFound {
            quickfix.fix50.component.DlvyInstGrp component = new quickfix.fix50.component.DlvyInstGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoDlvyInst value) {
            setField(value);
        }

        public quickfix.field.NoDlvyInst get(quickfix.field.NoDlvyInst value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoDlvyInst getNoDlvyInst()
            throws FieldNotFound {
            quickfix.field.NoDlvyInst value = new quickfix.field.NoDlvyInst();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoDlvyInst field) {
            return isSetField(field);
        }

        public boolean isSetNoDlvyInst() {
            return isSetField(85);
        }

        public void set(quickfix.field.SecondaryIndividualAllocID value) {
            setField(value);
        }

        public quickfix.field.SecondaryIndividualAllocID get(
            quickfix.field.SecondaryIndividualAllocID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID()
            throws FieldNotFound {
            quickfix.field.SecondaryIndividualAllocID value = new quickfix.field.SecondaryIndividualAllocID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
            return isSetField(field);
        }

        public boolean isSetSecondaryIndividualAllocID() {
            return isSetField(989);
        }

        public void set(quickfix.field.AllocMethod value) {
            setField(value);
        }

        public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocMethod getAllocMethod()
            throws FieldNotFound {
            quickfix.field.AllocMethod value = new quickfix.field.AllocMethod();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocMethod field) {
            return isSetField(field);
        }

        public boolean isSetAllocMethod() {
            return isSetField(1002);
        }

        public void set(quickfix.field.AllocCustomerCapacity value) {
            setField(value);
        }

        public quickfix.field.AllocCustomerCapacity get(
            quickfix.field.AllocCustomerCapacity value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity()
            throws FieldNotFound {
            quickfix.field.AllocCustomerCapacity value = new quickfix.field.AllocCustomerCapacity();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
            return isSetField(field);
        }

        public boolean isSetAllocCustomerCapacity() {
            return isSetField(993);
        }

        public void set(quickfix.field.IndividualAllocType value) {
            setField(value);
        }

        public quickfix.field.IndividualAllocType get(
            quickfix.field.IndividualAllocType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IndividualAllocType getIndividualAllocType()
            throws FieldNotFound {
            quickfix.field.IndividualAllocType value = new quickfix.field.IndividualAllocType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IndividualAllocType field) {
            return isSetField(field);
        }

        public boolean isSetIndividualAllocType() {
            return isSetField(992);
        }

        public void set(quickfix.field.AllocPositionEffect value) {
            setField(value);
        }

        public quickfix.field.AllocPositionEffect get(
            quickfix.field.AllocPositionEffect value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AllocPositionEffect getAllocPositionEffect()
            throws FieldNotFound {
            quickfix.field.AllocPositionEffect value = new quickfix.field.AllocPositionEffect();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AllocPositionEffect field) {
            return isSetField(field);
        }

        public boolean isSetAllocPositionEffect() {
            return isSetField(1047);
        }

        public void set(quickfix.field.ClearingFeeIndicator value) {
            setField(value);
        }

        public quickfix.field.ClearingFeeIndicator get(
            quickfix.field.ClearingFeeIndicator value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator()
            throws FieldNotFound {
            quickfix.field.ClearingFeeIndicator value = new quickfix.field.ClearingFeeIndicator();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
            return isSetField(field);
        }

        public boolean isSetClearingFeeIndicator() {
            return isSetField(635);
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

        public static class NoMiscFees extends Group {
            static final long serialVersionUID = 20050617;

            public NoMiscFees() {
                super(136, 137, new int[] { 137, 138, 139, 891, 0 });
            }

            public void set(quickfix.field.MiscFeeAmt value) {
                setField(value);
            }

            public quickfix.field.MiscFeeAmt get(
                quickfix.field.MiscFeeAmt value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.MiscFeeAmt getMiscFeeAmt()
                throws FieldNotFound {
                quickfix.field.MiscFeeAmt value = new quickfix.field.MiscFeeAmt();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.MiscFeeAmt field) {
                return isSetField(field);
            }

            public boolean isSetMiscFeeAmt() {
                return isSetField(137);
            }

            public void set(quickfix.field.MiscFeeCurr value) {
                setField(value);
            }

            public quickfix.field.MiscFeeCurr get(
                quickfix.field.MiscFeeCurr value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.MiscFeeCurr getMiscFeeCurr()
                throws FieldNotFound {
                quickfix.field.MiscFeeCurr value = new quickfix.field.MiscFeeCurr();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.MiscFeeCurr field) {
                return isSetField(field);
            }

            public boolean isSetMiscFeeCurr() {
                return isSetField(138);
            }

            public void set(quickfix.field.MiscFeeType value) {
                setField(value);
            }

            public quickfix.field.MiscFeeType get(
                quickfix.field.MiscFeeType value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.MiscFeeType getMiscFeeType()
                throws FieldNotFound {
                quickfix.field.MiscFeeType value = new quickfix.field.MiscFeeType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.MiscFeeType field) {
                return isSetField(field);
            }

            public boolean isSetMiscFeeType() {
                return isSetField(139);
            }

            public void set(quickfix.field.MiscFeeBasis value) {
                setField(value);
            }

            public quickfix.field.MiscFeeBasis get(
                quickfix.field.MiscFeeBasis value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.MiscFeeBasis getMiscFeeBasis()
                throws FieldNotFound {
                quickfix.field.MiscFeeBasis value = new quickfix.field.MiscFeeBasis();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.MiscFeeBasis field) {
                return isSetField(field);
            }

            public boolean isSetMiscFeeBasis() {
                return isSetField(891);
            }
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
                quickfix.field.ClearingInstruction value)
                throws FieldNotFound {
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

        public static class NoDlvyInst extends Group {
            static final long serialVersionUID = 20050617;

            public NoDlvyInst() {
                super(85, 165, new int[] { 165, 787, 781, 0 });
            }

            public void set(quickfix.field.SettlInstSource value) {
                setField(value);
            }

            public quickfix.field.SettlInstSource get(
                quickfix.field.SettlInstSource value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SettlInstSource getSettlInstSource()
                throws FieldNotFound {
                quickfix.field.SettlInstSource value = new quickfix.field.SettlInstSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SettlInstSource field) {
                return isSetField(field);
            }

            public boolean isSetSettlInstSource() {
                return isSetField(165);
            }

            public void set(quickfix.field.DlvyInstType value) {
                setField(value);
            }

            public quickfix.field.DlvyInstType get(
                quickfix.field.DlvyInstType value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.DlvyInstType getDlvyInstType()
                throws FieldNotFound {
                quickfix.field.DlvyInstType value = new quickfix.field.DlvyInstType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.DlvyInstType field) {
                return isSetField(field);
            }

            public boolean isSetDlvyInstType() {
                return isSetField(787);
            }

            public void set(quickfix.fix50.component.SettlParties component) {
                setComponent(component);
            }

            public quickfix.fix50.component.SettlParties get(
                quickfix.fix50.component.SettlParties component)
                throws FieldNotFound {
                getComponent(component);

                return component;
            }

            public quickfix.fix50.component.SettlParties getSettlParties()
                throws FieldNotFound {
                quickfix.fix50.component.SettlParties component = new quickfix.fix50.component.SettlParties();
                getComponent(component);

                return component;
            }

            public void set(quickfix.field.NoSettlPartyIDs value) {
                setField(value);
            }

            public quickfix.field.NoSettlPartyIDs get(
                quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs()
                throws FieldNotFound {
                quickfix.field.NoSettlPartyIDs value = new quickfix.field.NoSettlPartyIDs();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
                return isSetField(field);
            }

            public boolean isSetNoSettlPartyIDs() {
                return isSetField(781);
            }

            public static class NoSettlPartyIDs extends Group {
                static final long serialVersionUID = 20050617;

                public NoSettlPartyIDs() {
                    super(781, 782, new int[] { 782, 783, 784, 801, 0 });
                }

                public void set(quickfix.field.SettlPartyID value) {
                    setField(value);
                }

                public quickfix.field.SettlPartyID get(
                    quickfix.field.SettlPartyID value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.SettlPartyID getSettlPartyID()
                    throws FieldNotFound {
                    quickfix.field.SettlPartyID value = new quickfix.field.SettlPartyID();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.SettlPartyID field) {
                    return isSetField(field);
                }

                public boolean isSetSettlPartyID() {
                    return isSetField(782);
                }

                public void set(quickfix.field.SettlPartyIDSource value) {
                    setField(value);
                }

                public quickfix.field.SettlPartyIDSource get(
                    quickfix.field.SettlPartyIDSource value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.SettlPartyIDSource getSettlPartyIDSource()
                    throws FieldNotFound {
                    quickfix.field.SettlPartyIDSource value = new quickfix.field.SettlPartyIDSource();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.SettlPartyIDSource field) {
                    return isSetField(field);
                }

                public boolean isSetSettlPartyIDSource() {
                    return isSetField(783);
                }

                public void set(quickfix.field.SettlPartyRole value) {
                    setField(value);
                }

                public quickfix.field.SettlPartyRole get(
                    quickfix.field.SettlPartyRole value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.SettlPartyRole getSettlPartyRole()
                    throws FieldNotFound {
                    quickfix.field.SettlPartyRole value = new quickfix.field.SettlPartyRole();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.SettlPartyRole field) {
                    return isSetField(field);
                }

                public boolean isSetSettlPartyRole() {
                    return isSetField(784);
                }

                public void set(
                    quickfix.fix50.component.SettlPtysSubGrp component) {
                    setComponent(component);
                }

                public quickfix.fix50.component.SettlPtysSubGrp get(
                    quickfix.fix50.component.SettlPtysSubGrp component)
                    throws FieldNotFound {
                    getComponent(component);

                    return component;
                }

                public quickfix.fix50.component.SettlPtysSubGrp getSettlPtysSubGrp()
                    throws FieldNotFound {
                    quickfix.fix50.component.SettlPtysSubGrp component = new quickfix.fix50.component.SettlPtysSubGrp();
                    getComponent(component);

                    return component;
                }

                public void set(quickfix.field.NoSettlPartySubIDs value) {
                    setField(value);
                }

                public quickfix.field.NoSettlPartySubIDs get(
                    quickfix.field.NoSettlPartySubIDs value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs()
                    throws FieldNotFound {
                    quickfix.field.NoSettlPartySubIDs value = new quickfix.field.NoSettlPartySubIDs();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
                    return isSetField(field);
                }

                public boolean isSetNoSettlPartySubIDs() {
                    return isSetField(801);
                }

                public static class NoSettlPartySubIDs extends Group {
                    static final long serialVersionUID = 20050617;

                    public NoSettlPartySubIDs() {
                        super(801, 785, new int[] { 785, 786, 0 });
                    }

                    public void set(quickfix.field.SettlPartySubID value) {
                        setField(value);
                    }

                    public quickfix.field.SettlPartySubID get(
                        quickfix.field.SettlPartySubID value)
                        throws FieldNotFound {
                        getField(value);

                        return value;
                    }

                    public quickfix.field.SettlPartySubID getSettlPartySubID()
                        throws FieldNotFound {
                        quickfix.field.SettlPartySubID value = new quickfix.field.SettlPartySubID();
                        getField(value);

                        return value;
                    }

                    public boolean isSet(quickfix.field.SettlPartySubID field) {
                        return isSetField(field);
                    }

                    public boolean isSetSettlPartySubID() {
                        return isSetField(785);
                    }

                    public void set(quickfix.field.SettlPartySubIDType value) {
                        setField(value);
                    }

                    public quickfix.field.SettlPartySubIDType get(
                        quickfix.field.SettlPartySubIDType value)
                        throws FieldNotFound {
                        getField(value);

                        return value;
                    }

                    public quickfix.field.SettlPartySubIDType getSettlPartySubIDType()
                        throws FieldNotFound {
                        quickfix.field.SettlPartySubIDType value = new quickfix.field.SettlPartySubIDType();
                        getField(value);

                        return value;
                    }

                    public boolean isSet(
                        quickfix.field.SettlPartySubIDType field) {
                        return isSetField(field);
                    }

                    public boolean isSetSettlPartySubIDType() {
                        return isSetField(786);
                    }
                }
            }
        }
    }
}
