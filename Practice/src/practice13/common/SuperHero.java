package practice13.common;

/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
/*public int attack() {
		return this.power;
 */

public class SuperHero extends Hero {

	private Item epuiment;

	public Item getEpuiment() {
		return epuiment;
	}

	public void setEpuiment(Item epuiment) {
		this.epuiment = epuiment;
	}

	public int attack() {

		return super.attack() + epuiment.getAdditionalDamage();
	}

}
