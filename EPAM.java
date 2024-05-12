package javaPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EPAM {

    //how to sort a table and find max value and print respective row

    String name;
    String subject;
    int marks;
    public EPAM(String name,String subject,int marks){
        this.name = name ;
        this.subject =subject;
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    public String getSubject(){
        return subject;
    }
    public String getName(){
        return name;
    }

    public static void main(String [] args){
        List<EPAM> student = new ArrayList<>();
        student.add(new EPAM("siva","flight Dynamics",87));
        student.add(new EPAM("yogan","Rocket Propulsion",97));
        student.add(new EPAM("sweety","Fluid Dynamics",95));

        student.sort(Comparator.comparing(EPAM::getMarks).reversed());

        EPAM topStudent = student.get(0);

        System.out.println(topStudent.getName());
        System.out.println(topStudent.getSubject());
        System.out.println(topStudent.getMarks());

    }


}
