import java.util.Scanner;
public class Game
{
    int choice = 1;
    public void start()
    {
        System.out.println("Welcome to Text Adventure!");
        System.out.println("You come to a set of two closed doors. Which one will you choose? Type 1 for the left door or type 2 for the right door");
        choice = scanResponse();
        if (choice == 1)
        {
            System.out.println("You open the left door and you see a path forward. You also see two weapons: a sword and a gun. You can only carry one, so type 1 for the sword or type 2 for the gun.");
            choice = scanResponse();
            if (choice == 1)
            {
                System.out.println("You take the sword and venture forward. As you walk down the path, you encounter a shady potion seller. The seller offers you potions for one coin each.\nHe is low on his stock and only has two potions left: a red potion and a blue potion. You only have one coin in your pocket so type 1 for the red potion or type 2 for the blue potion.");
                choice = scanResponse();
                if (choice == 1)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your sword and drink your red potion. Suddenly, you pass out and get transported to another world!\nYou wake up in a mysterious room. Out of nowhere, a bald man with sunglasses walks up to you and informs you that you've been living in a simulation.\nReality hits you too hard and you die.\nMatrix Ending 1 (1/x)");
                    System.exit(0);
                }
                if (choice == 2)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your sword and drink your blue potion. The blue potion fills you with strength and you slay the beast with your sword.\nCongratulations, you win!\nGood Ending 1 (2/x)");
                    System.exit(0);
                }
            }
            if (choice == 2)
            {
                System.out.println("You take the gun and venture forward. As you walk down the path, you encounter a shady potion seller. The seller offers you potions for one coin each.\nHe is low on his stock and only has two potions left: a red potion and a blue potion. You only have one coin in your pocket so type 1 for the red potion or type 2 for the blue potion.");
                choice = scanResponse();
                if (choice == 1)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your gun and drink your red potion. Suddenly, you pass out and get transported to another world!\nYou wake up in a mysterious room. Out of nowhere, a bald man with sunglasses walks up to you and informs you that you've been living in a simulation.\nReality hits you too hard and you die.\nMatrix Ending 2 (3/x)");
                    System.exit(0);
                }
                if (choice == 2)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your gun and drink your blue potion. The blue potion fills you with strength, which doesn't quite help you with a gun.\nYou shoot at the dragon, only to realize that the bullets bounce right off because it has bulletproof scales. The dragon swiftly attacks you with a breath of fire and you die.\nBad Ending 1 (4/x)");
                    System.exit(0);
                }
            }

        }
        if (choice == 2)
        {
            System.out.println("You open the right door. The door leads you to a shady room. It gets darker and darker as you walk deeper and deeper into the room. Suddenly, the door shuts ");
        }
    }
    public int scanResponse()
    {
        boolean valid = false;
        String i = "";
        Scanner scanner = new Scanner(System.in);
        while (!valid)
        {
            i = scanner.nextLine();
            if (i.equals("1")  || i.equals("2"))
            {
                valid = true;
            }
            else
            {
                System.out.println("Invalid Input, Please Type 1 or 2.");
            }
        }

        int finalInt = 0;

        if (i.equals("1"))
        {
            finalInt = 1;
        }
        if (i.equals("2"))
        {
            finalInt = 2;
        }

        return finalInt;
    }
}
