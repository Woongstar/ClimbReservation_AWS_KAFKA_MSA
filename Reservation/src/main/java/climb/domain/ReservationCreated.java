package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private Long centerId;
    private String reservationDate;
    private String status;
    private Long paymentId;
    private String clientPhoneNum;

    public ReservationCreated(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationCreated() {
        super();
    }
}
//>>> DDD / Domain Event
