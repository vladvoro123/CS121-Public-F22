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

- State two or three specific skills or concepts you felt this lab
  helped you learn or understand. (You can list these in incomplete
  sentences.)

- What was your biggest challenge in this lab? Explain your challenge
  specifically - what method, what concept, etc.



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

  Original (147): feedTimes.get(0).toString(), amounts.get(i));
  Fixed (147):   feedTimes.get(i).toString(), amounts.get(i));
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


## Known issues or Bugs

TODO

## Sources used

TODO