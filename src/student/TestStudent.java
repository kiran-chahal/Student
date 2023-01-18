/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kchah
 */
public class TestStudent {
    public static void main(String[] args){
        Student obj = new Student("s1","kiran");
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1","kiran");
        studentList[1] = new Student("s2","suzzie");
        studentList[2] = new Student("s3","atiqa");
        
        for(int i= 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }//end of method
}//end of main