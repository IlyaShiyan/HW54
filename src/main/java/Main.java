import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBox = new ArrayList<>();
        HeavyBox box1 = new HeavyBox(500);
        HeavyBox box2 = new HeavyBox(400);
        HeavyBox box3 = new HeavyBox(350);
        HeavyBox box4 = new HeavyBox(830);
        HeavyBox box5 = new HeavyBox(520);
        heavyBox.add(box1);
        heavyBox.add(box2);
        heavyBox.add(box3);
        heavyBox.add(box4);
        heavyBox.add(box5);

        for (HeavyBox i: heavyBox) System.out.print(i + " ");

        box1.setWeight(501);
        heavyBox.set(0,box1);

        heavyBox.remove(heavyBox.size()-1);

        String[] boxArray = new String[heavyBox.size()];

        System.out.println("\n"+"First way: ");

        for (int i = 0; i < heavyBox.size(); i++) {
           boxArray[i] = String.valueOf(heavyBox.get(i));
            System.out.print(boxArray[i]+ " ");
        }

        System.out.println("\n"+"Second way: ");

        Object[] boxArray2 =  heavyBox.toArray();
        for (Object i: boxArray2) {
            System.out.print(i + " ");
        }

        heavyBox.clear();
        System.out.println(heavyBox);
    }
}
