import java.io.File;

public class Fichier implements Composant {
    private File fichier;

    public Fichier(File fichier) {
        this.fichier = fichier;
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + fichier.getName());
    }
}


