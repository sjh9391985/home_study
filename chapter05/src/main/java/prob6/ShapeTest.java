package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest extends Shape implements Resizable {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		
		list.add( new Rectangle(5, 6) );
		list.add( new RectTriangle( 6, 2) );
		
		for( Shape shape : list ) {
			System.out.println( "area:" + shape.getArea() );
			System.out.println( "perimeter:" + shape.getPerimeter() );
			
			if( shape instanceof Resizable ) {
				Resizable resizable = (Resizable) shape;
				resizable.resize( 0.5 );
				System.out.println( "new area:" + shape.getArea() );
				System.out.println( "new perimeter:" + shape.getPerimeter() );
			}
		}
	}

	@Override
	public void resize(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}