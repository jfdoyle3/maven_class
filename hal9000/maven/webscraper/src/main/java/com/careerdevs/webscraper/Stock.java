/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.careerdevs.webscraper;

/**
 *
 * @author indel
 */
public class Stock {
    	private String symbol;
	private String lastPrice;
	private String priceChange;
	private String changePercentage;
	private String marketTime;
	private String volume;
	private String avgvol;
	private String marketCap;
	
	public Stock(String symbol, String lastPrice, String priceChange, String changePercentage, String marketTime,
			String volume, String avgvol, String marketCap) {
		this.symbol = symbol;
		this.lastPrice = lastPrice;
		this.priceChange = priceChange;
		this.changePercentage = changePercentage;
		this.marketTime = marketTime;
		this.volume = volume;
		this.avgvol = avgvol;
		this.marketCap = marketCap;
	}

    @Override
    public String toString() {
        return "Stock{" + "symbol=" + symbol + ", lastPrice=" + lastPrice + ", priceChange=" + priceChange + ", changePercentage=" + changePercentage + ", marketTime=" + marketTime + ", volume=" + volume + ", avgvol=" + avgvol + ", marketCap=" + marketCap + '}';
    }
        
}
