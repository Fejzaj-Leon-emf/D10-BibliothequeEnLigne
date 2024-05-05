package app;

public class Application {

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(5);
        bibliotheque.ajouterLivre(new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", "9782070643027", true));
        bibliotheque.ajouterLivre(new Livre("Le Seigneur des Anneaux : La Communauté de l'Anneau", "J.R.R. Tolkien", "9782266283611", true));
        bibliotheque.ajouterLivre(new Livre("1984", "George Orwell", "9782070345096", true));
        bibliotheque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "9782070628642", false));
        bibliotheque.ajouterLivre(new Livre("To Kill a Mockingbird", "Harper Lee", "9780061120084", true));

        bibliotheque.afficherTousLesLivres();
        Livre livre = bibliotheque.rechercherParISBN("9782070643027");
        if (livre != null) {
            livre.emprunter();
        }
        bibliotheque.afficherLivresEmpruntes();
        if (livre != null) {
            livre.restituer();
        }
        bibliotheque.afficherLivresDisponibles();
    }
}
