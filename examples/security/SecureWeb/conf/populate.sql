DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL auto_increment,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `gender` char(1),
  PRIMARY KEY (`id`)
);

insert into users (firstname, lastname, gender) values
    ('Xuekun', 'Kou', 'M'), ('Test', 'User1', 'M'), ('Test', 'User2', 'F');