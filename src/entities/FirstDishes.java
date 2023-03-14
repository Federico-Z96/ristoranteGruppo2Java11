package src.entities;

public class FirstDishes {
        private String name;
        private double price;

        public FirstDishes(String name , double price) {
            this.name = name;
            this.price = price;

        }
        public String getName(){
            return name;
        }
        public Double getPrice(){
            return price;
        }
        public String setName(){
            return name;
        }
        public Double setPrice(){
            return price;
        }

    void  printinfo(){
        System.out.println( this.name + this.price+"$");
    }

}
