package JavaCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class DateExample {
    public static void main(String[] args) throws IOException {
        long Savings=10;
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String firstInput = "2022/01/01";
        final String secondInput = reader.readLine();
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        Savings=Saving*days;
        System.out.println(Savings);
    }
}