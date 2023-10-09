public class Second extends First{
    public Second(Dificult person, Enum anEnum) {
        super(person, anEnum);
    }
    public void printInfo(Dificult nameAndAge, Enum anEnum){
        System.out.println("Name: "+ nameAndAge.getName());
        System.out.println("Age: "+ nameAndAge.getAge());
        System.out.println("Number: "+ anEnum);
    }
    public final  void  printInfo(Enum count){
        System.out.println("Number: "+ count);
    }
    public void printInfo(){
        System.out.println("Name: "+ getPerson().getName());
        System.out.println("Age: "+ getPerson().getAge());
    }
}
