package com.github.doyaaaaaken.kotlincsv.dsl.context

import com.github.doyaaaaaken.kotlincsv.util.Const
import com.github.doyaaaaaken.kotlincsv.util.CsvDslMarker
import java.nio.charset.Charset

@CsvDslMarker
interface ICsvWriterContext {
    val charset: Charset
    val delimiter: Char
//    val quoteChar: Char
    val lineTerminator: String
}

@CsvDslMarker
class CsvWriterContext : ICsvWriterContext {
    override var charset = Const.defaultCharset
    override var delimiter: Char = ','
//    override var quoteChar: Char = '"'
    override var lineTerminator: String = "\r\n"
}
