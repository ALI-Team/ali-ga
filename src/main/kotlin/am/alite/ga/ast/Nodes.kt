package am.alite.ga.ast

sealed class Node {
    fun plus(other: Node) = OperatorNode('+', this, other)
    fun minus(other: Node) = OperatorNode('-', this, other)
    fun times(other: Node) = OperatorNode('*', this, other)
    fun div(other: Node) = OperatorNode('/', this, other)
}

class IntNode(val value: Long) : Node()
class FloatNode(val value: Double) : Node()
class OperatorNode(val operator: Char, val left: Node, val right: Node) : Node()
class VarNode(val id: String) : Node()
class FunctionNode(val functionName: Functions, val arg: Node) : Node()
class BiFunctionNode(val functionName: Functions, val arg1: Node, val arg2: Node) : Node()
class ConstantNode(val id: Constants) : Node()
