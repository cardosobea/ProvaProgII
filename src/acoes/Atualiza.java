package acoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Aluno;

public class Atualiza {
	public static void alteracao(Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(aluno);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
