public class Shop {
    private FoodStuff[] foodStuffs;

    public Shop(FoodStuff[] foodStuffs){
        this.foodStuffs = foodStuffs;
    }
    public Shop(){
    }

    public FoodStuff getFoodStuffByFoodName(String foodName){
        for (int i = 0; i < foodStuffs.length; i++) {
            FoodStuff currFood = foodStuffs[i];
            if(currFood.getFoodName().equals(foodName))
                return currFood;
        }
        return null;
    }

    public FoodStuff getFoodStuffByPrice(double price){
        for (int i = 0; i < foodStuffs.length; i++) {
            FoodStuff currFood = foodStuffs[i];
            if(currFood.getPrice() == price)
                return currFood;
        }
        return null;
    }

    public FoodStuff [] getFoodStuffByTypOfFood(String typOfFood){
        FoodStuff [] result = new FoodStuff[foodStuffs.length];
        for (int i = 0; i < foodStuffs.length; i++) {
            if(foodStuffs[i].getTypOfFood().equals(typOfFood)){
                result [i] = foodStuffs [i];
            }
        }
        return result;
    }

    public static void printArrFoodStuff(FoodStuff[] foodStuffs){
        for (int i = 0; i < foodStuffs.length; i++) {
            if(foodStuffs [i] != null){
                System.out.println(foodStuffs[i].toString());
            }
        }
    }

    public FoodStuff [] getFoodStuffByPriceA(double minPrice, double maxPrice){
        FoodStuff [] result = new FoodStuff[foodStuffs.length];
        for (int i = 0; i < foodStuffs.length; i++) {
            if(foodStuffs[i].getPrice() >=minPrice && foodStuffs[i].getPrice()<=maxPrice) {
                result[i] = foodStuffs[i];
            }
        }
        return result;
    }

    public FoodStuff [] getFoodStuffByWeight(double minWeight, double maxWeight){
        FoodStuff [] result = new FoodStuff[foodStuffs.length];
        for (int i = 0; i < foodStuffs.length; i++) {
            if(foodStuffs[i].getWeight() >=minWeight && foodStuffs[i].getWeight()<=maxWeight) {
                result[i] = foodStuffs[i];
            }
        }
        return result;
    }

    public FoodStuff [] getFoodStuffByBrandName(String brandName) {
        FoodStuff[] result = new FoodStuff[foodStuffs.length];
        for (int i = 0; i < foodStuffs.length; i++) {
            if (foodStuffs[i].getBrandName().equals(brandName)) {
                result[i] = foodStuffs[i];
            }
        }
        return result;
    }

}
