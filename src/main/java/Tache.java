


public class Tache extends ComponentTache{

    private int duree;

    public Tache(int duree, String nom) {
        super(nom);

        this.duree = duree;
    }

    @Override
    int getDuree() {
        return this.duree;
    }
}
