package raytracer;

import javax.vecmath.*;

public class OrtographicCamera extends Camera {
	private double size = 0d;
	
	public OrtographicCamera(double size) {
		this.size = size;
	}
	
	public Ray generateRay(Point2d point) {
		// ToDo: Generate the ray by
		// providing a point and a vector
        /**
         *
        * IMPLEMENTADO FALTA PROBAR
         */
		Ray ray = new Ray(new Point3d(point.x, point.y, 0), new Vector3d(0d, 0d, 1d));
		return ray;
	}
}
