package prisBeregner;

public class Main {
    void main(){

        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Price with discount: " + finalPrice + " kr");




    }


    double applyDiscount(double price, double discountPercent){
        return price * (1 - discountPercent / 100); //forstod ikke beregningen

    }

    double addTax(double price){
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount){
        double discountPrice = applyDiscount(basePrice, discount);
        double finalPrice = addTax(discountPrice);
        return finalPrice;
    }


}



