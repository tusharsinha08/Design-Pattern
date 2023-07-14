public class SingleResponsibility {
     public static void main(String[] args) {
          User u1 = new User();
          EmailService email = new EmailService();

          u1.login("Tushar", "passward");
          email.sendEmail("My friend", "sadp", "body");
     }
}