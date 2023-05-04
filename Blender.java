public class Blender {
    public Juice blend(Fruit fruit) {
        System.out.println(fruit.useful);
        Juice juice = new Juice(fruit.weight * fruit.useful / 100);
        return juice;
    }
}