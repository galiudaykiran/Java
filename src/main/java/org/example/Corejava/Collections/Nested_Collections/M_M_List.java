package org.example.Corejava.Collections.Nested_Collections;

import java.util.*;

public class M_M_List {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Map<String,Map<String, List<Integer>>> Student_Data = new HashMap<>();
        System.out.print("Enter the Number of students  : ");

        int no_student = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< no_student; i++){
            System.out.print("Enter Student Name : ");

            String student_name = sc.nextLine();

            Map<String,List<Integer>> Subject_Marks = new HashMap<>();

            System.out.print("Enter the number of subjects for  "+student_name+": ");

            int no_subjects = sc.nextInt();
            sc.nextLine();

            for (int j = 0;j<no_subjects;j++){
                System.out.print("Enter  subject Name : ");
                String sub = sc.nextLine();

                System.out.print("Enter the number of marks for   "+sub+" : ");
                int marks = sc.nextInt();

                List<Integer> marks_list = new ArrayList<>();

                for (int k = 0;k<marks;k++){
                    System.out.print("Enter mid "+ (k+1)+" marks : ");
                    marks_list.add(sc.nextInt());
                }

                sc.nextLine();
                Subject_Marks.put(sub, marks_list);

            }
            Student_Data.put(student_name, Subject_Marks);
        }


//        System.out.print(Student_Data +" ");

        System.out.println("-----Student Data------");

        for (Map.Entry<String,Map<String,List<Integer>>> studentEntry : Student_Data.entrySet()){
            System.out.println(" Student : "+studentEntry.getKey());

            for (Map.Entry<String,List<Integer>> subjectEntry : studentEntry.getValue().entrySet())
            {
                System.out.println(" Subject : "+subjectEntry.getKey());
                System.out.println(" Marks : "+studentEntry.getValue());
            }
            System.out.println();
        }



    }
}
