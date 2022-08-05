package AdvanceTask1;

import java.sql.SQLOutput;

public class Rose extends Plant implements Smelling, Flowering{

    @Override
    public void smell() {
        System.out.println("роза : умеет пахнуть");
    }

    @Override
    public void flower() {
        System.out.println("роза : умеет цвести");
    }
}
