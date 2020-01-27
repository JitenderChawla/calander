package com.example.AppointmentCalendar.Models;

public class Bookings
{
    private int slotId;

    private Long bookingStartTime;

    private int bookingId;

    private Customer customer;

    public int getSlotId ()
    {
        return slotId;
    }

    public void setSlotId (int slotId)
    {
        this.slotId = slotId;
    }

    public Long getBookingStartTime ()
    {
        return bookingStartTime;
    }

    public void setBookingStartTime (Long bookingStartTime)
    {
        this.bookingStartTime = bookingStartTime;
    }

    public int getBookingId ()
    {
        return bookingId;
    }

    public void setBookingId (int bookingId)
    {
        this.bookingId = bookingId;
    }

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

//    @Override
//    public String toString()
//    {
//        return "ClassPojo [slotId = "+slotId+", bookingStartTime = "+bookingStartTime+", bookingId = "+bookingId+", customer = "+customer+"]";
//    }
}