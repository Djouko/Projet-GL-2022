import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f5f45ba0-ea78-4caf-a82d-ea9f7b97e171")
public class prime {
    @objid ("f318ef27-05b7-4450-8209-04d907323941")
    public int id_prime;

    @objid ("ff12bb4f-ba45-4a55-ada9-bc96d2b0d080")
    public int reputation;

    @objid ("33489fb0-6c6c-4b56-b489-543ceb85a0ca")
    public String expiration;

    @objid ("9032d6e6-da99-42fd-be20-b8eb7ba3f1c3")
    public List<photo> photo = new ArrayList<photo> ();

    @objid ("7d31bae8-af31-44a2-9e12-1e9c898a350c")
    public void modifierReputation():bool() {
    }

    @objid ("ba26f60e-d4ad-4f3a-87b2-546ea156319f")
    public prime() {
    }

}
