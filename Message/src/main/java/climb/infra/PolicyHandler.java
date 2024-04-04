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
    MessageRepository messageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CenterModified'"
    )
    public void wheneverCenterModified_AlertMessage(
        @Payload CenterModified centerModified
    ) {
        CenterModified event = centerModified;
        System.out.println(
            "\n\n##### listener AlertMessage : " + centerModified + "\n\n"
        );

        // Sample Logic //
        Message.alertMessage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentApproved'"
    )
    public void wheneverPaymentApproved_AlertMessage(
        @Payload PaymentApproved paymentApproved
    ) {
        PaymentApproved event = paymentApproved;
        System.out.println(
            "\n\n##### listener AlertMessage : " + paymentApproved + "\n\n"
        );

        // Sample Logic //
        Message.alertMessage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCanceled'"
    )
    public void wheneverPaymentCanceled_AlertMessage(
        @Payload PaymentCanceled paymentCanceled
    ) {
        PaymentCanceled event = paymentCanceled;
        System.out.println(
            "\n\n##### listener AlertMessage : " + paymentCanceled + "\n\n"
        );

        // Sample Logic //
        Message.alertMessage(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
