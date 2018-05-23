package pets;

/**
 *
 * @author pFisher
 */
public class Pets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet p1 = new Pet("Harley", "dog", "Cy Fisher", 4);
        Pet p2 = new Pet("Angel", "guinea pig", "Aubrey Williams", 3);
        Pet p3 = new Pet("Ava", "dog", "Christy Maclay", 6);
        System.out.println(p1.getOwner() + ",  "+p1.getPetName() + ", " + p1.getPetType());
        p1.setOwner("Addy Wise");
        p1.setPetType("cat");
        p1.setPetName("Fluffy");
        p1.setPetAge(120);
        System.out.println(p1.getOwner() + ",  "+p1.getPetName() + ", " + p1.getPetType());
    }

    public static class Pet {
        private String petName;
        private String petType;
        private String owner;
        private int petAge;
        public Pet(String petName, String petType, String owner,
                int petAge) {
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
            if (petAge < 0 || petAge > 100) {
                System.out.println("Invalid pet age");
            } else {
                this.petAge = petAge;
            }
        }
    }
}
