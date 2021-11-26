class ManufacturingController {
    static int k = 0;
    public static String requestProduct(String product) {
        k++;
        return String.format("%d. Requested %s", k, product);
    }

    public static int getNumberOfProducts() {
        return k;
    }
}