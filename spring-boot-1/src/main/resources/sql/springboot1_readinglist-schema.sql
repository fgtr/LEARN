DROP TABLE IF EXISTS read_item;
CREATE TABLE read_item (
  id identity,
  reader varchar(20) not null,
  isbn varchar(20) not null,
  title varchar(100) not null,
  author varchar(50) not null,
  description varchar(2000) not null
);

DROP TABLE IF EXISTS reader;
CREATE TABLE reader (
  id identity,
  username varchar(20),
  password varchar(100),
  fullname varchar(50),
  version int
);
