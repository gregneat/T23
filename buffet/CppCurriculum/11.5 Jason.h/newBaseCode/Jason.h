#ifndef _JASON_H_
#define	_JASON_H_


#include <iostream>
#include <windows.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
#include <sstream>
#include <fstream>

using namespace std;
void gotoxy(short x, short y) {
	COORD pos = {x, y};
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
	}
void drawlineH(char symbol, int xcoord, int ycoord, int length){ //draws a horizontal line with indicated length
	gotoxy(xcoord, ycoord);
	for(int i = 0; i < length; i++){
		cout<<symbol;
	}
}
void drawlineV(char symbol, int xcoord, int ycoord, int length){ //draws a vertical line with indicated length
	for(int i = 0; i < length; i++) {
		gotoxy(xcoord, ycoord + i);
		cout<<symbol<<endl;
	}
}
void diagonaldown(char symbol, int xcoord, int ycoord, int length){ //draws a diaongal line with indicated length, negative slope
	for(int i = 0; i < length; i++){
		gotoxy(xcoord + i, ycoord + i);
		cout<<symbol<<endl;
	}
}
void diagonalup(char symbol, int xcoord, int ycoord, int length){ //draws a diagonal line with indicated length, positive slope
	for(int i = 0; i < length; i++){
		gotoxy(xcoord + i, ycoord - i);
		cout<<symbol;
	}
}
void drawbox(char symbol, int xcoord, int ycoord, int width, int height){ //draws a filled box
	for(int i = 0; i < height; i++){
		drawlineH(symbol, xcoord, ycoord + i, width);
		cout<<endl;
	}
}
void framedbox(char symbol, int xcoord, int ycoord, int width, int height){ //draws a framed box
	drawlineH(symbol, xcoord, ycoord, width);
	cout<<endl;
	for(int i = 0; i < height - 1; i++){
		gotoxy(xcoord, ycoord + i + 1);
		cout<<symbol;
		gotoxy(xcoord + width - 1, ycoord + i + 1);
		cout<<symbol;
		cout<<endl;
	}
	drawlineH(symbol, xcoord, ycoord + height, width);
}
void triangle(char symbol, int xcoord, int ycoord, int height){ // draws a filled triangle
	gotoxy(xcoord, ycoord);
	cout<<symbol;
	cout<<endl;
	for(int i = 0; i < height; i++){
		drawlineH(symbol, xcoord - i - 1, ycoord + i + 1, 2*i + 3);
		cout<<endl;
	}
}
void framedtriangle(char symbol, int xcoord, int ycoord, int height){ //draws a framed triangle
	gotoxy(xcoord, ycoord);
	cout<<symbol;
	cout<<endl;
	for(int i = 0; i < height; i++){
		gotoxy(xcoord - i - 1, ycoord + i + 1);
		cout<<symbol<<endl;
		gotoxy(xcoord + i + 1, ycoord + i + 1);
		cout<<symbol<<endl;
	}
	drawlineH(symbol, xcoord - height, ycoord + height, height*2);
}
int pow(int x, int y){ //returns first number to the power of second number
	int saved = x;
	int c = 0;
	y = y - 1;
	while(c<y){
		x=x*saved;
		c++;
	}
	return x;
}
boolean equal(int a, int b){ //returns a true/false statement depending on equality of numbers
	if(a==b) return true;
	else return false;
}
int max(int a, int b){ //finds the greater number between the two
	if(a>b) return a;
	else if (b>a) return b;
	else return 0;
}
int min(int a, int b){//finds the smaller number between the two
	if(a<b) return a;
	else if (b<a) return b;
	else return 0;
}
int abs(int x){ //returns the absolute value of a given number
	if(x < 0) x = x*-1;
	return x;
}
int random(int r)
{
    return rand()% r + 1;
}  
#endif


