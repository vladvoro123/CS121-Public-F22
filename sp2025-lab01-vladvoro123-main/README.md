# Lab 01: Introduction 

## Learning Objectives

- Accept and submit an assignment using GitHub Classrooms
- Build, run, and test a gradle project

# Overview

## Source Files
This project contains the following source files:

- `Main.java` - Contains the main method (is the driver class)
  	     Contains one method, `getGreeting`.
	     You need to implement a second method, `getPlanet'

## Test Files
This project contains the following test files:

- `MainTest.java` - Contains tests for the methods in `Main.java`.
  		  The first test has been implemented for you.  You
  		  should use the first test as an example to implement
  		  the second test for `getPlanet`

# Your Tasks

## Task 0: Watch Lab Overview Video

[Lab 01: Overview](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=8355ceb0-bf1a-4b7f-bd6e-b0ef015bbba8)

## Task 1: Run Your Project

First, run the code that was provided.  The following document and
video show you how to run a Gradle Project in VS Code:

[How to Run a Gradle Project (Video)](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=7630420b-bd64-4902-b006-b0ef0132218d)

[How to Run a Gradle Project (Text Guide)](https://docs.google.com/document/d/15WAfim9JQhSjcjGr8BND5J-CU_Q10mQZExRpj-i2xSA/edit?usp=sharing)


## Task 2: Test Your Project

Open `MainTest.java` located in `app/src/test/java/lab`.  Take a
careful look at the test code and run the test.  It should pass.

The following video and document show you how to run the tests:

[How to Run Tests (video)](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=42821667-9b08-4024-90d2-b0ef013addbf)

[How to Run Tests (text guide)](https://docs.google.com/document/d/1weeEn8CiGJX7b5QRWrv_WvyS1qJEKXzH1gKtwucFWLQ/edit?usp=sharing)

## Task 3: Add A Method

Open `Main.java`.  Add a method called `getPlanet` where indicated by
the comments.  `getPlanet` should return the String "Earth".  This
method will be very similar to `getGreeting`.

Add a print statement to `main` that calls `getPlanet` and prints the
return value.

Run your program.  It should print:

Hello
Earth

Sync your changes with GitHub.  Add, commit, and push (sync) with the
commit message, "Implemented getPlanet"

Refer back to [Using GitHub
Classroom](https://docs.google.com/document/d/1uto5CLqL8sQFAzPK3xH5D--kGViTsyc__avbWDODxds/edit?usp=sharing)
for detailed instructions on how to sync and commit your changes.  Use
the instructions under "Using Your Repository in VS Code".

## Task 4: Test Your Method

Open the test file `MainTest.java`, which can be found in
`app/src/test/java/lab`.  Using the existing test method as an
example, write a new test method that asserts `getPlanet` returns the
String "Earth".

Run your tests to verify they pass.  If you aren't seeing the test
output, try cleaning your project by using the `clean` task. (Refer
back to How To Run a Gradle Project for how to use tasks).

Change the return value of `getPlanet` and check that your test
fails. Make sure to correct the method before commiting your code.

Once you get all your tests to pass, sync your changes with GitHub.
Add, commit, and push (sync) with the commit message, "Added test
method for getPlanet".

## Task 5: Fill out Retrospective.md

Open `Retrospective.md`.  You can click on the icon on the right with
the magnifying glass to see the formatted file, but you'll need to
edit the .md file.

Fill in the sections as the instructions in Retrospective indicate.

When you're done, sync your changes with GitHub.  Add, commit, and
push (sync) with the commit message, "Finished lab reflection".

Congrats! You're all done!


