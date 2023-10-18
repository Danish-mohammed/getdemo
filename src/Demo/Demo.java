package Demo;

class Parent {
    int x= 10;

    public Parent() {
        System.out.println("parent clas Constructor");
    }

    void display(){
        System.out.println("Parent class display method");
    }
}

class Child extends Parent{
    int x =20;

    public Child() {
        super();
    }

    @Override
    void display() {
        System.out.println("Child display method");
        System.out.println("Child x value:"+x);
        System.out.println("Parent x value:"+ super.x);
        super.display();
    }
}

class Demo{
    public static void main(String[] args) {
        Child object = new Child();
        object.display();
    }
}
