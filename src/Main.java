import problems.*;
import algorithm.*;

public class Main {
    public static void main(String[] args) {
        Algorithm rs = new RandomSearch();

        Problem[] problems = {
                new Sphere(2),
                new Sphere(5),
                new Sphere(10)
                // add others later
        };

        for (Problem p : problems) {
            int maxFes = 3000 * p.getDimensions();
            Solution sol = rs.execute(p, maxFes, true);

            System.out.println("\nBest result for " + p.getName() +
                    " (" + p.getDimensions() + "D): " + sol.fitness);
        }
    }
}
