package am.alite.ga.parser

interface Lexer {
    fun next(): Token
    fun peek(): Token
    fun eof(): Boolean
    fun error(msg: String)
}
