import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
      Instant d00 = Instant.parse("2022-07-20T01:30:26Z");

      DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        .withZone(ZoneId.systemDefault());

      System.out.println("Formatação Brasil " + fmt1.format(d00));
      System.out.println("Formatação ISO " + d00.toString());
    }
}
