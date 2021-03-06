package io.adev.itschool.robot.common.arena.entity

import io.adev.itschool.robot.common.arena.entity.arena.TargetBlock

data class RobotState(
    val position: Position,
    val text: String = "",
    val finishReason: String? = null,
    val initKeyPosition: Position? = null,
    val nextStepKey: String? = null,
    val currentToken: String? = null,
    val code: Int? = null,
    val beforeMove: () -> Unit = {},
    val isWon: Boolean = false,
    val source: Source? = null,
) {
    val size = Size.Virtual(width = 1.vp, height = 1.vp)

    fun destroyed(source: Source): RobotState {
        return copy(finishReason = "Robot is destroyed", source = source)
    }

    fun won(source: TargetBlock): RobotState {
        return copy(isWon = true, source = source)
    }

    fun move(direction: Position.Direction, source: Source): RobotState {
        return copy(
            position = position.move(direction),
            nextStepKey = null,
            currentToken = nextStepKey,
            source = source
        )
    }

    fun display(text: String): RobotState {
        return copy(text = text)
    }

    fun initKey(): RobotState {
        return if (initKeyPosition == null)
            copy(initKeyPosition = position)
        else
            throw AlreadyHaveKeyException()
    }

    fun useKey(key: String): RobotState {
        return copy(nextStepKey = key)
    }

    fun checkToken() {
        val hash = initKeyPosition?.hash() ?: throw KeyIsNotProducedException()
        if (currentToken != hash) {
            throw KeyIsNotEnteredException()
        }
    }

    fun getKey(): String {
        return initKeyPosition?.hash() ?: throw KeyIsNotProducedException()
    }

    fun withCode(code: Int): RobotState {
        return copy(code = code)
    }

    fun checkCode() {
        val codeString = when (code) {
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            else -> throw WrongPasswordException()
        }
        if (text != codeString) {
            throw WrongPasswordException()
        }
    }

    fun withBeforeMove(beforeMove: () -> Unit): RobotState {
        return copy(beforeMove = beforeMove)
    }

    fun finish(reason: String?): RobotState {
        return copy(finishReason = reason)
    }

    override fun toString(): String {
        return "$position finishReason=$finishReason from=${source?.sourceRepresentation()}"
    }

    interface Source {
        fun sourceRepresentation(): String
    }
}

class AlreadyHaveKeyException : IllegalStateException("You've already got key. Use it")

class KeyIsNotProducedException : IllegalStateException("You need to produce the key")

class KeyIsNotEnteredException : IllegalStateException("You need to enter the key")

class WrongPasswordException : IllegalStateException("Robot is displaying a wrong password")