import java.time.Clock;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by akhil on 11/06/17.
 */
public class Date {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int month = in.nextInt();
            int day = in.nextInt();
            int year = in.nextInt();
            LocalDate dt = LocalDate.of(year,month,day);
            System.out.println(dt.getDayOfWeek());

        }
    }



