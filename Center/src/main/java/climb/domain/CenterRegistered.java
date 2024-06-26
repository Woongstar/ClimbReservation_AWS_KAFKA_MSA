package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CenterRegistered extends AbstractEvent {

    private Long centerId;
    private String centerName;
    private String centerLocation;
    private String startTime;
    private String endTime;
    private String courses;
    private Integer enterFee;

    public CenterRegistered(Center aggregate) {
        super(aggregate);
    }

    public CenterRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
