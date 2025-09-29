#include<iostream>
using namespace std;
class b;
class a{
	private:
		int a = 1;
	friend void show(class a, class b );
};
class b{
	private:
		int b = 2 ;
	friend void show( class a , class b );
};
void show(a ob , b ob1){
	cout << ob.a + ob1.b ;
}
int main(){
	a ob2;
	b ob3;
	show(ob2 , ob3);
}
