/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 extends SuperHero{

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
        SuperHero superhero=new SuperHero();
        Slime slime=new Slime();

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
        Item item=new Item("こん棒",4);
        
		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
        

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
do{
        	
        	if( slime.damage(superhero.attack( )) ){ // HeroがSlimeに攻撃
            	System.out.println(superhero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
            	break;
            	}else{
            	if( superhero.damage(slime.attack( )) ){ // SlimeがHeroに攻撃
            	System.out.println(slime.getName()+"は"+superhero.getName()+"との戦闘に勝利した");
            	break;
            	}
            	}
            	}while ( true );
        
        
	}
}
