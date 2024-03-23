package lld.builderpattern;

public class Main {
    public static void main(String[] args) {
        Student stud = Student.builder().classNo(1).name("Ankita").build();
        System.out.println(stud.toString());
    }
}
