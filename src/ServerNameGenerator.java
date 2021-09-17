
public class ServerNameGenerator {

    public static String serverGenerator(String[] inputArray){
        return inputArray[(int)(Math.floor(Math.random() * inputArray.length))];
    }

    public static void main(String[] args) {
        String[] nouns = {"airport", "ambulance", "helicopter", "planet", "piano", "hamburger", "guitarr", "hair", "animal","eggplant"};
        String[] adjectives = {"annoying", "amused", "alert", "obnoxious", "blue","bored","embarassed", "fragile", "foolish", "fantastic"};

        System.out.println("Here is your server name: \n" + serverGenerator(adjectives) + " " + serverGenerator(nouns));

    }
}