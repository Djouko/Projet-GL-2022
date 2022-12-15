import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("207ada71-12c8-4c66-9cf3-ed20c4ddac27")
public class contributeur {
    @objid ("2af55201-d7b2-455d-a8e1-63c2fcf7bf70")
    private int idCon;

    @objid ("a0e50ee8-b0fd-4e99-91f9-a4321cf9838c")
    public String nomCon;

    @objid ("6db7e966-f290-4ec0-8f61-24e65603ba87")
    public List<publication> publication = new ArrayList<publication> ();

    @objid ("0b1c8b32-ea57-4c51-b963-d0ffec39eb84")
    public void modifierPub()() {
    }

    @objid ("c10214c1-e546-4bc5-8ae9-5a562c50fb7c")
    public void supprimerPub()() {
    }

    @objid ("035b54e5-2c5f-4152-82d3-715fa776d7d7")
    public void consulterPub()() {
    }

    @objid ("bd8c3b5b-1ee1-40b5-acc5-ffb3145837ec")
    public contributeur() {
    }

}
