# ThankYouCard
This program will print a thank you note based on two user inputs

- Gift
- Name

## Compiling and Running
You must have Java installed.

First download it via GitHub or:

### HTTPS

`git clone https://github.com/sweeper3000/ThankYouCard`

### SSH

`git clone git@github.com:sweeper3000/ThankYouCard`

Then open a terminal and go to the directory the file is located in. Then:

`javac ThankYouCard.java`

`java ThankYouCard`

## Usage
The usage is very simple. At the start of the program is 3 choices for sentences. Here are the bodies:

Thank you very much for the [gift]! I really liked it! (1)

Thanks for the [gift]! (2)

Amazing gift. Thank you! (3)

**All notes start with `Dear name,` on the first line.**

There are three strings in which the user gives input. They are `gift`, `name` and `signature`. In a print statement, they are defined in `[these_brackets]`.

The user inputs the `gift`, the `name` of the person who sent the gift and a `signature` which is your name. You then enter the corresponding number. If a user inputs anything other than `1`, `2`, or `3`, the program prints `You did not enter a valid choice.`
