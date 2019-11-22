public class Classroom {
    
// Main method with class 

    public static void main(String[] args) {
        
        Wilder w1 = new Wilder("Christian", true);
        Wilder w2 = new Wilder("Gerolt", true);
        Wilder w3 = new Wilder("Alex", true);
        Wilder w4 = new Wilder("Thomas", false);

        w1.setFirstname("Christoph");
        w2.setFirstname("Berthold");
        w3.setFirstname("Axel");
        w4.setFirstname("Thorsten");
        

// 8. Print out whoAmI method for all instances

        System.out.println(w1.whoAmI());
        System.out.println(w2.whoAmI());
        System.out.println(w3.whoAmI());
        System.out.println(w4.whoAmI());
    } 
}