import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TriangleTest extends TestCase {
	
	private Triangle triangle;
	

	@Test
	public void testIsEquilateral(){
		triangle = new Triangle(3, 3, 3);
		assertTrue(triangle.isEquilateral());
	}
	@Test
	public void testIsIsosceles(){
		triangle = new Triangle(2, 3, 3);
		assertTrue(triangle.isIsosceles());
	}
	@Test
	public void testIsScalene(){
		triangle = new Triangle(4, 3, 2);
		assertTrue(triangle.isScalene());
	}
	

}
