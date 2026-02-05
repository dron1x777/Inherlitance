public class Chat {
   private String name;
   private boolean isNew;
   private int dateOfIssue;
   private String designColor;

   public Chat(String name, int dateOfIssue, String designColor) {
       this.name = name;
       this.isNew = false;
       this.dateOfIssue = dateOfIssue;
       this.designColor = designColor;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDesignColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    void getChatName(){
        System.out.println(name);
    }

    void getIsNewChat(){
        if(dateOfIssue <= 5){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", isNew=" + isNew +
                ", dateOfIssue=" + dateOfIssue +
                ", designColor='" + designColor + '\'' +
                '}';
    }
}
