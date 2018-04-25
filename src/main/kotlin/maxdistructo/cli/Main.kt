package maxdistructo.cli

import maxdistructo.discord.core.*
import maxdistructo.discord.core.impl.*

class Main{
val version = "1.0-Alpha"
lateinit var token : String
lateinit var bot : Bot
lateinit var prefix : String
fun main(String[] args){
println("MaxDistructo's CLI for Discord")
println("Version: " + version)

if(args[0] == "-token"){
  token = args[1].toString() 
}
else if(Utils.readJSONFromFile("/cli.conf").getString("token") != null){
  println("No token specified in args. Checking cli.conf")
  token = Utils.readJSONFromFile("/cli.conf").getString("token")
}
else{
  println("No token found. Please restart the program with a token specified.")
  exitProcess(0)
}

if(args[2] == "-prefix"){
  prefix = args[3].toString()
}
else if(Utils.readJSONFromFile("/cli.conf").getString("prefix") != null){
  println("Prefix not specified with token in args. Checking cli.conf")
  prefix = Utils.readJSONFromFile("/cli.conf").getString("prefix")
}
else{
  println("No prefix found. Please restart with a prefix specified.")
  exitProcess(0)
}

bot = Bot(token) //Initialize "bot" with the found token (Token will not be null at this point because of earlier checks)

}
