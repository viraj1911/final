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
public class Student {
   private String name;
   private int ID;

    public Student(){
       name = "Not set";
       ID = 0;
    }
    public Student(String name, int ID){
       this.name = name;
       this.ID = ID;
    }
   public void setName(String givenName)
   {
       this.name = name;
   }
   
   public String getName()
   {
       return name;
   }
   public void setID (int givenID)
   {
       this.ID = givenID;
   }
   public int getID()
   {
       return ID;
   }

   
}
