public class RunFood {

    public static void main(String[] arg){

        FoodStuff foodStuff1 = new FoodStuff("banana", "fruit", "acb", 5,1.2 );
        FoodStuff foodStuff2 = new FoodStuff("orange","fruit", "civ", 7,2);
        FoodStuff foodStuff3 = new FoodStuff("tomato","vegetables", "civ", 2,2);
        FoodStuff[] foodStuffs = new FoodStuff[3];
        foodStuffs[0] = foodStuff1;
        foodStuffs[1] = foodStuff2;
        foodStuffs[2] = foodStuff3;
        for (int i = 0; i < foodStuffs.length; i++) {
            System.out.println(foodStuffs[i].getFoodName());
            System.out.println(foodStuffs[i].getTypOfFood());
            System.out.println(foodStuffs[i].getBrandName());
            System.out.println(foodStuffs[i].getPrice());
            System.out.println(foodStuffs[i].getWeight());
            foodStuff1.setFoodName("");
            System.out.println(foodStuffs[i].getFoodName());
        }


        Shop shop = new Shop(foodStuffs);
        FoodStuff orange = shop.getFoodStuffByFoodName("orange");
        System.out.println(orange.getPrice() + " " + orange.getWeight());
        FoodStuff price = shop.getFoodStuffByPrice(5);
        System.out.println(price.toString());

        FoodStuff [] typ = shop.getFoodStuffByTypOfFood("fruit");
        Shop.printArrFoodStuff(typ);

        FoodStuff [] prices = shop.getFoodStuffByPriceA(2.1,7.1);
        Shop.printArrFoodStuff(prices);

        FoodStuff [] weight = shop.getFoodStuffByWeight(1.5,3);
        Shop.printArrFoodStuff(weight);

        FoodStuff [] brand = shop.getFoodStuffByBrandName("acb");
        Shop.printArrFoodStuff(brand);


        User [] users = new User[4];
        users[0] = new User("Anna", "aaa@b.com", "12345678");
        users[0].setBasket(foodStuffs);
        users[1] = new User("Inna", "iii@b.com", "12345678");
        users[2] = new User("Mark", "mmm@b.com", "12345678");
        users[3] = new User("Tom", "ttt@b.com", "123456789");
        for (int i = 0; i < users.length; i++) {
           System.out.println(users[i].toString());
            users[2].setPassword("123");
            System.out.println(users[2].getPassword());
            users[0].setEmail("");
            System.out.println(users[0].getEmail());
            users[1].setName("");
            System.out.println(users[1].getName());
        }

        InternetShop internetShop = new InternetShop(foodStuffs, users);
             String result1 = internetShop.getUserByName("Tom");
             System.out.println(result1);

             String result2 = internetShop.getUserByEmail("iii@b.com");
             System.out.println(result2);


    }

}
