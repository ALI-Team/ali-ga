package am.alite.ga.ast

public class ExpressionNode {
    var displayChar: Char
    lateinit var operandLeft: ExpressionNode
    lateinit var operandRight: ExpressionNode

    constructor(inputNum: Char) {
	displayChar = inputNum
    }

    constructor(operator: Char, leftNode: ExpressionNode, rightNode: ExpressionNode) {
	displayChar = operator
	operandLeft = leftNode
	operandRight = rightNode
    }
}
