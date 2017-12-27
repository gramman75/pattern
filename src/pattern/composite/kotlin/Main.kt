package pattern.composite.kotlin

class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val rootdir  = Directory("root kotlin")
            val childdir  = Directory("child")

            val first = File("first", 100)
            val second= File("second", 200)

            childdir.add(first)
            childdir.add(second)

            rootdir.add(childdir)

            rootdir.printList()




        }
    }
}