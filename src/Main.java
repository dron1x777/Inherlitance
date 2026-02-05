
public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat("a", 3, "blue");
        System.out.println(chat);
        chat.getChatName();
        chat.getIsNewChat();
        Slack slack = new Slack("b", 6, "balck", true, true);
        System.out.println(slack);
        slack.getChatName();
        slack.getIsNewChat();
        Whatsapp whatsapp = new Whatsapp("c", 4, "green", 345, true);
        System.out.println(whatsapp);
        whatsapp.getChatName();
        whatsapp.getIsNewChat();
        Instagram instagram = new Instagram("d", 8765, "yellow", 45, 65);
        System.out.println(instagram);
        instagram.getChatName();
        instagram.getIsNewChat();
        Telegram telegram = new Telegram("e", 3, "purple", 654, 'M');
        System.out.println(telegram);
        telegram.getChatName();
        telegram.getIsNewChat();

    }
}