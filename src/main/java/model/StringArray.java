package model;

import utility.StringArrayHelper;

public class StringArray {

	public String[] array = new String[2];

	public void add(String value) {

		int size = size();

		if (size == array.length) {

			String[] tmp = new String[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[1];

			}
			array = tmp;

		}

		for (int i = 0; i < array.length; i++) {
			String content = array[i];
			if (content == null) {
				array[i] = value;
				break;
			}
		}
	}

	public int size() {
		int size = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				size++;
			}

		}
		return size;
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			String content = array[i];
			System.out.print(content + ", ");

		}
		System.out.println("]");
	}

}
