package java_class;

public class StudentClassA {
        private int age;
        private String name;
        private int numberOfCourse;
        private String specialization;



        public StudentClassA ( String name ) {
            this.name = name;

        }
        public void studentAge(int studentAge){
            age =  studentAge;
        }
        public void studentNumberOfCourse(int studentNumberOfCourse){
            numberOfCourse =  studentNumberOfCourse;
        }
        public void studentSpecialization(String studentSpecialization){
            specialization =  studentSpecialization;
        }


        public void printStudentClassA(){
            System.out.println("Имя:"+ name );
            System.out.println("Возраст:" + age );
            System.out.println("Номер курса:" + numberOfCourse );
            System.out.println("Специальность:" + specialization);
          }
}
