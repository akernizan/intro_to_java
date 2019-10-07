import java.util.Scanner;

public class dice {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("What's your number? ");
    int N = sc.nextInt();
    dice_roll(N);
  }

  public static int dice_roll(int N){
    int dice_1;
    int dice_2;
    int rollCount = 0;

    dice_1 = (int)(12 * Math.random()) + 1;
    dice_2 = (int)(12 * Math.random()) + 1;

    while(true){
      if (N < 2 || N > 12){
        System.out.println("You're number is out of range.");
        return 0;
      } else {
        if (dice_1 + dice_2 == N) {
          rollCount++;
          System.out.println("We guessed right!. "+ dice_1 + " + " + dice_2 + " = " + N);
          System.out.println("It took "+ rollCount + " roll(s).");
          return rollCount;
        } else {
          System.out.println("We guessed: "+ dice_1 + " + " + dice_2);
          dice_1 = (int)(6 * Math.random()) + 1;
          dice_2 = (int)(6 * Math.random()) + 1;
          rollCount++;
        }
      }
    }
  }
}
