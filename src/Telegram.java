public class Telegram extends Chat {
    private int countOfMessage;
    private char gender;


    public Telegram(String name, int dateOfIssue, String designColor, int countOfMessage, char gender) {
        super(name, dateOfIssue, designColor);
        this.countOfMessage = countOfMessage;
        this.gender = gender;
    }

    public int getCountOfMessage() {
        return countOfMessage;
    }

    public void setCountOfMessage(int countOfMessage) {
        this.countOfMessage = countOfMessage;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    void getChatName() {
        super.getChatName();
    }

    @Override
    void getIsNewChat() {
        super.getIsNewChat();
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", isNew=" + getIsNew() +
                ", dateOfIssue=" + getDateOfIssue() +
                ", designColor='" + getDesignColor() + '\'' +
                ", countOfMessage=" + getCountOfMessage() +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
