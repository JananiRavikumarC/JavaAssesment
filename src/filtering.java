import java.util.*;
import java.util.stream.Collectors;

public class filtering {

    public List<prodlist> filterByBrand(List<prodlist> list, String brand) {
        return list.stream().filter(p -> p.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
    }

    public List<prodlist> filterByCategory(List<prodlist> list, String category) {
        return list.stream().filter(p -> p.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
    }

    public List<prodlist> availableProducts(List<prodlist> list) {
        return list.stream().filter(p -> p.getStock() > 0).collect(Collectors.toList());
    }

    public List<prodlist> productsWithReturnPolicy(List<prodlist> list) {
        return list.stream().filter(p -> p.getReturnPolicy() != null && !p.getReturnPolicy().isEmpty()).collect(Collectors.toList());
    }

    public List<prodlist> sortedByPriceAsc(List<prodlist> list) {
        return list.stream().sorted(Comparator.comparingDouble(prodlist::getPrice)).collect(Collectors.toList());
    }

    public List<prodlist> sortedByPriceDesc(List<prodlist> list) {
        return list.stream().sorted(Comparator.comparingDouble(prodlist::getPrice).reversed()).collect(Collectors.toList());
    }

    public Map<String, List<prodlist>> groupedByBrand(List<prodlist> list) {
        return list.stream().collect(Collectors.groupingBy(prodlist::getBrand));
    }

    public Map<String, Long> countByBrand(List<prodlist> list) {
        return list.stream().collect(Collectors.groupingBy(prodlist::getBrand, Collectors.counting()));
    }

public List<prodlist> filterByBrandAndCategory(List<prodlist> list, String brand, String category) {
        return list.stream()
                .filter(p -> p.getBrand().equalsIgnoreCase(brand) && p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<prodlist> filterByPriceRange(List<prodlist> list, double minPrice, double maxPrice) {
        return list.stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<prodlist> filterByRating(List<prodlist> list, double minRating) {
        return list.stream()
                .filter(p -> p.getRating() >= minRating)
                .collect(Collectors.toList());
    }
}

