public class Advertisement {
    private Object content;                 /*видио*/
    private String name;                    /*имя*/
    private long initialAmount;             /*начальная сумма, стоимость рекламы в копейках*/
    private int hits;                       /*количество оплаченных показов*/
    private int duration;                   /*продолжительность в секундах*/
    private long amountPerOneDisplaying;    /*равняет стоимости одного показа рекламного объявления в копейках*/

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration){
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = (hits > 0) ? initialAmount / hits : 0;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public int getHits() {
        return hits;
    }

    public void revalidate(){
        if(hits == 0) throw new UnsupportedOperationException();
        hits--;
    }
}
