# Digital Assignment - 1

Develop Java Programs implementing 10 new concepts/features/Topics (not in our syllabus).

## Sending Email in Java through Gmail Server
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/SendEmail.java)
* [Source](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/SendEmail.java)
* [`.jar` files](https://www.javatpoint.com/src/mail/mailactivation.zip)
* Steps:
  1. **Get the session object:** The `javax.mail.Session` class provides two methods to get the object of session, `Session.getDefaultInstance()` method and `Session.getInstance()` method. 
  2. **Compose the message:** The `javax.mail.Message` class provides methods to compose the message. But it is an abstract class so its subclass `javax.mail.internet.MimeMessage` class is mostly used. To create the message, you need to pass session object in `MimeMessage` class constructor. 
  3. **Resolving Authentication failure**: Click on [this link](https://www.google.com/settings/security/lesssecureapps) and click on turn on radio button to allow users to send mail from unknown location.