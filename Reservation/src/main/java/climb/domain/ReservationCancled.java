package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationCancled extends AbstractEvent {

    private Long id;

    public ReservationCancled(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationCancled() {
        super();
    }
}
//>>> DDD / Domain Event
