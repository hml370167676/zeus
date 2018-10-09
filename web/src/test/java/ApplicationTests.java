import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 8/31/2018 10:03 AM
 */
@SpringBootTest
public class ApplicationTests {

  @Autowired
  private JavaMailSender mailSender;

  @Test
  public void sendMailTest() {

    SimpleMailMessage message = new SimpleMailMessage();

  }
}
