package acoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Aluno;

public class Remove {
	public static void remocao(Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		Aluno a = manager.find(Aluno.class, aluno.getId());
		manager.getTransaction().begin();
		manager.remove(a);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
