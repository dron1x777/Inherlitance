public class Instagram extends Chat {
    private int likes;
    private int viewOfProfile;

    public Instagram(String name, int dateOfIssue, String designColor, int likes, int viewOfProfile) {
        super(name, dateOfIssue, designColor);
        this.likes = likes;
        this.viewOfProfile = viewOfProfile;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getViewOfProfile() {
        return viewOfProfile;
    }
    public void setViewOfProfile(int viewOfProfile) {
        this.viewOfProfile = viewOfProfile;
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
                ", likes=" + likes +
                ", viewOfProfile=" + viewOfProfile +
                '}';
    }
}
