package acoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Aluno;

public class Insere {
	public static void insercao(Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
