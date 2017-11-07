package am.alite.ga.parser

sealed class Token(val value: String)

class NumberToken(value: String) : Token(value)
class OperatorToken(value: String) : Token(value)
class IdToken(value: String) : Token(value)
class PuncToken(value: String) : Token(value)
