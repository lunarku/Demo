package spring.consumer;

import org.apache.log4j.Logger;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class TopicListener implements MessageListener {

    private static final Logger LOGGER = Logger.getLogger(TopicListener.class);

    @Override
    public void onMessage(Message message) {
        if(message != null){
            TextMessage textMessage = (TextMessage) message;
            try {
                String text = textMessage.getText();
                LOGGER.info("topic消费消息： " + text);
            } catch (JMSException e) {
                LOGGER.error("获取消息出异常： {}", e );
            }
        }
    }
}
