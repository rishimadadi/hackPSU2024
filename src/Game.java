import java.util.Scanner;
public class Game
{
    int choice = 1;
    public void start()
    {
        System.out.println("Welcome to Text Adventure!");
        System.out.println("You come to a set of two closed doors. Which one will you choose? Type 1 for the left door or type 2 for the right door.");
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
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your sword and drink your red potion. Suddenly, you pass out and get transported to another world!\nYou wake up in a mysterious room. Out of nowhere, a bald man with sunglasses walks up to you and informs you that you've been living in a simulation.\nReality hits you too hard and you die.\nMatrix Ending 1 (1/7)");
                    System.exit(0);
                }
                if (choice == 2)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your sword and drink your blue potion. The blue potion fills you with strength and you slay the beast with your sword.\nCongratulations, you win!\nGood Ending 1 (2/7)");
                    System.exit(0);
                }
            }
            if (choice == 2)
            {
                System.out.println("You take the gun and venture forward. As you walk down the path, you encounter a shady potion seller. The seller offers you potions for one coin each.\nHe is low on his stock and only has two potions left: a red potion and a blue potion. You only have one coin in your pocket so type 1 for the red potion or type 2 for the blue potion.");
                choice = scanResponse();
                if (choice == 1)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your gun and drink your red potion. Suddenly, you pass out and get transported to another world!\nYou wake up in a mysterious room. Out of nowhere, a bald man with sunglasses walks up to you and informs you that you've been living in a simulation.\nReality hits you too hard and you die.\nMatrix Ending 2 (3/7)");
                    System.exit(0);
                }
                if (choice == 2)
                {
                    System.out.println("You encounter a ferocious dragon! This is the final boss! You ready your gun and drink your blue potion. The blue potion fills you with strength, which doesn't quite help you with a gun.\nYou shoot at the dragon, only to realize that the bullets bounce right off because it has bulletproof scales. The dragon swiftly attacks you with a breath of fire and you die.\nBad Ending 1 (4/7)");
                    System.exit(0);
                }
            }

        }
        if (choice == 2)
        {
            System.out.println("You open the right door. The door leads you to a shady room. It gets darker and darker as you walk deeper and deeper into the room. Suddenly, the door shuts behind you!\nSomeone then comes up from behind you and knocks you out. You wake up in a warehouse tied to a chair.\nYou have two options: you can either type 1 to try wiggling yourself out or type 2 to bounce your chair over to a conveniently placed rotary saw a few yards away.");
            choice = scanResponse();
            if (choice == 1)
            {
                System.out.println("After a few attempts, you successfully wiggle yourself out. You start walking towards the front exit of the warehouse.\nSuddenly, your kidnapper reveals himself from behind some pallets placed next to the exit.\nHe has a chainsaw and is about to attack. You have two choices: type 1 to run or type 2 to fight!");
                choice = scanResponse();
                if (choice == 1)
                {
                    System.out.println("You attempt to run from your kidnapper. Unfortunately, you run straight into a massive sinkhole that you somehow didn't notice.\nYou die as a coward.\nBad Ending 2 (5/7)");
                }
                if (choice == 2)
                {
                    System.out.println("You attempt to fight your kidnapper. You run up to him and use your decades of professional MMA skills to subdue him.\nCongratulations, you win!\nGood Ending 2 (6/7)");
                }
            }
            if (choice == 2)
            {
                System.out.println("You attempt to bounce over to the rotary saw. Unfortunately, you fall over before you can get there and you knock yourself unconscious from the impact. You never wake up again.\nBad Ending 3 (7/7)");
                System.exit(0);
            }
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
