package com.sorrowblue.ktcore.core

import com.sorrowblue.ktcore.peripheral.Coords
import com.sorrowblue.ktcore.peripheral.Items
import com.sorrowblue.ktcore.state.*

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

	/**
	 * プレーヤーに3次元の加速度vecX、vexY、vecZを追加します。
	 */
	fun addVelocity(vecX: Double, vecY: Double, vecZ: Double)

	/**
	 * プレイヤーの経験状態を返します。
	 */
	fun experience(): Exception

	/**
	 * プレイヤーの経験を返します。
	 */
	fun getExperience(): Double

	/**
	 * プレーヤーにexp期限を設定します。
	 */
	fun setExperience(exp: Double)

	/**
	 * プレイヤーに経験を追加します。
	 */
	fun addExperience(exp: Double)

	/**
	 * プレーヤーのレベルのステータスを返します。
	 */
	fun level(): Level

	/**
	 * プレーヤーのレベルを返します。
	 */
	fun getLevel(): Int

	/**
	 * プレーヤーにlvlレベルを設定します。
	 */
	fun setLevel(lv: Int)

	/**
	 * プレーヤーにレベルを追加します。
	 */
	fun addLevel(lv: Int)

	/**
	 * プレーヤーのフライト状況を返します。
	 */
	fun flying(): Flying

	/**
	 * プレーヤーが飛行できるかどうかを調べます。
	 */
	fun getFlyingEnabled(): Boolean

	/**
	 * プレーヤーの飛行能力を設定します。
	 */
	fun setFlyingEnabled(fly: Boolean)

	/**
	 * プレーヤーが飛んでいるかどうかを調べます。
	 */
	fun getFlying(): Boolean

	/**
	 * プレーヤーのフライト状況を設定します。
	 */
	fun setFlying(fly: Boolean)

	/**
	 * プレーヤーの疲労状態を返します。
	 */
	fun exhaustion(): Exhaustion

	/**
	 * プレーヤーの疲労を返します。
	 */
	fun getExhaustion(): Double

	/**
	 * プレイヤーのexh欠乏単位を設定します。
	 */
	fun setExhaustion(exh: Double)

	/**
	 * プレーヤーの飽和状態を返します。
	 */
	fun hunger(): Hunger

	/**
	 * プレーヤーの満腹感を返します。
	 */
	fun getHunger(): Int

	/**
	 * プレーヤーの飽食単位のhnrを指定します。
	 */
	fun setHunger(hnr: Int)

	/**
	 * プレーヤーの彩度状態を返します。
	 */
	fun saturation(): Saturation

	/**
	 * プレーヤーの彩度を返します。
	 */
	fun getSaturation(): Int

	/**
	 * sat飽和単位をプレーヤーに設定します。
	 */
	fun setSaturation(sat: Int)

	/**
	 * プレーヤーの健康状態を返します。
	 */
	fun health(): Health

	/**
	 * プレーヤーの健康状態を返します。
	 */
	fun getHealth(): Int

	/**
	 * ヘルスの単位をプレイヤーに設定します。
	 */
	fun setHealth(hp: Int)

	/**
	 * プレーヤーのアカウントのステータスを返します。
	 */
	fun score()
	/**
	 *  プレーヤーのスコアを返します。
	 */
	fun getScore()
}
