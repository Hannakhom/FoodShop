public class FoodStuff {
    private String foodName;
    private String typOfFood;
    private String brandName;
    private double price;
    private double weight;

    public FoodStuff(){
    }
    public FoodStuff(String foodName, String typOfFood, String brandName, double price, double weight){
        this.foodName = foodName;
        this.brandName = brandName;
        this.typOfFood = typOfFood;
        this.price = price;
        this.weight = weight;
    }
    public String getFoodName() {
        return foodName;
    }
    public String getTypOfFood() {
        return typOfFood;
    }

    public String getBrandName(){
        return brandName;
    }

    public double getWeight(){
        return weight;
    }

    public double getPrice(){
        return price;
    }

    public void setFoodName( String foodName){
        if (foodName == null || foodName.isEmpty()){
            this.foodName = "unknown";
        }else {
            this.foodName = foodName;
        }
    }

    public void setTypOfFood(String typOfFood) {
        this.typOfFood = typOfFood;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "FoodStuff{" +
                "foodName='" + foodName + '\'' +
                ", typOfFood='" + typOfFood + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

}
