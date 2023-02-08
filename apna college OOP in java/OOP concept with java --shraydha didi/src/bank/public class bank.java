package bank;

class Account {
    public String name; // public access modifier
    String lastName; //default
    private email; //private AM
    protected password; //protected AM

    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(){
        this.password = pass;
    }
}


public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna  College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcd")
        System.out.println(account1.getPassword());

    }


}