

public abstract class ComponentTache {
    private String nom;

    public ComponentTache( String nom) {
        this.nom = nom;
    }

    abstract int getDuree();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
