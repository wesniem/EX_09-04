package nyc.c4q.wesniemarcelin;

public class Main {

    public static void main(String[] args) {
	Student newStudent = new Student("Wesnie","Marcelin", 230, "burgers");
    Student student2 = new Student("Lisa","Frank", 100,"hotdogs");
        //Test to see if getter method is working properly
        System.out.println(newStudent.getFood());
        //Calls the checkSameFavoriteFood method from the Student class
        System.out.println(Student.checkSameFavoriteFood(newStudent,student2));
    }
//    public static boolean checkSameFavoriteFood(Student x, Student y){
//        if(x.getFood().equals(y.getFood())){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}
