String bottle = " bottles ";
String down = "one";
for(int bottles = 99; bottles > 0; bottles -= 1) {
  println(bottles + bottle + "of beer on the wall, \n" + bottles + " " + bottle +" of beer!");
  print("Take " + down + " down, pass it around, ");
  
  if(bottles == 2) {
    bottle = " bottle ";
  }
}
