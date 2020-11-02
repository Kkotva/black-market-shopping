package cz.uhk.fim.pro2.shopping.ui;

import cz.uhk.fim.pro2.shopping.model.Child;
import cz.uhk.fim.pro2.shopping.model.GenderType;
import cz.uhk.fim.pro2.shopping.model.ShoppingCart;
import cz.uhk.fim.pro2.shopping.utils.DataGenerator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Pane pnlColor;
    @FXML
    public Label lblNameAndAge;
    @FXML
    public Label lblPrice;
    @FXML
    public TextArea txtLog;

    private ShoppingCart cart;

    private List<Child> childsToBuy;

    private Child currentChild;

    public void onSkipButtonClick() {
        this.currentChild = this.childsToBuy.get(this.childsToBuy.indexOf(this.currentChild) + 1);
        updateUi();
    }

    public void onAddButtonClick() {
        this.cart.addChild(this.currentChild);
        this.childsToBuy.remove(this.currentChild);
        this.currentChild = this.childsToBuy.get(0);
        updateUi();
    }

    public void onCheckCartButtonClick() {
        StringBuilder sb = new StringBuilder();
        for (Child child : this.cart.getChildList()) {
            sb.append(child).append("\n");
        }
        txtLog.setText(sb.toString());
    }

    private void initMarketplace() {
        this.childsToBuy = new ArrayList<>();
        String[] boyNames = { "Charles", "John", "Henry", "Adolf"};
        String[] girlNames = { "Jane", "Helen", "Kate", "Eva"};
        String[] nationalitaies = { "Czech", "American", "Afroamerican", "German"};

        Random random = new Random();

        for (String name : boyNames) {
            this.childsToBuy.add(new Child(
                    String.valueOf(Math.abs(name.hashCode())),
                    name,
                    random.nextDouble() * 15000,
                    DataGenerator.randomBirthdate(),
                    GenderType.MALE,
                    random.nextBoolean(),
                    random.nextDouble() * 100,
                    random.nextBoolean(),
                    nationalitaies[random.nextInt(4)],
                    0x88aef9,
                    0xaa3d98,
                    0x55fe13
            ));
        }

        for (String name : girlNames) {
            this.childsToBuy.add(new Child(
                    String.valueOf(Math.abs(name.hashCode())),
                    name,
                    random.nextDouble() * 10000,
                    DataGenerator.randomBirthdate(),
                    GenderType.FEMALE,
                    random.nextBoolean(),
                    random.nextDouble() * 100,
                    random.nextBoolean(),
                    nationalitaies[random.nextInt(4)],
                    0xaa3d98,
                    0x55fe13,
                    0x88aef9
            ));
        }
    }

    private void updateUi() {
        pnlColor.setStyle(String.format("-fx-background-color: #%s", String.valueOf(this.currentChild.getSkinTone()).substring(0, 6)));
        lblNameAndAge.setText(String.format("%s, %d", this.currentChild.getDisplayName(), this.currentChild.getAge()));
        lblPrice.setText(String.format("%.2f", this.currentChild.getPrice()));
    }

    private void initCart() {
        this.cart = new ShoppingCart();
        this.cart.setVat(0.21);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initCart();
        initMarketplace();
        this.currentChild = this.childsToBuy.get(0);
        updateUi();
    }
}
