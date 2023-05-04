public class app {
public static void main(String[] args) {
    // create a Blender
    Blender portableBlender = new Blender();

    // create a few fruit objects
    // 6 objects in memory: 2 x Apple, 2 x Orange, 2 x Pineapple

    // 6 variables of type Fruit
    // Compline time/ Run time

    // UPCASTING
    Fruit smallApple = new Apple(50);
    Fruit bigApple = new Apple(200);
    Fruit smallOrange = new Orange(30);
    Fruit bigOrange = new Orange(500);
    Fruit smallPineapple = new Pineapple(100);
    Fruit bigPineapple = new Pineapple(800);

    // let's blend
    Juice smallAppleJuice = portableBlender.blend(smallApple);
    System.out.println(smallAppleJuice.volume);

    Juice bigOrangeJuice = portableBlender.blend(bigOrange);
    System.out.println(bigOrangeJuice.volume);

    Juice smallPineappleJuice = portableBlender.blend(smallPineapple);
    System.out.println(smallPineappleJuice.volume);
}
}