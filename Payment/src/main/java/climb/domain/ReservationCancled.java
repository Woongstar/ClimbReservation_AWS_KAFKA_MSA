package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReservationCancled extends AbstractEvent {

    private Long id;
}
