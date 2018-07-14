#include <stdio.h>
#include <conio.h>
main()
{
	struct personal
    {
	    char name[10];
	    int day;
	    char month[10];
	    int year;
	    float salary;
    };
	struct personal inf;
	printf("Enter name, birthdate(day,month,year) and salary -->\n");
	gets(inf.name);
	scanf("%d %d %s %d %f",&inf.day,&inf.month,&inf.year,&inf.salary);
	printf("\nDetails -->\nName : %s\nDate : %d %s %d\nSalary : Rs.\f",inf.name,inf.day,inf.month,inf.year,inf.salary);	
}
