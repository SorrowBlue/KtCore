package com.sorrowblue.ktcore.core

import com.sorrowblue.ktcore.peripheral.Coords
import com.sorrowblue.ktcore.peripheral.Items

external object Player {

	/**
	 * アイテムをプレイヤーのインベントリに追加します。
	 */
	fun addItemToInventory(nameID: String, count: Int)

	/**
	 * Entityモジュールを使用してプレーヤを操作するエンティティとしてプレーヤを返します。
	 */
	fun get(): Long

	/**
	 * エンティティプレーヤーとしてのプレーヤーの名前を返します。
	 */
	fun getNameForEnt(player: Long): String

	/**
	 * プレーヤーの名前を返します。
	 */
	fun getName(): String

	/**
	 * プレーヤーが配置されている次元のIDを返します。
	 */
	fun getDimension(): Int

	/**
	 * mobの本質がプレーヤーかどうかをチェックします。
	 */
	fun isPlayer(mob: Long): Boolean

	/**
	 * プレーヤーが見ているオブジェクトを返します。
	 */
	fun getPointed(): dynamic

	/**
	 * プレイヤーの目録をmobエンティティとして返します。
	 */
	fun getInventory(mob: Long, obj0: dynamic, obj1: dynamic): dynamic

	/**
	 * プレーヤーが保持するアイテムを返します。
	 */
	fun getCarriedItem(): Items

	/**
	 * id、count、dataで項目を保持させます。
	 */
	fun setCarriedItem(id: Int, count: Int, data: Int)

	/**
	 * カウントアイテムをプレイヤーの手札から削除します。
	 */
	fun decreaseCarriedItem(count: Int)

	/**
	 * 座標x、y、zにプレーヤーを配置します。
	 */
	fun setPosition(x: Int, y: Int, z: Int)

	/**
	 * プレーヤーの座標を返します。
	 */
	fun getPosition(): Coords

	/**
	 * プレーヤーを座標x、y、zに移動します。
	 */
	fun addPosition(x: Int, y: Int, z: Int)

	/**
	 * プレーヤーに3次元の加速度velx、vely、velzを設定します。
	 */
	fun setVelocity(vecX: Double, vecY: Double, vecZ: Double)

	/**
	 * プレーヤーの3Dアクセラレーションを返します。
	 */
	fun getVelocity(): Coords
	fun addVelocity(velx、vely、velz) - プレーヤーに3次元の加速度velx、vely、velzを追加します。
	fun experience() - プレイヤーの経験状態を返します。
	fun getExperience() - プレイヤーの経験を返します。
	fun setExperience(exp) - プレーヤーにexp期限を設定します。
	fun addExperience(exp) - プレイヤーに経験を追加します。
	fun level() - プレーヤーのレベルのステータスを返します。
	fun getLevel() - プレーヤーのレベルを返します。
	fun setLevel(lvl) - プレーヤーにlvlレベルを設定します。
	fun addLevel(lvl) - プレーヤーにレベルを追加します。
	fun flying() - プレーヤーのフライト状況を返します。
	fun getFlyingEnabled() - プレーヤーが飛行できるかどうかを調べます。
	fun setFlyingEnabled(fly？) - プレーヤーの飛行能力を設定します。
	fun getFlying() - プレーヤーが飛んでいるかどうかを調べます。
	fun setFlying(fly？) - プレーヤーのフライト状況を設定します。
	fun exhaustion() - プレーヤーの疲労状態を返します。
	fun getExhaustion() - プレーヤーの疲労を返します。
	fun setExhaustion(exh) - プレイヤーのexh欠乏単位を設定します。
	fun hunger() - プレーヤーの飽和状態を返します。
	fun getHunger() - プレーヤーの満腹感を返します。
	fun setHunger(hnr) - プレーヤーの飽食単位のhnrを指定します。
	fun saturation() - プレーヤーの彩度状態を返します。
	fun getSaturation() - プレーヤーの彩度を返します。
	fun setSaturation(sat) - sat飽和単位をプレーヤーに設定します。
	fun health() - プレーヤーの健康状態を返します。
	fun getHealth() - プレーヤーの健康状態を返します。
	fun setHealth(hp) - ヘルスの単位をプレイヤーに設定します。
	fun score() - プレーヤーのアカウントのステータスを返します。
	fun getScore() - プレーヤーのスコアを返します。
}
