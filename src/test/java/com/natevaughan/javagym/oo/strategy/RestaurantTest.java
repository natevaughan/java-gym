package com.natevaughan.javagym.oo.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
	/**
	 * Create a class called Restaurant that takes the following commands
	 * CREATE_MENU_ITEM <item_id> <item_name> <price>
	 *     -> "created" if success
	 *     -> "duplicate" if duplicated name or id
	 * CREATE_TABLE <table_id> <seat_count>
	 *     -> "created" if success
	 *     -> "duplicate" if duplicated id
	 * SEAT_PARTY <guest_count> <table_id_optional>
	 *     -> seat the party at the optionally specified table, or choose a table that can acommodate the guests
	 *     -> <table_id> if there is a table that can accommodate the guests or if the table specified is available
	 *     -> "occupied" if the table specified is occupied
	 *     -> "" if there is no table available
	 * ORDER_ITEM <item_id> <table_number>
	 *     -> "ordered" if success
	 *     -> "nonexistant" if the item doesn't exist
	 *     -> "unsat" if the table does not have guests
	 * CHECKOUT <table_id>
	 *     -> Return the total amount owed to settle the bill, with 10.5% tax
	 *     -> Include 18% gratuity if there are more than 5 in the party
	 * CAPACITY
	 *     -> "70.0%" return the percent, out of 100, with 1 decimal place, of seats filled in the restaurant
	 */
	@Test
	public void restaurantTest1() {
		Restaurant r = new Restaurant();
		assertEquals("created", r.process("CREATE_MENU_ITEM app01 SpinDip 9.50"));
		assertEquals("duplicate", r.process("CREATE_MENU_ITEM app01 Fries 6.50"));
		assertEquals("duplicate", r.process("CREATE_MENU_ITEM app02 SpinDip 8.50"));
	}

	@Test
	public void restaurantTest2() {
		Restaurant r = new Restaurant();
		assertEquals("created", r.process("CREATE_TABLE table01 6"));
		assertEquals("duplicate", r.process("CREATE_TABLE table01 4"));
	}

	@Test
	public void restaurantTest3() {
		Restaurant r = new Restaurant();
		assertEquals("created", r.process("CREATE_TABLE table01 4"));
		assertEquals("created", r.process("CREATE_TABLE table02 6"));
		assertEquals("created", r.process("CREATE_TABLE table03 2"));
		assertEquals("table01", r.process("SEAT_PARTY 5"));
		assertEquals("table03", r.process("SEAT_PARTY 1"));
		assertEquals("", r.process("SEAT_PARTY 5"));
		assertEquals("occupied", r.process("SEAT_PARTY 5 table01"));
	}


	/**
	 * Now create a new command that gets the sales totals for each item and
	 * ranks them by most sales volume (dollars) to least:
	 * SALES_REPORT
	 *  - should output <item_id> <sales_amount_dollars> <sales_count>
	 *  - in the case of equal sales dollars amounts, it should order by higher volume
	 */
	@Test
	public void happyHourTest1() {

	}
}
