/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author MRuser
 */
public class CubeNumber extends TagSupport {
    int number;
    public void setNumber(int n)
    {
        number=n;
    }
    public int doStartTag()
    {
        JspWriter out=pageContext.getOut();
        try
        {
            out.println(number*number*number);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
}
