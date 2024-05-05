package app;

public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean estDisponible;

    public Livre(String titre, String auteur, String isbn, boolean estDisponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.estDisponible = estDisponible;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean estDisponible() {
        return estDisponible;
    }

    public void emprunter() {
        if (estDisponible) {
            estDisponible = false;
        } else {
            System.out.println("Le livre est déjà emprunté.");
        }
    }

    public void restituer() {
        estDisponible = true;
    }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Statut: " + (estDisponible ? "Disponible" : "Emprunté");
    }
}
