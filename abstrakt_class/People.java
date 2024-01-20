package abstrakt_class;
import java.util.Objects;
public abstract class People {
    private String name;
    private String locashen="";
    private int dexterity;
    public People(String name,int dexterity){
        this.name = name;
        this.dexterity=dexterity;
    }

    @Override
    public String toString() {
        return ("Создан обьект " + this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People pepls = (People) o;
        return Objects.equals(name, pepls.name);//(dnaCode == pepls.dnaCode);
    }
}
