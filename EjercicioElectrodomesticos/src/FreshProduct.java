public class FreshProduct extends Product{
    public String packageDate;
    public String originCountry;
    public FreshProduct(String expireDate, String lotNumber, String packageDate, String originCountry) {
        super(expireDate, lotNumber);
        this.originCountry = originCountry;
        this.packageDate = packageDate;

    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getPackageDate() {
        return packageDate;
    }

    @Override
    public String toString() {
        return super.toString() +"Frozen product:" +"\n\tPackage date: " + packageDate + "\n\tOrigin country:" + originCountry;
    }
}

