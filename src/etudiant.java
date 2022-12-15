import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4bea73e-1ffe-48ae-8ca4-93535fa19f9b")
public class etudiant {
    @objid ("465b6486-2fd5-4942-a5ef-b7cd6637884b")
    public int etudiant_id;

    @objid ("61a24a37-625c-42c6-808b-816be834696a")
    public String etudiant_nom;

    @objid ("1d4ce43f-58e0-471f-ba10-b3ee6229ce0a")
    public String etudiant_prenom;

    @objid ("c29c1936-2727-4cd8-a5d2-bbe132e07a50")
    public String etudiant_adresse;

    @objid ("34f71954-5640-407e-bc36-50ed36be5b0c")
    public String etudiant_lieunais;

    @objid ("66dfff09-f4c3-4de0-bae4-72b82df0ac71")
    public String etudiant_email;

    @objid ("dd4a1120-aeaf-4dc3-8461-36aa3fe7ad1d")
    protected String etudiant_motDePasse;

    @objid ("ada4152e-9e03-4454-bb74-d72a130fbad2")
    public String etudiant_status;

    @objid ("c15c879f-6a78-489f-84f1-b9b594908891")
    public List<badge> badge = new ArrayList<badge> ();

    @objid ("e60f0a81-a0dc-4de7-9bd1-feb3ebd8bd00")
    public List<question> question = new ArrayList<question> ();

    @objid ("eacfae8d-fa1d-4573-b99b-113c641cc5ee")
    public List<role> role = new ArrayList<role> ();

    @objid ("0a38d6d2-e681-4946-899a-be96e766c129")
    public compteEtudiant compteEtudiant;

    @objid ("cf4acc44-9b03-4bea-a20f-4a4ecd193f43")
    public void ajouterEtudiant():bool() {
    }

    @objid ("63881cc9-1577-43e8-b2eb-ed7d3d8baa82")
    public void modifierEtudiant(etudiant_id :integer):bool() {
    }

    @objid ("102cf26c-488b-4947-9e00-52fe4e911628")
    public void consuterEtudiant(etudiant_id:integer):bool() {
    }

    @objid ("de5ffbb1-9eb2-4c4f-aaba-e41a1dfc6ebe")
    public void listeEtudiant():etudiant() {
    }

    @objid ("438c206e-e76c-412e-bab8-c3d93542cb33")
    public void getEmail():string() {
    }

    @objid ("22d958e9-e723-4097-879e-f4ae52a19670")
    public void creerQuestion():bool() {
    }

    @objid ("046f22ca-270c-49aa-912f-bc69f5908bfa")
    String getEtudiant_motDePasse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.etudiant_motDePasse;
    }

    @objid ("eaeb10e1-e2bc-4800-9ade-1feea9af54b1")
    void setEtudiant_motDePasse(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.etudiant_motDePasse = value;
    }

    @objid ("167d6dc6-1514-4a81-a323-5b737975eb17")
    public etudiant() {
    }

}
