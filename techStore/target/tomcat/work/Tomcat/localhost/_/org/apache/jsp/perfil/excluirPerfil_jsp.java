/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-25 20:42:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.perfil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class excluirPerfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  \n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Perfil</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("  :root {\n");
      out.write("    font-family: arial;\n");
      out.write("    --bg-cinza: #8d8d8d;\n");
      out.write("    --color-1: #313030;\n");
      out.write("    --color-2: #292929;\n");
      out.write("    --color-3: #3b3b3b;\n");
      out.write("    --roxo: #695bf5;\n");
      out.write("    --roxo-claro: #8180c1;\n");
      out.write("    --roxo-forte: #682baf;\n");
      out.write("    --roxo-escuro: #27263d;\n");
      out.write("    --roxo-perola: #bdbcdd;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  body {\n");
      out.write("    background-color: var(--color-1);\n");
      out.write("    color: var(--roxo);\n");
      out.write("    height: 100%;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  div {\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    justify-content: center;\n");
      out.write("    width: 50%;\n");
      out.write("    height: 100%;\n");
      out.write("    margin: auto;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    background-color: var(--roxo-escuro);\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    width: 200px;\n");
      out.write("    height: 40px;\n");
      out.write("    margin: 20px;\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <header>\n");
      out.write("    <h2>\n");
      out.write("      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("    </h2>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div>\n");
      out.write("      <h2>Tem certeza que deseja excluir sua conta?</h2>\n");
      out.write("      <a href=\"/find-all-produtos\">\n");
      out.write("        <button>\n");
      out.write("          Cancelar\n");
      out.write("        </button></a>\n");
      out.write("\n");
      out.write("        <form action=\"/delete-account\" method=\"get\" >\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cpf}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"cpf\"/>\n");
      out.write("            <button type=\"submit\">Excluir</button>\n");
      out.write("        </form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}