package mogi2.ex_2.bb;

import java.time.LocalDate;

public class Foo {
    public String getDate() {
        LocalDate date = LocalDate.of(2019, 12, 12);
        return date.toString();
    }
}