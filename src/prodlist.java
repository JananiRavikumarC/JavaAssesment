public class prodlist {
    private int id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String sku;
    private double weight;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private String returnPolicy;
    private int minimumOrderQuantity;
    private String thumbnail;

    public prodlist(int id, String title, String description,
                    String category, double price, double discountPercentage, double rating,
                    int stock, String brand, String sku, double weight, String warrantyInformation,
                    String shippingInformation, String availabilityStatus, String returnPolicy,
                    int minimumOrderQuantity, String thumbnail) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.stock = stock;
        this.brand = brand;
        this.sku = sku;
        this.weight = weight;
        this.warrantyInformation = warrantyInformation;
        this.shippingInformation = shippingInformation;
        this.availabilityStatus = availabilityStatus;
        this.returnPolicy = returnPolicy;
        this.minimumOrderQuantity = minimumOrderQuantity;
        this.thumbnail = thumbnail;
    }

    public int getId() { 
    	return id; 
    	}
    public String getTitle() {
    	return title; 
    	}
    public String getDescription() { 
    	return description; 
    	}
    public String getCategory() { 
    	return category; 
    	}
    public double getPrice() { 
    	return price; 
    	}
    public double getDiscountPercentage() { 
    	return discountPercentage; 
    	}
    public double getRating() { 
    	return rating; 
    	}
    public int getStock() { 
    	return stock; 
    	}
    public String getBrand() { 
    	return brand; 
    	}
    public String getSku() { 
    	return sku; 
    	}
    public double getWeight() { 
    	return weight; 
    	}
    public String getWarrantyInformation() { 
    	return warrantyInformation; 
    	}
    public String getShippingInformation() { 
    	return shippingInformation; 
    	}
    public String getAvailabilityStatus() { 
    	return availabilityStatus; 
    	}
    public String getReturnPolicy() { 
    	return returnPolicy; 
    	}
    public int getMinimumOrderQuantity() { 
    	return minimumOrderQuantity; 
    	}
    public String getThumbnail() { 
    	return thumbnail; 
    	}

    @Override
    public String toString() {
        return "prodlist{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", stock=" + stock +
                '}';
    }
}
