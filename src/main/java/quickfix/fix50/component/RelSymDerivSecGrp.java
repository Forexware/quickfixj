package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class RelSymDerivSecGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 146, };

    public RelSymDerivSecGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoRelatedSym value) {
        setField(value);
    }

    public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoRelatedSym getNoRelatedSym()
        throws FieldNotFound {
        quickfix.field.NoRelatedSym value = new quickfix.field.NoRelatedSym();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoRelatedSym field) {
        return isSetField(field);
    }

    public boolean isSetNoRelatedSym() {
        return isSetField(146);
    }

    public static class NoRelatedSym extends Group {
        static final long serialVersionUID = 20050617;

        public NoRelatedSym() {
            super(146, 55,
                new int[] {
                    55, 65, 48, 22, 454, 460, 461, 167, 762, 200, 541, 224, 225,
                    239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947,
                    206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667,
                    875, 876, 864, 873, 874, 965, 966, 1049, 967, 968, 969, 970,
                    971, 1018, 996, 997, 1079, 15, 827, 668, 869, 870, 555, 336,
                    625, 58, 354, 355, 0
                });
        }

        public void set(quickfix.fix50.component.Instrument component) {
            setComponent(component);
        }

        public quickfix.fix50.component.Instrument get(
            quickfix.fix50.component.Instrument component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.Instrument getInstrument()
            throws FieldNotFound {
            quickfix.fix50.component.Instrument component = new quickfix.fix50.component.Instrument();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.Symbol value) {
            setField(value);
        }

        public quickfix.field.Symbol get(quickfix.field.Symbol value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Symbol getSymbol() throws FieldNotFound {
            quickfix.field.Symbol value = new quickfix.field.Symbol();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Symbol field) {
            return isSetField(field);
        }

        public boolean isSetSymbol() {
            return isSetField(55);
        }

        public void set(quickfix.field.SymbolSfx value) {
            setField(value);
        }

        public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SymbolSfx getSymbolSfx()
            throws FieldNotFound {
            quickfix.field.SymbolSfx value = new quickfix.field.SymbolSfx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SymbolSfx field) {
            return isSetField(field);
        }

        public boolean isSetSymbolSfx() {
            return isSetField(65);
        }

        public void set(quickfix.field.SecurityID value) {
            setField(value);
        }

        public quickfix.field.SecurityID get(quickfix.field.SecurityID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityID getSecurityID()
            throws FieldNotFound {
            quickfix.field.SecurityID value = new quickfix.field.SecurityID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityID field) {
            return isSetField(field);
        }

        public boolean isSetSecurityID() {
            return isSetField(48);
        }

        public void set(quickfix.field.SecurityIDSource value) {
            setField(value);
        }

        public quickfix.field.SecurityIDSource get(
            quickfix.field.SecurityIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityIDSource getSecurityIDSource()
            throws FieldNotFound {
            quickfix.field.SecurityIDSource value = new quickfix.field.SecurityIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityIDSource field) {
            return isSetField(field);
        }

        public boolean isSetSecurityIDSource() {
            return isSetField(22);
        }

        public void set(quickfix.fix50.component.SecAltIDGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.SecAltIDGrp get(
            quickfix.fix50.component.SecAltIDGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.SecAltIDGrp getSecAltIDGrp()
            throws FieldNotFound {
            quickfix.fix50.component.SecAltIDGrp component = new quickfix.fix50.component.SecAltIDGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoSecurityAltID value) {
            setField(value);
        }

        public quickfix.field.NoSecurityAltID get(
            quickfix.field.NoSecurityAltID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoSecurityAltID getNoSecurityAltID()
            throws FieldNotFound {
            quickfix.field.NoSecurityAltID value = new quickfix.field.NoSecurityAltID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoSecurityAltID field) {
            return isSetField(field);
        }

        public boolean isSetNoSecurityAltID() {
            return isSetField(454);
        }

        public void set(quickfix.field.Product value) {
            setField(value);
        }

        public quickfix.field.Product get(quickfix.field.Product value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Product getProduct() throws FieldNotFound {
            quickfix.field.Product value = new quickfix.field.Product();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Product field) {
            return isSetField(field);
        }

        public boolean isSetProduct() {
            return isSetField(460);
        }

        public void set(quickfix.field.CFICode value) {
            setField(value);
        }

        public quickfix.field.CFICode get(quickfix.field.CFICode value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CFICode getCFICode() throws FieldNotFound {
            quickfix.field.CFICode value = new quickfix.field.CFICode();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CFICode field) {
            return isSetField(field);
        }

        public boolean isSetCFICode() {
            return isSetField(461);
        }

        public void set(quickfix.field.SecurityType value) {
            setField(value);
        }

        public quickfix.field.SecurityType get(
            quickfix.field.SecurityType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityType getSecurityType()
            throws FieldNotFound {
            quickfix.field.SecurityType value = new quickfix.field.SecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityType field) {
            return isSetField(field);
        }

        public boolean isSetSecurityType() {
            return isSetField(167);
        }

        public void set(quickfix.field.SecuritySubType value) {
            setField(value);
        }

        public quickfix.field.SecuritySubType get(
            quickfix.field.SecuritySubType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecuritySubType getSecuritySubType()
            throws FieldNotFound {
            quickfix.field.SecuritySubType value = new quickfix.field.SecuritySubType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecuritySubType field) {
            return isSetField(field);
        }

        public boolean isSetSecuritySubType() {
            return isSetField(762);
        }

        public void set(quickfix.field.MaturityMonthYear value) {
            setField(value);
        }

        public quickfix.field.MaturityMonthYear get(
            quickfix.field.MaturityMonthYear value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityMonthYear getMaturityMonthYear()
            throws FieldNotFound {
            quickfix.field.MaturityMonthYear value = new quickfix.field.MaturityMonthYear();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityMonthYear field) {
            return isSetField(field);
        }

        public boolean isSetMaturityMonthYear() {
            return isSetField(200);
        }

        public void set(quickfix.field.MaturityDate value) {
            setField(value);
        }

        public quickfix.field.MaturityDate get(
            quickfix.field.MaturityDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityDate getMaturityDate()
            throws FieldNotFound {
            quickfix.field.MaturityDate value = new quickfix.field.MaturityDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityDate field) {
            return isSetField(field);
        }

        public boolean isSetMaturityDate() {
            return isSetField(541);
        }

        public void set(quickfix.field.CouponPaymentDate value) {
            setField(value);
        }

        public quickfix.field.CouponPaymentDate get(
            quickfix.field.CouponPaymentDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CouponPaymentDate getCouponPaymentDate()
            throws FieldNotFound {
            quickfix.field.CouponPaymentDate value = new quickfix.field.CouponPaymentDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CouponPaymentDate field) {
            return isSetField(field);
        }

        public boolean isSetCouponPaymentDate() {
            return isSetField(224);
        }

        public void set(quickfix.field.IssueDate value) {
            setField(value);
        }

        public quickfix.field.IssueDate get(quickfix.field.IssueDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IssueDate getIssueDate()
            throws FieldNotFound {
            quickfix.field.IssueDate value = new quickfix.field.IssueDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IssueDate field) {
            return isSetField(field);
        }

        public boolean isSetIssueDate() {
            return isSetField(225);
        }

        public void set(quickfix.field.RepoCollateralSecurityType value) {
            setField(value);
        }

        public quickfix.field.RepoCollateralSecurityType get(
            quickfix.field.RepoCollateralSecurityType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType()
            throws FieldNotFound {
            quickfix.field.RepoCollateralSecurityType value = new quickfix.field.RepoCollateralSecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
            return isSetField(field);
        }

        public boolean isSetRepoCollateralSecurityType() {
            return isSetField(239);
        }

        public void set(quickfix.field.RepurchaseTerm value) {
            setField(value);
        }

        public quickfix.field.RepurchaseTerm get(
            quickfix.field.RepurchaseTerm value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepurchaseTerm getRepurchaseTerm()
            throws FieldNotFound {
            quickfix.field.RepurchaseTerm value = new quickfix.field.RepurchaseTerm();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepurchaseTerm field) {
            return isSetField(field);
        }

        public boolean isSetRepurchaseTerm() {
            return isSetField(226);
        }

        public void set(quickfix.field.RepurchaseRate value) {
            setField(value);
        }

        public quickfix.field.RepurchaseRate get(
            quickfix.field.RepurchaseRate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepurchaseRate getRepurchaseRate()
            throws FieldNotFound {
            quickfix.field.RepurchaseRate value = new quickfix.field.RepurchaseRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepurchaseRate field) {
            return isSetField(field);
        }

        public boolean isSetRepurchaseRate() {
            return isSetField(227);
        }

        public void set(quickfix.field.Factor value) {
            setField(value);
        }

        public quickfix.field.Factor get(quickfix.field.Factor value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Factor getFactor() throws FieldNotFound {
            quickfix.field.Factor value = new quickfix.field.Factor();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Factor field) {
            return isSetField(field);
        }

        public boolean isSetFactor() {
            return isSetField(228);
        }

        public void set(quickfix.field.CreditRating value) {
            setField(value);
        }

        public quickfix.field.CreditRating get(
            quickfix.field.CreditRating value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CreditRating getCreditRating()
            throws FieldNotFound {
            quickfix.field.CreditRating value = new quickfix.field.CreditRating();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CreditRating field) {
            return isSetField(field);
        }

        public boolean isSetCreditRating() {
            return isSetField(255);
        }

        public void set(quickfix.field.InstrRegistry value) {
            setField(value);
        }

        public quickfix.field.InstrRegistry get(
            quickfix.field.InstrRegistry value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrRegistry getInstrRegistry()
            throws FieldNotFound {
            quickfix.field.InstrRegistry value = new quickfix.field.InstrRegistry();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrRegistry field) {
            return isSetField(field);
        }

        public boolean isSetInstrRegistry() {
            return isSetField(543);
        }

        public void set(quickfix.field.CountryOfIssue value) {
            setField(value);
        }

        public quickfix.field.CountryOfIssue get(
            quickfix.field.CountryOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CountryOfIssue getCountryOfIssue()
            throws FieldNotFound {
            quickfix.field.CountryOfIssue value = new quickfix.field.CountryOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CountryOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetCountryOfIssue() {
            return isSetField(470);
        }

        public void set(quickfix.field.StateOrProvinceOfIssue value) {
            setField(value);
        }

        public quickfix.field.StateOrProvinceOfIssue get(
            quickfix.field.StateOrProvinceOfIssue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue()
            throws FieldNotFound {
            quickfix.field.StateOrProvinceOfIssue value = new quickfix.field.StateOrProvinceOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetStateOrProvinceOfIssue() {
            return isSetField(471);
        }

        public void set(quickfix.field.LocaleOfIssue value) {
            setField(value);
        }

        public quickfix.field.LocaleOfIssue get(
            quickfix.field.LocaleOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LocaleOfIssue getLocaleOfIssue()
            throws FieldNotFound {
            quickfix.field.LocaleOfIssue value = new quickfix.field.LocaleOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LocaleOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetLocaleOfIssue() {
            return isSetField(472);
        }

        public void set(quickfix.field.RedemptionDate value) {
            setField(value);
        }

        public quickfix.field.RedemptionDate get(
            quickfix.field.RedemptionDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RedemptionDate getRedemptionDate()
            throws FieldNotFound {
            quickfix.field.RedemptionDate value = new quickfix.field.RedemptionDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RedemptionDate field) {
            return isSetField(field);
        }

        public boolean isSetRedemptionDate() {
            return isSetField(240);
        }

        public void set(quickfix.field.StrikePrice value) {
            setField(value);
        }

        public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikePrice getStrikePrice()
            throws FieldNotFound {
            quickfix.field.StrikePrice value = new quickfix.field.StrikePrice();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikePrice field) {
            return isSetField(field);
        }

        public boolean isSetStrikePrice() {
            return isSetField(202);
        }

        public void set(quickfix.field.StrikeCurrency value) {
            setField(value);
        }

        public quickfix.field.StrikeCurrency get(
            quickfix.field.StrikeCurrency value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikeCurrency getStrikeCurrency()
            throws FieldNotFound {
            quickfix.field.StrikeCurrency value = new quickfix.field.StrikeCurrency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikeCurrency field) {
            return isSetField(field);
        }

        public boolean isSetStrikeCurrency() {
            return isSetField(947);
        }

        public void set(quickfix.field.OptAttribute value) {
            setField(value);
        }

        public quickfix.field.OptAttribute get(
            quickfix.field.OptAttribute value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OptAttribute getOptAttribute()
            throws FieldNotFound {
            quickfix.field.OptAttribute value = new quickfix.field.OptAttribute();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OptAttribute field) {
            return isSetField(field);
        }

        public boolean isSetOptAttribute() {
            return isSetField(206);
        }

        public void set(quickfix.field.ContractMultiplier value) {
            setField(value);
        }

        public quickfix.field.ContractMultiplier get(
            quickfix.field.ContractMultiplier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContractMultiplier getContractMultiplier()
            throws FieldNotFound {
            quickfix.field.ContractMultiplier value = new quickfix.field.ContractMultiplier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContractMultiplier field) {
            return isSetField(field);
        }

        public boolean isSetContractMultiplier() {
            return isSetField(231);
        }

        public void set(quickfix.field.CouponRate value) {
            setField(value);
        }

        public quickfix.field.CouponRate get(quickfix.field.CouponRate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CouponRate getCouponRate()
            throws FieldNotFound {
            quickfix.field.CouponRate value = new quickfix.field.CouponRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CouponRate field) {
            return isSetField(field);
        }

        public boolean isSetCouponRate() {
            return isSetField(223);
        }

        public void set(quickfix.field.SecurityExchange value) {
            setField(value);
        }

        public quickfix.field.SecurityExchange get(
            quickfix.field.SecurityExchange value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityExchange getSecurityExchange()
            throws FieldNotFound {
            quickfix.field.SecurityExchange value = new quickfix.field.SecurityExchange();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityExchange field) {
            return isSetField(field);
        }

        public boolean isSetSecurityExchange() {
            return isSetField(207);
        }

        public void set(quickfix.field.Issuer value) {
            setField(value);
        }

        public quickfix.field.Issuer get(quickfix.field.Issuer value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Issuer getIssuer() throws FieldNotFound {
            quickfix.field.Issuer value = new quickfix.field.Issuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Issuer field) {
            return isSetField(field);
        }

        public boolean isSetIssuer() {
            return isSetField(106);
        }

        public void set(quickfix.field.EncodedIssuerLen value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuerLen get(
            quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuerLen getEncodedIssuerLen()
            throws FieldNotFound {
            quickfix.field.EncodedIssuerLen value = new quickfix.field.EncodedIssuerLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuerLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuerLen() {
            return isSetField(348);
        }

        public void set(quickfix.field.EncodedIssuer value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuer get(
            quickfix.field.EncodedIssuer value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuer getEncodedIssuer()
            throws FieldNotFound {
            quickfix.field.EncodedIssuer value = new quickfix.field.EncodedIssuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuer field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuer() {
            return isSetField(349);
        }

        public void set(quickfix.field.SecurityDesc value) {
            setField(value);
        }

        public quickfix.field.SecurityDesc get(
            quickfix.field.SecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityDesc getSecurityDesc()
            throws FieldNotFound {
            quickfix.field.SecurityDesc value = new quickfix.field.SecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetSecurityDesc() {
            return isSetField(107);
        }

        public void set(quickfix.field.EncodedSecurityDescLen value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDescLen get(
            quickfix.field.EncodedSecurityDescLen value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDescLen value = new quickfix.field.EncodedSecurityDescLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDescLen() {
            return isSetField(350);
        }

        public void set(quickfix.field.EncodedSecurityDesc value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDesc get(
            quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDesc value = new quickfix.field.EncodedSecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDesc() {
            return isSetField(351);
        }

        public void set(quickfix.field.Pool value) {
            setField(value);
        }

        public quickfix.field.Pool get(quickfix.field.Pool value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Pool getPool() throws FieldNotFound {
            quickfix.field.Pool value = new quickfix.field.Pool();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Pool field) {
            return isSetField(field);
        }

        public boolean isSetPool() {
            return isSetField(691);
        }

        public void set(quickfix.field.ContractSettlMonth value) {
            setField(value);
        }

        public quickfix.field.ContractSettlMonth get(
            quickfix.field.ContractSettlMonth value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContractSettlMonth getContractSettlMonth()
            throws FieldNotFound {
            quickfix.field.ContractSettlMonth value = new quickfix.field.ContractSettlMonth();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContractSettlMonth field) {
            return isSetField(field);
        }

        public boolean isSetContractSettlMonth() {
            return isSetField(667);
        }

        public void set(quickfix.field.CPProgram value) {
            setField(value);
        }

        public quickfix.field.CPProgram get(quickfix.field.CPProgram value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CPProgram getCPProgram()
            throws FieldNotFound {
            quickfix.field.CPProgram value = new quickfix.field.CPProgram();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CPProgram field) {
            return isSetField(field);
        }

        public boolean isSetCPProgram() {
            return isSetField(875);
        }

        public void set(quickfix.field.CPRegType value) {
            setField(value);
        }

        public quickfix.field.CPRegType get(quickfix.field.CPRegType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CPRegType getCPRegType()
            throws FieldNotFound {
            quickfix.field.CPRegType value = new quickfix.field.CPRegType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CPRegType field) {
            return isSetField(field);
        }

        public boolean isSetCPRegType() {
            return isSetField(876);
        }

        public void set(quickfix.fix50.component.EvntGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.EvntGrp get(
            quickfix.fix50.component.EvntGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.EvntGrp getEvntGrp()
            throws FieldNotFound {
            quickfix.fix50.component.EvntGrp component = new quickfix.fix50.component.EvntGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoEvents value) {
            setField(value);
        }

        public quickfix.field.NoEvents get(quickfix.field.NoEvents value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
            quickfix.field.NoEvents value = new quickfix.field.NoEvents();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoEvents field) {
            return isSetField(field);
        }

        public boolean isSetNoEvents() {
            return isSetField(864);
        }

        public void set(quickfix.field.DatedDate value) {
            setField(value);
        }

        public quickfix.field.DatedDate get(quickfix.field.DatedDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DatedDate getDatedDate()
            throws FieldNotFound {
            quickfix.field.DatedDate value = new quickfix.field.DatedDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DatedDate field) {
            return isSetField(field);
        }

        public boolean isSetDatedDate() {
            return isSetField(873);
        }

        public void set(quickfix.field.InterestAccrualDate value) {
            setField(value);
        }

        public quickfix.field.InterestAccrualDate get(
            quickfix.field.InterestAccrualDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InterestAccrualDate getInterestAccrualDate()
            throws FieldNotFound {
            quickfix.field.InterestAccrualDate value = new quickfix.field.InterestAccrualDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InterestAccrualDate field) {
            return isSetField(field);
        }

        public boolean isSetInterestAccrualDate() {
            return isSetField(874);
        }

        public void set(quickfix.field.SecurityStatus value) {
            setField(value);
        }

        public quickfix.field.SecurityStatus get(
            quickfix.field.SecurityStatus value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityStatus getSecurityStatus()
            throws FieldNotFound {
            quickfix.field.SecurityStatus value = new quickfix.field.SecurityStatus();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityStatus field) {
            return isSetField(field);
        }

        public boolean isSetSecurityStatus() {
            return isSetField(965);
        }

        public void set(quickfix.field.SettleOnOpenFlag value) {
            setField(value);
        }

        public quickfix.field.SettleOnOpenFlag get(
            quickfix.field.SettleOnOpenFlag value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettleOnOpenFlag getSettleOnOpenFlag()
            throws FieldNotFound {
            quickfix.field.SettleOnOpenFlag value = new quickfix.field.SettleOnOpenFlag();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettleOnOpenFlag field) {
            return isSetField(field);
        }

        public boolean isSetSettleOnOpenFlag() {
            return isSetField(966);
        }

        public void set(quickfix.field.InstrmtAssignmentMethod value) {
            setField(value);
        }

        public quickfix.field.InstrmtAssignmentMethod get(
            quickfix.field.InstrmtAssignmentMethod value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrmtAssignmentMethod getInstrmtAssignmentMethod()
            throws FieldNotFound {
            quickfix.field.InstrmtAssignmentMethod value = new quickfix.field.InstrmtAssignmentMethod();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrmtAssignmentMethod field) {
            return isSetField(field);
        }

        public boolean isSetInstrmtAssignmentMethod() {
            return isSetField(1049);
        }

        public void set(quickfix.field.StrikeMultiplier value) {
            setField(value);
        }

        public quickfix.field.StrikeMultiplier get(
            quickfix.field.StrikeMultiplier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikeMultiplier getStrikeMultiplier()
            throws FieldNotFound {
            quickfix.field.StrikeMultiplier value = new quickfix.field.StrikeMultiplier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikeMultiplier field) {
            return isSetField(field);
        }

        public boolean isSetStrikeMultiplier() {
            return isSetField(967);
        }

        public void set(quickfix.field.StrikeValue value) {
            setField(value);
        }

        public quickfix.field.StrikeValue get(quickfix.field.StrikeValue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikeValue getStrikeValue()
            throws FieldNotFound {
            quickfix.field.StrikeValue value = new quickfix.field.StrikeValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikeValue field) {
            return isSetField(field);
        }

        public boolean isSetStrikeValue() {
            return isSetField(968);
        }

        public void set(quickfix.field.MinPriceIncrement value) {
            setField(value);
        }

        public quickfix.field.MinPriceIncrement get(
            quickfix.field.MinPriceIncrement value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MinPriceIncrement getMinPriceIncrement()
            throws FieldNotFound {
            quickfix.field.MinPriceIncrement value = new quickfix.field.MinPriceIncrement();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MinPriceIncrement field) {
            return isSetField(field);
        }

        public boolean isSetMinPriceIncrement() {
            return isSetField(969);
        }

        public void set(quickfix.field.PositionLimit value) {
            setField(value);
        }

        public quickfix.field.PositionLimit get(
            quickfix.field.PositionLimit value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PositionLimit getPositionLimit()
            throws FieldNotFound {
            quickfix.field.PositionLimit value = new quickfix.field.PositionLimit();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PositionLimit field) {
            return isSetField(field);
        }

        public boolean isSetPositionLimit() {
            return isSetField(970);
        }

        public void set(quickfix.field.NTPositionLimit value) {
            setField(value);
        }

        public quickfix.field.NTPositionLimit get(
            quickfix.field.NTPositionLimit value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NTPositionLimit getNTPositionLimit()
            throws FieldNotFound {
            quickfix.field.NTPositionLimit value = new quickfix.field.NTPositionLimit();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NTPositionLimit field) {
            return isSetField(field);
        }

        public boolean isSetNTPositionLimit() {
            return isSetField(971);
        }

        public void set(quickfix.fix50.component.InstrumentParties component) {
            setComponent(component);
        }

        public quickfix.fix50.component.InstrumentParties get(
            quickfix.fix50.component.InstrumentParties component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.InstrumentParties getInstrumentParties()
            throws FieldNotFound {
            quickfix.fix50.component.InstrumentParties component = new quickfix.fix50.component.InstrumentParties();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoInstrumentParties value) {
            setField(value);
        }

        public quickfix.field.NoInstrumentParties get(
            quickfix.field.NoInstrumentParties value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoInstrumentParties getNoInstrumentParties()
            throws FieldNotFound {
            quickfix.field.NoInstrumentParties value = new quickfix.field.NoInstrumentParties();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoInstrumentParties field) {
            return isSetField(field);
        }

        public boolean isSetNoInstrumentParties() {
            return isSetField(1018);
        }

        public void set(quickfix.field.UnitofMeasure value) {
            setField(value);
        }

        public quickfix.field.UnitofMeasure get(
            quickfix.field.UnitofMeasure value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.UnitofMeasure getUnitofMeasure()
            throws FieldNotFound {
            quickfix.field.UnitofMeasure value = new quickfix.field.UnitofMeasure();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.UnitofMeasure field) {
            return isSetField(field);
        }

        public boolean isSetUnitofMeasure() {
            return isSetField(996);
        }

        public void set(quickfix.field.TimeUnit value) {
            setField(value);
        }

        public quickfix.field.TimeUnit get(quickfix.field.TimeUnit value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.TimeUnit getTimeUnit() throws FieldNotFound {
            quickfix.field.TimeUnit value = new quickfix.field.TimeUnit();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.TimeUnit field) {
            return isSetField(field);
        }

        public boolean isSetTimeUnit() {
            return isSetField(997);
        }

        public void set(quickfix.field.MaturityTime value) {
            setField(value);
        }

        public quickfix.field.MaturityTime get(
            quickfix.field.MaturityTime value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityTime getMaturityTime()
            throws FieldNotFound {
            quickfix.field.MaturityTime value = new quickfix.field.MaturityTime();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityTime field) {
            return isSetField(field);
        }

        public boolean isSetMaturityTime() {
            return isSetField(1079);
        }

        public void set(quickfix.field.Currency value) {
            setField(value);
        }

        public quickfix.field.Currency get(quickfix.field.Currency value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Currency getCurrency() throws FieldNotFound {
            quickfix.field.Currency value = new quickfix.field.Currency();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Currency field) {
            return isSetField(field);
        }

        public boolean isSetCurrency() {
            return isSetField(15);
        }

        public void set(quickfix.field.ExpirationCycle value) {
            setField(value);
        }

        public quickfix.field.ExpirationCycle get(
            quickfix.field.ExpirationCycle value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ExpirationCycle getExpirationCycle()
            throws FieldNotFound {
            quickfix.field.ExpirationCycle value = new quickfix.field.ExpirationCycle();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ExpirationCycle field) {
            return isSetField(field);
        }

        public boolean isSetExpirationCycle() {
            return isSetField(827);
        }

        public void set(quickfix.fix50.component.InstrumentExtension component) {
            setComponent(component);
        }

        public quickfix.fix50.component.InstrumentExtension get(
            quickfix.fix50.component.InstrumentExtension component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.InstrumentExtension getInstrumentExtension()
            throws FieldNotFound {
            quickfix.fix50.component.InstrumentExtension component = new quickfix.fix50.component.InstrumentExtension();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.DeliveryForm value) {
            setField(value);
        }

        public quickfix.field.DeliveryForm get(
            quickfix.field.DeliveryForm value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DeliveryForm getDeliveryForm()
            throws FieldNotFound {
            quickfix.field.DeliveryForm value = new quickfix.field.DeliveryForm();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DeliveryForm field) {
            return isSetField(field);
        }

        public boolean isSetDeliveryForm() {
            return isSetField(668);
        }

        public void set(quickfix.field.PctAtRisk value) {
            setField(value);
        }

        public quickfix.field.PctAtRisk get(quickfix.field.PctAtRisk value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PctAtRisk getPctAtRisk()
            throws FieldNotFound {
            quickfix.field.PctAtRisk value = new quickfix.field.PctAtRisk();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PctAtRisk field) {
            return isSetField(field);
        }

        public boolean isSetPctAtRisk() {
            return isSetField(869);
        }

        public void set(quickfix.fix50.component.AttrbGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.AttrbGrp get(
            quickfix.fix50.component.AttrbGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.AttrbGrp getAttrbGrp()
            throws FieldNotFound {
            quickfix.fix50.component.AttrbGrp component = new quickfix.fix50.component.AttrbGrp();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoInstrAttrib value) {
            setField(value);
        }

        public quickfix.field.NoInstrAttrib get(
            quickfix.field.NoInstrAttrib value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoInstrAttrib getNoInstrAttrib()
            throws FieldNotFound {
            quickfix.field.NoInstrAttrib value = new quickfix.field.NoInstrAttrib();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoInstrAttrib field) {
            return isSetField(field);
        }

        public boolean isSetNoInstrAttrib() {
            return isSetField(870);
        }

        public void set(quickfix.fix50.component.InstrmtLegGrp component) {
            setComponent(component);
        }

        public quickfix.fix50.component.InstrmtLegGrp get(
            quickfix.fix50.component.InstrmtLegGrp component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix50.component.InstrmtLegGrp getInstrmtLegGrp()
            throws FieldNotFound {
            quickfix.fix50.component.InstrmtLegGrp component = new quickfix.fix50.component.InstrmtLegGrp();
            getComponent(component);

            return component;
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

        public void set(quickfix.field.TradingSessionID value) {
            setField(value);
        }

        public quickfix.field.TradingSessionID get(
            quickfix.field.TradingSessionID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.TradingSessionID getTradingSessionID()
            throws FieldNotFound {
            quickfix.field.TradingSessionID value = new quickfix.field.TradingSessionID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.TradingSessionID field) {
            return isSetField(field);
        }

        public boolean isSetTradingSessionID() {
            return isSetField(336);
        }

        public void set(quickfix.field.TradingSessionSubID value) {
            setField(value);
        }

        public quickfix.field.TradingSessionSubID get(
            quickfix.field.TradingSessionSubID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.TradingSessionSubID getTradingSessionSubID()
            throws FieldNotFound {
            quickfix.field.TradingSessionSubID value = new quickfix.field.TradingSessionSubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.TradingSessionSubID field) {
            return isSetField(field);
        }

        public boolean isSetTradingSessionSubID() {
            return isSetField(625);
        }

        public void set(quickfix.field.Text value) {
            setField(value);
        }

        public quickfix.field.Text get(quickfix.field.Text value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Text getText() throws FieldNotFound {
            quickfix.field.Text value = new quickfix.field.Text();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Text field) {
            return isSetField(field);
        }

        public boolean isSetText() {
            return isSetField(58);
        }

        public void set(quickfix.field.EncodedTextLen value) {
            setField(value);
        }

        public quickfix.field.EncodedTextLen get(
            quickfix.field.EncodedTextLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedTextLen getEncodedTextLen()
            throws FieldNotFound {
            quickfix.field.EncodedTextLen value = new quickfix.field.EncodedTextLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedTextLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedTextLen() {
            return isSetField(354);
        }

        public void set(quickfix.field.EncodedText value) {
            setField(value);
        }

        public quickfix.field.EncodedText get(quickfix.field.EncodedText value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedText getEncodedText()
            throws FieldNotFound {
            quickfix.field.EncodedText value = new quickfix.field.EncodedText();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedText field) {
            return isSetField(field);
        }

        public boolean isSetEncodedText() {
            return isSetField(355);
        }

        public static class NoSecurityAltID extends Group {
            static final long serialVersionUID = 20050617;

            public NoSecurityAltID() {
                super(454, 455, new int[] { 455, 456, 0 });
            }

            public void set(quickfix.field.SecurityAltID value) {
                setField(value);
            }

            public quickfix.field.SecurityAltID get(
                quickfix.field.SecurityAltID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SecurityAltID getSecurityAltID()
                throws FieldNotFound {
                quickfix.field.SecurityAltID value = new quickfix.field.SecurityAltID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SecurityAltID field) {
                return isSetField(field);
            }

            public boolean isSetSecurityAltID() {
                return isSetField(455);
            }

            public void set(quickfix.field.SecurityAltIDSource value) {
                setField(value);
            }

            public quickfix.field.SecurityAltIDSource get(
                quickfix.field.SecurityAltIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SecurityAltIDSource getSecurityAltIDSource()
                throws FieldNotFound {
                quickfix.field.SecurityAltIDSource value = new quickfix.field.SecurityAltIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SecurityAltIDSource field) {
                return isSetField(field);
            }

            public boolean isSetSecurityAltIDSource() {
                return isSetField(456);
            }
        }

        public static class NoEvents extends Group {
            static final long serialVersionUID = 20050617;

            public NoEvents() {
                super(864, 865, new int[] { 865, 866, 867, 868, 0 });
            }

            public void set(quickfix.field.EventType value) {
                setField(value);
            }

            public quickfix.field.EventType get(quickfix.field.EventType value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.EventType getEventType()
                throws FieldNotFound {
                quickfix.field.EventType value = new quickfix.field.EventType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.EventType field) {
                return isSetField(field);
            }

            public boolean isSetEventType() {
                return isSetField(865);
            }

            public void set(quickfix.field.EventDate value) {
                setField(value);
            }

            public quickfix.field.EventDate get(quickfix.field.EventDate value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.EventDate getEventDate()
                throws FieldNotFound {
                quickfix.field.EventDate value = new quickfix.field.EventDate();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.EventDate field) {
                return isSetField(field);
            }

            public boolean isSetEventDate() {
                return isSetField(866);
            }

            public void set(quickfix.field.EventPx value) {
                setField(value);
            }

            public quickfix.field.EventPx get(quickfix.field.EventPx value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.EventPx getEventPx()
                throws FieldNotFound {
                quickfix.field.EventPx value = new quickfix.field.EventPx();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.EventPx field) {
                return isSetField(field);
            }

            public boolean isSetEventPx() {
                return isSetField(867);
            }

            public void set(quickfix.field.EventText value) {
                setField(value);
            }

            public quickfix.field.EventText get(quickfix.field.EventText value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.EventText getEventText()
                throws FieldNotFound {
                quickfix.field.EventText value = new quickfix.field.EventText();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.EventText field) {
                return isSetField(field);
            }

            public boolean isSetEventText() {
                return isSetField(868);
            }
        }

        public static class NoInstrumentParties extends Group {
            static final long serialVersionUID = 20050617;

            public NoInstrumentParties() {
                super(1018, 1019, new int[] { 1019, 1050, 1051, 1052, 0 });
            }

            public void set(quickfix.field.InstrumentPartyID value) {
                setField(value);
            }

            public quickfix.field.InstrumentPartyID get(
                quickfix.field.InstrumentPartyID value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrumentPartyID getInstrumentPartyID()
                throws FieldNotFound {
                quickfix.field.InstrumentPartyID value = new quickfix.field.InstrumentPartyID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrumentPartyID field) {
                return isSetField(field);
            }

            public boolean isSetInstrumentPartyID() {
                return isSetField(1019);
            }

            public void set(quickfix.field.InstrumentPartyIDSource value) {
                setField(value);
            }

            public quickfix.field.InstrumentPartyIDSource get(
                quickfix.field.InstrumentPartyIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource()
                throws FieldNotFound {
                quickfix.field.InstrumentPartyIDSource value = new quickfix.field.InstrumentPartyIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
                return isSetField(field);
            }

            public boolean isSetInstrumentPartyIDSource() {
                return isSetField(1050);
            }

            public void set(quickfix.field.InstrumentPartyRole value) {
                setField(value);
            }

            public quickfix.field.InstrumentPartyRole get(
                quickfix.field.InstrumentPartyRole value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrumentPartyRole getInstrumentPartyRole()
                throws FieldNotFound {
                quickfix.field.InstrumentPartyRole value = new quickfix.field.InstrumentPartyRole();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrumentPartyRole field) {
                return isSetField(field);
            }

            public boolean isSetInstrumentPartyRole() {
                return isSetField(1051);
            }

            public void set(
                quickfix.fix50.component.InstrumentPtysSubGrp component) {
                setComponent(component);
            }

            public quickfix.fix50.component.InstrumentPtysSubGrp get(
                quickfix.fix50.component.InstrumentPtysSubGrp component)
                throws FieldNotFound {
                getComponent(component);

                return component;
            }

            public quickfix.fix50.component.InstrumentPtysSubGrp getInstrumentPtysSubGrp()
                throws FieldNotFound {
                quickfix.fix50.component.InstrumentPtysSubGrp component = new quickfix.fix50.component.InstrumentPtysSubGrp();
                getComponent(component);

                return component;
            }

            public void set(quickfix.field.NoInstrumentPartySubIDs value) {
                setField(value);
            }

            public quickfix.field.NoInstrumentPartySubIDs get(
                quickfix.field.NoInstrumentPartySubIDs value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs()
                throws FieldNotFound {
                quickfix.field.NoInstrumentPartySubIDs value = new quickfix.field.NoInstrumentPartySubIDs();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
                return isSetField(field);
            }

            public boolean isSetNoInstrumentPartySubIDs() {
                return isSetField(1052);
            }

            public static class NoInstrumentPartySubIDs extends Group {
                static final long serialVersionUID = 20050617;

                public NoInstrumentPartySubIDs() {
                    super(1052, 1053, new int[] { 1053, 1054, 0 });
                }

                public void set(quickfix.field.InstrumentPartySubID value) {
                    setField(value);
                }

                public quickfix.field.InstrumentPartySubID get(
                    quickfix.field.InstrumentPartySubID value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.InstrumentPartySubID getInstrumentPartySubID()
                    throws FieldNotFound {
                    quickfix.field.InstrumentPartySubID value = new quickfix.field.InstrumentPartySubID();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.InstrumentPartySubID field) {
                    return isSetField(field);
                }

                public boolean isSetInstrumentPartySubID() {
                    return isSetField(1053);
                }

                public void set(quickfix.field.InstrumentPartySubIDType value) {
                    setField(value);
                }

                public quickfix.field.InstrumentPartySubIDType get(
                    quickfix.field.InstrumentPartySubIDType value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType()
                    throws FieldNotFound {
                    quickfix.field.InstrumentPartySubIDType value = new quickfix.field.InstrumentPartySubIDType();
                    getField(value);

                    return value;
                }

                public boolean isSet(
                    quickfix.field.InstrumentPartySubIDType field) {
                    return isSetField(field);
                }

                public boolean isSetInstrumentPartySubIDType() {
                    return isSetField(1054);
                }
            }
        }

        public static class NoInstrAttrib extends Group {
            static final long serialVersionUID = 20050617;

            public NoInstrAttrib() {
                super(870, 871, new int[] { 871, 872, 0 });
            }

            public void set(quickfix.field.InstrAttribType value) {
                setField(value);
            }

            public quickfix.field.InstrAttribType get(
                quickfix.field.InstrAttribType value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrAttribType getInstrAttribType()
                throws FieldNotFound {
                quickfix.field.InstrAttribType value = new quickfix.field.InstrAttribType();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrAttribType field) {
                return isSetField(field);
            }

            public boolean isSetInstrAttribType() {
                return isSetField(871);
            }

            public void set(quickfix.field.InstrAttribValue value) {
                setField(value);
            }

            public quickfix.field.InstrAttribValue get(
                quickfix.field.InstrAttribValue value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.InstrAttribValue getInstrAttribValue()
                throws FieldNotFound {
                quickfix.field.InstrAttribValue value = new quickfix.field.InstrAttribValue();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.InstrAttribValue field) {
                return isSetField(field);
            }

            public boolean isSetInstrAttribValue() {
                return isSetField(872);
            }
        }

        public static class NoLegs extends Group {
            static final long serialVersionUID = 20050617;

            public NoLegs() {
                super(555, 600,
                    new int[] {
                        600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611,
                        248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598,
                        254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620,
                        621, 622, 623, 624, 556, 740, 739, 955, 956, 999, 1001,
                        0
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
                quickfix.field.LegSecurityIDSource value)
                throws FieldNotFound {
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
                quickfix.field.NoLegSecurityAltID value)
                throws FieldNotFound {
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

            public quickfix.field.LegProduct get(
                quickfix.field.LegProduct value) throws FieldNotFound {
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

            public quickfix.field.LegCFICode get(
                quickfix.field.LegCFICode value) throws FieldNotFound {
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
                quickfix.field.LegSecuritySubType value)
                throws FieldNotFound {
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

            public boolean isSet(
                quickfix.field.LegRepoCollateralSecurityType field) {
                return isSetField(field);
            }

            public boolean isSetLegRepoCollateralSecurityType() {
                return isSetField(250);
            }

            public void set(quickfix.field.LegRepurchaseTerm value) {
                setField(value);
            }

            public quickfix.field.LegRepurchaseTerm get(
                quickfix.field.LegRepurchaseTerm value)
                throws FieldNotFound {
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
                quickfix.field.LegRepurchaseRate value)
                throws FieldNotFound {
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
                quickfix.field.LegInstrRegistry value)
                throws FieldNotFound {
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
                quickfix.field.LegCountryOfIssue value)
                throws FieldNotFound {
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
                quickfix.field.LegLocaleOfIssue value)
                throws FieldNotFound {
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
                quickfix.field.LegRedemptionDate value)
                throws FieldNotFound {
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
                quickfix.field.LegStrikeCurrency value)
                throws FieldNotFound {
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
                quickfix.field.LegSecurityExchange value)
                throws FieldNotFound {
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
                quickfix.field.EncodedLegIssuerLen value)
                throws FieldNotFound {
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
                quickfix.field.EncodedLegIssuer value)
                throws FieldNotFound {
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

            public quickfix.field.LegRatioQty get(
                quickfix.field.LegRatioQty value) throws FieldNotFound {
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

            public quickfix.field.LegSide getLegSide()
                throws FieldNotFound {
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

            public quickfix.field.LegCurrency get(
                quickfix.field.LegCurrency value) throws FieldNotFound {
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

            public quickfix.field.LegPool getLegPool()
                throws FieldNotFound {
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
                quickfix.field.LegUnitofMeasure value)
                throws FieldNotFound {
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

            public quickfix.field.LegTimeUnit get(
                quickfix.field.LegTimeUnit value) throws FieldNotFound {
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
        }
    }
}
