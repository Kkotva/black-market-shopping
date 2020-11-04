package cz.uhk.fim.pro2.shopping.ui;

import cz.uhk.fim.pro2.shopping.model.Child;
import cz.uhk.fim.pro2.shopping.model.Marketplace;
import cz.uhk.fim.pro2.shopping.model.ShoppingCart;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

//    @FXML
//    public Pane pnlColor;
//    @FXML
//    public Label lblNameAndAge;
//    @FXML
//    public Label lblPrice;
//    @FXML
//    public TextArea txtLog;

    private ShoppingCart cart;

    private Marketplace marketplace;

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
//        txtLog.setText(sb.toString());
    }

    private void initMarketplace() {
        this.marketplace = new Marketplace();
    }

    private void updateUi() {
//        pnlColor.setStyle(String.format("-fx-background-color: #%s", String.valueOf(this.currentChild.getSkinTone()).substring(0, 6)));
//        lblNameAndAge.setText(String.format("%s, %d", this.currentChild.getDisplayName(), this.currentChild.getAge()));
//        lblPrice.setText(String.format("%.2f", this.currentChild.getPrice()));
    }

    private void initCart() {
        this.cart = new ShoppingCart();
        this.cart.setVat(0.21);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initCart();
        initMarketplace();
//        this.currentChild = this.childsToBuy.get(0);
        updateUi();
    }
}
