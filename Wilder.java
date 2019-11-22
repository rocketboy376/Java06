public class Wilder {
//  2. Add attributes to class

    private String firstname;
    private boolean present;

// 3. Constructor for firstname and present

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

// 4a. Getters for both attributes

    public String getFirstname() {
        return this.firstname;
    }
    public boolean isPresent() {
        return this.present;
    }
// 4b. Setters for both attributes

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setPresence(boolean present) {
        this.present = present;
    }

// 5. Method returning text

    public String whoAmI() {
        if (isPresent()) {
            return "My name is " + this.getFirstname() + " and I am present.";
        }    
        else {
            return "My name is " + this.getFirstname() + " and I am NOT present.";
        }
    }   
}