package am.alite.ga.ast

sealed class Node {
    operator fun plus(other: Node) = OperatorNode('+', this, other)
    operator fun minus(other: Node) = OperatorNode('-', this, other)
    operator fun times(other: Node) = OperatorNode('*', this, other)
    operator fun div(other: Node) = OperatorNode('/', this, other)
    infix fun pow(other: Node) = OperatorNode('^', this, other)
}

data class IntNode(val value: Long) : Node()
data class FloatNode(val value: Double) : Node()
data class OperatorNode(val operator: Char, val left: Node, val right: Node) : Node()
data class VarNode(val id: String) : Node()
data class FunctionNode(val functionName: Functions, val arg: Node) : Node()
data class BiFunctionNode(val functionName: Functions, val arg1: Node, val arg2: Node) : Node()
data class ConstantNode(val id: Constants) : Node()
