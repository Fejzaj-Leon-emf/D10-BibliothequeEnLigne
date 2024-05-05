package app;

public class Bibliotheque {
    private Livre[] livres;
    private int index; // Pour suivre le nombre de livres ajoutés

    public Bibliotheque(int taille) {
        livres = new Livre[taille];
        index = 0;
    }

    public void ajouterLivre(Livre livre) {
        if (index < livres.length) {
            livres[index] = livre;
            index++;
        } else {
            System.out.println("Pas de place pour ajouter plus de livres");
        }
    }

    public Livre rechercherParISBN(String isbn) {
        for (int i = 0; i < index; i++) {
            if (livres[i].getIsbn().equals(isbn)) {
                return livres[i];
            }
        }
        return null;
    }

    public void afficherLivresDisponibles() {
        for (int i = 0; i < index; i++) {
            if (livres[i].estDisponible()) {
                System.out.println(livres[i]);
            }
        }
    }

    public void afficherLivresEmpruntes() {
        for (int i = 0; i < index; i++) {
            if (!livres[i].estDisponible()) {
                System.out.println(livres[i]);
            }
        }
    }

    public void afficherTousLesLivres() {
        for (int i = 0; i < index; i++) {
            System.out.println(livres[i]);
        }
    }
}
