package za.co.simplitate.junit.spring.dao;

import org.springframework.stereotype.Component;

import za.co.simplitate.junit.spring.dto.Ticket;

@Component
public class TicketDaoImpl implements TicketDAO {

	public int create(Ticket ticket) {
		return 1;
	}

}
