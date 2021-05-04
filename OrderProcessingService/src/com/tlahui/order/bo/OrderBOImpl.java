package com.tlahui.order.bo;

import java.sql.SQLException;

import com.tlahui.order.bo.exception.BOException;
import com.tlahui.order.dao.OrderDAO;
import com.tlahui.order.dto.Order;

public class OrderBOImpl implements OrderBO {
	
	private OrderDAO dao;

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			dao.create(order);
		} catch (SQLException e) {
			throw new BOException(e);			
		}
		return false;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		return false;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		return false;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
