package quickfix.fix43;

import quickfix.FieldNotFound;


public class SecurityTypeRequest extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "v";

    public SecurityTypeRequest() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public SecurityTypeRequest(quickfix.field.SecurityReqID securityReqID) {
        this();
        setField(securityReqID);
    }

    public void set(quickfix.field.SecurityReqID value) {
        setField(value);
    }

    public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.SecurityReqID getSecurityReqID()
        throws FieldNotFound {
        quickfix.field.SecurityReqID value = new quickfix.field.SecurityReqID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.SecurityReqID field) {
        return isSetField(field);
    }

    public boolean isSetSecurityReqID() {
        return isSetField(320);
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
}
