package ss5_AccessModfier.ThucHanh;

public class StaticProperty2 {
    public static void main(String[] args) {
        StaticProperty staticProperty1 = new StaticProperty("Mazda 6", "Skyactiv 7");
        System.out.println(staticProperty1.getName());
        staticProperty1.setName("Mazda 7");
        System.out.println(staticProperty1.getName());
        staticProperty1.setEngine("sky 7");
        StaticProperty staticProperty2 = new StaticProperty("Mazda 6", "Skyactiv 6");
        System.out.println(staticProperty2.getEngine());

        StaticProperty staticPropertyn3 = new StaticProperty("name","sky9");
        System.out.println(staticPropertyn3.getName());
        System.out.println(staticProperty1.equals(staticProperty2));
    }
}
