import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_compras {
	
	@Test
	void testUmaParcela() {
		CompraParcelada cp = new CompraParcelada(200.00, 1, 0.01);
		assertEquals(202.00, cp.total());
	}
	
	@Test
	void testDuasParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 2, 0.01);
		assertEquals(204.02, cp.total());
	}
	
	@Test
	void testCincoParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 5, 0.01);
		assertEquals(202.20201002000002, cp.total());
	}
	
	@Test
	void testDezParcelas() {
		CompraParcelada cp = new CompraParcelada(200.00, 10, 0.01);
		assertEquals(220.9244250822409, cp.total());
	}

}
