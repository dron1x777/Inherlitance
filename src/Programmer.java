public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String coding() {
        return "programmer is coding";
    }

}
