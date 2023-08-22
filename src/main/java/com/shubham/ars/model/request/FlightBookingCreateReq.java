package com.shubham.ars.model.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FlightBookingCreateReq {

    private String scheduleId;

    private Integer amountPaid;

    private String customerName;
}
