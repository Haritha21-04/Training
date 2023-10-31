package Collections;



import java.util.Date;
import java.util.Vector;

class Bill {
    private int billNo;
    private String custName;
    private Date date;
    private int total;
    private Vector<Pizza> pizza;

    public Bill(int billNo, String custName) {
        this.billNo = billNo;
        this.custName = custName;
        this.date = new Date();
        this.total = 0;
        this.pizza = new Vector<>();
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    public Vector<Pizza> getPizza() {
        return pizza;
    }

    public void addPizza(Pizza pizza) {
        this.pizza.add(pizza);
    }

    public void calculateTotal() {
        total = 0;
        for (Pizza p : pizza) {
            total += calculatePizzaCost(p);
        }
    }

    private int calculatePizzaCost(Pizza pizza) {
        
        return 0;
    }
}
