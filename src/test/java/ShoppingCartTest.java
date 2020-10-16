import cz.uhk.fim.pro2.shopping.model.Child;
import cz.uhk.fim.pro2.shopping.model.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setup() {
        this.cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test pro overeni poctu v nakupnim kosiku")
    public void test_getChildCount() {

        // test pro prazdny kosik
        Assertions.assertEquals(0, cart.getChildCount());

        // test pro 2 prvky v kosiku
        List<Child> list2Children = new ArrayList<>();
        list2Children.add(new Child());
        list2Children.add(new Child());
        this.cart.setChildList(list2Children);
        Assertions.assertEquals(2, cart.getChildCount());
    }
}
