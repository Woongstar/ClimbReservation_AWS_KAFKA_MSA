package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private Long centerId;
    private String reservationDate;
    private String status;
    private Long paymentId;
    private String clientPhoneNum;
}
