
package quickfix.fix42;
import quickfix.FieldNotFound;


public class ResendRequest extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "2";
  

  public ResendRequest()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public ResendRequest(quickfix.field.BeginSeqNo beginSeqNo, quickfix.field.EndSeqNo endSeqNo) {
    this();
    setField(beginSeqNo);
    setField(endSeqNo);
  }
    
  public void set(quickfix.field.BeginSeqNo value)
  {
    setField(value);
  }

  public quickfix.field.BeginSeqNo get(quickfix.field.BeginSeqNo  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound
  {
    quickfix.field.BeginSeqNo value = new quickfix.field.BeginSeqNo();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.BeginSeqNo field)
  {
    return isSetField(field);
  }

  public boolean isSetBeginSeqNo()
  {
    return isSetField(7);
  }
  
  public void set(quickfix.field.EndSeqNo value)
  {
    setField(value);
  }

  public quickfix.field.EndSeqNo get(quickfix.field.EndSeqNo  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.EndSeqNo getEndSeqNo() throws FieldNotFound
  {
    quickfix.field.EndSeqNo value = new quickfix.field.EndSeqNo();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.EndSeqNo field)
  {
    return isSetField(field);
  }

  public boolean isSetEndSeqNo()
  {
    return isSetField(16);
  }
  
}
  