package collectionFramework;
import java.util.LinkedList;
import java.util.ListIterator;

class linkedlist {

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();

        Student s1 = new Student("Sujit", 1);
        Student s2 = new Student("Siddharth", 2);
        Student s3 = new Student("Karanpreet", 3);
        Student s4 = new Student("Hari", 5);
        Student s5 = new Student("Tricha", 4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList.get(2));
    }

    public static void printStudentList(LinkedList<Student> students) {
        ListIterator it = students.listIterator(students.size());
        if(it.hasPrevious()){
            System.out.println(it.previous());
        }
//        for(Student s : students) {
//            System.out.println(s.getDetails());
//        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}