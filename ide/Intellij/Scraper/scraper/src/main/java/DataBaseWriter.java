

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class DataBaseWriter {

    public void writeToDatabase(ArrayList<Stock> stockList) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.201/financialscraper",
                    "jfdoyle3", "Fl1pp3r6467");

            String sql = "INSERT INTO stocktable (datestamp, symbol, lastprice,pricechange,changepercentage,markettime,volume,avgvol,marketcap) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            for (int idx = 0; idx < stockList.size(); idx++) {
                Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
                statement.setTimestamp(1, timeStamp);
                statement.setString(2, stockList.get(idx).getSymbol());
                statement.setString(3, stockList.get(idx).getLastPrice());
                statement.setString(4, stockList.get(idx).getPriceChange());
                statement.setString(5, stockList.get(idx).getChangePercentage());
                statement.setString(6, stockList.get(idx).getMarketTime());
                statement.setString(7, stockList.get(idx).getVolume());
                statement.setString(8, stockList.get(idx).getAvgvol());
                statement.setString(9, stockList.get(idx).getMarketCap());

                statement.executeUpdate();

            }
            if (connection != null)
                connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}