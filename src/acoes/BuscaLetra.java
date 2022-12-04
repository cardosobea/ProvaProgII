package acoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Aluno;

public class BuscaLetra {
	public static List<Aluno> buscaLetra(String l){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select a from Aluno as a where a.nome like :primeiraletra");
		query.setParameter("primeiraletra", l + "%");
		List<Aluno> a = (List<Aluno>)query.getResultList();
		return a;
	}
}
