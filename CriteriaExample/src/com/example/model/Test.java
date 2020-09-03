package com.example.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Student.class);
		// get all data from student table
		/*
		 * List<Student> students = cr.list(); Iterator<Student> it =
		 * students.iterator(); while (it.hasNext()) { Student s = it.next();
		 * System.out.println(s.getName() + "\t" + s.getEmail() + "\t" +
		 * s.getPass()); }
		 */

		// get single object based on primary key
		/*
		 * Student std=session.get(Student.class, "deep@gmail.com");
		 * System.out.println(std.getName());
		 */

		// how to perform login using criteria
		/*
		 * Criterion c1 = Restrictions.eq("email", "deep@gmail.com"); Criterion
		 * c2 = Restrictions.eq("pass", "12345");
		 * 
		 * LogicalExpression le = Restrictions.and(c1, c2); cr.add(le);
		 * 
		 * List<Student> students = cr.list(); if (students.size() > 0) {
		 * System.out.println("login Successfully"); } else {
		 * System.out.println("login Failed"); }
		 */

		// get data from database more than this
		/*
		 * cr.add(Restrictions.gt("pass", "12345")); List<Student> students =
		 * cr.list(); if (students.size() > 0) {
		 * System.out.println(students.get(0).getName()); }
		 */

		/*
		 * // get data from database more than this
		 * cr.add(Restrictions.ge("pass", "12345")); List<Student> students =
		 * cr.list(); if (students.size() > 0) {
		 * 
		 * for (Student s : students) { System.out.println(s.getName()); } }
		 */
		/*
		 * // get data from database less than this
		 * cr.add(Restrictions.le("pass", "12345")); List<Student> students =
		 * cr.list(); if (students.size() > 0) {
		 * 
		 * for (Student s : students) { System.out.println(s.getName()); } }
		 */

		// get data from database less than this
/*		cr.add(Restrictions.lt("pass", "12345"));
		List<Student> students = cr.list();
		if (students.size() > 0) {

			for (Student s : students) {
				System.out.println(s.getName());
			}
		}*/
		
		//get data from starting point and ending point
		/*cr.add(Restrictions.between("pass", "12345","54321"));
		List<Student> students = cr.list();
		System.out.println(students.size());
		*/
		
		/*cr.add(Restrictions.like("name", "%H"));
		System.out.println(cr.list().size());*/
		
		/*cr.add(Restrictions.ilike("name", "%H"));
		System.out.println(cr.list().size());*/
	
		//cr.add(Restrictions.or(c1,c2));
		
		/*cr.setProjection(Projections.avg("pass"));
		System.out.println(cr.list().get(0));*/
		
		/*cr.setProjection(Projections.max("pass"));
		System.out.println(cr.list().get(0));*/
		
		/*cr.setProjection(Projections.min("pass"));
		System.out.println(cr.list().get(0));*/

		
		
	}
	
}
