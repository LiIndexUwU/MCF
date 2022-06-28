package team.brb.mcf.util;

public class BotConnect {

    public String userToSendMessagesTo;

    public BotConnect(String userToSendMessagesTo) {
        this.userToSendMessagesTo = userToSendMessagesTo;
    }

    public String getUserToSendMessagesTo() {
        return userToSendMessagesTo;
    }

    public void connect() {
        int tries = 0;
        for (int i = 0; i < 100; i++) {
            println("[...........]");
            println("[C..........]");
            println("[Co.........]");
            println("[Con........]");
            println("[Conn.......]");
            println("[Conne......]");
            println("[Connec.....]");
            println("[Connect....]");
            println("[Connecti...]");
            println("[Connectin..]");
            println("[Connecting.]");
            tries++;
        }

        if (tries == 99) {
            println("[Connected]");
        } else {
            println("[Connection Lost]");
        }

        PlayerUtil.getInfo("johnclark15");

    }

    public static void println(String x) {
        System.out.println(x);
    }
}