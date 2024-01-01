public class ShoppingCart {
    // We declare an array with defined size 1 - we expect that at least one product will be added
    private static Product[] shoppingCart = new Product[0];
    private static float totalValue;

    public static void addProduct(Product product) {
        if (product.getQuantity() > 0) {
            // After `shoppingCart` array declaration we can not change array size(length)
            // So that we create new array with size equals of shopping cart plus 1 to create space for next product
            Product[] newShoppingCart = new Product[shoppingCart.length + 1];
            // and copy array
            System.arraycopy(shoppingCart, 0, newShoppingCart, 0, shoppingCart.length);
            // We put product at index which is the last one in array and equal of length of array
            newShoppingCart[shoppingCart.length] = product;
            // After all we need to replace original shopping cart with new one with added product
            shoppingCart = new Product[newShoppingCart.length];
            System.arraycopy(newShoppingCart, 0, shoppingCart, 0, newShoppingCart.length);
            totalValue += product.getPrice();
        }
    }

    public static float totalValue() {
        return totalValue;
    }

    public static double itemsInCart() {
        return shoppingCart.length;
    }
}
