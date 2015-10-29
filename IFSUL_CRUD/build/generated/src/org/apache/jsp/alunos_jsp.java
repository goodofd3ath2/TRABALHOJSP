package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alunos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cabecalho.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Gerenciamento de Disciplinas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Sistema de Controle de Disciplinas</h1>\n");
      out.write("        <div class=\"centro\">Usuário: xxxxx - <a href=\"#\">Sair</a>\n");
      out.write("            <hr />\n");
      out.write("            <div><a href=\"alunos.jsp\">Aluno</a> - <a href=\"professores.jsp\">Professores</a> - <a href=\"disciplinas.jsp\">Disciplina</a></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1 class=\"centro\">Alunos</h1>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                +<a href=\"alunos-cadastrar.jsp\">Novo Aluno</a><br />\n");
      out.write("                <form>\n");
      out.write("                    <input type=\"text\" />\n");
      out.write("                    <input type=\"submit\" value=\"Pesquisar\"/><br />\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Matrícula</th>\n");
      out.write("                            <th>Nome</th>\n");
      out.write("                            <th>Disciplinas</th>\n");
      out.write("                            <th>Matriculado</th>\n");
      out.write("                            <th>Ações</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>1</td>\n");
      out.write("                            <td>xxxxxx</td>\n");
      out.write("                            <td>99</td>\n");
      out.write("                            <td>SIM</td>\n");
      out.write("                            <td><a href=\"alunos-atualizar.jsp\">Editar</a>\n");
      out.write("                                <a href=\"alunos-excluir-ok.jsp?matricula=1\">Excluir</a>\n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>2</td>\n");
      out.write("                            <td>xxxxxx</td>\n");
      out.write("                            <td>99</td>\n");
      out.write("                            <td>SIM</td>\n");
      out.write("                            <td><a href=\"alunos-atualizar.jsp\">Editar</a>\n");
      out.write("                                <a href=\"alunos-excluir-ok.jsp?matricula=2\">Excluir</a>\n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>3</td>\n");
      out.write("                            <td>xxxxxx</td>\n");
      out.write("                            <td>99</td>\n");
      out.write("                            <td>SIM</td>\n");
      out.write("                            <td><a href=\"alunos-editar.jsp\">Editar</a>\n");
      out.write("                                <a href=\"alunos-excluir.jsp\">Excluir</a>\n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}