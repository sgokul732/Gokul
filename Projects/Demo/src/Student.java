import java.util.function.Function;
public class Student {
    public String name;
    public int age;
    String gender;
    public Student(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender=gender;
    }
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }
}