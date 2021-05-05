package gun2Odev;

public class Main {

	public static void main(String[] args) {
		
		Kurs kurs1=new Kurs(1,"Programlamaya Giriþ Ýçin Temel Kurs",0,"Engin Demiroð");
		
		KursManager kursManager1=new KursManager();
		kursManager1.add(kurs1);
		
		Kurs kurs2=new Kurs(2,"Yazýlým Geliþtirici Yetiþtirme Kampý C#",0,"Engin Demiroð");
		
		KursManager kursManager2=new KursManager();
		kursManager2.add(kurs2);
		
		//setter larla deðiþkenlere deðer atamak 
		Kurs kurs3=new Kurs();
		kurs3.setcourseId(3);
		kurs3.setname("Yazýlým Geliþtirici Yetiþtirme Kampý Java");
		kurs3.setcomletionRate(0);
		kurs3.setteacher("Engin Demiroð");
		
		KursManager kursManager3=new KursManager();
		kursManager3.add(kurs3);
		
		Kurs[] kurslar= {kurs1,kurs2,kurs3};
		
		Member member1=new Member("Ada","Güzel","x@hotmail.com","***");
		Member member2=new Member("Ahmet","Ak","y@hotmail.com","****");
		Member member3=new Member("Mehmet","Tat","z@hotmail.com","*****");
		
		
		Member[] members= {member1,member2,member3};
		
		System.out.println("KURSLAR");

		for(Kurs kurs:kurslar) 
		{
			System.out.println(kurs.getname());
		}
		
		
		System.out.println("ÜYELER");

		for(Member member:members) 
		{
			System.out.println(member.getFirstName()+" "+ member.getLastName());
		}
		
		
		kurs3.setname("Yazýlým Geliþtirici Yetiþtirme Kampý Java-React");
		kursManager3.update(kurs3);
	
		System.out.println("KURSLAR");

		for(Kurs kurs:kurslar) 
		{
			System.out.println(kurs.getname());
		}
	
	}
			
}
