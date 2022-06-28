package team.brb.mcf.util;

public class PlayerUtil {
    public static String getInfo(String username) {
        return "> Username: " + username + 
        "\n" + "> COORDS: " + "X(" + new Random().nextInt(60000000) + "), Z(" + new Random().nextInt(60000000) + ")";
    }
}