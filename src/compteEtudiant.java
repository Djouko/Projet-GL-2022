import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a19c8db7-59c5-4a91-b0fe-127c368c1c06")
public class compteEtudiant {
    @objid ("577a49a5-c6e2-400e-991e-faab93ad06f7")
    private int comptEtud_id;

    @objid ("7e49b182-42e6-448c-bc1b-9790c4cfe771")
    private String Pseudo;

    @objid ("41c190da-1293-4e4c-b864-ec0bb964c334")
    private String password;

    @objid ("7744fa70-b4c3-4ba9-923b-bcedbd5042a4")
    private String status;

    @objid ("7a34e957-2738-4781-94d5-66e8e08308ff")
    public void modifierCompte(compteEtud_id : integer):bool() {
    }

    @objid ("5f7ccf54-0b92-42bf-9783-323d24d7aa7f")
    public void supprimerCompte(compteEtud_id:integer):bool() {
    }

    @objid ("050ad0dc-4ed9-4992-baac-0fae62f22c32")
    public void desactiverCompte(compteEtud_id:int):bool() {
    }

    @objid ("aa761db5-f5fa-4078-b0aa-1871dc6bcd1c")
    public void activerCompte(compteEtud_id: int):bool() {
    }

    @objid ("be843059-bb41-466d-9648-8d0e0f0d4717")
    public void modifierMotDePasse() {
    }

    @objid ("23277caf-0d7b-4e42-b1e1-b7f892724f5e")
    int getComptEtud_id() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.comptEtud_id;
    }

    @objid ("126547bc-91ca-4839-a471-52fa6b1e1ddc")
    void setComptEtud_id(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.comptEtud_id = value;
    }

    @objid ("d57676d9-cd63-4f54-9227-0067acbb1823")
    String getPseudo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Pseudo;
    }

    @objid ("5c4e1f3c-310d-427a-994e-07b4fcdb5c4c")
    void setPseudo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Pseudo = value;
    }

    @objid ("32598ed5-4e23-475a-b10b-4b9dfad01b8f")
    String getPassword() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.password;
    }

    @objid ("77e6b150-09c0-4243-ab45-0b0c9d2f9643")
    void setPassword(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.password = value;
    }

    @objid ("1cdd3b14-018f-4751-bb30-2c112fbd57da")
    public compteEtudiant() {
    }

}
