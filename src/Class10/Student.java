package Class10;

public class Student {
    //Properties/Attributes
    String name;
    int age;
    String id;

    //Methods?Functions/Behaviours
    void study(){      //void -> behavior
        System.out.println("Studying 16 hours a day......");
    }

    public static void main(String[] args) {
        //we are creating actual student by using the Student class
        Student ehabObj=new Student();
        ehabObj.name="Ehab";
        ehabObj.age=22;
        ehabObj.id="abc123";
        ehabObj.study(); //scanner.nextInt();

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();
    }
}
