
/* TODO: create a class called Product with two private properties of name and priceInCents.
      Add a public static method called, find average price that takes in an array of products
      and finds the average price of all products. Add a main method to the class to test some
      values.
   */




public class Product {
    //private vriables
    private String name;
    private int priceInCents;

    //contructor-sets valu of private variables using this keyword.instantiats and gives values to objects
    public Product(String name,int priceInCents){
        this.name = name;
        this.priceInCents = priceInCents;
    }

            //instanc emethods
    public void printDetails(){
        System.out.printf("the product name is : %s The product price is :$%.2f",
                this.name,
                this.priceInCents/100.0);
    }

            //static methods
    public static double getAverageProductPrice(Product[] products){
            int total = 0;
            for(Product product: products){
                total += product.getPriceInCents();
            }
            return total / products.length;
    }
    //getters and setters for variables above

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }





    public static void main(String[] args) {

Product [] products = {

         new Product("hammer",5),
        new Product("nails",4),
        new Product("screwdriver",3)

        };
double average = Product.getAverageProductPrice(products);
        System.out.println(average);
        System.out.println(Product.getAverageProductPrice(products));


    }



















    //-----------original--------
//    private String name;
//    private Double priceInCents;
//
////contructor to instaniate intial values
//public Product(String name, Double priceInCents){
//    this.name = name;
//    this.priceInCents = priceInCents;
//
//}
//
//    public static double findAveragePrice(Product[] products){
//
//        double sum =0;
//                for(Product product : products){
//                    sum += product.priceInCents;
//                }
//                  return sum / products.length;
//    }
//
//
//
//    public static void main(String[] args) {
//
//        //create 3 products
//        Product[] products = {
//        new Product("ductTape", 3.50),
//        new Product("hammer", 5.00),
//        new Product("screwNails", 7.00),
//        new Product("lights", 7.55),
//        new Product("Paint", 7.98)
//
//        };
//        //store 3 products in arrayofproducts
//        //call findaverageprie passing in the array of products strogin value in double variable
//        //use prinftf to format currency for double
//        System.out.println(Product.findAveragePrice(products));
//
//
//
//    }



}
