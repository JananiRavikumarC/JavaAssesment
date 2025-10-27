import java.sql.Connection;
import java.sql.PreparedStatement;

public class deletion {

    public static void deleteProductById(int id) {
        try (Connection conn = dbconn.getConnection()) {
            String sql = "DELETE FROM products_data WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Product with ID " + id + " deleted successfully.");
            } else {
                System.out.println("No product found with ID " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllProducts() {
        try (Connection conn = dbconn.getConnection()) {
            String sql = "DELETE FROM products_data";
            PreparedStatement ps = conn.prepareStatement(sql);
            int rows = ps.executeUpdate();
            System.out.println(rows + " products deleted from database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
