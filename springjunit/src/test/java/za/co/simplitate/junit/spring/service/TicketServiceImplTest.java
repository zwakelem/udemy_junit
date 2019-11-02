package za.co.simplitate.junit.spring.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import za.co.simplitate.junit.spring.dao.TicketDAO;
import za.co.simplitate.junit.spring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:application-context.xml" )
public class TicketServiceImplTest {

	private static final int RESULT = 1;
	private static final String PHONE = "123";
	private static final String PASSENGER_NAME = "Zwakele";
	
	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	private TicketServiceImpl service;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void whenBuyTicket_thenReturnValidValue() {
		when(dao.create(any(Ticket.class))).thenReturn(1);
		int result = service.buyTicket(PASSENGER_NAME,PHONE);
		assertEquals(result, RESULT);
	}

}
