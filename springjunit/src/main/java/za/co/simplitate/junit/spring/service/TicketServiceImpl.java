package za.co.simplitate.junit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import za.co.simplitate.junit.spring.dao.TicketDAO;
import za.co.simplitate.junit.spring.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketDAO dao;

	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		return getTicketDAO().create(ticket);
	}

	public TicketDAO getTicketDAO() {
		return dao;
	}

	public void setTicketDAO(TicketDAO ticketDAO) {
		this.dao = ticketDAO;
	}

}
