package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Integer fee;
    private String status;
}
