import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Manikin("Noris", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robocop("1000011", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Meow", distance, heigth);

        Hurdle[] Hurdles = new Hurdle[6];

        boolean isTrack;
        for (int i = 0; i < Hurdles.length; i++) {
            distance = rand.nextInt(10);
            isTrack = rand.nextBoolean();
            if (isTrack) {
                Hurdles[i] = new Track("Track " + i, distance);
            } else {
                Hurdles[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < Hurdles.length; j++) {

                result = Hurdles[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!!");
            } else {
                System.out.println("unsuccessfully!!!");
            }
        }
    }
}