package am.alite.ga.ast

sealed class node {
    fun plus(other: node) = operatorNode('+', this, other)
    fun minus(other: node) = operatorNode('-', this, other)
    fun times(other: node) = operatorNode('*', this, other)
    fun div(other: node) = operatorNode('/', this, other)
}

class intNode(val value: Long):node()
class floatNode(val value: Double):node()
class operatorNode(val operator: Char, val left: node, val right: node):node()
class varNode(val id: String):node()
class functionNode(val functionName: Functions, val arg: node):node()
class biFunctionNode(val functionName: Functions, val arg1: node, val arg2: node):node()
class constantNode(val id: Constants):node()
