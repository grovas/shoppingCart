import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    // given or arrange
    private final Product knife = Product.create("Knife", 33.0f, 0);
    @Test
    public void testAddProductWhenProductQuantityIsZero() {
        // when or act
        ShoppingCart.addProduct(knife);

        // then or assert
        assertEquals(ShoppingCart.totalValue(), 0);
        assertEquals(ShoppingCart.itemsInCart(), 0);
    }
    @Test
    public void testAddProduct() {
        // given or arrange
        Product fork = Product.create("Fork", 11.2f, 34);
        Product spoon = Product.create("Spoon", 23.0f, 8);

        // when or act
        ShoppingCart.addProduct(fork);
        ShoppingCart.addProduct(spoon);
        ShoppingCart.addProduct(knife);
        ShoppingCart.addProduct(fork);

        // then or assert
        assertEquals(ShoppingCart.totalValue(), 45.4f);
        assertEquals(ShoppingCart.itemsInCart(), 3);
    }
}