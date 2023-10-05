public class Customer {


 //1.a
  private  String firstName;
   private String lastName;
   private String username;
   private int id;

//1.b
   //En konstruktør har ingen returtype
   public Customer(String firstName, String lastName,String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
   }

    @Override
    public String toString() {
       return "Firstname: "+firstName + " Lastname: "+lastName + " username: " + username ;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getid() {
        return id;
    }

}
