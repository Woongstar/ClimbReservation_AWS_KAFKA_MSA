package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CenterDeleted extends AbstractEvent {

    private Long centerId;

    public CenterDeleted(Center aggregate) {
        super(aggregate);
    }

    public CenterDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
