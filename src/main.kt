fun main(){
    var number=car("Jeep","Wrangler","Black",5)
    number.carry(10)
     number.identity()
    number.calculatingpackingfees(10)
     var Bus = Bus("Mazda","CX5","Red",10)
    Bus.calculatingpackingfees(9)

}
class car(var model:String,var make:String,var color:String,var capacity:Int) {


    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carry $people passengers")}
            else
                println("over capacity of $x people ")
    }

       fun identity(){
           println("i am a $color $model $make")
       }
    fun calculatingpackingfees(hours:Int):Int{
        var fees = hours * 20
        println(fees)
    return fees
    }
}
class Bus(var model: String,var make: String,var color: String,var capacity: Int){

    fun maxtripfare(fare:Double) {
        var z = fare * capacity


    }
    fun calculatingpackingfees(hours: Int):Int{
        var fees = hours * capacity
        println(fees)
        return fees
    }

}