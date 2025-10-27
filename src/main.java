import java.util.List;

public class main {
    public static void main(String[] args) {

        List<prodlist> productDetails = operations.getData();

        filtering filterManager = new filtering();

        System.out.println("Grouped by Brand:");
        System.out.println(filterManager.groupedByBrand(productDetails));

        System.out.println("\nSorted by Price Ascending:");
        System.out.println(filterManager.sortedByPriceAsc(productDetails));

        System.out.println("\nSorted by Price Descending:");
        System.out.println(filterManager.sortedByPriceDesc(productDetails));

        System.out.println("\nCount by Brand:");
        System.out.println(filterManager.countByBrand(productDetails));

        System.out.println("\nAvailable Products:");
        System.out.println(filterManager.availableProducts(productDetails));

        System.out.println("\nProducts with Return Policy:");
        System.out.println(filterManager.productsWithReturnPolicy(productDetails));

        System.out.println("\nFilter by Category (beauty):");
        System.out.println(filterManager.filterByCategory(productDetails, "beauty"));

        System.out.println("\nFilter by Brand (Apple):");
        System.out.println(filterManager.filterByBrand(productDetails, "Apple"));
        
        System.out.println("\n FILTER BY BRAND AND CATEGORY (Neutrogena, beauty) ");
        System.out.println(filterManager.filterByBrandAndCategory(productDetails, "Neutrogena", "beauty"));

        System.out.println("\n FILTER BY PRICE RANGE (5.0 to 10.0) ");
        System.out.println(filterManager.filterByPriceRange(productDetails, 5.0, 10.0));

        System.out.println("\n FILTER BY MINIMUM RATING (4.5) ");
        System.out.println(filterManager.filterByRating(productDetails, 4.5));
    }
}
