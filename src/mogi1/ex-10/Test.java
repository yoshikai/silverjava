package mogi1.ex

import java.util.ArrayList;

public class Test {
    var name = "test";   // �@

    void exe(var data) {   // �A
        var emp = new Employee();   // �B
        var list = new ArrayList<>();   // �C
        var final point =10;    // �D
        for (var e = 0; e < 10; e++) { // �E
            //code more
        }
    }
}

class Employee {
}
