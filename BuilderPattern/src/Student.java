package lld.builderpattern;

public class Student {
    int rollNo;
    String name;
    int classNo;
    char section;
    String fatherName;
    String motherName;

    public Student(Builder builder) {
        this.rollNo = builder.rollNo;
        this.classNo = builder.classNo;
        this.name = builder.name;
        this.section = builder.section;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", classNo=" + classNo +
                ", section=" + section +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }


    static class Builder {
        int rollNo;
        String name;
        int classNo;
        char section;
        String fatherName;
        String motherName;

        public Builder rollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder classNo(int classNo) {
            this.classNo = classNo;
            return this;
        }

        public Builder section(char section) {
            this.section = section;
            return this;
        }

        public Builder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }
        public Builder motherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
