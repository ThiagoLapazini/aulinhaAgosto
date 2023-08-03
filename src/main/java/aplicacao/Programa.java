package aplicacao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Catalogo;
import dominio.Requisitos;
import dominio.generoEnum;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogo-jogos");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Catalogo cat = new Catalogo(20342L, "Valorant", "Rito Games", "Rito", "Portugues", 10,
				generoEnum.TIRO, LocalDate.of(2020, 06, 01),new Requisitos("Windows","Core 2 Quad","1024mb","GT930","120GB"));
		em.merge(cat);
		em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
