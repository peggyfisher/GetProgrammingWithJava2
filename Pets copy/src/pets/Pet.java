package pets;

/**
 *
 * @author PFisher
 */
public class Pet {
    private String petName;
    private String petType;
    private String owner;
    private int petAge;
    
    public Pet(String petName, String petType, String owner,
            int petAge)
    {
        this.petName = petName;
        this.petType = petType;
        this.owner = owner;
        this.petAge = petAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    @Override
    public String toString(){
        return "\nPet name: "+petName + "\nPet type: "+petType + 
                "\nOwner: "+owner + "\nAge: "+petAge;
    }
    
    
}
