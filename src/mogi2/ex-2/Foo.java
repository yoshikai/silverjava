package mogi2.ex;

import java.time.LocalDate;

public class Foo {
    public String getDate() {
        LocalDate date = LocalDate.of(2019, 12, 12);
        return date.toString();
    }
}