package demo1;

public class Hero {
	String name;// 姓名
	float hp;// 血量
	float armor;// 护甲
	int moveSpeed;// 移动速度
	int killNum = 0;// 击杀数
	int deathNum = 0;// 死亡数
	int assistsNum = 0;// 助攻数
	static int pi = 100;

	//构造函数
	public Hero() {
	}

	//构造函数
	public Hero(String name, float hp, float armor, int moveSpeed) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getArmor() {
		return armor;
	}

	public void setArmor(float armor) {
		this.armor = armor;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public int getKillNum() {
		return killNum;
	}

	public void setKillNum(int killNum) {
		this.killNum = killNum;
	}

	public int getDeathNum() {
		return deathNum;
	}

	public void setDeathNum(int deathNum) {
		this.deathNum = deathNum;
	}

	public int getAssistsNum() {
		return assistsNum;
	}

	public void setAssistsNum(int assists) {
		this.assistsNum = assists;
	}
	
	//击杀函数，击杀数+1
	public int kill(Hero hero) {
		hero.hp = 0;
		System.out.println(this.name + "击杀了" + hero.name);
		this.legendary();
		this.killSay();
		hero.deathSay();
		return this.killNum += 1;
	}

	//击杀对手时喊话
	public void killSay() {
		System.out.println(this.name+"才是胜利者！");
	}

	//助攻，助攻数+1
	public int assists(Hero teammate,Hero enemy) {
		teammate.kill(enemy);
		System.out.println(this.name +"协助"+teammate.name+"击杀了"+enemy.name);
		return this.assistsNum++;
	}
	
	//死亡，死亡数+1
	public int death() {
		if (this.hp == 0) {
			this.deathNum += 1;
		}
		return this.deathNum;
	}

	//死亡喊话
	public void deathSay() {
		System.out.println(this.name + "一定会再回来的！");
	}
	
	//超神
	public void legendary() {
		if (this.killNum >= 8) {
			System.out.println(this.name+"已经超神了！");
		}
	}
	
	public float recovery(float blood) {
		return this.hp += blood;
	}

	public static void main(String[] args) {
		Hero gailun = new Hero("盖伦", 3000, 120, 350);
		Hero timo = new Hero("提莫", 1998, 50, 350);
		Hero guanghui = new Hero("光辉", 2000, 45, 345);
		System.out.println("我是伟大的" + gailun.name);
		gailun.kill(timo);
		System.out.println(gailun.killNum);
		gailun.assists(guanghui, timo);
		for (int i = 1; i < 9; i++) {
			System.out.println("***********"+i+"***********");
			gailun.kill(timo);
		}
		
	}
}
