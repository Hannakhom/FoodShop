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

    public String getUserByName(String name){
        String result = new String();
        for (int i = 0; i < users.length; i++) {
            if(users[i].getName().equals(name)){
                result = users[i].toString();
            }
        }
        return result;
    }

    public String getUserByEmail(String email){
        String result = new String();
        for (int i = 0; i < users.length; i++) {
            if(users[i].getEmail().equals(email)){
                result = users[i].toString();
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