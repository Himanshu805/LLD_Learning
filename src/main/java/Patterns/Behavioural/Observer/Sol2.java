package Patterns.Behavioural.Observer;

interface StockListener {

    public void updated(int stock);
}

class App implements StockListener{
    @Override
    public void updated(int stock) {
        System.out.println("App : BurgerStock updated to "+stock);
    }

}

class Web implements StockListener{
    @Override
    public void updated(int stock) {
        System.out.println("Web : BurgerStock updated to "+stock);
    }
}

class BurgerStock1 {
    private int stock;
    private App  app = new App();
    private Web web  = new Web();

    public void setStock(int stock){
        this.stock = stock;
        app.updated(stock);
        web.updated(stock);
    }

}

public class Sol2{
    public static void main(String[] args) {

        BurgerStock1 burgerStock = new BurgerStock1();
        burgerStock.setStock(5);
        burgerStock.setStock(10);
    }

}


