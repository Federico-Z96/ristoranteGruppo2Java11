package classRestaurant;

public class first_dishes {
        private String name;
        private double price;

        public first_dishes (String name ,double price) {
            this.name = name;
            this.price = price;
            System.out.println(name + price);
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

  /*  @Override
    public String toString() {
        return "first_dishes{" +
                "name='" + name + '\'' +
                ", price=" + price + " euro" +
                '}';
    }*/

}
