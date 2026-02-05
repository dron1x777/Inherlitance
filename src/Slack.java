public class Slack extends Chat {
    private boolean haveClassGroup;
    private boolean isStudent;

    public Slack(String name, int dateOfIssue, String designColor, boolean haveClassGroup, boolean isStudent) {
        super(name, dateOfIssue, designColor);
        this.haveClassGroup = haveClassGroup;
        this.isStudent = isStudent;
    }

    public boolean isHaveClassGroup() {
        return haveClassGroup;
    }

    public void setHaveClassGroup(boolean haveClassGroup) {
        this.haveClassGroup = haveClassGroup;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
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
                ", haveClassGroup=" + haveClassGroup +
                ", isStudent=" + isStudent +
                '}';
    }
}
