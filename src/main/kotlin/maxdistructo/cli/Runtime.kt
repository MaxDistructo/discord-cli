package maxdistructo.cli

object Runtime{
  var sendMessage = false
  var selected = "none"
  var channel = "none"
  var guild = "none"
  var role = "none"
  var user = "none"
  val scanner = Scanner.
   fun initilize(bot : Bot){
     println("Logging in ...")
     println("Welcome " + bot.client.ourUser.name)
     print("> ")
     
   }
  fun commandline(){
  }
  fun messagesender(){
  var in = readLine()!!
    if(in.toString().charAt(0) == Main.prefix){
      sendMessage = false
    }
    else if (selected == "channel"){
      Message.sendMessage(bot.client.getGuildsByName(guild)[0].getChannelsByName(channel)[0], in)
    }
    else{
      println("Function not found")
    }
  }
  
}
