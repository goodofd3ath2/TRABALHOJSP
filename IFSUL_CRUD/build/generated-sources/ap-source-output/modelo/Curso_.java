package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Disciplina;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-11T17:54:10")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> codigo;
    public static volatile CollectionAttribute<Curso, Disciplina> disciplinaCollection;
    public static volatile SingularAttribute<Curso, String> nome;

}