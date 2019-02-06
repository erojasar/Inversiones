/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author erojasar
 */
public class DividendStock extends Stock{
    protected double dividends;

    public DividendStock(double dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue() {
        return (this.totalShares*this.currentPrice)+this.dividends;
    }

    @Override
    public double getProfit() {
        return (this.totalShares*this.currentPrice)-this.totalCost;
    }
}
