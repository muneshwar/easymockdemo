package easymarket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class StockMarketTest {
	private Business business;
	private StockMarket mockMarket;
	
	@Before
	public void setUp() {
		System.out.println("setting the intial parameters");
		business = new Business();
		business.setName("healthcare");
		mockMarket = EasyMock.createMock(StockMarket.class);
		business.setStockMarket(mockMarket);
	}
	
	@Test
	public void getMarketValueTest() {
		Stock stock = new Stock("first",3);
		business.addStock(stock);
		EasyMock.expect(mockMarket.getPrice("first")).andReturn(30.0);
		EasyMock.replay(mockMarket);
		System.out.println(" The market value is : "+business.getMarketValue());
		assertEquals( Double.valueOf(90.0),business.getMarketValue());
	}

}
