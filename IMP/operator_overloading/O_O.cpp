#include<iostream>
using namespace std;
class a{
	public:
		int a , b , c;
		void input(){
			cin>> a >> b >> c ;
		}
		void output(){
			cout << a <<b << c;
		}

		//this is operator overloading 
		void operator ++(int){        //parameter showing that this is post , if no parameter it means pre
			a++;
			b++;
			c++;
		}
};
int main(){
	a ob;
	ob.input();
	ob.output();
	ob++;
	ob.output();
}
