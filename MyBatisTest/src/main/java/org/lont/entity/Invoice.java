package org.lont.entity;

import java.util.Date;
import java.util.List;

public class Invoice {
   private int invoice;
   private int customerID;
   private Date invoiceDate;
   private String total;
   private Customer customer;
   private List<BillingInfo> list;
}
