package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import code.OrderPosition;

public final class AddOrderPosition_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AddPositionForm</title>\n");
      out.write("    <body>\n");
      out.write("          ");
      code.OrderPosition orderPosition = null;
      synchronized (request) {
        orderPosition = (code.OrderPosition) _jspx_page_context.getAttribute("orderPosition", PageContext.REQUEST_SCOPE);
        if (orderPosition == null){
          orderPosition = new code.OrderPosition();
          _jspx_page_context.setAttribute("orderPosition", orderPosition, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("           <form action=\"AddOrderPositionServlet\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <center>\n");
      out.write("            <tr>\n");
      out.write("                <th>Add Order Position Form</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Order ID:</td>\n");
      out.write("                <td><input type=\"text\" name=\"OrderId\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((code.OrderPosition)_jspx_page_context.findAttribute("orderPosition")).getOrderId())));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Product ID:</td>\n");
      out.write("                <td><input type=\"text\" name=\"ProductId\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((code.OrderPosition)_jspx_page_context.findAttribute("orderPosition")).getProductId())));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Price:</td>\n");
      out.write("                <td><input type=\"text\" name=\"Price\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((code.OrderPosition)_jspx_page_context.findAttribute("orderPosition")).getPrice())));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("               <tr>\n");
      out.write("                <td>Item Count:</td>\n");
      out.write("                <td><input type=\"text\" name=\"ItemCount\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((code.OrderPosition)_jspx_page_context.findAttribute("orderPosition")).getItemCount())));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                        <td><center><a href=\"OrderPosition.jsp\">Back</center></td>\n");
      out.write("                            <td><center><input type=\"reset\" value=\"Reset\" /></center></td>\n");
      out.write("                            <td><center><input type=\"submit\" value=\"Add\"></center></td>\n");
      out.write("                        </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("          </center>\n");
      out.write("           </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
}
