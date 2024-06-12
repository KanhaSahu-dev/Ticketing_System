package com.kanha.service;

import java.util.List;

import com.kanha.beans.HistoryBean;
import com.kanha.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
