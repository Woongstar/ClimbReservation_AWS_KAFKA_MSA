package climb.domain;

import climb.ReservationApplication;
import climb.domain.ReservationCancled;
import climb.domain.ReservationCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long centerId;

    private String reservationDate;

    private String status;

    private Long paymentId;

    private String clientPhoneNum;

    @PostPersist
    public void onPostPersist() {
        ReservationCreated reservationCreated = new ReservationCreated(this);
        reservationCreated.publishAfterCommit();

        ReservationCancled reservationCancled = new ReservationCancled(this);
        reservationCancled.publishAfterCommit();
    }

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }
}
//>>> DDD / Aggregate Root
