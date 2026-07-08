package main;

import java.io.File;
import java.io.FileNotFoundException;

import model.Circle;
import model.ShapeReader;

public class shapeReaderTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("src/main/resources/Shapes");
		ShapeReader shapeReader = new ShapeReader(file);
		
		System.out.println(shapeReader.getShapesWithMinArea(2));
		System.out.println(shapeReader.getCircles());
		
		Circle circle1 = new Circle(31.23);
		System.out.println(circle1.getCircumferenceInCm());

	}

}
