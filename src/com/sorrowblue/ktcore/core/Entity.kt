package com.sorrowblue.ktcore.core

import com.sorrowblue.ktcore.peripheral.Coords
import com.sorrowblue.ktcore.peripheral.SimpleCoords

external object Entity {
	/**
	 * 世界のすべてのmobのJava配列を返します。
	 */
	fun getAll(): dynamic

	/**
	 * 世界のすべてのmobのJavaScript配列を返します。
	 */
	fun getAllJS(): dynamic

	/**
	 * mobエンティティのpropetryプロパティの値を文字列として返します。
	 */
	fun getExtra(entity: Long, name: String): dynamic

	/**
	 * mob値の文字列としてvalue値を持つpropetryプロパティを書き込みます。
	 */
	fun putExtra(entity: Long, name: String, value: dynamic)

	/**
	 * mobオブジェクトのpropetryプロパティをJSオブジェクトの形で返します。
	 */
	fun getExtraJson(entity: Long, name: String): dynamic

	/**
	 * 値を持つpropetryプロパティをmobエンティティのJSエンティティとして書き込みます。
	 */
	fun putExtraJson(entity: Long , name: String, value: dynamic)

	/**
	 * mobs idの効果持続時間,レベル・レベルを設定します。
	 */
	fun addEffect(entity: Long, id: Int, duration: Int, level: Int, amplifier: Boolean, particles: Boolean)

	/**
	 * mobエンティティからidエフェクトを削除します。
	 */
	fun clearEffect(entity: Long, id: Int)

	/**
	 * mobエンティティからすべてのエフェクトを削除します。
	 */
	fun clearEffects(entity: Long)

	/**
	 * 暴徒のダメージをhpユニットに与える。
	 */
	fun damageEntity(entity: Long, hp: Int)

	/**
	 * hp単位でmobエッセンスを回復します。
	 */
	fun healEntity(entity: Long, hp: Int)
	/**
	 * mobエンティティの数値型を返します。
	 */
	fun getType(entity: Long): Int

	/**
	 * mobのヒットボックスのプロパティを幅の高さと高さの幅に設定します。
	 */
	fun setHitbox(entity: Long, width: Long, height: Long)

	/**
	 * mobが存在するかどうかを調べます。
	 */
	fun isExist(entity: Long): Boolean

	/**
	 * IDタイプと生き物を生成しますX,Y,Z座標及び外の特性を割り当てます。
	 */
	fun spawn(x: Int, y: Int, z: Int, type: Int, skin: String): Long

	/**
	 * fun spawnと同じですが,MobRegistryによって作成された文字列ID名でエンティティを生成します
	 */
	fun spawnCustom(name: String, x: Int, y: Int, z: Int, extra: dynamic): dynamic

	/**
	 * 世界からmobの本質を取り除きます。
	 */
	fun remove(entity: Long)

	/**
	 * MobRegistryを介して作成された場合,mobエンティティのプロトタイプを返します。
	 */
	fun getCustom(entity: Long): dynamic

	/**
	 * mobエンティティの年齢を設定します。
	 */
	fun setAge(entity: Long, age: Long): Double

	/**
	 * Entityの年齢を返します。
	 */
	fun getAge(entity: Long): Double

	/**
	 * mobテクスチャのテクスチャテクスチャ内のパスを返します。
	 */
	fun getSkin(entity: Long): String

	/**
	 * mobエンティティのテクスチャパスに沿ってテクスチャを配置します。
	 */
	fun setSkin(entity: Long, texture: String)

	/**
	 * mobエンティティのレンダーIDを返します。
	 */
	fun getRender(entity: Long): dynamic

	/**
	 * mobエンティティのidレンダリングでレンダーを設定します。バニラレンダリングのリスト
	 */
	fun setRender(entity: Long, render: dynamic)

	/**
	 * ライダーの本質をライディングの本質に当てはめます。
	 */
	fun rideAnimal(rider: Long, ridden: Long)

	/**
	 * mobエンティティの名前を返します。
	 */
	fun getNameTag(entity: Long): String

	/**
	 * エンティティのmob名を設定します。
	 */
	fun setNameTag(entity: Long, name: String)

	/**
	 * 	fun getTarget(entity: Long) -

	 */
	fun getTarget(entity: Long): Long

	/**
	 * 攻撃対象の犠牲者の本質を置きます。
	 */
	fun setTarget(attaker: Long, victim: Long)

	/**
	 * モバイルの価値に依存しますか？mobエンティティの移動能力を管理します。
	 */
	fun setMobile(entity: Long, mobile: Boolean)

	/**
	 * mobがクロール中かどうかをチェックします。
	 */
	fun getSneaking(entity: Long): Boolean

	/**
	 * mobエンティティのクロールを有効または無効にします。
	 */
	fun setSneaking(entity: Long,sneak: Boolean)

	/**
	 * ライダーが暴徒であるかどうかを調べます。
	 */
	fun getRider(entity: Long): Long

	/**
	 * 暴徒がエンティティ上に座っているかどうかをチェックします。
	 */
	fun getRiding(entity: Long): Long

	/**
	 * ダニのダニの間にmobの燃え尽きを引き起こします。
	 */
	fun setFire(entity: Long, tick: Int)

	/**
	 * mobエンティティの正常性を返します。
	 */
	fun getHealth(entity: Long): Int

	/**
	 * mobエンティティのhp単位でヘルスを設定します。
	 */
	fun setHealth(entity: Long, hp: Int)

	/**
	 * mobの最大ヘルスを返します。
	 */
	fun getMaxHealth(entity: Long): Int

	/**
	 * mobのmaxhpの最大ヘルスを設定します。
	 */
	fun setMaxHealth(entity: Long, maxHp: Int)

	/**
	 * mobエッセンスをx,y,z座標に設定します。
	 */
	fun setPosition(entity: Long, x: Long, y: Long, z: Long)

	/**
	 * Modの座標を取得する
	 */
	fun getPosition(entity: Long): SimpleCoords

	/**
	 * 比較的座標X,Y,ZにエッセンスMOBを移動させます。
	 */
	fun addPosition(entity: Long, x: Int, y: Int, z:Int)

	/**
	 * Velzエンティティのmobという3次元の加速度velxを設定します。
	 */
	fun setVelocity(entity: Long, vecX: Double, vecY: Double, vecZ: Double)

	/**
	 * mobエンティティの3Dアクセラレーションを返します。
	 */
	fun getVelocity(entity: Long): Coords.Vec

	/**
	 * 3次元の加速度velx,vely,velzエンティティmobを追加します。
	 */
	fun addVelocity(entity: Long, vecX: Double, vecY: Double, vecZ: Double)

	/**
	 * 座標1と座標2の座標間の距離を返します。
	 */
	fun getDistanceBetweenCoords(coords1: SimpleCoords, coords2: SimpleCoords): Double

	/**
	 * mobエンティティからcoordsオブジェクト内の座標までの距離を返します。
	 */
	fun getDistanceToCoords(entity: Long, coords: SimpleCoords): Double

	/**
	 * エンティティmob1とmob2の間の距離を返します。
	 */
	fun getDistanceToEntity(mod1: Long, mod2: Long): Double

	/**
	 * mobエンティティの視野角を返します。
	 */
	fun getLookAngle(entity: Long): Angle
	/**
	 * エンティティに顎とピッチの視野角を設定します。
	 */
	fun setLookAngle(entity: Long, yaw: Double, pitch: Double)

	/**
	 * mobエンティティのビューベクトルを返します。
	 */
	fun getLookVector(entity: Long): Coords.Vec

	/**
	 * mobエンティティのビューベクトルを返します。
	 */
	fun getLookAt(entity: Long, x: Int, y: Int, z: Int): Coords.Vec

	/**
	 * エンティティを座標の方向に向かせます
	 */
	fun lookAt(entity: Long, x: Int, y: Int, z: Int)

	/**
	 * mob1のエッセンスをmob2エンティティに移動します。
	 */
	fun moveToTarget(entity: Long, target: Long, params: dynamic) // params = {speed, denyX, jumpVel}

	/**
	 * パラメータ設定でmobエンティティを角度に移動します。
	 */
	fun moveToAngle(entity: Long, angle: Angle, params: dynamic)

	/**
	 * mobのエンティティをparams設定でビューの方向に移動します。
	 */
	fun moveToLook(entity: Long, params: dynamic)

	/**
	 * mobの動きベクトルを返します。
	 */
	fun getMovingVector(entity: Long): Coords.Vec

	/**
	 * mob mobの角度を返します。
	 */
	fun getMovingAngle(entity: Long): Angle
	/**
	 * x,y,z座標に最も近いエンティティを返します。
	 */
	fun findNearest(x: Int, y: Int, z: Int): Long

	/**
	 * 中心座標と半径maxRangeを持つ,球体にタイプタイプのエンティティのJS配列を返します。
	 */
	fun getAllInRange(coords: SimpleCoords, maxRange: Int, type: Int): dynamic
	/**
	 * mobエンティティのインベントリを返します。
	 */
	fun getInventory(entity: Long, handleNames: dynamic, handleEnchant: dynamic): dynamic
	/**
	 * mobのエッセンスがシェルであるかどうかをチェックします。シェルのエッセンスは,そのデータをオブジェクトとして返します。
	 */
	fun getProjectileItem(entity: Long): dynamic
}