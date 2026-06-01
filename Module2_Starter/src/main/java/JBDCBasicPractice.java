import java.sql.*;

public class JBDCBasicPractice {
    // set up login info
    private static final String url = "jdbc:h2:./data/studentdb;MODE=MySQL;DATABASE_TO_LOWER=TRUE";
    private static final String user = "sa";
    private static final String pass = "secret";

    public static void main(String[] args) throws Exception {
        // UTF-8 encoding goes here first two lines

        // login timeout goes here before connection

        //try-w-re for getConnection

            //try-w-re for statement

            // setQuery Timeout goes here

                // try-w-re for ResultSet executeQuery d

                    // print header

                    // loop through with rs.next() to next row and grab data from that row, is exists

                    // print footer

                    // success use System.exit(0)

    // catch SQLException
        //System.exit(2)

     // catch (ClassNotFoundException
     // System.exit
    }
}
