class Widget extends Product {
    private String productionDate;

    public Widget(String id, String pd, double pr) {

        super(id.concat("_" + pd), pr);
//        System.out.println("ID: " + id.concat("_" + pd));
        productionDate = pd;
    }

    @Override
    public String getProductID() {
        return super.getProductID();
    }

}
