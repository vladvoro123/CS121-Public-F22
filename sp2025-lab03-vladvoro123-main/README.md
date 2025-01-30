# Lab 3: Inheritance 

## Learning Objectives

- Create a derived class from a base class
- Describe the differences between an Interface and Abstract class
- Explore how a simple inheritance hierarchy works
- Explore how to program without ever writing a **main** function!
- Establish the practice/habit of understanding
  expectations/requirements of all units of code BEFORE writing that
  code.


# Overview

## Source Files
This project contains the following source files:

- `TicketInterface.java` - Interface defining methods all tickets should have
- `BasicTicket.java` - Abstract class implementing methods that will be
                        the same for all tickets
- `FloorTicket.java` - Child class of `BasicTicket`. Represents a ticket for
                        a specific zone. 
- `VIPTicket.java` - Child class of `BasicTicket`. Represents a box seat ticket.
- `StageTicket.java` - Child class of `VIPTicket`.  Represents a
  		                ticket for a seat in the stage wings.

## Test Files
This project contains the following test files:

- `FloorTicketTest.java` - contains tests for `FloorTicket` objects;
                         discussed in lab overview video and needs to
                         be fully implemented
- `VIPTicketTest.java` - contains tests for `VIPTicket` objects.
- `StageTicketTest.java` - contains tests for `StageTicket` objects.


# Your Tasks

## Task 0: Watch the Lab Overview Video

[Lab 3 Overview] (https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=fbd2f6a6-789c-413c-9386-b0f40158aed9)

## Task 1: Understand the Inheritance Hierarchy

Look through `TicketInterface.java` and `BasicTicket.java`.  The
interface declares the methods that any class implementing the
interface must implement.  The abstract class, `BasicTicket`,
implements the methods of the interface that will be the same for our
Ticket classes.

Then look at the classes you're supposed to implement -
`FloorTicket.java`, `VIPTicket.java`, and `StageTicketTest.java`.  You
may find it helpful to draw the relationship between these classes and
the previous classes so you know how each file relates to the other.
Make sure you understand what needs to be implemented in each file.


## Task 2: Implement the Test Files

Implement the test files!?  Yes, **BEFORE you implement the
classes**. This is called "test-driven development". By writing the
tests first, you can verify that you understand the expected behavior
of each class and method before you start trying to figure out how to
implement the behavior.

Watch the Lab Overview Video for a walk-through of how to
implement tests for `FloorTicket.` Then implement the test files for
all three classes.  You may be able to reuse tests from file to file -
we'll look more into that and how to streamline the tests later.  This
week, just focus on practicing writing tests that will run every line
of code that you wrote, including boundary cases and invalid input
(where applicable).

Sync your changes with GitHub after you finish each test file.  Add,
commit, and push (sync) with the commit message, "Implemented
< testfile name >", replacing < testfile name > with the name of the file
you implemented.

## Task 3: Implement the Ticket class files

Implement `FloorTicket`, `VIPTicket`, and `StageTicket` as directed in
the documentation in each file.  Use your test file to test your class
as you develop it.  For this week, you may assume that the location
provided to the constructors is correct (for example, you may assume
the user gives you a box number between 1 and 4 when creating a
`VIPTicket`).  You'll add error checking in the next few labs.

Sync your changes with GitHub after each time you work on the lab.
Add, commit, and push (sync) with a message that describes what you
accomplished since the last commit.


## Task 4: Fill out Retrospective.md

Open `Retrospective.md`.  You can click on the icon on the right with
the magnifying glass to see the formatted file, but you'll need to
edit the .md file.

Fill in the sections as the instructions in Retrospective indicate.

When you're done, sync your changes with GitHub.  Add, commit, and
push (sync) with the commit message, "Finished lab reflection".

Congrats! You're all done!




