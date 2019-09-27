public class fullname {
  public static void main(String[] args){
    String firstName = "Akosua";
    String lastName = "Kernizan";
    String myFullyName = firstName + ' ' + lastName;

    int birthDate = 4;
    int birthMonth = 6;
    int birthYear = 1989;

    String myBirthday = Integer.toString(birthMonth) + "-" + Integer.toString(birthDate)+ "-" + Integer.toString(birthYear);

    System.out.println("    *********        ******        ******   ");
    System.out.println("   ****   ****       ******      ******     ");
    System.out.println("  ****     ****      ******    ******       ");
    System.out.println(" ****       ****     ******  ******         ");
    System.out.println(" ****************    *************           ");
    System.out.println(" ****        ****    ******  ******         ");
    System.out.println(" ****        ****    ******    ******       ");
    System.out.println(" ****        ****    ******      ******     ");
    System.out.println(" ****        ****    ******        *******  ");

    System.out.println("My name is " + myFullyName);
    System.out.println("My birthday is on " + myBirthday);
  }
}
