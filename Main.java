package oop;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> teacher1 = new ArrayList<>();
        teacher1.add("Mathematics");
        teacher1.add("Physics");
        System.out.println("Teacher-mathematician teachs " + teacher1);

        List<String> teacher2 = new ArrayList<>();
        teacher2.add("Biology");
        teacher2.add("Chemistry");
        System.out.println("Teacher-biologist teachs " + teacher2);

        List<String> teacher3 = new ArrayList<>();
        teacher3.add("Literature");
        teacher3.add("Philosophy");
        System.out.println("Teacher-humanitarian teachs " + teacher3);


        EnumMap<Person.Subject, String> subjectForStudent = new EnumMap<Person.Subject, String>(Person.Subject.class);
        subjectForStudent.put(Person.Subject.MATHEMATICS, "Teacher-mathematician");
        subjectForStudent.put(Person.Subject.PHYSICS, "Teacher-mathematician");
        subjectForStudent.put(Person.Subject.BIOLOGI, "Teacher-biologist");
        subjectForStudent.put(Person.Subject.CHEMISTRY, "Teacher-biologist");
        subjectForStudent.put(Person.Subject.LITERATURE, "Teacher-humanitarian");
        subjectForStudent.put(Person.Subject.PHILOSOPHI, "Teacher-humanitarian");
        System.out.println(subjectForStudent);

    }



    public String getSubject() {
        return getSubject().toLowerCase();
    }
}
