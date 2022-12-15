import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2045b2ee-e64b-4777-8d4a-dfd4d0450216")
public class commentaire {
    @objid ("fadf184a-9e3f-4301-ac7a-b0f5f798b80a")
    public int id_co;

    @objid ("d34a6281-9416-4dbc-93d3-26467f95b31b")
    public String descriptionCo;

    @objid ("d12c69a4-e1a7-4dbf-a847-07e23e7e8bbf")
    public int nbre_vote;

    @objid ("b305814d-fd9e-42ff-bfd9-c465db7ea640")
    public Date heure_creation;

    @objid ("c41b90b8-0480-456b-b03c-d4ef2f6f4ae6")
    public photo photo;

    @objid ("70de2ccc-f4da-4e41-9883-782c3bef0370")
    public List<notification> notification = new ArrayList<notification> ();

    @objid ("1ff6402d-119d-49bb-9923-0b06c0112fd8")
    public void incrementerVoteCount():void() {
    }

    @objid ("6e08aae2-5007-4ac5-b458-0434ae726f0b")
    public void ajouterCo():bool() {
    }

    @objid ("932fa346-9dbd-490b-b1e0-588a566a991e")
    public void modifierCo(id_co:integer):bool() {
    }

    @objid ("b4505045-7c79-469b-874c-46aa0734bfe5")
    public void supprimerCo(id_co:integer):bool() {
    }

    @objid ("1bb46d51-cfa7-462d-bc42-248b1adba28d")
    public void consulter():commentaire() {
    }

    @objid ("e26c25d3-f7b8-457c-a020-c74a372a7912")
    public commentaire() {
    }

}
