package Dao;

import Dto.Student;
import Exception.NorecordfE;

public interface Inter {
	
	
		public Student findStudentById(int id) throws NorecordfE;
		public void  saveStudent(Student student);
		public boolean  deleteStudentById(int id) throws NorecordfE;
		public void  updateStudentLevel(int id, int level);

} 
