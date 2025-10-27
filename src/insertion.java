import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

public class insertion {

    public static List<dto> insertInClass() {
        dto product1 = new dto();
        product1.setTitle("Essence Mascara Lash Princess");
        product1.setDescription("Volumizing mascara");
        product1.setCategory("beauty");
        product1.setPrice(9.99);
        product1.setDiscountPercentage(10.48);
        product1.setRating(2.56);
        product1.setStock(99);
        product1.setBrand("Essence");
        product1.setSku("BEA-ESS-ESS-001");
        product1.setWeight(4);
        product1.setWarrantyInformation("1 week warranty");
        product1.setShippingInformation("Ships in 3-5 days");
        product1.setAvailabilityStatus("In Stock");
        product1.setReturnPolicy("No return policy");
        product1.setMinimumOrderQuantity(48);
        product1.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/essence-mascara-lash-princess/thumbnail.webp");

        dto product2 = new dto();
        product2.setTitle("Neutrogena Hydro Boost Water Gel");
        product2.setDescription("Oil-free moisturizer");
        product2.setCategory("beauty");
        product2.setPrice(9.99);
        product2.setDiscountPercentage(12.75);
        product2.setRating(4.32);
        product2.setStock(120);
        product2.setBrand("Neutrogena");
        product2.setSku("BEA-NEU-HYD-002");
        product2.setWeight(50);
        product2.setWarrantyInformation("No warranty");
        product2.setShippingInformation("Ships in 2-4 days");
        product2.setAvailabilityStatus("In Stock");
        product2.setReturnPolicy("7-day return policy");
        product2.setMinimumOrderQuantity(24);
        product2.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/neutrogena-hydro-boost/thumbnail.webp");

        dto product3 = new dto();
        product3.setTitle("L'Oreal Paris Revitalift Cream");
        product3.setDescription("Anti-aging moisturizer");
        product3.setCategory("beauty");
        product3.setPrice(15.50);
        product3.setDiscountPercentage(15.00);
        product3.setRating(4.7);
        product3.setStock(85);
        product3.setBrand("L'Oreal Paris");
        product3.setSku("BEA-LOR-REV-003");
        product3.setWeight(60);
        product3.setWarrantyInformation("6 months warranty");
        product3.setShippingInformation("Ships in 2-5 days");
        product3.setAvailabilityStatus("In Stock");
        product3.setReturnPolicy("No return");
        product3.setMinimumOrderQuantity(12);
        product3.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/loreal-revitalift/thumbnail.webp");

        dto product4 = new dto();
        product4.setTitle("Maybelline Fit Me Foundation");
        product4.setDescription("Matte + Poreless");
        product4.setCategory("beauty");
        product4.setPrice(7.99);
        product4.setDiscountPercentage(8.5);
        product4.setRating(4.1);
        product4.setStock(200);
        product4.setBrand("Maybelline");
        product4.setSku("BEA-MAY-FIT-004");
        product4.setWeight(30);
        product4.setWarrantyInformation("No warranty");
        product4.setShippingInformation("Ships in 3-5 days");
        product4.setAvailabilityStatus("In Stock");
        product4.setReturnPolicy("7-day return");
        product4.setMinimumOrderQuantity(20);
        product4.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/maybelline-fit-me/thumbnail.webp");

        dto product5 = new dto();
        product5.setTitle("Revlon ColorStay Lipstick");
        product5.setDescription("Long-lasting lipstick");
        product5.setCategory("beauty");
        product5.setPrice(6.50);
        product5.setDiscountPercentage(5.5);
        product5.setRating(4.0);
        product5.setStock(150);
        product5.setBrand("Revlon");
        product5.setSku("BEA-REV-COL-005");
        product5.setWeight(20);
        product5.setWarrantyInformation("No warranty");
        product5.setShippingInformation("Ships in 3-4 days");
        product5.setAvailabilityStatus("In Stock");
        product5.setReturnPolicy("No return");
        product5.setMinimumOrderQuantity(15);
        product5.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/revlon-colorstay/thumbnail.webp");

        // Add remaining 10 products similarly...
        dto product6 = new dto();
        product6.setTitle("Nivea Soft Cream");
        product6.setDescription("Light moisturizer");
        product6.setCategory("beauty");
        product6.setPrice(4.99);
        product6.setDiscountPercentage(6.0);
        product6.setRating(4.3);
        product6.setStock(180);
        product6.setBrand("Nivea");
        product6.setSku("BEA-NIV-SOF-006");
        product6.setWeight(50);
        product6.setWarrantyInformation("No warranty");
        product6.setShippingInformation("Ships in 2-4 days");
        product6.setAvailabilityStatus("In Stock");
        product6.setReturnPolicy("7-day return");
        product6.setMinimumOrderQuantity(10);
        product6.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/nivea-soft/thumbnail.webp");

        dto product7 = new dto();
        product7.setTitle("Himalaya Face Wash");
        product7.setDescription("Gentle face wash");
        product7.setCategory("beauty");
        product7.setPrice(3.99);
        product7.setDiscountPercentage(4.0);
        product7.setRating(4.5);
        product7.setStock(250);
        product7.setBrand("Himalaya");
        product7.setSku("BEA-HIM-FAC-007");
        product7.setWeight(60);
        product7.setWarrantyInformation("No warranty");
        product7.setShippingInformation("Ships in 3 days");
        product7.setAvailabilityStatus("In Stock");
        product7.setReturnPolicy("No return");
        product7.setMinimumOrderQuantity(5);
        product7.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/himalaya-facewash/thumbnail.webp");

        dto product8 = new dto();
        product8.setTitle("Garnier Micellar Water");
        product8.setDescription("Cleansing water");
        product8.setCategory("beauty");
        product8.setPrice(5.50);
        product8.setDiscountPercentage(7.0);
        product8.setRating(4.2);
        product8.setStock(130);
        product8.setBrand("Garnier");
        product8.setSku("BEA-GAR-MIC-008");
        product8.setWeight(100);
        product8.setWarrantyInformation("No warranty");
        product8.setShippingInformation("Ships in 2-3 days");
        product8.setAvailabilityStatus("In Stock");
        product8.setReturnPolicy("7-day return");
        product8.setMinimumOrderQuantity(8);
        product8.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/garnier-micellar/thumbnail.webp");

        dto product9 = new dto();
        product9.setTitle("Lakme Kajal");
        product9.setDescription("Waterproof kajal");
        product9.setCategory("beauty");
        product9.setPrice(4.25);
        product9.setDiscountPercentage(3.5);
        product9.setRating(4.4);
        product9.setStock(140);
        product9.setBrand("Lakme");
        product9.setSku("BEA-LAK-KAJ-009");
        product9.setWeight(10);
        product9.setWarrantyInformation("No warranty");
        product9.setShippingInformation("Ships in 2-3 days");
        product9.setAvailabilityStatus("In Stock");
        product9.setReturnPolicy("No return");
        product9.setMinimumOrderQuantity(12);
        product9.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/lakme-kajal/thumbnail.webp");

        dto product10 = new dto();
        product10.setTitle("Biotique Bio Shampoo");
        product10.setDescription("Herbal shampoo");
        product10.setCategory("beauty");
        product10.setPrice(6.99);
        product10.setDiscountPercentage(8.0);
        product10.setRating(4.1);
        product10.setStock(90);
        product10.setBrand("Biotique");
        product10.setSku("BEA-BIO-SHA-010");
        product10.setWeight(200);
        product10.setWarrantyInformation("No warranty");
        product10.setShippingInformation("Ships in 3-5 days");
        product10.setAvailabilityStatus("In Stock");
        product10.setReturnPolicy("7-day return");
        product10.setMinimumOrderQuantity(10);
        product10.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/biotique-shampoo/thumbnail.webp");

        dto product11 = new dto();
        product11.setTitle("The Body Shop Body Butter");
        product11.setDescription("Moisturizing body butter");
        product11.setCategory("beauty");
        product11.setPrice(12.99);
        product11.setDiscountPercentage(9.0);
        product11.setRating(4.6);
        product11.setStock(60);
        product11.setBrand("The Body Shop");
        product11.setSku("BEA-TBS-BOD-011");
        product11.setWeight(150);
        product11.setWarrantyInformation("No warranty");
        product11.setShippingInformation("Ships in 3 days");
        product11.setAvailabilityStatus("In Stock");
        product11.setReturnPolicy("No return");
        product11.setMinimumOrderQuantity(6);
        product11.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/bodyshop-bodybutter/thumbnail.webp");

        dto product12 = new dto();
        product12.setTitle("Dove Shampoo");
        product12.setDescription("Daily care shampoo");
        product12.setCategory("beauty");
        product12.setPrice(5.50);
        product12.setDiscountPercentage(6.0);
        product12.setRating(4.0);
        product12.setStock(110);
        product12.setBrand("Dove");
        product12.setSku("BEA-DOV-SHA-012");
        product12.setWeight(180);
        product12.setWarrantyInformation("No warranty");
        product12.setShippingInformation("Ships in 2-4 days");
        product12.setAvailabilityStatus("In Stock");
        product12.setReturnPolicy("7-day return");
        product12.setMinimumOrderQuantity(12);
        product12.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/dove-shampoo/thumbnail.webp");

        dto product13 = new dto();
        product13.setTitle("Clinique Moisturizer");
        product13.setDescription("Hydrating cream");
        product13.setCategory("beauty");
        product13.setPrice(18.99);
        product13.setDiscountPercentage(10.0);
        product13.setRating(4.7);
        product13.setStock(40);
        product13.setBrand("Clinique");
        product13.setSku("BEA-CLI-MOI-013");
        product13.setWeight(60);
        product13.setWarrantyInformation("No warranty");
        product13.setShippingInformation("Ships in 2-3 days");
        product13.setAvailabilityStatus("In Stock");
        product13.setReturnPolicy("No return");
        product13.setMinimumOrderQuantity(5);
        product13.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/clinique-moisturizer/thumbnail.webp");

        dto product14 = new dto();
        product14.setTitle("Forest Essentials Face Cream");
        product14.setDescription("Luxury herbal face cream");
        product14.setCategory("beauty");
        product14.setPrice(25.50);
        product14.setDiscountPercentage(12.0);
        product14.setRating(4.8);
        product14.setStock(30);
        product14.setBrand("Forest Essentials");
        product14.setSku("BEA-FOR-FAC-014");
        product14.setWeight(50);
        product14.setWarrantyInformation("No warranty");
        product14.setShippingInformation("Ships in 3-5 days");
        product14.setAvailabilityStatus("In Stock");
        product14.setReturnPolicy("7-day return");
        product14.setMinimumOrderQuantity(2);
        product14.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/forest-essentials/thumbnail.webp");

        dto product15 = new dto();
        product15.setTitle("Lakme Lipstick Matte");
        product15.setDescription("Long lasting matte lipstick");
        product15.setCategory("beauty");
        product15.setPrice(6.99);
        product15.setDiscountPercentage(5.5);
        product15.setRating(4.2);
        product15.setStock(80);
        product15.setBrand("Lakme");
        product15.setSku("BEA-LAK-LIP-015");
        product15.setWeight(15);
        product15.setWarrantyInformation("No warranty");
        product15.setShippingInformation("Ships in 2-3 days");
        product15.setAvailabilityStatus("In Stock");
        product15.setReturnPolicy("No return");
        product15.setMinimumOrderQuantity(10);
        product15.setThumbnail("https://cdn.dummyjson.com/product-images/beauty/lakme-lipstick-matte/thumbnail.webp");

        return Arrays.asList(product1, product2, product3, product4, product5,
                product6, product7, product8, product9, product10,
                product11, product12, product13, product14, product15);
    }

    public static void insertData(List<dto> ListProducts){
        try (Connection conn = dbconn.getConnection()){
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO products_data(title, description, category, price, discount_percentage, rating, stock, brand, sku, weight, warranty_information, shipping_information, availability_status, return_policy, minimum_order_quantity, thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            for(dto product : ListProducts ) {
                ps.setString(1, product.getTitle());
                ps.setString(2, product.getDescription());
                ps.setString(3, product.getCategory());
                ps.setDouble(4, product.getPrice());
                ps.setDouble(5, product.getDiscountPercentage());
                ps.setDouble(6, product.getRating());
                ps.setInt(7, product.getStock());
                ps.setString(8, product.getBrand());
                ps.setString(9, product.getSku());
                ps.setDouble(10, product.getWeight());
                ps.setString(11, product.getWarrantyInformation());
                ps.setString(12, product.getShippingInformation());
                ps.setString(13, product.getAvailabilityStatus());
                ps.setString(14, product.getReturnPolicy());
                ps.setInt(15, product.getMinimumOrderQuantity());
                ps.setString(16, product.getThumbnail());
                ps.addBatch();
            }
            ps.executeBatch();
            System.out.println("Inserted 15 products successfully!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
        List<dto> products = insertInClass(); 
        insertData(products);                 
    }
}
