import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dossier implements Composant {
    private File repertoire;
    private List<Composant> enfants;

    public Dossier(File repertoire) {
        this.repertoire = repertoire;
        this.enfants = new ArrayList<>();
    }

    public void ajouter(Composant composant) {
        enfants.add(composant);
    }

    public void supprimer(Composant composant) {
        enfants.remove(composant);
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + repertoire.getName() + File.separator);

        for (int i = 0; i < enfants.size(); i++) {
            Composant enfant = enfants.get(i);
            if (i == enfants.size() - 1) {
                enfant.afficher(indentation + "└── ");
            } else {
                enfant.afficher(indentation + "├── ");
            }
        }
    }
}
