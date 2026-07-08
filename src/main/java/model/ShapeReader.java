package model;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {

	double bInCm;

	private final ArrayList<Shape> shapes;

	public ShapeReader(File file) throws FileNotFoundException {
		shapes = new ArrayList<>();
		File shapeFile = file;

		Scanner scanner = new Scanner(shapeFile);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split(";");

			String shapeType = tokens[0];
			double aInCm = Double.parseDouble(tokens[1]);

			if (tokens.length == 3) {
				double bInCm = Double.parseDouble(tokens[2]);
			}

			switch (shapeType) {
			case "Rectangle":
				Rectangel rectangle = new Rectangel(aInCm, bInCm);
				shapes.add(rectangle);
				break;
			case "Circle":
				Circle circle = new Circle(aInCm);
				shapes.add(circle);
				break;
			case "Square":
				Square square = new Square(aInCm);
				shapes.add(square);
				break;
			}
		}
	}

	public ArrayList<Circle> getCircles() {
		ArrayList<Circle> circleList = new ArrayList<>();
		for (Shape circles : shapes) {
			if (circles instanceof Circle) {
				circleList.add((Circle) circles);
			}
		}
		return circleList;
	}

	public ArrayList<Shape> getShapesWithMinArea(double areaInCm2) {
		ArrayList<Shape> shapesWithSize = new ArrayList<>();
		double tempSize = 0;

		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				tempSize = shape.getAreaInCm2();
			} else if (shape instanceof Square) {
				tempSize = shape.getAreaInCm2();
			} else if (shape instanceof Rectangel) {
				tempSize = shape.getAreaInCm2();
			}

			if (tempSize >= areaInCm2) {
				shapesWithSize.add(shape);
			}

		}

		return shapesWithSize;

	}

}
