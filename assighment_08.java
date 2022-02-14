import java.util.Arrays;

public class NearestPoints {

              

              static double distance(double[] p1, double[] p2) {

                          
                           return Math.sqrt(Math.pow(p2[0] - p1[0], 2)

                                                       + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));

              }

              public static void main(String[] args) {

                           

                           double points[][] = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 },

                                                       { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 }, { -1.5, 4, 2 },

                                                       { 5.5, 4, -0.5 } };

                          
                           double shortestDistance = 0, temp = 0;

                           double[] p1 = null, p2 = null; // closest points

                           

                           for (int i = 0; i < points.length; i++) {

                                         for (int j = i + 1; j < points.length; j++) {

                                                       // finding distance between points at index i and index j

                                                       temp = distance(points[i], points[j]);

                                                      

                                                       if (p1 == null || p2 == null || temp < shortestDistance) {

                                                                    //setting point at index i as p1, point at index j as p2

                                                                    p1 = points[i];

                                                                    p2 = points[j];

                                                                    
                                                                    shortestDistance = temp;

                                                       }

                                         }

                           }

                          
                           System.out.println("Closest Points: " + Arrays.toString(p1) + " and "

                                                       + Arrays.toString(p2));

                         
                           System.out.println("Distance: " + shortestDistance);

              }

}