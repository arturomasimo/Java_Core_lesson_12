package lession12_enumArrayList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;
import java.util.List;
/**
 * The Main class represents working with enums
 * @author ARTUR
 * @since JDK 13.0.2
 */


public class Main {

// main metod first work 
	public static void main(String[] args) throws WrongInputConsoleParametersException  {
		Scanner scan = new Scanner(System.in);
		String st;
		int d=0,c=0;
	
		List<Month> monthList  = Arrays.asList(Month.values());
		List<Season>seasonList = Arrays.asList(Season.values());
		

		while (true) {
			printMenu();
			st = scan.nextLine();
			switch (st) {
			case "1": {
				System.out.print("Введіть назву місяця : ");
				st = scan.nextLine();
				checkErrors(st, "місяця");
				if (checkMonth(st, monthList)) {//
					System.out.println("Такий місяць існує");
				} else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			case "2": {
				System.out.print("Введіть пору року: ");
				st = scan.nextLine();
				checkErrors(st, "пори року");

				if (checkSeason(st, seasonList)) {
					System.out.print("Пора року " + st.toUpperCase() + " має такі місяці: ");
					for (Month m1 : monthList) {
						if (m1.getSeason().name().equalsIgnoreCase(st)) {
							System.out.print(m1.name() + " ");
						}
					}
					System.out.println();
				} else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			case "3": {
				System.out.print("Введіть назву місяця: ");
				st = scan.nextLine();
				checkErrors(st, "місяця");
				if (checkMonth(st, monthList)) {

					for (Month m : monthList) {
						if (m.name().equalsIgnoreCase(st))
						{
							d = m.getDays();
							break;
						}		
						}
					System.out.print("Кількість днів у місяця " + st.toUpperCase() + " має " + d 
							+ " днів і мають такі місяці: ");
					
					for (Month m2 : monthList) {
						if (m2.getDays()==d) {
							System.out.print(m2.name() + " ");
						}
					}
					System.out.println();
				} else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			case "4": {
				System.out.print("Введіть назву місяця : ");
				st = scan.nextLine();
				checkErrors(st, "місяця");
				if (checkMonth(st,monthList)) {
					for (Month m : monthList) {
						if (m.name().equalsIgnoreCase(st))
						{
							d = m.getDays();
							break;
						}		
						}

					System.out.print("Кількість днів у місяця " + st.toUpperCase() + " має " + d
							+ " днів і МЕНШЕ мають такі місяці: ");
					for (Month m2 : monthList) {
						if (m2.getDays()<d) {
							System.out.print(m2 + "(" + m2.getDays() + ") ");
						}
					}
					System.out.println();
				} else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			case "5": {
				System.out.print("Введіть назву місяця : ");
				st = scan.nextLine();
				checkErrors(st, "місяця");
				if (checkMonth(st,monthList)) {
					for (Month m : monthList) {
						if (m.name().equalsIgnoreCase(st))
						{
							d = m.getDays();
							break;
						}		
						}

					System.out.print("Кількість днів у місяця " + st.toUpperCase() + " має " + d
							+ " днів і БІЛЬШЕ мають такі місяці: ");
					for (Month m2 : monthList) {
						if (m2.getDays()>d) {
							System.out.print(m2 + "(" + m2.getDays() + ") ");
						}

					}
					System.out.println();
					}
				 else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			case "6": {
				System.out.print("Введіть пору року: ");
				st = scan.nextLine();
				c=0;
				Season [] season = Season.values();
				checkErrors(st, "пори року");
				if (checkSeason(st, seasonList)) {

					System.out.print("Пора року " + st.toUpperCase() + " має наступну після себе ");
					for (Season s2 : seasonList) {
						if (st.equalsIgnoreCase(s2.name()))
							{
								break;
							}
						else
						{
						c=c+1;
						}
						
					}
					if (c == 3)
						System.out.print(season[0]);
					else
						System.out.print(season[c+ 1]);
					System.out.println();
				} else {
					System.out.println("Такої пори року немає");
				}
				break;
			}
			case "7": {
				System.out.print("Введіть пору року: ");
				st = scan.nextLine();
				Season [] season = Season.values();
				c=0;
				checkErrors(st, "пори року");
				System.out.print("Пора року " + st.toUpperCase() + " має попередню після себе ");
				if (checkSeason(st, seasonList)) {
				for (Season s2 : seasonList) {
					if (st.equalsIgnoreCase(s2.name()))
						{
							break;
						}
					else
					{
					c=c+1;
					}
					
				}
				if (c == 0)
					System.out.print(season[3]);
				else
					System.out.print(season[c- 1]);

					System.out.println();
				} else {
					System.out.println("Такої пори року немає");
				}
				break;
			}
			case "8": {
				System.out.print("Місяці з парною кількістю днів: ");
				for (Month m2 : monthList) {
					if (m2.getDays() % 2 == 0) {
						System.out.print(m2 + " " + m2.getDays() + ", ");
					}
				}
				System.out.println();
				break;
			}

			case "9": {
				System.out.print("Місяці з НЕпарною кількістю днів: ");
				for (Month m2 : monthList) {
					if (m2.getDays() % 2 == 1) {
						System.out.print(m2 + " " + m2.getDays() + ", ");
					}
				}
				System.out.println();
				break;
			}
			case "0":
			{
				System.exit(0);
			}
			case "10": {
				System.out.print("Введіть назву місяця: ");
				st = scan.nextLine();
				checkErrors(st, "місяця");

				if (checkMonth(st, monthList)) {
					for (Month m2 : monthList)
						if (m2.name().equalsIgnoreCase(st))
						{
							d = m2.getDays();
							break;
						}		
				{
					if (d % 2 == 0) {
						System.out.print(st + " має парну кількість днів (" + d + ")");
					} else {
						System.out.print(st + " має НЕпарну кількість днів (" + d + ")");
					}
					}
					System.out.println();
				} else {
					System.out.println("Такого місяця немає");
				}
				break;
			}
			default:
				throw new WrongInputConsoleParametersException("Неправильне значення: " + st);
			}
		}
	
	}
	// print menu 
	private static void printMenu() {
		System.out.println("Введіть 1  щоб перевірити чи є місяць в році");
		System.out.println("Введіть 2  щоб вивести всі місяці пори року");
		System.out.println("Введіть 3  щоб всі місяці з вказаною кількістю днів");
		System.out.println("Введіть 4  щоб всі місяці з меншою кількістю днів");
		System.out.println("Введіть 5  щоб всі місяці з більшою кількістю днів");
		System.out.println("Введіть 6  щоб вивести наступну пору року");
		System.out.println("Введіть 7  щоб вивести попередню пору року");
		System.out.println("Введіть 8  щоб вивести місяці з парною кількістю днів");
		System.out.println("Введіть 9  щоб вивести місяці з НЕпарною кількістю днів");
		System.out.println("Введіть 10 щоб вивести парна чи непарна кількість днів в місяці");
		System.out.println("Введіть 0  щоб вийти з програми");
		
	}
	//check for the presence of the month
	private static boolean checkMonth(String s, List<Month> monthList) {
		boolean f = false;
		for (Month month : Month.values()) {
			if (s.equalsIgnoreCase(month.name())) {
				f = true;
				break;
			}
		}
		return f;
	}
 // check for the presence of the season
	private static boolean checkSeason(String s, List<Season> seasonList) {
		boolean f = false;
		for (Season s1 : seasonList) {
			if (s.equalsIgnoreCase(s1.name())) {
				f = true;
				break;
			}
		}
		return f;
	}
// check the correctness of the month or season
	private static void checkErrors (String s1, String s2 ) throws WrongInputConsoleParametersException
	{
		String kirilica = "[а-яА-Я+]";
		Pattern pattern = Pattern.compile(kirilica);
		Matcher mather = pattern.matcher(s1);
		
		if(s1.length()<3 || s1.length()>9)
			throw new WrongInputConsoleParametersException("Назва "+s2+" введена невірно (кількість знаків)");
		if (!s1.matches("^\\D*$"))
			throw new WrongInputConsoleParametersException("Назва "+s2+" не може містити цифри");
		if (mather.find())
			throw new WrongInputConsoleParametersException("Назва "+s2+" не може містити кирилицю");
			
	}
}
