package Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
	
  static EntityManagerFactory emf;
  
  static {
	 emf=Persistence.createEntityManagerFactory("raushconnection");
  }

  static EntityManager getconnection() {
	  return emf.createEntityManager();
  }
  
}
