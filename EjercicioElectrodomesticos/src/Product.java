public class Product {
    public String expireDate;
    public String lotNumber;
    public Product(String expireDate, String lotNumber) {
        this.expireDate = expireDate;
        this.lotNumber  = lotNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    @Override
    public String toString() {
        return  "Product = {" + "\nExpire Date: " + expireDate + "\nLot Number: " + lotNumber + "\n}";
    }
}
