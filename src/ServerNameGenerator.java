
public class ServerNameGenerator {

    public static String serverGenerator(String[] inputStringArray){
        return inputStringArray[(int)(Math.floor(Math.random() * inputStringArray.length))];
    }

    public static void main(String[] args) {
        String[] nouns = {"airport", "ambulance", "helicopter", "planet", "piano", "hamburger", "guitarr", "hair", "animal","eggplant"};
        String[] adjectives = {"annoying", "amused", "alert", "obnoxious", "blue","bored","embarassed", "fragile", "foolish", "fantastic"};

        System.out.println("Here is your server name: \n" + serverGenerator(adjectives) + " " + serverGenerator(nouns));

    }
}