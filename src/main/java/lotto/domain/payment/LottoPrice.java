package lotto.domain.payment;


import lotto.ThousandWons;

public class LottoPrice {
    private final static int BASIC_PRICE = 1000;
    private final int amount;

    private LottoPrice(int amount) {
        this.amount = amount;
    }

    public static LottoPrice basic() {
        return new LottoPrice(BASIC_PRICE);
    }

    public boolean isAffordable(ThousandWons money) {
        return money.isMuchThanOrEqual(amount);
    }

    public int calculateLottoCount(ThousandWons money) {
        return money.divide(amount);
    }
}