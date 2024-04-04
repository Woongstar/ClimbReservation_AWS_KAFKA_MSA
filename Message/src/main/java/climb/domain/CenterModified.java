package climb.domain;

import climb.domain.*;
import climb.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CenterModified extends AbstractEvent {

    private Long centerId;
    private String centerName;
    private String centerLocation;
    private String startTime;
    private String endTime;
    private String courses;
    private Integer enterFee;
}
