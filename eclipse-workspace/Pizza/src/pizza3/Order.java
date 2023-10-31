package pizza3;
import java.util.Date;

public class Order implements Deliverable {
    private int orderNo;
    private Date orderDate;
    private int cost;
    private String custName;
    private String custAddress;
    private int approxDistance;

    public Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
        this.setOrderNo(orderNo);
        this.setOrderDate(orderDate);
        this.setCost(cost);
        this.setCustName(custName);
        this.setCustAddress(custAddress);
        this.approxDistance = approxDistance;
    }

    public boolean delivery() {
        if (approxDistance <= Deliverable.deliveryAreaLimit) {
            return true;
        } else {
            System.out.println("Home Delivery not available for this distance.");
            return false;
        }
    }

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
}
