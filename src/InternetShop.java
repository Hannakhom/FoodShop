public class InternetShop  extends Shop{
    private User [] users;


    public InternetShop(FoodStuff[] foodStuffs, User[] users){
        super(foodStuffs);
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User [] getByUserName(String name){
        User [] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if(users[i].getName().equals(name)){
                result[i] = users[i];
            }
        }
        return result;
    }

    public User [] getByUserEmail(String email){
        User [] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if(users[i].getEmail().equals(email)){
                result[i] = users[i];
            }
        }
        return result;
    }

    public static void printArrUsers(User [] users){
        for (int i = 0; i < users.length; i++) {
            if(users [i] != null){
                System.out.println(users[i].toString());
            }
        }
    }
}