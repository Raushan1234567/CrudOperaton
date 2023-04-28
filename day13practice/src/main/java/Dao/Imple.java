package Dao;

import org.hibernate.Transaction;



import Dto.Student;
import Exception.NorecordfE;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;

public class Imple implements Inter{

	@Override
	public Student findStudentById(int id) throws NorecordfE {
		Student s=null;
EntityManager em=Connection.getconnection();
	
try {
	 s=em.find(Student.class,id);
		
		if(s==null) {
			throw new NorecordfE  ("no record found");
		}
}catch(IllegalArgumentException ex) {
	System.out.println(ex.getMessage());
}finally {
	em.close();			
}
//book object: detached state
return s;
	}

	@Override
	public void saveStudent(Student student) {
		EntityManager em=Connection.getconnection();
		
		EntityTransaction et =em.getTransaction();
		et.begin();
		try {
			
			em.persist(student);
		}
		catch(PersistenceException e){
			System.out.println(e.getMessage());
		}
		
		finally{
			et.commit();
		    em.close();
		}
		
	}

	@Override
	public boolean deleteStudentById(int id) throws  NorecordfE {
		EntityManager em=Connection.getconnection();
		
		Student stu =em.find(Student.class,id);
		
		if(stu==null) {
			throw new NorecordfE  ("no record found");
		}
		EntityTransaction et=em.getTransaction();
		et.begin();
		try {
		em.remove(stu);
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			et.commit();
			em.close();
		}
		
		return false;
		
	}

	@Override
	public void updateStudentLevel(int id, int level) {
		// TODO Auto-generated method stub
		EntityManager em=Connection.getconnection();
		
		EntityTransaction et=em.getTransaction();
		Student stu= em.find(Student.class, id);
		
		stu.setLevel(level);
		
		et.begin();
		
		try {
		em.merge(stu);
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}finally {
			et.commit();
			em.close();
		}
		
		
		
		
		
	
	}

}
