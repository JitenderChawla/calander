package com.example.AppointmentCalendar.Models;

public class Booking
{
    private String date;

    private Bookings[] bookings;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public Bookings[] getBookings ()
    {
        return bookings;
    }

    public void setBookings (Bookings[] bookings)
    {
        this.bookings = bookings;
    }

//    @Override
//    public String toString()
//    {
//        return "ClassPojo [date = "+date+", bookings = "+bookings+"]";
//    }
}
		