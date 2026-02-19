package utility;

public class StringArrayHelper {

	public static String[] add(String[] array, String value) {
		
		int size = StringArrayHelper.size(array);

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
		return array;

	}

	public static int size(String[] array) {
		int size = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				size++;
			}

		}
		return size;
	}
	
	public static void print(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");

		}
		System.out.println("]");
	}

}