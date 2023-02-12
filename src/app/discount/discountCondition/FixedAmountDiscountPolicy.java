package app.discount.discountCondition;

import app.discount.discountPolicy.DiscountPolicy;

public class FixedAmountDiscountPolicy implements DiscountPolicy{
    private int discountAmount;
    public FixedAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }
    public int calculateDiscountedPrice(int price) {
        return price - discountAmount;
    }
}
