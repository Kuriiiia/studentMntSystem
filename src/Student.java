public class Student {
    public String name;
    public int age;
    private static int nextId = 0;//
    public final int studentId;

    public Student() {
     this.studentId = nextId++;
    }

    public int getStudentId() {
        return nextId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display(){
        System.out.println("students details");
        System.out.println("student Id: "+getStudentId());
        System.out.println("student name: "+getName());
        System.out.println("student age: "+getAge());
    }
}

