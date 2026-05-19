package MyrezEWalletSystem.model;

public class Account {
    private  String Name;
    private String Password;
    private double Balance;
    private String phone;
    private int id ;
    private String email;
    public Account(String email , String password){
       this.email=email;
        this.Password=password;

    }
    public Account(String email, String password, String phone) {
       this.email=email;
        this.Password = password;
        this.phone = phone;
        this.Balance = 0;
    }
    public Account(String email, String password, String phone, int id) {
        this.email=email;
        Password = password;
        this.phone = phone;
        this.id = id;
    }

    public Account(String email, String password, double balance, String phone, int id ) {
      this.email=email;
      this.Password = password;
       this. Balance = balance;
        this.phone = phone;
        this.id  = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return Password;
    }

    public double getBalance() {
        return Balance;
    }

    public String getPhone() {
        return phone;
    }

    public int getId () {
        return id;
    }

    @Override
    public String toString() {
        return "===== Profile =====\n" +
                "Name: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Age: " + id + "\n" +
                "Balance: " + Balance + "\n" +
                "===================";


    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
