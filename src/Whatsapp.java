public class Whatsapp extends Chat{
    private int countOfMessages;
    private boolean haveAccount;

    public Whatsapp(String name, int dateOfIssue, String designColor, int countOfMessages, boolean haveAccount) {
        super(name, dateOfIssue, designColor);
        this.countOfMessages = countOfMessages;
        this.haveAccount = haveAccount;
    }
    public int getCountOfMessages() {
        return countOfMessages;
    }
    public void setCountOfMessages(int countOfMessages) {
        this.countOfMessages = countOfMessages;
    }
    public boolean isHaveAccount() {
        return haveAccount;
    }
    public void setHaveAccount(boolean haveAccount) {
        this.haveAccount = haveAccount;
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
        return "Chat{" +
                "name='" + getName() + '\'' +
                ", isNew=" + getIsNew() +
                ", dateOfIssue=" + getDateOfIssue() +
                ", designColor='" + getDesignColor() + '\'' +
                ", countOfMessages=" + countOfMessages +
                ", haveAccount=" + haveAccount +
                '}';
    }
}

