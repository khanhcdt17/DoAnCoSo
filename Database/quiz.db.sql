BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "quizQuestions" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"question"	TEXT,
	"ans_a"	TEXT,
	"ans_b"	TEXT,
	"ans_c"	TEXT,
	"ans_d"	TEXT,
	"result"	TEXT,
	"explaintion"	TEXT,
	"topic"	TEXT,
	"type_question"	TEXT,
	"img"	TEXT
);
INSERT INTO "quizQuestions" VALUES (1,'Which was the first purely object oriented programming language developed?','Java','C++','SmallTalk','Kotlin','c','SmallTalk was the first programming language developed which was purely object oriented. It was developed by Alan Kay. OOP concept came into picture in 1970’s.','OOPs Concept & Features','OOPs Basic Concepts','img1');
INSERT INTO "quizQuestions" VALUES (3,'Which of the following best defines a class?','Parent of an object','Instance of an object','Blueprint of an object','Scope of an object','b','SmallTalk was the first programming language developed which was purely object oriented. It was developed by Alan Kay. OOP concept came into picture in 1970’s.','OOPs Concept & Features','OOPs Basic Concepts','img1');
INSERT INTO "quizQuestions" VALUES (4,'1+1','2','3','4','5','6','7','OOPs Concept & Features','OOPs Basic Concepts','10');
INSERT INTO "quizQuestions" VALUES (5,'a','b','cd','e','f','g','h','OOPs Concept & Features','OOPs Basic Concepts','img1');
COMMIT;
