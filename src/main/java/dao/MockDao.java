package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import javax.persistence.Query;

import dto.MockDto;
@Component
public class MockDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mock");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(MockDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
	}
	public MockDto findbyId(String email) {
		MockDto dto=entityManager.find(MockDto.class, email);
		return dto;
	}
	public void delete(MockDto dto2) {
	entityTransaction.begin();
	entityManager.remove(dto2);
	entityTransaction.commit();
		
	}
	public List<MockDto> findAll() {
		Query query=entityManager.createQuery("SELECT pp FROM MockDto pp");
		return query.getResultList();
	}
	

}