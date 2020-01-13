package com.company.oop;

public class MyClass {
    public static void main(String[] args) {
        E obj = new E(10, 20, 30,40,50);
        System.out.println("A.x = " + obj.x +          "; B.y = " + obj.x + "; C.z = " + obj.z+"; D.k = "+obj.k+"; E.n = "+obj.n);
    }
}
class A {
    public int x;
    public A(int x) {     // Конструктор
        this.x = x;
        System.out.println("A.A()");
    }
}

class B extends A {
    public int y;
    public B(int x, int y) {  // Конструктор
        super(x); // Вызов A.A(x)
        this.y = y;
        System.out.println("B.B()");
    }
}


class C extends B {
    public int z;
    public C(int x, int y, int z) {// Конструктор
        super(x, y);    // Вызов B.B(x, y)
        this.z = z;
        System.out.println("C.C()");    }
    }


        class D extends C{
    public  int k;
        public D(int x, int y, int z, int k) {
            super(x, y, z);
            this.k=k;
        }
    }

   class E extends D{
    public int n;
    public E(int x, int y, int z,int k, int n){
        super(x,y,z,k);
        this.n=n;
    }
   }