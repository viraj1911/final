/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week1;

/**
 *
 * @author viraj138
 */
public class StudentList
{


        public static void main(String args[])
          {

                 Student s1 = new Student();
                 s1.setName("Viraj");
                 s1.setID(123);
                 System.out.println("Name :" + s1.getName() + " ID : " +  s1.getID());

				 Student s2 = new Student ("abc", 12345);
				 System.out.println("S1 == Name :" + s1.getName() + "ID:" + s1.getID());
				 System.out.println("S2 == Name: " + s2.getName() + "ID:" + s2.getID() );


				 Student[] studentList = new Student[5];
				 studentList[0] = s1;
				 studentList[1] = s2;

				 




          }
}
