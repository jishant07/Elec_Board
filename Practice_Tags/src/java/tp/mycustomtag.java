package tp;


import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class mycustomtag extends TagSupport
{
    public int doStartTag()
    { 
        try
        {
           JspWriter out = pageContext.getOut();
            out.println("Worked on the tag....");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return SKIP_BODY;
    }
}
