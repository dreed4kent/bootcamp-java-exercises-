package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make code difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int raccoonsPlayingInWoods = 3;
		int raccoonsGoHome = 2;
		int raccoonsLeftInWoods = raccoonsPlayingInWoods - raccoonsGoHome;
		System.out.println(raccoonsLeftInWoods);

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberLessBeesThanFlowers = numberOfFlowers - numberOfBees;
		System.out.println(numberLessBeesThanFlowers);

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int pigeonCurrentlyEating = 1;
		int pigeonJoining = 1;
		int pigeonTotalEating = pigeonCurrentlyEating + pigeonJoining;
		System.out.println(pigeonTotalEating);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owlsOnFence = 3;
		int owlsJoining = 2;
		int owlsTotal = owlsOnFence + owlsJoining;
		System.out.println(owlsTotal);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversLeftWorking = beaversWorking - beaversSwimming;
		System.out.println(beaversLeftWorking);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucansSitting = 2;
		int toucansJoining = 1;
		int toucansTotal = toucansSitting + toucansJoining;
		System.out.println(toucansTotal);

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int ratioSquirrelsToNuts = squirrels - nuts;
		System.out.println(ratioSquirrelsToNuts);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		float quarter = 0.25f;
		float dime = 0.10f;
		float nickel = 0.05f;
		float totalMoney = quarter + dime + (nickel * 2);
		System.out.println(totalMoney);

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int classBrierMuffins = 18;
		int classMacAdamsMuffins = 20;
		int classFlanneryMuffins = 17;
		int classTotalMuffins = classBrierMuffins + classMacAdamsMuffins + classFlanneryMuffins;
		System.out.println(classTotalMuffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		float costOfYoyo = 0.24f;
		float costOfWhistle = 0.14f;
		float costTotalOfToys = costOfYoyo + costOfWhistle;
		System.out.println(costTotalOfToys);
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int marshmallowsLarge = 8;
		int marshmallowsMini = 10;
		int marshmallowsTotal = marshmallowsLarge + marshmallowsMini;
		System.out.println(marshmallowsTotal);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		byte snowInchesAtHiltHouse = 29;
		byte snowInchesAtBrecknock = 17;
		byte moreInchesOfSnowHilt = (byte) (snowInchesAtHiltHouse - snowInchesAtBrecknock);
		System.out.println(moreInchesOfSnowHilt);
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int moneyBeginningAmount = 10;
		int moneyToyTruck = 3;
		int moneyPencil = 2;
		int moneyTotalSpent = moneyToyTruck + moneyPencil;
		int moneyRemaining = moneyBeginningAmount - (moneyTotalSpent);
		System.out.println(moneyRemaining);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesCollection = 16;
		int marblesLost = 7;
		int marblesRemaining = marblesCollection - marblesLost;
		System.out.println(marblesRemaining);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsMeganFound = 19;
		int seashellsMeganNeeds = 25;
		int seashellsDifference = seashellsMeganNeeds - seashellsMeganFound;
		System.out.println(seashellsDifference);
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsTotalBalloons = 17;
		int bradsRedBalloons = 8;
		int bradsGreenBalloons = bradsTotalBalloons - bradsRedBalloons;
		System.out.println(bradsGreenBalloons);
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int booksAddedOnShelf = 10;
		int booksTotal = booksOnShelf + booksAddedOnShelf;
		System.out.println(booksTotal);
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beesLegs = 6;
		int beesNumberOf = 8;
		int beesTotalLegs = beesLegs * beesNumberOf;
		System.out.println(beesTotalLegs);
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		float coneCost = 0.99f * 2;
		System.out.println(coneCost);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksCalledFor = 125;
		int rocksCurrent = 64;
		int rocksNeeded = rocksCalledFor - rocksCurrent;
		System.out.println(rocksNeeded);
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesOriginalNumber = 38;
		int marblesLost1 = 15;
		int marblesLeftOver = marblesOriginalNumber - marblesLost1;
		System.out.println(marblesLeftOver);
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesDriven = 32;
		int milesToGo = milesToConcert - milesDriven;
		System.out.println(milesToGo);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int minutesShovelingMorning = 90;
		int minutesShovelingAfternoon = 45;
		int minutesShovelingTotal = minutesShovelingMorning + minutesShovelingAfternoon;
		System.out.println(minutesShovelingTotal);
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		float hotdogsBought = 6;
		float hotdogCost = 0.50f;
		float hotdogPaidFor = hotdogsBought * hotdogCost;
		System.out.println(hotdogPaidFor);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int amountToSpendInCents = 50;
		int pencilCostInCents = 7;
		int pencilsPurchased = amountToSpendInCents / pencilCostInCents;
		System.out.println(pencilsPurchased);
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeen = 33;
		int butterfliesSeenOrange = 20;
		int butterfliesSeenRed = butterfliesSeen - butterfliesSeenOrange;
		String redButterflies = butterfliesSeenRed + " butterflies are red";
		System.out.println(redButterflies);
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		float amountGivenToClerk = 1.00f;
		float amountCandyCost = 0.54f;
		float amountChangeBack = amountGivenToClerk - amountCandyCost;
		System.out.println(amountChangeBack);
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackyard = 13;
		int treesPlanted = 12;
		int treesTotal = treesInBackyard + treesPlanted;
		System.out.println(treesTotal);
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysJoyWillSeeGrandma = 2;
		int hoursInADay = 24;
		int hoursJoyWillSeeGrandma = daysJoyWillSeeGrandma * hoursInADay;
		System.out.println(hoursJoyWillSeeGrandma);
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCousins = 4;
		int kimPiecesOfGum = 5;
		int kimGumGivenOut = kimCousins * kimPiecesOfGum;
		System.out.println(kimGumGivenOut);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		float moneyDanHas = 3.00f;
		float moneySpentOnCandy = 1.00f;
		float moneyLeftOver = moneyDanHas - moneySpentOnCandy;
		System.out.println(moneyLeftOver);
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnLake = 5;
		int peopleInEachBoat = 3;
		int peopleOnLakeTotal = boatsOnLake * peopleInEachBoat;
		System.out.println(peopleOnLakeTotal);
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosStartedWith = 380;
		int legosLost = 57;
		int legosLeftOver = legosStartedWith - legosLost;
		System.out.println(legosLeftOver);
        
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int totalMuffinsNeeded = 83;
		int muffinsLeftToBake = totalMuffinsNeeded - muffinsBaked;
		System.out.println(muffinsLeftToBake);
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int crayonsWilly = 1400;
		int crayonsLucy = 290;
		int moreCrayonsWillyHas = crayonsWilly - crayonsLucy;
		System.out.println(moreCrayonsWillyHas);
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnAPage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = stickersOnAPage * numberOfPages;
		System.out.println(totalNumberOfStickers);
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		int childrenSharingCupcakes = 8;
		int cupcakesPerChild = totalCupcakes / childrenSharingCupcakes;
		System.out.println(cupcakesPerChild);
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookiesMade = 47;
		int cookiesPerJar = 6;
		int cookiesLeftOver = gingerbreadCookiesMade % cookiesPerJar;
		System.out.println(cookiesLeftOver);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsPrepared = 59;
		int neighborsRecievingCroissants = 8;
		int croissantsLeftOver = croissantsPrepared % neighborsRecievingCroissants;
		System.out.println(croissantsLeftOver);
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		 int cookiesPerTray = 12;
		 int cookiesNeeded = 276;
		 int traysNeeded = cookiesNeeded / cookiesPerTray;
		 System.out.println(traysNeeded);
        
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		 int pretzelsMade = 480;
		 int pretzelsPerServing = 12;
		 int pretzelsNumberofServings = pretzelsMade / pretzelsPerServing;
		 System.out.println(pretzelsNumberofServings);
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		 int cupcakesBaked = 53;
		 int cupcakesLeftBehind = 2;
		 int cupcakesPerBox = 3;
		 int numberOfBoxesOfCupcakes = (cupcakesBaked - cupcakesLeftBehind) / cupcakesPerBox;
		 System.out.println(numberOfBoxesOfCupcakes);
        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		 int carrotSticksPrepared = 74;
		 int peopleEquallyRecievingCarrots = 12;
		 int carrotsLeftOver = carrotSticksPrepared % peopleEquallyRecievingCarrots;
		 System.out.println(carrotsLeftOver);
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		 int allTeddyBears = 98;
		 int maxTeddyBearsPerShelf = 7;
		 int numberOfShelvesFilled = allTeddyBears / maxTeddyBearsPerShelf;
		 System.out.println(numberOfShelvesFilled);
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		 int numberOfFamilyPictures = 480;
		 int maxPicturesPerAlbum = 20;
		 int albumsNeeded = numberOfFamilyPictures / maxPicturesPerAlbum;
		 System.out.println(albumsNeeded);
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		 int allTradingCards = 94;
		 int maxCardsInBox = 8;
		 int fullBoxes = allTradingCards / maxCardsInBox;
		 int cardsLeftOver = allTradingCards % maxCardsInBox;
		 System.out.println(fullBoxes);
		 System.out.println(cardsLeftOver);
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		 int booksToShelve = 210;
		 int shelvesToFill = 10;
		 int booksPerShelf = booksToShelve / shelvesToFill;
		 System.out.println(booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		 int croissantsBaked = 17;
		 int guestsSeveredEqually = 7;
		 int croissantsPerGuest = croissantsBaked / guestsSeveredEqually;
		 System.out.println(croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		 

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle inital must end
        with a period.
        Example: "Hopper, Grace B." 
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
 
            
	}

}
