package uz.abbos;

/** Bu erda mahsulotlarni generatsiya qilish  uchun util klass yaratiladi
 * Здесь создается утил класс для того чтобы генерировать продукты */
public final class ProductGenerate {

    private ProductGenerate(){

    }

    /** mahsulotlarni turi bo'yicha generatsiya qilish
     * генерация продукции по productType */
    public static Product get(ProductType productType){
        return switch (productType){
            case LAGMAN -> new Product(ProductType.LAGMAN,93.3,18_000.0);
            case PLOV -> new Product(ProductType.PLOV,217.7,22_000.0);
            case SALAD -> new Product(ProductType.SALAD,98.4,15_000.0);
            case COLA -> new Product(ProductType.COLA,42.0,10_000.0);
            case FANTA -> new Product(ProductType.FANTA,48.0,10_000.0);
            case ICE_CREAM -> new Product(ProductType.ICE_CREAM,140.1,28_000.0);
        }
    }
}
