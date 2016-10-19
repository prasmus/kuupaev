

//exercise 2.2

import java.util.*;
import java.text.*;

public class kellaaeg {

            public static void main(String args[]) {
                Date dNow = new Date();
                SimpleDateFormat ftusa =
                        new SimpleDateFormat("EEEEE, MMMMM dd, yyyy");
                SimpleDateFormat fteur =
                        new SimpleDateFormat("EEEEE dd MMMMM yyyy");

                System.out.println("USA aeg: ");
                ftusa.setTimeZone(TimeZone.getTimeZone("ECT"));
                System.out.println(ftusa.format(dNow));

                System.out.println("Euroopa aeg: ");
                fteur.setTimeZone(TimeZone.getTimeZone("EST"));
                System.out.println(fteur.format(dNow));

            }
        }
