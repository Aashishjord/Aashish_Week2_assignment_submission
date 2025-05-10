
    class Student{
        String name;
        int age;
    
        Student(String name, int age){
            this.name=name;
            this.age=age;
    
        }
        void displayInfo(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
    
        }
    }
    public class Qn4_simple {
        public static void main(String[] args) {
            Student student1=new Student("Aashish ",18);
            student1.displayInfo();
    
        }
    }

