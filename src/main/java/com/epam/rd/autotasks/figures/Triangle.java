package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
final Point p1;
final Point p2;
final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double area() {
        double operand1 = (p1.getX() - p3.getX()) * (p2.getY() - p3.getY());
        double operand2 = (p2.getX() - p3.getX()) * (p1.getY() - p3.getY());
        return Math.abs(operand1 - operand2) / 2;
    }

    @Override
    public String pointsToString() {
        return String.format("%s%s%s", p1, p2, p3);
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));

        if (p1.getX() == minX) {
            return p1;
        }

        if (p2.getX() == minX) {
            return p2;
        }

        return p3;
    }
    }
