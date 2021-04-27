package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    MariaDbDataSource dataSource = new MariaDbDataSource();

    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;

    }

    public int getPointsOfHouse(String inputString) {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement(
                                "SELECT SUM(points_earned) AS sum_of_points_by_house FROM house_points WHERE house_name = ? GROUP BY house_name");
        ) {
            stmt.setString(1, inputString);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int sumOfPointsByHouse = rs.getInt("sum_of_points_by_house");
                return sumOfPointsByHouse;}

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("SQL error.", sqle);
        }

        throw new IllegalArgumentException("No such house");
    }
}
