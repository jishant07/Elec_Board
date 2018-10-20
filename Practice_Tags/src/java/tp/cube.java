package tp;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class cube extends TagSupport
{
    int ber;
    public void setBer(int num)
    {
        ber = num;
    }
    public int doStartTag()
    {
        try
        {
            JspWriter out = pageContext.getOut();
            out.println("The Cube is : " + (ber*ber*ber));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        return SKIP_BODY;
    }
}
