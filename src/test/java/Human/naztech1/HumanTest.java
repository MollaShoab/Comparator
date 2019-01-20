package Human.naztech1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HumanTest {
	@Test
	public void testMapSortByName()
	{
		Map<Integer,Human>map=unSortedMap();
		Collections.synchronizedMap(map);
		assertEquals(nameSortedList(), map);
		for (int keys : map.keySet())
		{
		   System.out.println(keys);
		}		
	}
	public void testMapSortByAge()
	{
		
	}
	public void testMapSortBySalary()
	{
		
	}
	public void testMapByBirthdate() 
	{
		
	}


	@Test
	
	public void testListSortByName() {
		List<Human> list = unsortedList();
		Collections.sort(list);
		assertEquals(nameSortedList(), list);
	}

	@Test
	public void testListSortByAge() {
		List<Human> list = unsortedList();
		Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());
		assertEquals(ageSortedList(), list);
	}

	@Test
	public void testListSortBySalary() {
		List<Human> list = unsortedList();
		Collections.sort(list, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		assertEquals(salarySortedList(), list);
	}

	@Test
	public void testListByBirthdate() {
		List<Human> list = unsortedList();
		Collections.sort(list, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				if (o1.getDateOfBirth().isEqual(o2.getDateOfBirth())) return 0;
				return o1.getDateOfBirth().isAfter(o2.getDateOfBirth()) ? -1 : 1;
			}
		});
		assertEquals(ageSortedList(), list);

	}

	private List<Human> unsortedList() {
		List<Human> emp = new ArrayList<>();

		emp.add(new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));
		emp.add(new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		emp.add(new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		emp.add(new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		return emp;

	}

	private List<Human> ageSortedList() {
		List<Human> hage = new ArrayList<>();
		hage.add(new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		hage.add(new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		hage.add(new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));
		hage.add(new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		return hage;

	}

	private List<Human> salarySortedList() {
		List<Human> hsal = new ArrayList<>();

		hsal.add(new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		hsal.add(new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		hsal.add(new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		hsal.add(new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));
		return hsal;

	}

	private List<Human> dateOfBirthSortedList() {
		List<Human> hdob = new ArrayList<>();
		hdob.add(new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		hdob.add(new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		hdob.add(new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));
		hdob.add(new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		return hdob;
	}

	private List<Human> nameSortedList() {
		List<Human> nam = new ArrayList<>();
		nam.add(new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		nam.add(new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		nam.add(new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		nam.add(new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));

		return nam;

	}
	private Map<Integer, Human> unSortedMap() {
		Map<Integer,Human> un = new HashMap<>();
		un.put(0,new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		un.put(3,new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));
		un.put(2,new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		un.put(1,new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		

		return un;
	}
	private Map<Integer, Human> nameSortedMap() {
		Map<Integer,Human> Mnam = new HashMap<>();
		Mnam.put(0,new Human("nahid", 25, 17000.15f, LocalDate.of(1994, 12, 21)));
		Mnam.put(1,new Human("rahad", 21, 18000.12f, LocalDate.of(1997, 02, 01)));
		Mnam.put(2,new Human("shahed", 23, 15000.35f, LocalDate.of(1996, 05, 01)));
		Mnam.put(3,new Human("shoab", 24, 25000.32f, LocalDate.of(1995, 03, 24)));

		return Mnam;
	}
}
