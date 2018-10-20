package tp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class power extends TagSupport
{
    int b,pow,result=1;

    public void setB(int b) {
        this.b = b;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

   
   
    public int doStartTag()
    {
        return EVAL_BODY_INCLUDE;
    }
    public int doAfterBody() {
    pow++;   
    result *= b;   
    if (pow==b)   
      return SKIP_BODY;   
    else   
      return EVAL_BODY_AGAIN;   
  }  
    public int doEndTag()
    {
        try
        {
            JspWriter out = pageContext.getOut();
            
            out.println("The result is : " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return EVAL_PAGE;
    }
}
