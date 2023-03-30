fun main(){
     list(listOf("Mercy","Mary","Ann","Joel"))
personList()
similar()
carList()


}
fun list(names:List<String>):List<String> {
    val peopl = mutableListOf<String>()

    for (i in names.indices step 2) {
        peopl.add(names[i])

    }
    return peopl


}
fun people(height:List<Double>):List<Double>{
    var number=listOf(20.0,50.0,40.0,30.0)
    number.max()
    number.average()
    return number
}
data class Person(var name:String,var age:Int,var height: Double,var weight:Double)
fun personList() {

    val person1 = Person("Clarine",15,6.0,40.0)
    val person2 = Person("Mercy",4,4.0,40.0)
    val person3 = Person("Mary",30,4.0,50.0)
    val person4=Person("Ann",7,4.0,60.0)
    val person= mutableListOf(person1,person2,person3,person4)
    println(person)
    val sorted=person.sortedByDescending { person -> person.age}
    println(sorted)
//    val allProducts=person.filter {person -> person.age<=5000 }
}
fun similar(){
    val person4= Person("Angela",4,4.0,40.0)
    val person5 = Person("Jael",30,4.0,50.0)
    val person7= mutableListOf(person4,person5)
    person7.add(person4)
    println(person7)


}
data class Car(var registration:String,var milage:Int)
fun carList() {

    val car1 = Car("KN23" ,8)
    val car2 = Car("KG56", 4)
    val car3 = Car("KJB56", 30)
    val car4 = Car("KB2", 7)
    val car = mutableListOf(car1, car2, car3, car4)
    println(car)
//    val sorted = car.sortedByDescending { car -> car.milage}
//    println(sorted)
//    val allProducts=person.filter {person -> person.age<
}












