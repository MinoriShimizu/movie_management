DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS favorites;

CREATE TABLE movies (
  movie_id int unsigned AUTO_INCREMENT,
  category VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  director VARCHAR(100) NOT NULL,
  released_at DATE NOT NULL,
  PRIMARY KEY(movie_id)
);

CREATE TABLE favorites (
   id int unsigned AUTO_INCREMENT,
   movie_id int NOT NULL,
   watched_at DATE NOT NULL,
   comment VARCHAR(100),
   PRIMARY KEY(id)
);


INSERT INTO movies (category, name, director, released_at) VALUES ("ドラマ",     "ショーシャンクの空に",    "フランク・ダラボン",     '1995-06-03');
INSERT INTO movies (category, name, director, released_at) VALUES ("アニメ",     "この世界の片隅に",       "片渕須直",             '2016-11-16');
INSERT INTO movies (category, name, director, released_at) VALUES ("アニメ",     "カラフル",             "原恵一",               '2010-08-21');


INSERT INTO favorites (movie_id, watched_at, comment) VALUES (3,      '2011-10-16',    "大好きな小説の映画化");