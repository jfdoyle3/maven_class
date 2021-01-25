

import java.util.ArrayList;
import java.util.Iterator;

public class StockList {

    public ArrayList<Stock> createStockList(ArrayList<String> tableData) {

        ArrayList<Stock> stockList = new ArrayList<Stock>();

        for (int rmve = 0; rmve < tableData.size(); rmve++) {
            tableData.remove("-");
            tableData.remove("USD");
        }
        int rows = (tableData.size() / 8) - 1;

        Iterator<String> itr = tableData.iterator();

        for (int idx = 0; idx < rows; idx++) {
            Stock share = new Stock(itr.next(), itr.next(), itr.next(), itr.next(), itr.next(), itr.next(), itr.next(),
                    itr.next());

            stockList.add(share);
        }

        return stockList;
    }

}