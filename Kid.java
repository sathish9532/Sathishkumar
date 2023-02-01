class Kid extends Mother
{
String name="Suman";
public static void main(String[] args){
Kid kid=new Kid();
kid.work();
kid.study();
}
public void study(){
System.out.println("Studied book");
System.out.println(name+" "+super.name);
}
public void work(){
System.out.println("Doing activities");
System.out.println(name+" "+super.name);
}
}
