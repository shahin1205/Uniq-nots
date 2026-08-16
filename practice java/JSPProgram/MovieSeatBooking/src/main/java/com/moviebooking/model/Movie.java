package com.moviebooking.model;

public class Movie {

    private int id;
    private String movieName;
    private String showDate;
    private String showTime;
    private double price;
    private int rowsCount;
    private int seatsPerRow;

    public Movie(){}

    public Movie(String movieName,
                 String showDate,
                 String showTime,
                 double price,
                 int rowsCount,
                 int seatsPerRow){

        this.movieName=movieName;
        this.showDate=showDate;
        this.showTime=showTime;
        this.price=price;
        this.rowsCount=rowsCount;
        this.seatsPerRow=seatsPerRow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }
// Generate Getters Setters
}