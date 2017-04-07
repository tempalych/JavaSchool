package generics3.vault.developers.javaDevelopers;

import generics3.vault.developers.Developer;

/**
 * Created by artem on 06.04.17.
 */
public class JavaDeveloper extends Developer {
    private boolean workPPRB;

    public JavaDeveloper(String name, Integer iq, boolean workPPRB) {
        super(name, iq);
        this.workPPRB = workPPRB;
    }

    public JavaDeveloper(String name, Integer iq) {
        super(name, iq);

    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name" + super.getName() +"; "+
                "iq=" + super.getIq() +"; "+
                "workPPRB=" + workPPRB +"; "+
                '}';
    }
}
