package pokemon.com.network;

import java.util.ArrayList;

public class ListCards {

    ArrayList<RetrofitClientInstance> cards;

    public ListCards(ArrayList<RetrofitClientInstance> cards) {
        this.cards = cards;
    }

    public ArrayList<RetrofitClientInstance> getCards() {
        return cards;
    }

    public void setCards(ArrayList<RetrofitClientInstance> cards) {
        this.cards = cards;
    }
}


