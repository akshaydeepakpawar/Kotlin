//fun main() {
//     println("Hello, world!")
//     var a=10;
//     println(a)
//     a=20    we can change the value
//     println(a)
//     val b=30
//     println(b)
//     b=10 we can't change the value
//     println(b)
//     
//     **string example**
//     
//     var name="akshay"
//     println(name)
//     name="pawar"
//     println(name)
//     
//     **for checking null type exeptions **

//     var myname: String?=null
//     if(myname!=null)
//     {
//         println(myname)
//     }
    
    
// ** if else condition **

//     val age=12
//     if(age>=18)
//     println("you can vote")
//     else
//     println("you can't vote ")
    
// ** when condition **

// val name="ok"
    
//     when(name){
//         "akshay"->println("hello world")
//         "hello"->println("hey akshay")
//         "ok"->println("done!!")
//     }
//     
//      **Arrays**
    
// val names=arrayOf("siri","google")
// for(name in names)
//     {
//         println("my good frd is $name")
//     }
    
    //**Ranges**
      
//     for (i in 0..3)
//     {
//         print(i)
//     }
//     print(" ")
//     for (i in 2..10 step 2)
//     {
//         print(i)
//     }
//     print(" ")
//     for(i in 3 downTo(0))
//     {
//         print(i)
//     }
    
    
//     val x=5
//     if(x in 1..10)
//     {
//         print("true")
//     }
//     else
//     print("false")
    
//     val x=5
//     if(x !in 1..10)
//     {
//         print("true")
//     }
//     else
//     print("false")
//     
//    ** Function **

//    fun addition(num1 : Int ,num2 : Int ):Int = num1+num2
// 	print(addition(5,2))  
// 	
	
// 	  fun greeting(name: String="akshay",greet: String="good morning!")
//     {
//         println("hello $name,$greet")
//     }
//     greeting(greet="good night")
    
    //** high order functions **
       
//     fun operation (a:Int ,b:Int ,addition:(Int ,Int)->Int):Int
//     {
//         return addition(a,b)
//     }
    
//     val output = operation(5,2,{a,b->
//     println("addition of two number")
//     a+b
//     })
//     println(output)
    
    // filter 
    
    fun main(){
//         val list =listOf<Int>(1,2,3,4,5,6,7,8,9,10)
//         val newlist=list.filter({
//             it%2==0
//         }).forEach({
//             println("$it")
//         })
//        
        val myname:String?="akshay"
        myname?.let{
            print(myname)
        }
    }