package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    final Point p;
    final double radius;
    double Pi= Math.PI;

    public Circle(Point p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Pi*Math.pow(radius,2);
    }

    @Override
    public String pointsToString() {
        return p.toString();
    }

    @Override
    public Point leftmostPoint() {
        return new Point(p.getX() - radius, p.getY());
    }

    @Override
    public String toString() {
        return String.format("Circle[%s%s]", pointsToString(), radius);
    }
}
