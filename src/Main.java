import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Enter student details: ");
        System.out.print("name: ");
            String name = sc.nextLine();
            st.setName(name);
        System.out.print("age: ");
            int age = sc.nextInt();
            st.setAge(age);
        System.out.println("students details: ");
        System.out.println("student Id: "+st.getStudentId());
        System.out.println("student name: "+st.getName());
        System.out.println("student age: "+st.getAge());


    }
}