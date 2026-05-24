package utils;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailUtils {
    private static final String FILE_PROPERTIES = "mail.properties";

    private static final String USERNAME = ConfigUtils.get(FILE_PROPERTIES, "SMTP_FROM");
    private static final String PASSWORD = ConfigUtils.get(FILE_PROPERTIES, "SMTP_PASSWORD");
    private static final String SMTP_AUTH = ConfigUtils.get(FILE_PROPERTIES, "SMTP_AUTH");
    private static final String SMTP_STARTTLS_ENABLE = ConfigUtils.get(FILE_PROPERTIES, "SMTP_STARTTLS_ENABLE");
    private static final String SMTP_HOST = ConfigUtils.get(FILE_PROPERTIES, "SMTP_HOST");
    private static final int SMTP_PORT = ConfigUtils.getInt(FILE_PROPERTIES, "SMTP_PORT");

    /**
     * Sends an email to the specified recipient with the given title and
     * content.
     *
     * @param sentTo The email address of the recipient.
     * @param title The title of the email.
     * @param content The content of the email, which can be HTML formatted.
     */
    public static void sendMail(String sentTo, String title, String content) {
        // Email account credentials
        
        
        // Set up email server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", SMTP_AUTH);
        props.put("mail.smtp.starttls.enable", SMTP_STARTTLS_ENABLE);
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);
        // Authenticate and establish session with email server
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });
        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USERNAME)); 
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sentTo));
            message.setSubject(title);
            message.setContent(content, "text/html");
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            System.out.println("Error at :" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        MailUtils.sendMail("toantthe172722@fpt.edu.vn", "hello TPA", "<h1>qua dep</h1>");
    }
}
