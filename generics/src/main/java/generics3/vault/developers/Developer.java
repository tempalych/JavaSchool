package generics3.vault.developers;

/**
 * Created by artem on 06.04.17.
 */
public class Developer {
    private String name;
    private Integer iq;

    public Developer(String name, Integer iq) {
        this.name = name;
        this.iq = iq;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                '}';
    }
}
