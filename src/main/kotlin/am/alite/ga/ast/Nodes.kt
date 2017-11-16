package am.alite.ga.ast

sealed class node {
    fun plus(other: node) = operatorNode('+', this, other)
    fun minus(other: node) = operatorNode('-', this, other)
    fun times(other: node) = operatorNode('*', this, other)
    fun div(other: node) = operatorNode('/', this, other)
}

class intNode(val value:Long):node
class floatNode(val value:Double):node
class operatorNode(val operator:Char, val left:node, val right:node)
class varNode(val id: String)
