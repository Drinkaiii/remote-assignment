
USE `assignment`;

#question1
SELECT title , content , user.email FROM articles JOIN user ON articles.id_user = user.id ORDER BY user.email;

#question2
SELECT title , content FROM articles ORDER BY id LIMIT 6 OFFSET 6;