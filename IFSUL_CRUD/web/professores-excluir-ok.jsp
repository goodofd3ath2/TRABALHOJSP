<%@page import="modelo.Professor"%>
<%@page import="dao.ProfessorDAO"%>
<%@include file="cabecalho.jsp"%>
<%
String siape = request.getParameter("siape");
ProfessorDAO dao = new ProfessorDAO();
Professor obj=dao.buscarPorChavePrimaria(siape);
dao.excluir(obj);
%>
         <h1 class="centro">Exclus�o de Professores</h1>
            
         <div>
             O Registro <%=siape%> foi exclu�do com sucesso.<br />
             <a href="professores.jsp">Voltar para Listagem</a>
         </div>
    </body>
</html>
