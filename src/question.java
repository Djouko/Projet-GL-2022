import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e6b7b751-a083-47c9-b60e-098c511b2519")
public class question {
    @objid ("4e164687-c6c8-4cd7-924f-558a39633c14")
    public int id_question;

    @objid ("511b7ef4-ac47-4573-be14-d12c680cde0d")
    public String titre;

    @objid ("3fa06075-dbf4-4910-a136-c99882a72320")
    public String description;

    @objid ("036a57b5-1b4a-4e78-88e1-696d65aed8cb")
    public String nbre_vote;

    @objid ("99dbde60-27c2-40b3-9028-d9acb21f6f00")
    public String nbre_vue;

    @objid ("55770c31-e58d-43b8-8bba-781e1dc32a21")
    public String status;

    @objid ("14eb8fe3-dd11-468f-9f50-a4e2385e4501")
    public prime prime;

    @objid ("b97040fa-5f4d-427d-b532-35efd694ddd8")
    public communauté  communauté ;

    @objid ("0c2c0bd5-2430-47a9-aec5-043fd99b65ae")
    public commentaire commentaire;

    @objid ("765d3d25-2382-43f9-9d9d-4327f73375e2")
    public void fermerQuestion():bool() {
    }

    @objid ("675de216-1614-4ba9-b6cc-8cb8056c5c81")
    public void desactiverQuestion():bool() {
    }

    @objid ("9466727f-bd33-4df8-a8d4-a2a214b65cfc")
    public void ajouterQuestion():bool() {
    }

    @objid ("9cb20adf-fa01-4a64-a967-7203677f3d55")
    public void modifierQuestion(id_question:int):bool() {
    }

    @objid ("e2f90c88-6ef8-4bf6-ac1b-be0b1aae11a2")
    public void supprimeQuestion(id_question:int):bool() {
    }

    @objid ("87c5d5b6-4866-419f-9441-0334c6aa62e4")
    public void afficherQuestion(id_question:int):question() {
    }

    @objid ("57ef8d53-aa98-4ecf-b8b8-658a67e27621")
    public void ilstrQuestion():list<question>() {
    }

    @objid ("55dcef58-2fb4-4da4-9215-f9db8ff6ddb6")
    public question() {
    }

}
