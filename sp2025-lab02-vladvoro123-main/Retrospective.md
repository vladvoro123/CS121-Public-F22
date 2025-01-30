# Retrospective

- name: Vlad Vorozhko

## Instructions

Employers consistently look for people who can clearly and correctly
talk about their work; this is your chance to practice explaining your
processes and your code.

For the **Experience** and **Lab Questions** sections, answer the
questions using complete sentences and proper grammar.  Not all labs
will have a **Lab Questions** section.

For the **Known issues or Bugs** section you need to detail any issues
or bugs that you have in your code. For example maybe your code
crashes randomly and you couldn't figure out why. If your code doesn't
have any issues you can simply write NONE in this section.

For the **Sources used** section you must detail any sources you used
and *how you used them* outside of the textbook or course
website. Please include any tutorials you used as well.  This helps me
figure out what areas need more explanation.  If you write NONE in
this section it is assumed that you didn't use any outside resources
at all.  Be safe CITE!

## Experience

TODO

- Were there any parts of the lab that you felt were unclear? If so,
  why? What would have made it clearer?

  The steps were a little hazy for me. I didn't understand if we were
  supposed to have all tests pass for step 2 or if that was the last step. 
  I think I figured it out eventually where the 2nd step was to fix any
  obvious bugs in the automaticfeeder.java file so it was able to run. Then
  the last step was to ensure all the tests passed in the AutomaticFeederTest.java

- State two or three specific skills or concepts you felt this lab
  helped you learn or understand. (You can list these in incomplete
  sentences.)

  I learned how to use the alorithmic comments to my advantage and help fix
  and problems in my AutomaticFeeder.java file. Anytime I didn't understand
  why my test wasn't passing I would read the alorithmic comment and debug
  my code. I also developed a better grasp on how the test file is very
  important for debugging. Using the test file as a resource for finding
  any issues in the main file. 

- What was your biggest challenge in this lab? Explain your challenge
  specifically - what method, what concept, etc.

  My biggest challenge in this lab was getting familair and comfortable with
  debugging and utilizing both the main file and the tester. Sometimes I get ahead
  of myself and attempt to fix the code head on instead of taking a step back 
  and working through it one step at a time. 

## Lab Questions

1. List **every** bug you found and fixed.  For each bug, state the
original line of code, the corrected line of code, and what the bug
was.

  Original (20): private ArrayList<double> amounts; // amount to feed
  Fixed (20): private ArrayList<Double> amounts; // amount to feed
  Bug: the "d" in double was not capitlized

  Original (43): LocalTime time = LocaLTime.of(hour, min);
  Fixed (43): LocalTime time = LocalTime.of(hour, min);
  Bug: the second "L" in LocaLTime was capitlized

  Original (91): feedingTimes.remove(index);
  Fixed (91): feedTimes.remove(index);
  Bug: the array list is not called feedingTimes but rather feedTimes

  Original (137): for (int i = 0; i < feedTime.size(); i++) 
  Fixed (137): for (int i = 0; i < feedTimes.size(); i++)
  Bug: the array list feedTimes was missing the "s" in the original
  
  Origianl (113):  if (feedTimes.isEmpty()) 
            return -1;
  Fixed (113):  if (feedTimes.isEmpty()) {
            return -1;
        }
  Bug: The brackets after the if statement were not present.

  Original:  int index = amounts.indexOf(toFind);
  Fixed: int index = feedingTimes.indexOf(toFind);

        if (index == -1) {
            return -1; // Feeding time not found.
        }
  Bug: it should be calling from feedingTimes not amounts and also there is no if
  statement or return after the int. 

  Original (147): feedTimes.get(0).toString(), amounts.get(i);
  Fixed (147):   feedTimes.get(i).toString(), amounts.get(i);
  Bug: The time never updated and always stayed on the 0 index

  Original (43): nothing blank
  Fixed (43):   if (hour < 0 || hour > 23 || min < 0 || min > 59 || amt <= 0) {
            return; 
        }
  Bug: I was unable to have the testAddInvalidFeedings() pass so I included this
  right below the addFeedings() block and set the boundaries for the tester. 

For example:
# Bug
Original: System.out.println("hello world")
Fixed: System.out.println("hello world");
Bug: Missing semicolon

# Bug
Original: int numCOokies = 4; 
Fixed: int numCookies = 4;
Bug: numCookies misspelled



2. What role did the algorithm comments and properly named variables
play in how easy it was to find a bug?  Did you find it harder to
debug methods without algorithmic comments?

The algorithm comments helped a lot. Everytime I ran into an issue I would check
the expected results and compare them to the results I was receiving. This would 
give me a clear idea of what was going wrong.


## Known issues or Bugs

I did not find any issues or bugs other than the ones I fixed
in the automaticfeeder.java file.

## Sources used

I did not use any outside sources other than the provided textbook
and resources in our module folders.