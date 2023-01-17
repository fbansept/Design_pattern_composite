import java.util.List;

public class Projet extends ComponentTache{

    private List<ComponentTache> children;

    public Projet(String nom) {
        super(nom);
    }

    @Override
    int getDuree() {

        int dureeTotal = 0;

        for(ComponentTache c : children){
            dureeTotal += c.getDuree();
        }
        
        return dureeTotal;
    }

    public void add(ComponentTache tache) {
        children.add(tache);
    }

    public void remove(ComponentTache tache) {
        children.remove(tache);
    }
}
