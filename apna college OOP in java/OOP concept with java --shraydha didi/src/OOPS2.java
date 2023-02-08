interface Animal {
    public void walk();
}
interface Hervivore {

}
class Horse implements Animal, Hervivore {
    public void walks(){
        System.out.println("walks on 4 legs");
    }
}


public class OOPS2 {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}