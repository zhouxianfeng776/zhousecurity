
-- Dumping data for table spring_security.oauth_client_details: ~4 rows (approximately)
/*!40000 ALTER TABLE `oauth_client_details` DISABLE KEYS */;
INSERT INTO `oauth_client_details` (`client_id`, `resource_ids`, `client_secret`, `scope`, `authorized_grant_types`, `web_server_redirect_uri`, `authorities`, `access_token_validity`, `refresh_token_validity`, `additional_information`, `autoapprove`) VALUES
	('client', '', '{bcrypt}$2a$10$d7pc6NaAZBgtM5uRc7AaVe160r1Bxd9EI8jeu4oaQYt0j/sAXwxLy', 'all', 'password', '', '', NULL, NULL, '{}', ''),
	('test1', '', '{bcrypt}$2a$10$iI0VZ/NZsvnmP77.wdz3TOvpVb.YZqfvM5UDUeTREuJge.KedyT82', 'read', 'authorization_code', '', '', NULL, NULL, '{}', ''),
	('tonr', 'test1', '{noop}secret', 'read,write,messages', 'authorization_code,implicit,password,refresh_token', 'http://localhost:8080/product,http://localhost:8085/sso-login,http://localhost:8085/test,http://localhost:8086/test', 'ROLE_CLIENT', NULL, NULL, '{}', ''),
	('tonr-with-redirect', 'sparklr', 'secret', 'read,write,messages', 'authorization_code,implicit', 'http://localhost:8080/tonr2/sparklr/photos', 'ROLE_CLIENT', NULL, NULL, '{}', '');

