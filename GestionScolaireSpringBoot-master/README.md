# gestionscolairespringboot
Bonjour à tous


INSERT INTO `role` (`name`) VALUES ('USER');
INSERT INTO `role` (`name`) VALUES ('CREATOR');
INSERT INTO `role` (`name`) VALUES ('EDITOR');
INSERT INTO `role` (`name`) VALUES ('ADMIN');

INSERT INTO `user` (`username`, `password`, `enabled`) VALUES ('patrick', '$2a$10$cTUErxQqYVyU2qmQGIktpup5chLEdhD2zpzNEyYqmxrHHJbSNDOG.', 1);
(patrick,patrick)

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (1, 1);


http://localhost:8080/gestion
