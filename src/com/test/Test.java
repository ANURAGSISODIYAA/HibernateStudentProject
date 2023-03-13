package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dto.Attendance;
import com.dto.Course;
import com.dto.Fees;
import com.dto.Marksheet;
import com.dto.Student;
import com.dto.University;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Scanner sc = new Scanner(System.in);
		
		
		int ch;
		do {
			System.out.println("Enter your choice :");
			System.out.println("o Enter 1 to INSERT the details of the Student.");
			System.out.println("o Enter 2 to INSERT the details of the Univerity.");
			System.out.println("o Enter 3 to INSERT the fees of the Student.");
			System.out.println("o Enter 4 to INSERT the details of the Course.");
			System.out.println("o Enter 5 to INSERT the details of the MarkSheet.");
			System.out.println("o Enter 7 to Exist.");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
				Student st = new Student();
				
				System.out.println("Enter the Student Id.");
				int std = sc.nextInt();
				st.setStudentId(std);


				System.out.println("Enter the Student First Name.");
				String fname = sc.next();
				st.setFirstName(fname);

				System.out.println("Enter the Student Last Name.");
				String lname = sc.next();
				st.setLastName(lname);

				System.out.println("Enter the Student Address.");
				String address = sc.next();
				st.setAddress(address);

				System.out.println("Enter the Student Gender.");
				String gender = sc.next();
				st.setGender(gender);

				System.out.println("Enter the Student RollNumber.");
				int rollnumber = sc.nextInt();
				st.setRollNumber(rollnumber);
				
				/*
				 * System.out.println("Enter the University Id."); int uId = sc.nextInt();
				 */

				Transaction tx = s.beginTransaction();

				Attendance a = new Attendance();
				System.out.println("Enter the Semiseter 1 Attendance percentage.");
				int attendance = sc.nextInt();
				a.setSemister1(25);
				a.setSemister2(45);

				Set se = new HashSet();
				se.add(a);

				st.setChildren(se);
				s.save(st);
				tx.commit();
				//s.close();
				//sf.close();

				/*
				 * if() { System.out.println();
				 * System.out.println("********Record inserted succesfully!!********");
				 * System.out.println(); }else {
				 * System.out.println("********Something went wrong!! please try again********"
				 * ); System.out.println(); } System.out.println();
				 */
				break;

			case 2:
				University u = new University();

				System.out.println("Enter the University Name");
				String uname = sc.next();
				u.setUniversityName(uname);

				System.out.println("Enter the University Address");
				String uaddress = sc.next();
				u.setUniversityAddress(uaddress);

				System.out.println("Enter the University Fees.");
				int ufees = sc.nextInt();
				u.setUniversityFess(ufees);

				Student st1 = new Student();

				Set se1 = new HashSet();
				se1.add(st1);

				u.setChildren(se1);

				Transaction tx1 = s.beginTransaction();
				s.save(u);
				tx1.commit();
			//	s.close();
			//	sf.close();

				break;

			case 3:

				Student st2 = new Student();
				

				System.out.println("Enter the Student Id.");
				int stId = sc.nextInt();
				st2.setStudentId(stId);


				Fees f = new Fees();
				System.out.println("Enter the Semister");
				int semiseter = sc.nextInt();
				f.setSemister(semiseter);

				System.out.println("Enter the Fees");
				int fees = sc.nextInt();
				f.setFees(fees);
				f.setParent(st2);

				Transaction tx2 = s.beginTransaction();
				s.save(f);
				tx2.commit();
				//s.close();
				//sf.close();

				break;

			case 4:
				Course c = new Course();

				System.out.println("Enter the Course Name");
				String cname = sc.next();
				c.setCourseName(cname);

				System.out.println("Enter the Course Duration in Years");
				int cduration = sc.nextInt();
				c.setCourseDuration(cduration);

				System.out.println("Enter the Course Fees.");
				int cfees = sc.nextInt();
				c.setCourseFess(cfees);

				Student st3 = new Student();

				System.out.println("Enter the Student Id.");
				int stid = sc.nextInt();
				st3.setStudentId(stid);

				Set se2 = new HashSet();
				se2.add(st3);

				c.setChildren(se2);

				Transaction tx3 = s.beginTransaction();
				s.save(c);
				tx3.commit();
				//s.close();
				//sf.close();
				break;
			case 5:
				Student st4 = new Student();

				System.out.println("Enter the Student Id.");
				int stnid = sc.nextInt();
				st4.setStudentId(stnid);

//				System.out.println("Enter the Student First Name.");
//				String fnames = sc.next();
//				st4.setFirstName(fnames);
//
//				System.out.println("Enter the Student Last Name.");
//				String lnames = sc.next();
//				st4.setLastName(lnames);
//
//				System.out.println("Enter the Student Address.");
//				String addresss = sc.next();
//				st4.setAddress(addresss);
//
//				System.out.println("Enter the Student Gender.");
//				String genderr = sc.next();
//				st4.setGender(genderr);
//
//				System.out.println("Enter the Student RollNumber.");
//				int rollnumberr = sc.nextInt();
//				st4.setRollNumber(rollnumberr);
				
				Marksheet m1 = new Marksheet();
				
				System.out.println("Enter the Chemistry Numbers");
				int cNumbers = sc.nextInt();
				m1.setChemistryNumbers(cNumbers);

				System.out.println("Enter the Physics Numbers");
				int pNumbers = sc.nextInt();
				m1.setPhysicsNumbers(pNumbers);
				System.out.println("Enter the Maths Numbers ");
				int mNumbers = sc.nextInt();
				m1.setMathsNumbers(mNumbers);
				
				System.out.println("Enter the electronics Numbers");
				int eNumbers = sc.nextInt();
				m1.setElectronicsNumber(eNumbers);
				
				System.out.println("Enter the Mechanical Numbers ");
				int mlNumbers = sc.nextInt();
				m1.setMechanicalNumbers(mlNumbers);
				Transaction tx4 = s.beginTransaction();
			
				m1.setParent(st4);
				
				s.save(m1);
				//s.close();
	tx4.commit();
				sf.close();
				/*
				 * try {
				 * 
				 * 
				 * 
				 * // Retrieve data from the source table Query query =
				 * s.createQuery("from Student"); List<Student> sourceData = query.list();
				 * 
				 * // Create objects of the target entity and set their values with the
				 * retrieved data List<Marksheet> targetData = new ArrayList<Marksheet>(); for
				 * (Student source : sourceData) { Marksheet m = new Marksheet();
				 * m.setFirstName(source.getFirstName()); m.setLastName(source.getLastName());
				 * m.setGender(source.getGender()); m.setAddress(source.getAddress());
				 * 
				 * targetData.add(m); }
				 * 
				 * // Save the objects to the target table for (Marksheet m : targetData) {
				 * s.save(m); }
				 * 
				 * tx4.commit(); } catch (Exception e) { tx4.rollback(); e.printStackTrace(); }
				 * finally { s.close(); }
				 */
				break;

			case 6:

				break;
			case 7:
				System.out.println("***********THANKYOU**************");
				break;
			}
		} while (ch != 7);

	}

	/*
	 * Attendance a = new Attendance(); a.setTotalattendance(75);
	 * 
	 * Student st = new Student(); st.setFirstName("anurag");
	 * st.setLastName("sisodiya"); st.setRollNumber(221010); st.setGender("male");
	 * st.setAddress("Indore");
	 * 
	 * Set se = new HashSet(); se.add(a);
	 * 
	 * st.setChildren(se); Transaction tx = s.beginTransaction(); s.save(st);
	 */
//		Address a = (Address) s.get(Address.class, 50);
//		System.out.println("Address name" + a.getAddressName());
//		Student sd = (Student) s.get(Student.class, 10);
//		System.out.println("Studen name" + sd.getStudentName());

//      s.update(ad);

//      s.delete(ad);
//		tx.commit();
//		s.close();
//		sf.close();

}
