public final class  Third extends Second {
    public Third(Dificult person, Enum anEnum) {
        super(person, anEnum);
    }
    public void printInfo(){
        System.out.println("Name: "+ getPerson().getName());
        System.out.println("Number: "+ getAnEnum());
    }
}
