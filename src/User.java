import java.util.Arrays;

public class User {
    private String name;
    private String email;
    private String password;
    private FoodStuff[] basket;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == null || name.isEmpty()) {
            System.out.println("error");
        }
    }
    public String getEmail () {
        return email;
    }


    public void setEmail (String email){
        this.email = email;
        if (email == null || email.isEmpty()){
            System.out.println("error");
        }
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password){
        this.password = password;
        String p = ".{8,}";
        if (password.matches(p)) {
            System.out.println(password);
        } else {
            System.out.println("error");
        }

    }

    public FoodStuff [] getBasket (){
        return basket;
    }

    public void setBasket (FoodStuff[]basket){
        this.basket = basket;

    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }

}