public class RefrigeratedProduct extends Product{
    public int fsbCode;
    public RefrigeratedProduct(String expireDate, String lotNumber, int fsbCode) {
        super(expireDate, lotNumber);
        this.fsbCode = fsbCode;
    }
    public int getFsbCode() {
        return fsbCode;
    }

    @Override
    public String toString() {
        return super.toString() +"Refrigerated product:" +"\n\tFood Supervision Body code: " + fsbCode;
    }
}
