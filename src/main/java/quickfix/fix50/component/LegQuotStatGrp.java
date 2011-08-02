package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class LegQuotStatGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 555, };

    public LegQuotStatGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoLegs value) {
        setField(value);
    }

    public quickfix.field.NoLegs get(quickfix.field.NoLegs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
        quickfix.field.NoLegs value = new quickfix.field.NoLegs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoLegs field) {
        return isSetField(field);
    }

    public boolean isSetNoLegs() {
        return isSetField(555);
    }

    public static class NoLegs extends Group {
        static final long serialVersionUID = 20050617;

        public NoLegs() {
            super(555, 600,
                new int[] {
                    600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248,
                    249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612,
                    942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623,
                    624, 556, 740, 739, 955, 956, 999, 1001, 687, 690, 587, 588,
                    683, 539, 685, 0
                });
        }

        public void set(quickfix.fix50.component.InstrumentLeg component) {
            setComponent(component);
        }

        public quickfix.fix50.component.InstrumentLeg get(
            quickfix.fix50.component.InstrumentLeg component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.InstrumentLeg getInstrumentLeg()
            throws FieldNotFound {
            quickfix.fix50.component.InstrumentLeg component = new quickfix.fix50.component.InstrumentLeg();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.LegSymbol value) {
            setField(value);
        }

        public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSymbol getLegSymbol()
            throws FieldNotFound {
            quickfix.field.LegSymbol value = new quickfix.field.LegSymbol();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSymbol field) {
            return isSetField(field);
        }

        public boolean isSetLegSymbol() {
            return isSetField(600);
        }

        public void set(quickfix.field.LegSymbolSfx value) {
            setField(value);
        }

        public quickfix.field.LegSymbolSfx get(
            quickfix.field.LegSymbolSfx value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSymbolSfx getLegSymbolSfx()
            throws FieldNotFound {
            quickfix.field.LegSymbolSfx value = new quickfix.field.LegSymbolSfx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSymbolSfx field) {
            return isSetField(field);
        }

        public boolean isSetLegSymbolSfx() {
            return isSetField(601);
        }

        public void set(quickfix.field.LegSecurityID value) {
            setField(value);
        }

        public quickfix.field.LegSecurityID get(
            quickfix.field.LegSecurityID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecurityID getLegSecurityID()
            throws FieldNotFound {
            quickfix.field.LegSecurityID value = new quickfix.field.LegSecurityID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecurityID field) {
            return isSetField(field);
        }

        public boolean isSetLegSecurityID() {
            return isSetField(602);
        }

        public void set(quickfix.field.LegSecurityIDSource value) {
            setField(value);
        }

        public quickfix.field.LegSecurityIDSource get(
            quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecurityIDSource getLegSecurityIDSource()
            throws FieldNotFound {
            quickfix.field.LegSecurityIDSource value = new quickfix.field.LegSecurityIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecurityIDSource field) {
            return isSetField(field);
        }

        public boolean isSetLegSecurityIDSource() {
            return isSetField(603);
        }

        public void set(quickfix.fix50.component.LegSecAltIDGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.LegSecAltIDGrp get(
            quickfix.fix50.component.LegSecAltIDGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.LegSecAltIDGrp getLegSecAltIDGrp()
            throws FieldNotFound {
            quickfix.fix50.component.LegSecAltIDGrp component = new quickfix.fix50.component.LegSecAltIDGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoLegSecurityAltID value) {
            setField(value);
        }

        public quickfix.field.NoLegSecurityAltID get(
            quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID()
            throws FieldNotFound {
            quickfix.field.NoLegSecurityAltID value = new quickfix.field.NoLegSecurityAltID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
            return isSetField(field);
        }

        public boolean isSetNoLegSecurityAltID() {
            return isSetField(604);
        }

        public void set(quickfix.field.LegProduct value) {
            setField(value);
        }

        public quickfix.field.LegProduct get(quickfix.field.LegProduct value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegProduct getLegProduct()
            throws FieldNotFound {
            quickfix.field.LegProduct value = new quickfix.field.LegProduct();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegProduct field) {
            return isSetField(field);
        }

        public boolean isSetLegProduct() {
            return isSetField(607);
        }

        public void set(quickfix.field.LegCFICode value) {
            setField(value);
        }

        public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCFICode getLegCFICode()
            throws FieldNotFound {
            quickfix.field.LegCFICode value = new quickfix.field.LegCFICode();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCFICode field) {
            return isSetField(field);
        }

        public boolean isSetLegCFICode() {
            return isSetField(608);
        }

        public void set(quickfix.field.LegSecurityType value) {
            setField(value);
        }

        public quickfix.field.LegSecurityType get(
            quickfix.field.LegSecurityType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecurityType getLegSecurityType()
            throws FieldNotFound {
            quickfix.field.LegSecurityType value = new quickfix.field.LegSecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecurityType field) {
            return isSetField(field);
        }

        public boolean isSetLegSecurityType() {
            return isSetField(609);
        }

        public void set(quickfix.field.LegSecuritySubType value) {
            setField(value);
        }

        public quickfix.field.LegSecuritySubType get(
            quickfix.field.LegSecuritySubType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecuritySubType getLegSecuritySubType()
            throws FieldNotFound {
            quickfix.field.LegSecuritySubType value = new quickfix.field.LegSecuritySubType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecuritySubType field) {
            return isSetField(field);
        }

        public boolean isSetLegSecuritySubType() {
            return isSetField(764);
        }

        public void set(quickfix.field.LegMaturityMonthYear value) {
            setField(value);
        }

        public quickfix.field.LegMaturityMonthYear get(
            quickfix.field.LegMaturityMonthYear value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear()
            throws FieldNotFound {
            quickfix.field.LegMaturityMonthYear value = new quickfix.field.LegMaturityMonthYear();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
            return isSetField(field);
        }

        public boolean isSetLegMaturityMonthYear() {
            return isSetField(610);
        }

        public void set(quickfix.field.LegMaturityDate value) {
            setField(value);
        }

        public quickfix.field.LegMaturityDate get(
            quickfix.field.LegMaturityDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegMaturityDate getLegMaturityDate()
            throws FieldNotFound {
            quickfix.field.LegMaturityDate value = new quickfix.field.LegMaturityDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegMaturityDate field) {
            return isSetField(field);
        }

        public boolean isSetLegMaturityDate() {
            return isSetField(611);
        }

        public void set(quickfix.field.LegCouponPaymentDate value) {
            setField(value);
        }

        public quickfix.field.LegCouponPaymentDate get(
            quickfix.field.LegCouponPaymentDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate()
            throws FieldNotFound {
            quickfix.field.LegCouponPaymentDate value = new quickfix.field.LegCouponPaymentDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
            return isSetField(field);
        }

        public boolean isSetLegCouponPaymentDate() {
            return isSetField(248);
        }

        public void set(quickfix.field.LegIssueDate value) {
            setField(value);
        }

        public quickfix.field.LegIssueDate get(
            quickfix.field.LegIssueDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegIssueDate getLegIssueDate()
            throws FieldNotFound {
            quickfix.field.LegIssueDate value = new quickfix.field.LegIssueDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegIssueDate field) {
            return isSetField(field);
        }

        public boolean isSetLegIssueDate() {
            return isSetField(249);
        }

        public void set(quickfix.field.LegRepoCollateralSecurityType value) {
            setField(value);
        }

        public quickfix.field.LegRepoCollateralSecurityType get(
            quickfix.field.LegRepoCollateralSecurityType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType()
            throws FieldNotFound {
            quickfix.field.LegRepoCollateralSecurityType value = new quickfix.field.LegRepoCollateralSecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
            return isSetField(field);
        }

        public boolean isSetLegRepoCollateralSecurityType() {
            return isSetField(250);
        }

        public void set(quickfix.field.LegRepurchaseTerm value) {
            setField(value);
        }

        public quickfix.field.LegRepurchaseTerm get(
            quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm()
            throws FieldNotFound {
            quickfix.field.LegRepurchaseTerm value = new quickfix.field.LegRepurchaseTerm();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
            return isSetField(field);
        }

        public boolean isSetLegRepurchaseTerm() {
            return isSetField(251);
        }

        public void set(quickfix.field.LegRepurchaseRate value) {
            setField(value);
        }

        public quickfix.field.LegRepurchaseRate get(
            quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegRepurchaseRate getLegRepurchaseRate()
            throws FieldNotFound {
            quickfix.field.LegRepurchaseRate value = new quickfix.field.LegRepurchaseRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegRepurchaseRate field) {
            return isSetField(field);
        }

        public boolean isSetLegRepurchaseRate() {
            return isSetField(252);
        }

        public void set(quickfix.field.LegFactor value) {
            setField(value);
        }

        public quickfix.field.LegFactor get(quickfix.field.LegFactor value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegFactor getLegFactor()
            throws FieldNotFound {
            quickfix.field.LegFactor value = new quickfix.field.LegFactor();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegFactor field) {
            return isSetField(field);
        }

        public boolean isSetLegFactor() {
            return isSetField(253);
        }

        public void set(quickfix.field.LegCreditRating value) {
            setField(value);
        }

        public quickfix.field.LegCreditRating get(
            quickfix.field.LegCreditRating value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCreditRating getLegCreditRating()
            throws FieldNotFound {
            quickfix.field.LegCreditRating value = new quickfix.field.LegCreditRating();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCreditRating field) {
            return isSetField(field);
        }

        public boolean isSetLegCreditRating() {
            return isSetField(257);
        }

        public void set(quickfix.field.LegInstrRegistry value) {
            setField(value);
        }

        public quickfix.field.LegInstrRegistry get(
            quickfix.field.LegInstrRegistry value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegInstrRegistry getLegInstrRegistry()
            throws FieldNotFound {
            quickfix.field.LegInstrRegistry value = new quickfix.field.LegInstrRegistry();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegInstrRegistry field) {
            return isSetField(field);
        }

        public boolean isSetLegInstrRegistry() {
            return isSetField(599);
        }

        public void set(quickfix.field.LegCountryOfIssue value) {
            setField(value);
        }

        public quickfix.field.LegCountryOfIssue get(
            quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCountryOfIssue getLegCountryOfIssue()
            throws FieldNotFound {
            quickfix.field.LegCountryOfIssue value = new quickfix.field.LegCountryOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCountryOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetLegCountryOfIssue() {
            return isSetField(596);
        }

        public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
            setField(value);
        }

        public quickfix.field.LegStateOrProvinceOfIssue get(
            quickfix.field.LegStateOrProvinceOfIssue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue()
            throws FieldNotFound {
            quickfix.field.LegStateOrProvinceOfIssue value = new quickfix.field.LegStateOrProvinceOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetLegStateOrProvinceOfIssue() {
            return isSetField(597);
        }

        public void set(quickfix.field.LegLocaleOfIssue value) {
            setField(value);
        }

        public quickfix.field.LegLocaleOfIssue get(
            quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue()
            throws FieldNotFound {
            quickfix.field.LegLocaleOfIssue value = new quickfix.field.LegLocaleOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetLegLocaleOfIssue() {
            return isSetField(598);
        }

        public void set(quickfix.field.LegRedemptionDate value) {
            setField(value);
        }

        public quickfix.field.LegRedemptionDate get(
            quickfix.field.LegRedemptionDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegRedemptionDate getLegRedemptionDate()
            throws FieldNotFound {
            quickfix.field.LegRedemptionDate value = new quickfix.field.LegRedemptionDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegRedemptionDate field) {
            return isSetField(field);
        }

        public boolean isSetLegRedemptionDate() {
            return isSetField(254);
        }

        public void set(quickfix.field.LegStrikePrice value) {
            setField(value);
        }

        public quickfix.field.LegStrikePrice get(
            quickfix.field.LegStrikePrice value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegStrikePrice getLegStrikePrice()
            throws FieldNotFound {
            quickfix.field.LegStrikePrice value = new quickfix.field.LegStrikePrice();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegStrikePrice field) {
            return isSetField(field);
        }

        public boolean isSetLegStrikePrice() {
            return isSetField(612);
        }

        public void set(quickfix.field.LegStrikeCurrency value) {
            setField(value);
        }

        public quickfix.field.LegStrikeCurrency get(
            quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegStrikeCurrency getLegStrikeCurrency()
            throws FieldNotFound {
            quickfix.field.LegStrikeCurrency value = new quickfix.field.LegStrikeCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegStrikeCurrency field) {
            return isSetField(field);
        }

        public boolean isSetLegStrikeCurrency() {
            return isSetField(942);
        }

        public void set(quickfix.field.LegOptAttribute value) {
            setField(value);
        }

        public quickfix.field.LegOptAttribute get(
            quickfix.field.LegOptAttribute value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegOptAttribute getLegOptAttribute()
            throws FieldNotFound {
            quickfix.field.LegOptAttribute value = new quickfix.field.LegOptAttribute();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegOptAttribute field) {
            return isSetField(field);
        }

        public boolean isSetLegOptAttribute() {
            return isSetField(613);
        }

        public void set(quickfix.field.LegContractMultiplier value) {
            setField(value);
        }

        public quickfix.field.LegContractMultiplier get(
            quickfix.field.LegContractMultiplier value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegContractMultiplier getLegContractMultiplier()
            throws FieldNotFound {
            quickfix.field.LegContractMultiplier value = new quickfix.field.LegContractMultiplier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegContractMultiplier field) {
            return isSetField(field);
        }

        public boolean isSetLegContractMultiplier() {
            return isSetField(614);
        }

        public void set(quickfix.field.LegCouponRate value) {
            setField(value);
        }

        public quickfix.field.LegCouponRate get(
            quickfix.field.LegCouponRate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCouponRate getLegCouponRate()
            throws FieldNotFound {
            quickfix.field.LegCouponRate value = new quickfix.field.LegCouponRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCouponRate field) {
            return isSetField(field);
        }

        public boolean isSetLegCouponRate() {
            return isSetField(615);
        }

        public void set(quickfix.field.LegSecurityExchange value) {
            setField(value);
        }

        public quickfix.field.LegSecurityExchange get(
            quickfix.field.LegSecurityExchange value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecurityExchange getLegSecurityExchange()
            throws FieldNotFound {
            quickfix.field.LegSecurityExchange value = new quickfix.field.LegSecurityExchange();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecurityExchange field) {
            return isSetField(field);
        }

        public boolean isSetLegSecurityExchange() {
            return isSetField(616);
        }

        public void set(quickfix.field.LegIssuer value) {
            setField(value);
        }

        public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegIssuer getLegIssuer()
            throws FieldNotFound {
            quickfix.field.LegIssuer value = new quickfix.field.LegIssuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegIssuer field) {
            return isSetField(field);
        }

        public boolean isSetLegIssuer() {
            return isSetField(617);
        }

        public void set(quickfix.field.EncodedLegIssuerLen value) {
            setField(value);
        }

        public quickfix.field.EncodedLegIssuerLen get(
            quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen()
            throws FieldNotFound {
            quickfix.field.EncodedLegIssuerLen value = new quickfix.field.EncodedLegIssuerLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedLegIssuerLen() {
            return isSetField(618);
        }

        public void set(quickfix.field.EncodedLegIssuer value) {
            setField(value);
        }

        public quickfix.field.EncodedLegIssuer get(
            quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedLegIssuer getEncodedLegIssuer()
            throws FieldNotFound {
            quickfix.field.EncodedLegIssuer value = new quickfix.field.EncodedLegIssuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedLegIssuer field) {
            return isSetField(field);
        }

        public boolean isSetEncodedLegIssuer() {
            return isSetField(619);
        }

        public void set(quickfix.field.LegSecurityDesc value) {
            setField(value);
        }

        public quickfix.field.LegSecurityDesc get(
            quickfix.field.LegSecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSecurityDesc getLegSecurityDesc()
            throws FieldNotFound {
            quickfix.field.LegSecurityDesc value = new quickfix.field.LegSecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetLegSecurityDesc() {
            return isSetField(620);
        }

        public void set(quickfix.field.EncodedLegSecurityDescLen value) {
            setField(value);
        }

        public quickfix.field.EncodedLegSecurityDescLen get(
            quickfix.field.EncodedLegSecurityDescLen value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen()
            throws FieldNotFound {
            quickfix.field.EncodedLegSecurityDescLen value = new quickfix.field.EncodedLegSecurityDescLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedLegSecurityDescLen() {
            return isSetField(621);
        }

        public void set(quickfix.field.EncodedLegSecurityDesc value) {
            setField(value);
        }

        public quickfix.field.EncodedLegSecurityDesc get(
            quickfix.field.EncodedLegSecurityDesc value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc()
            throws FieldNotFound {
            quickfix.field.EncodedLegSecurityDesc value = new quickfix.field.EncodedLegSecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetEncodedLegSecurityDesc() {
            return isSetField(622);
        }

        public void set(quickfix.field.LegRatioQty value) {
            setField(value);
        }

        public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegRatioQty getLegRatioQty()
            throws FieldNotFound {
            quickfix.field.LegRatioQty value = new quickfix.field.LegRatioQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegRatioQty field) {
            return isSetField(field);
        }

        public boolean isSetLegRatioQty() {
            return isSetField(623);
        }

        public void set(quickfix.field.LegSide value) {
            setField(value);
        }

        public quickfix.field.LegSide get(quickfix.field.LegSide value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSide getLegSide() throws FieldNotFound {
            quickfix.field.LegSide value = new quickfix.field.LegSide();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSide field) {
            return isSetField(field);
        }

        public boolean isSetLegSide() {
            return isSetField(624);
        }

        public void set(quickfix.field.LegCurrency value) {
            setField(value);
        }

        public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegCurrency getLegCurrency()
            throws FieldNotFound {
            quickfix.field.LegCurrency value = new quickfix.field.LegCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegCurrency field) {
            return isSetField(field);
        }

        public boolean isSetLegCurrency() {
            return isSetField(556);
        }

        public void set(quickfix.field.LegPool value) {
            setField(value);
        }

        public quickfix.field.LegPool get(quickfix.field.LegPool value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegPool getLegPool() throws FieldNotFound {
            quickfix.field.LegPool value = new quickfix.field.LegPool();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegPool field) {
            return isSetField(field);
        }

        public boolean isSetLegPool() {
            return isSetField(740);
        }

        public void set(quickfix.field.LegDatedDate value) {
            setField(value);
        }

        public quickfix.field.LegDatedDate get(
            quickfix.field.LegDatedDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegDatedDate getLegDatedDate()
            throws FieldNotFound {
            quickfix.field.LegDatedDate value = new quickfix.field.LegDatedDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegDatedDate field) {
            return isSetField(field);
        }

        public boolean isSetLegDatedDate() {
            return isSetField(739);
        }

        public void set(quickfix.field.LegContractSettlMonth value) {
            setField(value);
        }

        public quickfix.field.LegContractSettlMonth get(
            quickfix.field.LegContractSettlMonth value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegContractSettlMonth getLegContractSettlMonth()
            throws FieldNotFound {
            quickfix.field.LegContractSettlMonth value = new quickfix.field.LegContractSettlMonth();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegContractSettlMonth field) {
            return isSetField(field);
        }

        public boolean isSetLegContractSettlMonth() {
            return isSetField(955);
        }

        public void set(quickfix.field.LegInterestAccrualDate value) {
            setField(value);
        }

        public quickfix.field.LegInterestAccrualDate get(
            quickfix.field.LegInterestAccrualDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate()
            throws FieldNotFound {
            quickfix.field.LegInterestAccrualDate value = new quickfix.field.LegInterestAccrualDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
            return isSetField(field);
        }

        public boolean isSetLegInterestAccrualDate() {
            return isSetField(956);
        }

        public void set(quickfix.field.LegUnitofMeasure value) {
            setField(value);
        }

        public quickfix.field.LegUnitofMeasure get(
            quickfix.field.LegUnitofMeasure value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegUnitofMeasure getLegUnitofMeasure()
            throws FieldNotFound {
            quickfix.field.LegUnitofMeasure value = new quickfix.field.LegUnitofMeasure();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegUnitofMeasure field) {
            return isSetField(field);
        }

        public boolean isSetLegUnitofMeasure() {
            return isSetField(999);
        }

        public void set(quickfix.field.LegTimeUnit value) {
            setField(value);
        }

        public quickfix.field.LegTimeUnit get(quickfix.field.LegTimeUnit value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegTimeUnit getLegTimeUnit()
            throws FieldNotFound {
            quickfix.field.LegTimeUnit value = new quickfix.field.LegTimeUnit();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegTimeUnit field) {
            return isSetField(field);
        }

        public boolean isSetLegTimeUnit() {
            return isSetField(1001);
        }

        public void set(quickfix.field.LegQty value) {
            setField(value);
        }

        public quickfix.field.LegQty get(quickfix.field.LegQty value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegQty getLegQty() throws FieldNotFound {
            quickfix.field.LegQty value = new quickfix.field.LegQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegQty field) {
            return isSetField(field);
        }

        public boolean isSetLegQty() {
            return isSetField(687);
        }

        public void set(quickfix.field.LegSwapType value) {
            setField(value);
        }

        public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSwapType getLegSwapType()
            throws FieldNotFound {
            quickfix.field.LegSwapType value = new quickfix.field.LegSwapType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSwapType field) {
            return isSetField(field);
        }

        public boolean isSetLegSwapType() {
            return isSetField(690);
        }

        public void set(quickfix.field.LegSettlType value) {
            setField(value);
        }

        public quickfix.field.LegSettlType get(
            quickfix.field.LegSettlType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSettlType getLegSettlType()
            throws FieldNotFound {
            quickfix.field.LegSettlType value = new quickfix.field.LegSettlType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSettlType field) {
            return isSetField(field);
        }

        public boolean isSetLegSettlType() {
            return isSetField(587);
        }

        public void set(quickfix.field.LegSettlDate value) {
            setField(value);
        }

        public quickfix.field.LegSettlDate get(
            quickfix.field.LegSettlDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegSettlDate getLegSettlDate()
            throws FieldNotFound {
            quickfix.field.LegSettlDate value = new quickfix.field.LegSettlDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegSettlDate field) {
            return isSetField(field);
        }

        public boolean isSetLegSettlDate() {
            return isSetField(588);
        }

        public void set(quickfix.fix50.component.LegStipulations component) {
            setComponent(component);
        }

        public quickfix.fix50.component.LegStipulations get(
            quickfix.fix50.component.LegStipulations component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.LegStipulations getLegStipulations()
            throws FieldNotFound {
            quickfix.fix50.component.LegStipulations component = new quickfix.fix50.component.LegStipulations();
            getComponent(component);

            return component;
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

        public void set(quickfix.field.LegOrderQty value) {
            setField(value);
        }

        public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LegOrderQty getLegOrderQty()
            throws FieldNotFound {
            quickfix.field.LegOrderQty value = new quickfix.field.LegOrderQty();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LegOrderQty field) {
            return isSetField(field);
        }

        public boolean isSetLegOrderQty() {
            return isSetField(685);
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
                quickfix.field.LegStipulationType value)
                throws FieldNotFound {
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
                quickfix.field.LegStipulationValue value)
                throws FieldNotFound {
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
