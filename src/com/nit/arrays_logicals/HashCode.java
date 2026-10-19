package com.nit.arrays_logicals;
import java.util.Objects;
public class HashCode 
{
    private int id;
    private String name;
    public HashCode(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) 
    {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        HashCode student = (HashCode) obj;

        return id == student.id &&
               Objects.equals(name, student.name);
    }

    public static void main(String[] args)
    {

        HashCode student1 = new HashCode(1, "King");
        HashCode student2 = new HashCode(2, "Krish");
        HashCode student3 = new HashCode(1, "Alice");

        
        System.out.println("student1.equals(student2): " + student1.equals(student2));

        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student 1 hashcode "+ student1.hashCode());
        System.out.println("student 2 hashcode "+ student2.hashCode());
        System.out.println("student 3 hashcode "+ student3.hashCode());
    }
}