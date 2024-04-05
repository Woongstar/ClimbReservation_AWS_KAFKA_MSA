package climb.domain;

import climb.MessageApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import java.util.Random;
import java.util.concurrent.ExecutionException;

@Entity
@Table(name = "Message_table")
@Data
//<<< DDD / Aggregate Root
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private String userPhoneNum;

    public static MessageRepository repository() {
        MessageRepository messageRepository = MessageApplication.applicationContext.getBean(
            MessageRepository.class
        );
        return messageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void alertMessage(CenterModified centerModified) {
        //implement business logic here:

        Message message = new Message();
        
        message.setId(1L);
        message.setContent(centerModified.getCenterName() + "의 정보가 변경되었습니다. 고객님께서는 확인 부탁드립니다.");
        message.setUserPhoneNum("01096326336");

        if(repository().findById(1L).isPresent()){
            message.setContent("메세지 전송에 실패하였습니다. 이미 보낸 메세지입니다.. 예약을 취소합니다.");
        }
        repository().save(message);
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertMessage(PaymentApproved paymentApproved) {
        //implement business logic here:

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void alertMessage(PaymentCanceled paymentCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
