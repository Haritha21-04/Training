package pizza1;

class Customer {

   private int custNo;
   private String custName;
   private String custAddr;

   public Customer() {
       this.custNo = 0;
       this.custName = "Ram";
       this.custAddr = "";
   }
  public void display() {
       System.out.println("Number of customer: " + custNo);
       System.out.println(" Name of customer: " + custName);
       System.out.println("Customer Address: " + custAddr);
   }


   public int getCustNo() {
       return custNo;
   }
   public void setCustNo(int custNo) {
       this.custNo = custNo;
   }
   public String getCustName() {
       return custName;
   }
   public void setCustName(String custName) {
      this.custName = custName;
   }
   public String getCustAddr() {
       return custAddr;
   }
   public void setCustAddr(String custAddr) {
       this.custAddr = custAddr;
   }

}