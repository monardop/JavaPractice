public class FrozenProducts extends Product{
    public int recommendedTemperature;

    public FrozenProducts(String expireDate, String lotNumber, int recommendedTemperature) {
        super(expireDate, lotNumber);
        this.recommendedTemperature = recommendedTemperature;
    }

    public int getRecommendedTemperature() {
        return recommendedTemperature;
    }

    @Override
    public String toString() {
        return super.toString() +"Frozen product:" +"\n\tRecommended temperature: " + recommendedTemperature + "ºC";
    }
}
