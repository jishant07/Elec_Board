package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demoCustom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/cust_tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_cube_number_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_date_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_power_power_number;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_d_cube_number_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_date_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_power_power_number = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_d_cube_number_nobody.release();
    _jspx_tagPool_d_date_nobody.release();
    _jspx_tagPool_d_power_power_number.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        Current date is ");
      if (_jspx_meth_d_date_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("            The cube of 5 is ");
      if (_jspx_meth_d_cube_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        3 ^ 5 = ");
      if (_jspx_meth_d_power_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_d_date_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:date
    custom.MyTag _jspx_th_d_date_0 = (custom.MyTag) _jspx_tagPool_d_date_nobody.get(custom.MyTag.class);
    _jspx_th_d_date_0.setPageContext(_jspx_page_context);
    _jspx_th_d_date_0.setParent(null);
    int _jspx_eval_d_date_0 = _jspx_th_d_date_0.doStartTag();
    if (_jspx_th_d_date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_date_nobody.reuse(_jspx_th_d_date_0);
      return true;
    }
    _jspx_tagPool_d_date_nobody.reuse(_jspx_th_d_date_0);
    return false;
  }

  private boolean _jspx_meth_d_cube_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:cube
    custom.CubeNumber _jspx_th_d_cube_0 = (custom.CubeNumber) _jspx_tagPool_d_cube_number_nobody.get(custom.CubeNumber.class);
    _jspx_th_d_cube_0.setPageContext(_jspx_page_context);
    _jspx_th_d_cube_0.setParent(null);
    _jspx_th_d_cube_0.setNumber(5);
    int _jspx_eval_d_cube_0 = _jspx_th_d_cube_0.doStartTag();
    if (_jspx_th_d_cube_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_cube_number_nobody.reuse(_jspx_th_d_cube_0);
      return true;
    }
    _jspx_tagPool_d_cube_number_nobody.reuse(_jspx_th_d_cube_0);
    return false;
  }

  private boolean _jspx_meth_d_power_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:power
    custom.PowerNumber _jspx_th_d_power_0 = (custom.PowerNumber) _jspx_tagPool_d_power_power_number.get(custom.PowerNumber.class);
    _jspx_th_d_power_0.setPageContext(_jspx_page_context);
    _jspx_th_d_power_0.setParent(null);
    _jspx_th_d_power_0.setNumber(3);
    _jspx_th_d_power_0.setPower(5);
    int _jspx_eval_d_power_0 = _jspx_th_d_power_0.doStartTag();
    if (_jspx_eval_d_power_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write(" body\n");
        int evalDoAfterBody = _jspx_th_d_power_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_d_power_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_power_power_number.reuse(_jspx_th_d_power_0);
      return true;
    }
    _jspx_tagPool_d_power_power_number.reuse(_jspx_th_d_power_0);
    return false;
  }
}
