package toy.project.extra.game.textrpg;

public class TextRpgGameMain {

	Character c;
	Item[] items;
	
	TextRpgGameMain(){
		c = new Character("동산물주먹", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("무1한의대검",0,0,10,0);
		items[1] = new Item("가시갑옷",0,0,10,0);		
	}
	
	public static void main(String[] args) {
		new TextRpgGameMain().start();

	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("■□■□■□ 텍스트 RPG Ver 0.0.1 □■□■□■");
			System.out.println("1.내정보 | 2.사냥  |  0.종료");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1 :
				c.showInfo();
				break;
			case 2 :
				hunt();
				break;
				
			case 0 :
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
		
	}
	
	void hunt(){
		Monster m = new Monster("고블린", 20, 10, 15, 10
				, 5, 5, new Item[]{items[0], items[1]});
		System.out.println(m.name + "을 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1 :
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2 :
				System.out.println("도망쳤습니다.");
				break battle;
				
			}
		}
	}

}
