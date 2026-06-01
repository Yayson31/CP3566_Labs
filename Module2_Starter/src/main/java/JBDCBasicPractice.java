import java.sql.*;

public class JBDCBasicPractice {

    // TODO: figure out the production rules 

    // load up login info
    private static final String URL  = "jdbc:h2:./data/studentdb;MODE=MySQL;DATABASE_TO_LOWER=TRUE";
    private static final String USER = "sa";
    private static final String PASSWORD = "secret";

    // main
    public static void main(String[] args) {

        // use try-with-resources
        try {

            // establish connection with login info
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // create a statement
            Statement stmt = conn.createStatement();

            // print header with formatted output
            System.out.printf("%-4s %-14s %-6s %s%n", "ID", "Name", "GPA", "Program");
            System.out.println("-".repeat(36));

            // return a resultset using executeQuery with select statement
            try (ResultSet rs = stmt.executeQuery(
                    "select id, name, gpa, program from student order by name")) {

                // while loop using .next() to move to next row, if true, grab all data from current row
                while (rs.next()) {
                    System.out.printf("%-4d %-14s %-6.2f %s%n",
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getDouble("gpa"),
                            rs.getString("program"));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
