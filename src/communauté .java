import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c9712f7f-3d45-4408-83ad-67051c8a7ec4")
public class communauté  {
    @objid ("c6ad9e14-560a-42e9-8a5e-0950434a5645")
    public int id_communaute;

    @objid ("10d1a740-3791-4226-9cad-dc1218e44134")
    public String categorie;

    @objid ("64bb9928-7b82-4fc4-bf78-18c524e6d8da")
    public String description;

    @objid ("33d9d6cd-d7e8-4d36-be70-450b875f7cfe")
    public String titre;

    @objid ("b2604d9e-fb64-4b06-a2f6-a3499ba48192")
    public void ajouter():communauté () {
    }

    @objid ("4ec6f82e-b6b8-44cf-861b-9b3db7b38b8c")
    public void supprimer(id_communaute:int):bool() {
    }

    @objid ("3342cf8b-f17c-4a23-b298-774c2bcfe190")
    public void modifier(id_communaute:int):bool() {
    }

    @objid ("0ca3675f-35e0-4297-b51f-a2abfce57411")
    public void consulter(id_communauté:int)bool() {
    }

    @objid ("0f4f8a2e-e369-4756-8721-ee41216e92a0")
    public void ajouterQuestionCommunauté():bool() {
    }

    @objid ("8ecd8a9b-030b-41ef-8145-6a383044915d")
    public communauté () {
    }

}
