import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class operations {

    public static List<prodlist> getData() {
        List<prodlist> productList = new ArrayList<>();
        String query = "SELECT * FROM products_data";

        try (Connection conn = dbconn.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                prodlist p = new prodlist(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("category"),
                        rs.getDouble("price"),
                        rs.getDouble("discount_percentage"),
                        rs.getDouble("rating"),
                        rs.getInt("stock"),
                        rs.getString("brand"),
                        rs.getString("sku"),
                        rs.getDouble("weight"),
                        rs.getString("warranty_information"),
                        rs.getString("shipping_information"),
                        rs.getString("availability_status"),
                        rs.getString("return_policy"),
                        rs.getInt("minimum_order_quantity"),
                        rs.getString("thumbnail")
                );
                productList.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
