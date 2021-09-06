/*Nipun Puri
CSC 302 Programming Languages
Write a program that prints the start date of the upcoming weekend.*/

import java.util.Scanner;
import java.io.*;


class main
{
public static void main(String args[])
{
Scanner kb = new Scanner (System.in);

//date
System.out.println("Enter the date");
int date = kb.nextInt();

while(date>31 || date <=0)
{
System.out.println("Enter a date between 1-31");
date = kb.nextInt();
}

//month

System.out.println("Enter the month");
int month = kb.nextInt();

while (month > 12 || month < 0)
{
System.out.println("Enter a month between 1-12");
month = kb.nextInt();
}

//year

System.out.println("Enter the year");
int year = kb.nextInt();

while (year <= 0)
{
System.out.println("Enter a year greater than 0");
year = kb.nextInt();
}

//day of the week
System.out.println("Enter 0 if the day is monday, 1 for tuesday, 2 for wednesday, 3 for thursday, 4 for friday, 5 for saturday, and 6 for sunday");
int day = kb.nextInt();

while (day >6 || day <0)
{
System.out.println("Enter 0 if the day is monday, 1 for tuesday, 2 for wednesday, 3 for thursday, 4 for friday, 5 for saturday, and 6 for sunday");
 day = kb.nextInt();
}


//For the month of Feburary
//leap year

while (month==2 &&  date>29 && year % 4 == 0)
{
System.out.println("Enter a date between 1-29");
date = kb.nextInt();
}

//For non leap year feb
while(date>28 && month==2 && year % 4 !=0)
{
System.out.println("Enter a date between 1-28");
date = kb.nextInt();
}


//For april, june, september, and november
while((month == 4 || month == 6 || month == 9 || month == 11)&&(date>30))
{
System.out.println("Enter a date between 1-30");
date = kb.nextInt();
}

//process
switch (day)
{
case 0:
date = date + 5;
break;

case 1:
date = date + 4;
break;

case 2:
date = date + 3;
break;

case 3:
date = date + 2;
break;

case 4:
date = date + 1;
break;

case 5:
date = date + 7;
break;

case 6:
date = date +6;
break;

default:
}

//For april, june, september, and november
while((month == 4 || month == 6 || month == 9 || month == 11)&&(date>30))
{
date = date - 30;
}

//For feburary non-leap year
while(month == 2 && date > 28)
{
date = date - 28;
}

//For leap year feburary
while(month == 2 && date > 29 && year % 4 == 0)
{
date = date - 29;
}

//For the rest of the months
while(date > 31)
{
date = date - 31;
}

if(month == 12)
{
month = 1;
year = year + 1;
}

else 
month = month + 1;


System.out.println("The start date for the upcoming weekend is: " + date + " / "  + month + " / " + year  );

}


}