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
        if (name == null || name.isEmpty()) {
            System.out.println("error");
        }else{
            this.name = name;
        }
    }
    public String getEmail () {
        return email;
    }


    public void setEmail (String email){
        if (email == null || email.isEmpty()){
            System.out.println("error");
        }else{
            this.email = email;
        }
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password){
        if (password.length() >= 8){
            this.password = password;
        } else {
            System.out.println("incorrect");
        }
    }

    public FoodStuff [] getBasket (){
        return basket;
    }

    public void setBasket (FoodStuff[]basket){
        this.basket = basket;

    }

    public double getPriceBasket() {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            sum += basket[i].getPrice();
        }
        return sum;
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