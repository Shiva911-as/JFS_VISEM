package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.entity.Employee;
import com.example.util.HibernateUtil;

public class EmployeeDAO {

    // CREATE
    public static void insert(Employee emp) 
	{
        try  
		{
			Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = s.beginTransaction();
            s.persist(emp);
            tx.commit();
            System.out.println("Employee inserted");
        }
		catch(Exception e)
		{
			System.err.println("Error inserting employee: " + e.getMessage());
		}
    }

    // READ ALL
    public static void getAll() 
	{
        try  
		{
			Session s = HibernateUtil.getSessionFactory().openSession();
            List<Employee> list = s.createQuery("FROM Employee", Employee.class).list();
            list.forEach(e ->
             System.out.println(e.getId()+" "+e.getName()+" "+e.getDepartment()+" "+e.getSalary())
            );
        }
		catch(Exception e)
		{
			System.err.println("Error fetching employees: " + e.getMessage());
		}
    }

    // READ BY ID
    public static void getById(int id) {
        try  {
			Session s = HibernateUtil.getSessionFactory().openSession();
            Employee e = s.get(Employee.class, id);
            System.out.println(e != null ? e.getName() : "Employee not found");
        }
		catch(Exception e)
		{
			System.err.println("Error fetching employee by ID: " + e.getMessage());
		}
		
    }

    // UPDATE
    public static void update(Employee emp) {
        try  {
			Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = s.beginTransaction();
            s.merge(emp);
            tx.commit();
            System.out.println("Employee updated");
        }
		catch(Exception e)
		{
			System.err.println("Error updating employee: " + e.getMessage());
		}
    }

    // DELETE
    public static void delete(int id) {
        try  {
			Session s = HibernateUtil.getSessionFactory().openSession();
            Employee e = s.get(Employee.class, id);
            if (e != null) {
                Transaction tx = s.beginTransaction();
                s.remove(e);
                tx.commit();
                System.out.println("Employee deleted");
            }
        }
		catch(Exception e)
		{
			System.err.println("Error deleting employee: " + e.getMessage());
		}
    }
}