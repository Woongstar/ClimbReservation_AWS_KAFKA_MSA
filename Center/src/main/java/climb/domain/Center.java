package climb.domain;

import climb.CenterApplication;
import climb.domain.CenterDeleted;
import climb.domain.CenterModified;
import climb.domain.CenterRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Center_table")
@Data
//<<< DDD / Aggregate Root
public class Center {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long centerId;

    private String centerName;

    private String centerLocation;

    private String startTime;

    private String endTime;

    private String courses;

    private Integer enterFee;

    @PostPersist
    public void onPostPersist() {
        CenterRegistered centerRegistered = new CenterRegistered(this);
        centerRegistered.publishAfterCommit();

        CenterDeleted centerDeleted = new CenterDeleted(this);
        centerDeleted.publishAfterCommit();

        CenterModified centerModified = new CenterModified(this);
        centerModified.publishAfterCommit();
    }

    public static CenterRepository repository() {
        CenterRepository centerRepository = CenterApplication.applicationContext.getBean(
            CenterRepository.class
        );
        return centerRepository;
    }
}
//>>> DDD / Aggregate Root
