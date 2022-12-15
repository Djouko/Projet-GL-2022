import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("70d55dc5-db2c-4fc4-8588-cfd7ad5ce90f")
public class notification {
    @objid ("a58bbc47-02a9-455b-9ca3-6e824a2e0850")
    public int id_notification;

    @objid ("561f0b43-2543-4b8f-8548-fbd402ba7759")
    public String contenu;

    @objid ("0098f3e0-460c-4af9-b278-7aebaf243167")
    public Date creationTime;

    @objid ("79c5fbef-c878-4e57-b620-c182d55fcd0e")
    public etudiant etudiant;

    @objid ("93ddbe67-73fd-4f1a-b856-1c69cfd01daa")
    public void envoyerNotification():bool() {
    }

    @objid ("6821b762-b964-4842-8481-e9df614bab67")
    public notification() {
    }

}
