package com.zyl.hi.entities;

/**
 * @program: hibernate_demo02
 * @author: zhangyueli
 * @date: 2020-09-25
 */

public class Stock implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Stock stock;
    private Integer stockId;
    private String stockCode;
    private String stockName;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public Stock getOper() {
        return stock;
    }

    public void setOper(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockCode='" + stockCode + '\'' +
                ", stockName='" + stockName + '\'' +
                '}';
    }
}
