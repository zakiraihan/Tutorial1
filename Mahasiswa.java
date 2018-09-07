public class Mahasiswa {
	public static String name;
	public static String npm;
	public static int age;
	public static char sex;

	public Mahasiswa(String name, String npm, int age, char sex) {
		this.name = name;
		this.npm = npm;
		this.age = age;
		this.sex = sex;
	}

	public static String get_name(){
		return name;
	}

	public static String get_npm() {
		return npm;
	}

	public static void set_npm(int npm){
		this.npm = npm;
	}
}
