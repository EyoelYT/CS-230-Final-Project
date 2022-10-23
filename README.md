# CS-230-Final-Project

The client was The Gaming Room. They had a game on Android platform called “Draw it or Lose it”. They wanted to expand the software to other platforms through web browsers. Their request included some requirements stated as follows:
    -	The code should be web-based
    -	Game names must be unique
    -	Only one instance of every unique game can exist in memory at any given time.
    -	Users will have to check if a game is in use by using its unique name
    -	A game requires one or more teams
    -	A team will consist of multiple players
    -	Team names must be unique
    -	Player names must also be unique

This repository is composed of prewritten prototype code for user log in credential authorization and Base game general software design. One thing I did really well was writing out the executive summary and the design constraints as I had a very good understanding of the task The Gaming Room was asking for.

The given UML Diagram in particular helped me a lot in writing out the code. Figuring out the different classes, methods, encapsulation status and inheritance became easy because of this.

I would like to revise and put more specific recommendations for the distributed systems and networks. I feel like I did not elaborate the specific details of that part. I would improve it by mentioning some procedures with recommendations of a provider after careful review. Another thing that I didn't feel confident about was filling up the code for the REST API as the code base was relatively large and some parts I couldn't even understand.

The game would be designed based on the platform it is being accessed with. I categorized the users’ needs through the platform they are accessing the game. This will make the work of integration of multiple platforms easier. The user is the most vital part of the whole project. Without users, the game would be obsolete.

Approaching it from top-down (general to specific) helps in understanding the crucial parts of the project. In designing software, we have to see the big picture first before moving to the details. Additionally, categorization of design also helped. For example, I would consider The Game Design and Security Design of the software to be two separate categories of attention.
