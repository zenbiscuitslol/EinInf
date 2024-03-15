import java.util.Arrays;
import java.util.Random;

public class Food implements Comparable<Food> {
    public String type;
    public int calories;
    private static final String[] TYPES = {"Apple", "Pear", "Cookie", "Grape"}; //types of food

    private static final int[] CAL = {52, 57, 502, 57}; //calories for each food

    public Food(String type, int calories) { //constructor to create food object
        // TODO: only allow objects of types that are listed in TYPES
        this.type=type;
        this.calories=calories;
    }
    public String toString(){
         // TODO: return a String with the attributes
        return "Type: "+ type +" Calories :"+ calories;
    }
    public int compareTo(Food o) {
        // TODO: make the food comparable
         int compare1= this.type.length()*this.calories; //multiplies length of string with the calories
         int compare2= o.type.length()*o.calories;
         return Integer.compare(compare1,compare2);
    }
    public String getType() {
        // TODO: return 
        return this.type;
    }
    public int getCalories() {
        // TODO: return property
        return this.calories;
    }
    public static Food[] createSortedRandomList(int n) {
        // TODO: create a list with n random instances and sort them
        Food[] randomfood = new Food[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(TYPES.length); //generates a random int between 0 and 4
            String foodtype = TYPES[x]; //takes foodtype from the random index
            int cal = CAL[x]; //takes caloriies from the same random index
            randomfood[i] = new Food(foodtype, cal); //adds type and calories 
        }
        Arrays.sort(randomfood);
        return randomfood;
    }
    public static void main(String[] args) {
        // TODO: your test cases
        int compare= new Food("Grape",57).compareTo(new Food("Apple",50));
        System.out.println(compare);
        System.out.println(Arrays.toString(createSortedRandomList(3)));
    }

}
