import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> itemsInWallet;

    public Wallet(String name) {
        this.name = name;
        this.itemsInWallet = new ArrayList<IScan>();
    }
    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.itemsInWallet.size();
    }

    public void addItem(IScan item) {
        this.itemsInWallet.add(item);
    }

}
