<%@page import="modelo.Professor"%>
<%@page import="dao.ProfessorDAO"%>
<%@include file="cabecalho.jsp"%>
<%
    String siape = request.getParameter("siape");
    ProfessorDAO dao = new ProfessorDAO();
    Professor obj = dao.buscarPorChavePrimaria(siape);
%>
        <div>
            <h1 class="centro">Atualização de Professores</h1>
            
            <div>
                
                <form action="professores-atualizar-ok.jsp">
                    <label>Siape:</label>
                    <input type="text" value="<%=obj.getSiape()%>" name="txtSiape"/><br />
                    <label>Nome:</label>
                    <input type="text" value="<%=obj.getNome()%>" name="txtNome"/><br />
                 
                    <input type="submit" value="Atualizar" />
                </form>
            </div>
        </div>



    </body>
</html>
