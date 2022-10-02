package hello.core.order;

import hello.core.annotaition.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;



    public OrderServiceImpl(MemberRepository memberRepository, @Qualifier("mainDiscountPolicy") @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        return null;
    }

    @Override
    public boolean getMemberRepository() {
        return false;
    }
}