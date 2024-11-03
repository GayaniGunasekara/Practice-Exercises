abstract class Figure{
    double dim1 ;
    double dim2 ;
   Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    double area(){
        System.out.println("Area for rectangle: ");
        return dim1*dim2;
    }
}


class Triangle extends Figure{
    Triangle(double dim1,double dim2){
        super(dim1,dim2);
    }

    @Override
    double area() {
        System.out.println("Area of the triangle");
        return (dim1*dim2)/2;
    }
}


class ex02{
    public static void main(String[] args) {




        Triangle t1 = new Triangle(21.33,34.23);
        Figure t2 = new Rectangle(33,25);
        Triangle t3 = new Triangle(43.33,45.33);

        t1.area();
        t2.area();
        t3.area();
    }
}

