public class fullname {
  public static void main(String[] args){
    String firstName = "Akosua";
    String lastName = "Kernizan";
    String myFullName = firstName + ' ' + lastName;

    int birthDay = 4;
    int birthMonth = 6;
    int birthYear = 1989;

    String myBirthday = Integer.toString(birthMonth) + "-" + Integer.toString(birthDay)+ "-" + Integer.toString(birthYear);

    System.out.println("    *********        ******        ******   ");
    System.out.println("   ****   ****       ******      ******     ");
    System.out.println("  ****     ****      ******    ******       ");
    System.out.println(" ****       ****     ******  ******         ");
    System.out.println(" ****************    *************           ");
    System.out.println(" ****        ****    ******  ******         ");
    System.out.println(" ****        ****    ******    ******       ");
    System.out.println(" ****        ****    ******      ******     ");
    System.out.println(" ****        ****    ******        *******  ");

    System.out.println("My name is " + myFullName);
    System.out.println("My birthday is on " + myBirthday);
  }
}
