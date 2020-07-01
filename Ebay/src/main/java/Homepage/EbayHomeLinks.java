package Homepage;

import common.WebAPI;

public class EbayHomeLinks extends WebAPI {

    //Buy
    public void Buy(){
        clickByLinkedText("Registration");
        navigateBack();
        clickByLinkedText("eBay Money Back Guarantee");
        navigateBack();
        clickByLinkedText("Bidding & buying help");
        navigateBack();
        clickByLinkedText("Stores");
    }

    private void clickByLinkedText(String registration) {
    }

    //Sell
    public void Sell(){
        clickByLinkedText("Start selling");
        navigateBack();
        clickByLinkedText("Learn to sell");
        navigateBack();
        clickByLinkedText("Business sellers");
        navigateBack();
        clickByLinkedText("Affiliates");
        navigateBack();
    }
    //Tools & apps
    public void TnA(){
        clickByLinkedText("Mobile apps");
        navigateBack();
        clickByLinkedText("Developers");
        navigateBack();
        clickByLinkedText("Security center");
        navigateBack();
        clickByLinkedText("eBay official time");
        navigateBack();
        clickByLinkedText("Site map");
        navigateBack();
    }
    //eBay companies
    public void companies(){
        clickByLinkedText("eBay Classifieds");
        navigateBack();
        clickByLinkedText("See all companies");
        navigateBack();
    }
}
