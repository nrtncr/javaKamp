package gun2Odev;

public class KursManager {
	
	public void add(Kurs kurs) {
		System.out.println("Kurs tan�mland�: " + kurs.getname());
      }
	
	public void update(Kurs kurs) {
		System.out.println("Kurs bilgileri g�ncellendi: " + kurs.getname());
	}
}
