/* MyTriangle.java
 * simple program to demonstrate the API for StdDraw
 * draws a triangle with a dot in the middle
 * written by Joe Ryan, 11 Sep, 2014 in support of Algorithms I, Princeton Univ
 * published on Coursera.org
 * release under the MIT License, no warranty is expressed or implied!
 */

public class MyTriangle {
    public static void main(String[] args) {
        double t = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        StdDraw.point(0.5, t/3.0);
    }
}