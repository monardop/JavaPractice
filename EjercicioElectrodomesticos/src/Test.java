public class Test {
    private final Product  normal;
    private final RefrigeratedProduct refrigerated;
    private final FrozenProducts frozen;
    private final FreshProduct fresh;
    public Test() {
        this.normal = new Product("22/7/97", "12341AN23123J");
        this.fresh = new FreshProduct("11/4/98", "NIQ1231NASD", "asndf123", "Argentina");
        this.frozen = new FrozenProducts("9/12/96", "SDFSDF4672836", 36);
        this.refrigerated = new RefrigeratedProduct("11/3/1998", "NUIHNISDF212345", 456);
    }

    public void showTest() {
        System.out.println(normal);
        System.out.println(fresh);
        System.out.println(frozen);
        System.out.println(refrigerated);
    }
}
