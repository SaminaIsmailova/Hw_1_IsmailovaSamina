public class Main {
    public static void main(String[] args) {

        Second one =new Second(new Dificult(23, "Stiven"), Enum.ONE);
        Third two = new Third(new Dificult(35,"Mark"), Enum.TWO);
        Third three = new Third(new Dificult(42,"Lera"), Enum.THREE);

        one.printInfo();
        two.printInfo();
        three.printInfo();
        System.out.println("-------------------------");
        one.printInfo(one.getAnEnum());
        two.printInfo(two.getAnEnum());
        three.printInfo(three.getAnEnum());
        System.out.println("-------------------------");
        one.printInfo(one.getPerson(), one.getAnEnum());
        two.printInfo(two.getPerson(), two.getAnEnum());
        three.printInfo(three.getPerson(), three.getAnEnum());
    }
}