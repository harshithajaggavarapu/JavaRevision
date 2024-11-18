public class Student {
    String name;
    int age;
    int section;

    public Student(String name, int age, int section){
        this.name= name;
        this.age = age;
        this.section = section;
    }
//    @Override
//    public String toString(){
//        return "Student name is "+ name +", age is "+ age+ ", and studies in section "+ section;
//    }
    @Override
    public String toString(){
        final StringBuilder s = new StringBuilder("Student name is ");
        s.append(name).append(", age is");
        s.append(age).append(", and studies in section ");
        s.append(section);
        return s.toString();
    }
    public static void main(String[] args) {
        Student s1 = new Student("harshi",14, 4);
        System.out.println(s1.toString());
    }

}
