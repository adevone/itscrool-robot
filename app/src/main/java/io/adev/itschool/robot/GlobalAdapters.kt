package io.adev.itschool.robot

import io.adev.itschool.robot.common.arena.RobotController
import io.adev.itschool.robot.common.arena.entity.arena.parseArena
import io.adev.itschool.robot.platform.arena.ArenaHolder

lateinit var globalRobotController: RobotController
lateinit var globalArenaHolder: ArenaHolder

fun setArenaDraw(arenaDraw: String) {
    globalArenaHolder.arena = parseArena(arenaDraw)
}

/**
 * Передвинуться вправо на [stepsCount]
 * Если [stepsCount] не указано, то на 1 шаг
 */
fun right(stepsCount: Int = 1) {
    globalRobotController.right(stepsCount)
}

/**
 * Передвинуться влево на [stepsCount].
 * Если [stepsCount] не указано, то на 1 шаг.
 */
fun left(stepsCount: Int = 1) {
    globalRobotController.left(stepsCount)
}

/**
 * Передвинуться вниз на [stepsCount].
 * Если [stepsCount] не указано, то на 1 шаг.
 */
fun down(stepsCount: Int = 1) {
    globalRobotController.down(stepsCount)
}

/**
 * Передвинуться вверх на [stepsCount].
 * Если [stepsCount] не указано, то на 1 шаг.
 */
fun up(stepsCount: Int = 1) {
    globalRobotController.up(stepsCount)
}

/**
 * Показать [password] на дисплее робота.
 * Нужно для прохождения блоков с паролем.
 */
fun display(password: String) {
    globalRobotController.display(password)
}