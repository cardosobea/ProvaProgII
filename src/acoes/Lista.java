package acoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Aluno;

public class Lista {
	public static List<Aluno> lista() {
		String sql = "select a from Aluno as a";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(sql);
		List<Aluno> a = (List<Aluno>)query.getResultList();
		manager.close();
		factory.close();
		return a;
	}
}
