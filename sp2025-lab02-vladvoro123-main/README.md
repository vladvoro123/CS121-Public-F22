# Lab 02: Writing Tests 

## Learning Objectives
- Understand how to use a debugger
- Understand when you need to write tests and when you don't
- Identify methods that have side effects and how that impacts testability
- Establish the practice/habit of understanding
  expectations/requirements of all units of code BEFORE writing that
  code.

# Overview

In this lab, you will focus on writing tests to find all the bugs in
the `AutomaticFeeder` class.  Note that there is no driver class or
main method.  You will have to find and fix all the bugs by using the
output of your tests.

Take careful notes of the bugs you find and how you fixed them.  You
will have to specify all the bugs you find.


## Source Files
This project contains the following source files:

- `AutomaticFeeder.java` - allows you to schedule any number of
  		       	 amounts per day and specify, in grams, how
  		       	 much to feed.
			 
## Test Files
This project contains the following test files:

- `AutomaticFeederTest.java` - Contains tests for
  			      `AutomaticFeeder`. Some of the test
  			      methods are implemented.  You should
  			      read the ones that are implemented and
  			      use them to implement the rest of the
  			      tests.
			      

# Resources
- [Using VSCode Debugger](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=bae3a638-01fb-4e2d-a23a-b0d50189052d)
- [LocalTime Javadocs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/LocalTime.html)
- [ArrayList Javadocs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)
- [Asserts](https://www.javadoc.io/doc/org.testng/testng/latest/org/testng/Assert.html)
- [TestNG Tutorial](https://www.tutorialspoint.com/testng/index.htm)


# Your Tasks

## Task 0: Watch Lab Overview

[Lab 02 Overview Video](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=e8d78fa4-aefc-4d87-9f03-b258015bc571)

## Task 1: Get Familiar with the Code

**Before you start coding** read through the `AutomaticFeeder` class.
Then look through all the tests in `AutomaticFeederTest.java`.  Most of them
are already complete, but there are a couple you need to fill in.

Make note of what is being tested - you will soon have to write your
own tests.  This class is a good example of what to test and how
to write those tests.

## Task 2: Start Debugging

Run the tests that are currently implemented.  Take note of how
they're implemented; you can use them as a template for your own
tests.  Fix what bugs you can from the provided tests.  Make sure you
take careful notes!! You will have to list each bug you found and how
you fixed it in `Retrospective.md`.  Be careful about blindly
accepting VSCode suggestions; it's not always correct about what needs
to be fixed.  You still have to log the bugs that you fixed by using
VSCode suggestions!

After `AutomaticFeeder.java` passes all of the provided tests, sync
your changes with GitHub.  Add, commit, and push (sync) with the
commit message, "Task 2 completed. Squashed some bugs"


## Task 3: Write Tests

Fill in the other tests in `AutomaticFeederTest.java` to finish testing the
rest of the class.

Note that the largest sized list you have to test is a list with three
elements.  That's the smallest list with a first, last, and middle
element.

You can combine some tests, like the examples combine `addFeeding` and
`toString`.  You can also test `getAmount` on each element in the same
method, since `getAmount` should not modify the list.  Note, however,
that combining tests like this make it harder to pinpoint what failed
in that test - did the first element fail or the third?  You generally
want to write tests so that you know pretty much where the bug is just
by knowing which test failed.

Sync your changes with GitHub often.  Add, commit, and push (sync)
with a commit message describing what you accomplished since the last
commit.

## Task 4: Finish Debugging `AutomaticFeeder`

Continue to fix and document your fixes of `AutomaticFeeder.java`
until it passes all of the tests.  Use the tests you wrote to find
and fix the rest of the bugs.  Make sure you document each bug that
you find and how you fixed it in `Retrospective.md`.

Sync your changes with GitHub often.  Add, commit, and push (sync)
with a commit message describing what you accomplished since the last
commit.

## Task 5: Fill out Retrospective.md

Open `Retrospective.md`.  You can click on the icon on the right with
the magnifying glass to see the formatted file, but you'll need to
edit the .md file.

Fill in the sections as the instructions in Retrospective indicate.

When you're done, sync your changes with GitHub.  Add, commit, and
push (sync) with the commit message, "Finished lab reflection".

Congrats! You're all done!






