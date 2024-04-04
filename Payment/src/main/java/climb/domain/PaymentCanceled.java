package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;

    public PaymentCanceled(Payment aggregate) {
        super(aggregate);
    }

    public PaymentCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
