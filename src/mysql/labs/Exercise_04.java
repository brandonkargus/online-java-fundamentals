package mysql.labs;

/*
 * MySQL Exercise 4:
 *
 * Now that you have mastered your air travel database, it's time to connect this DB to a Java application
 * using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
 * demonstrate how to:
 *
 * Note: CRUD means (Create, Read, Update, Delete)
 *
 * 1.) CRUD new flights
 * 2.) CRUD new passengers
 * 3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
 *
 */

import java.sql.*;

public class Exercise_04 {
    public static String createFlight() {
        return "INSERT INTO flights(airline, plane, departure_airport, departure, arrival_airport, arrival) VALUES('3', '2', '4', '20220111', '1', '20220128')";
    }

    public static String queryFlight() {
        return "SELECT * FROM flights WHERE id = 3";
    }

    public static String updateFlight() {
        return "UPDATE flights SET plane = 4 WHERE id = 5";
    }

    public static String deleteFlight() {
        return "DELETE FROM flights WHERE id = 6";
    }

    public static String createPassenger() {
        return "INSERT INTO passengers(first_name, last_name, email, payment_info, ticket_info) VALUES('Horace', 'Jones', 'none', 'free ticket', 'valid anywhere')";
    }

    public static String queryPassenger() {
        return "SELECT * FROM passengers WHERE id = 7";
    }

    public static String updatePassenger() {
        return "UPDATE passengers SET email = 'bdhdb@gmail.com' WHERE id = 7";
    }

    public static String deletePassenger() {
        return "DELETE FROM passengers WHERE id = 7";
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
/*
 Just as a casual example - each of these operations should be in it's own method. Feel free to
 create all required classes/methods to accomplish this.
 createFlight(...); (DONE)
 queryFlight(...); (DONE)
 updateFlight(...); (DONE)
 deleteFlight(...); (DONE)
 createPassenger(...); (DONE)
 queryPassenger(...); (DONE)
 updatePassenger(...); (DONE)
 deletePassenger(...); (DONE)
 ...
 */
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/temp?"
                + "user=root&password=*****************"
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        connection = DriverManager.getConnection(connectionString);
        statement = connection.createStatement();
//int addition = statement.executeUpdate(createFlight());
//
//resultSet = statement.executeQuery(queryFlight());
//while (resultSet.next()) {
//
//int id = resultSet.getInt("id");
//int airline = resultSet.getInt("airline");
//int plane = resultSet.getInt("plane");
//int dept_air = resultSet.getInt("departure_airport");
//Date depart = resultSet.getDate("departure");
//int arr_air = resultSet.getInt("arrival_airport");
//Date arrive = resultSet.getDate("arrival");
//statement.close();
//connection.close();
//
////print out the result
//System.out.println("Flight id: " + id + ", Airline name: " + airline + ", Plane id: " + plane + ", Airport of Departure: " + dept_air + ", Departure date: " +
//depart + ", Airport of arrival: " + arr_air + ", Arrival date: " + arrive);
//}
//int update = statement.executeUpdate(updateFlight());
//int delete = statement.executeUpdate(deleteFlight());
//int addPass = statement.executeUpdate(createPassenger());
//resultSet = statement.executeQuery(queryPassenger());
//while (resultSet.next()) {
//
//int id = resultSet.getInt("id");
//String first = resultSet.getString("first_name");
//String last = resultSet.getString("last_name");
//String email = resultSet.getString("email");
//String payment = resultSet.getString("payment_info");
//String ticket = resultSet.getString("ticket_info");
//
//
//
////print out the result
//System.out.println("Passenger id: " + id + ", First Name: " + first + ", Last Name: " + last + ", Email: " + email + ", Payment Info: " +
//payment + ", Ticket Info: " + ticket);
//}
//int updatePass = statement.executeUpdate(updatePassenger());
//int deletePass = statement.executeUpdate(deletePassenger());
        statement.close();
        connection.close();
    }
}

