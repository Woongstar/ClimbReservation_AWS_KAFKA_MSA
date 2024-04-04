package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Integer fee;
    private String status;

    public PaymentApproved(Payment aggregate) {
        super(aggregate);
    }

    public PaymentApproved() {
        super();
    }
}
//>>> DDD / Domain Event
