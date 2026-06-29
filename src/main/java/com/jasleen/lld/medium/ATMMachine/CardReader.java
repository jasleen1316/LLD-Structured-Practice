package com.jasleen.lld.medium.ATMMachine;

public class CardReader {
    private Card card;

    public void acceptCard(Card card){
        this.card = card;
    }

    public void ejectCard(){
        card = null;
        System.out.println("Card Ejected");
    }

    public Card getCard(){
        return card;
    }

}
