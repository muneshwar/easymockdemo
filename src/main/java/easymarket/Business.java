package easymarket;

import java.util.ArrayList;
import java.util.List;

public class Business {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	private StockMarket stockMarket;
	private List<Stock> stocks = new ArrayList<Stock>();

	// Calculating the total value of the stock

	public Double getMarketValue() {
		Double value = 0.0;
		for (Stock stock : stocks) {
			value += (stockMarket.getPrice(stock.getName())) * (stock.getQuantity());

		}
		return value;
	}

}
