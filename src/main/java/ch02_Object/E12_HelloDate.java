package ch02_Object;

import java.util.Date;


/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 * @see <a href="http://stackoverflow.com/a/28082447/3399581">About running Javadoc in Eclipse</a>
*/
public class E12_HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
    */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }

}
