package acoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Aluno;

public class Busca {
	public static Aluno busca(Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		Aluno a = manager.find(Aluno.class, aluno.getId());
		manager.close();
		factory.close();
		return a;
	}
}
