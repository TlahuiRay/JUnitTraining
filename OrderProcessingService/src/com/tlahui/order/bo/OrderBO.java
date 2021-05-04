package com.tlahui.order.bo;

import com.tlahui.order.bo.exception.BOException;
import com.tlahui.order.dto.Order;

public interface OrderBO {
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
}
