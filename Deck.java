class Deck{
  private int card_size;
  private boolean[] card;
  public Deck(){
    card_size = 52;
    card = new boolean[card_size];
    for(int i =0;i < card_size;i++){
      card[i] =true;
    }
  }
  public boolean[] getCard(){
    return card;
  }
}
