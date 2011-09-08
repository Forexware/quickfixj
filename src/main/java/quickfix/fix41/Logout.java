
package quickfix.fix41;
import quickfix.FieldNotFound;


public class Logout extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "5";
  

  public Logout()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public void set(quickfix.field.Text value)
  {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound
  {
    quickfix.field.Text value = new quickfix.field.Text();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Text field)
  {
    return isSetField(field);
  }

  public boolean isSetText()
  {
    return isSetField(58);
  }
  
}
  