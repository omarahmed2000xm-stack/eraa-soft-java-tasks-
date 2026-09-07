public class Login {
    private String username ;
    private String  password;
    private int id ;

    Login(String username,String password){
        this.username=username;
        this.password=password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void login(){
      if (!username.equals("omar")||!password.equals("234234")){
          throw new IllegalArgumentException("invalid credential");

      }
      else {
          System.out.println(" you have logged in succesfully : (");
      }
    }
}
