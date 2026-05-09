        // Questions:


//        1): Take age as input and print if he/she is eligible to vote or not

//        System.out.println("Enter Age: ");
//        Scanner age = new Scanner(System.in);
//        int ageInt = age.nextInt();

//        if(ageInt >= 18){
//            System.out.println("You are a eligible to vote");
//        }
//        else{
//            System.out.println("You are not eligible to vote");
//        }


//    2): Take 5 subject input and find percentage of it :-
//        System.out.println("Marks in Sub1: ");
//        Scanner marks = new Scanner(System.in);
//        int marksInSub1 = marks.nextInt();
//        System.out.println("Marks in Sub2: ");
//        int marksInSub2 = marks.nextInt();
//        System.out.println("Marks in Sub3: ");
//        int marksInSub3 = marks.nextInt();
//        System.out.println("Marks in Sub4: ");
//        int marksInSub4 = marks.nextInt();
//        System.out.println("Marks in Sub5: ");
//        int marksInSub5 = marks.nextInt();
//
//        System.out.println("Your Percentage is : ");
//        System.out.println((marksInSub1+marksInSub2+marksInSub3+marksInSub4+marksInSub5)/5);

//        3): Take input in lowercase and convert into uppercase:

//       System.out.println("Enter character");
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        String str = sc.nextLine();
//        char upper = Character.toUpperCase(ch);
//        String uppers = str.toUpperCase();
//        System.out.println("The character is " + upper);
//        System.out.println("The word is " + uppers);

//        4): Take input in uppercase and convert into lowercase:

//        System.out.println("Enter character: ");
//        Scanner input = new Scanner(System.in);
//        char ch = input.next().charAt(0);
//        char lower = Character.toLowerCase(ch);
//        System.out.println("Lower case: " + lower);


//        5): Take input of 5 subject marks , drop the least one and calculate the overall percentage considering only top 4 marks , print it.

            Scanner sc = new Scanner(System.in);
        System.out.println("Input marks for sub1: ");
            int sub1 = sc.nextInt();
        System.out.println("Input marks for sub2: ");
            int sub2 = sc.nextInt();
        System.out.println("Input marks for sub3: ");
            int sub3 = sc.nextInt();
        System.out.println("Input marks for sub4: ");
            int sub4 = sc.nextInt();
        System.out.println("Input marks for sub5: ");
            int sub5 = sc.nextInt();

            int total = sub1 + sub2 + sub3 + sub4 + sub5;

            int min = sub1;

            if(sub2<min){
                min = sub2;
            }
            if(sub3<min){
                min = sub3;
            }
            if(sub4<min){
                min = sub4;
            }
            if(sub5<min){
                min = sub5;
            }

            total = total - min;

            double percentage = (total/4);

        System.out.println("The percentage is "+percentage);


    }

}
