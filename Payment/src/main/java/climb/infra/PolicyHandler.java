package climb.infra;

import climb.config.kafka.KafkaProcessor;
import climb.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PaymentRepository paymentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationCreated'"
    )
    public void wheneverReservationCreated_ApprovePayment(
        @Payload ReservationCreated reservationCreated
    ) {
        ReservationCreated event = reservationCreated;
        System.out.println(
            "\n\n##### listener ApprovePayment : " + reservationCreated + "\n\n"
        );

        // Sample Logic //
        Payment.approvePayment(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationCancled'"
    )
    public void wheneverReservationCancled_CancelPayment(
        @Payload ReservationCancled reservationCancled
    ) {
        ReservationCancled event = reservationCancled;
        System.out.println(
            "\n\n##### listener CancelPayment : " + reservationCancled + "\n\n"
        );

        // Sample Logic //
        Payment.cancelPayment(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
