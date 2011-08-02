package quickfix.fixt11;

import quickfix.FieldNotFound;


public class TestRequest extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "1";

    public TestRequest() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public TestRequest(quickfix.field.TestReqID testReqID) {
        this();
        setField(testReqID);
    }

    public void set(quickfix.field.TestReqID value) {
        setField(value);
    }

    public quickfix.field.TestReqID get(quickfix.field.TestReqID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TestReqID getTestReqID() throws FieldNotFound {
        quickfix.field.TestReqID value = new quickfix.field.TestReqID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TestReqID field) {
        return isSetField(field);
    }

    public boolean isSetTestReqID() {
        return isSetField(112);
    }
}
