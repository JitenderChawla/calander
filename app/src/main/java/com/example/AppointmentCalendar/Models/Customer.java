package com.example.AppointmentCalendar.Models;

public class Customer
{
    private String customerId;

    private String customerName;

    public String getCustomerId ()
    {
        return customerId;
    }

    public void setCustomerId (String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerName ()
    {
        return customerName;
    }

    public void setCustomerName (String customerName)
    {
        this.customerName = customerName;
    }

//    @Override
//    public String toString()
//    {
//        return "ClassPojo [customerId = "+customerId+", customerName = "+customerName+"]";
//    }
}
			
		