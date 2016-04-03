package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VendingMachineItemTest {
	
	VendingMachineItem vendingItem;

	@Before
	public void setUp() throws Exception {
		vendingItem = new VendingMachineItem("name", 1.5);
	}

	@After
	public void tearDown() throws Exception {
		vendingItem = null;
	}

	@Test
	public void testVendingMachineItem() {
		vendingItem = new VendingMachineItem("newName", 1.0);
		assertEquals("newName", vendingItem.getName());
		assertEquals(1.0, vendingItem.getPrice(),0.001);
	}
	
	@Test (expected=VendingMachineException.class)
	public void testVendingMachineItemLessThanZeroPrice() {
		vendingItem = new VendingMachineItem("newName", -1.5);
	}

	@Test
	public void testGetName() {
		assertEquals("name", vendingItem.getName());
	}
	
	@Test
	public void testChangeGetName() {
		assertEquals("name", vendingItem.getName());
		vendingItem = null;
		vendingItem = new VendingMachineItem("nameChange", 1.5);
		assertEquals("nameChange", vendingItem.getName());
	}

	@Test
	public void testGetPrice() {
		assertEquals(1.5, vendingItem.getPrice(),0.001);
	}
	
	@Test
	public void testChangeGetPrice() {
		assertEquals(1.5, vendingItem.getPrice(),0.001);
		vendingItem = null;
		vendingItem = new VendingMachineItem("name", 1.0);
		assertEquals(1.0, vendingItem.getPrice(),0.001);	
	}

}
