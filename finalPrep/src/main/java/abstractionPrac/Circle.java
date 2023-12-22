package abstractionPrac;

class Circle extends Shape{
    double radius;
    
    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
