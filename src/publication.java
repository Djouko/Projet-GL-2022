import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0994a082-2fc0-462c-b267-4c72d62e407a")
public class publication {
    @objid ("d5951c14-0f5c-436a-9d77-faa2f86b556d")
    public int id_pub;

    @objid ("dc163adb-413e-425d-b767-a9486d807f2b")
    public String nomPub;

    @objid ("5065d38d-f1ad-4a67-941e-e0a422cffcae")
    public String description;

    @objid ("7f95ee1e-8a34-4cc6-a0df-07ad65011e7e")
    public void ajouterPub():bool() {
    }

    @objid ("e24c761d-6027-4f84-9e8e-f4732c85b711")
    public void modifierPub(id_pub:int):bool() {
    }

    @objid ("d0d21134-add4-4256-9648-8902c0bd4cc0")
    public void consulter(id_pub:int):publication() {
    }

    @objid ("4be96e1b-ca67-4288-9be4-b4e1959d5e26")
    public void supprime_pub(id_pub:int):bool() {
    }

    @objid ("a7aca133-b49e-4410-a4ff-e80bc2da7e8e")
    public publication() {
    }

}
