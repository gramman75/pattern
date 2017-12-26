package pattern.visitor.kotlin

class Main{
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val rootDirectory = Directory("root")
            val firstDic = Directory("firstdir")
            val secondDic = Directory("seconddir")

            firstDic.add(File("file1", 100))
            firstDic.add(File("file2", 200))
            secondDic.add(File("file3", 200))
            secondDic.add(File("file4", 200))

            rootDirectory.add(firstDic)
            rootDirectory.add(secondDic)

            rootDirectory.accept(ListVisitor())

        }
    }
}