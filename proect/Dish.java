public enum  Dish {     /*блюдо*/

    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);

    private int duration;

    Dish(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){
        return "Fish, Steak, Soup, Juice, Water";
    }
}
