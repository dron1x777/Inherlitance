public class Dancer extends Person {
    public String groupName;

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    String getGroupName() {
        return groupName;
    }

    String dancing() {
        return"dancer is dancing";
    }

}
