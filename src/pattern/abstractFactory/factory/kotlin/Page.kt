package pattern.abstractFactory.factory.kotlin

import java.io.FileWriter
import java.io.Writer

abstract class Page(var title: String, var author: String) {
    var content: ArrayList<Item> = ArrayList<Item>()

    fun add(item: Item){
        this.content.add(item)
    }
    abstract fun makeHTML():String
    fun output(){
        val filename = "${this.title}.html"
        val writer:Writer = FileWriter(filename)
        writer.write(this.makeHTML())
        writer.close()
        println(filename + "을 작성하였습니다.")
    }
}