 insert into role (role,id) values ('ROLE_ADMIN',default);
 insert into role (role,id) values ('ROLE_USER',default);
 
 -- Inserir usuário admin com roles ROLE_ADMIN e ROLE_USER
INSERT INTO app_user (username, password, expired, locked, credentials_expired, disabled) 
VALUES ('admin', '$2a$10$VrFwyypFNkBVsDkkLZoBHOC/kEw9eBlnrrwzp4eTwXqx/hm19g9ue', false, false, false, false);

INSERT INTO app_user (username, password, expired, locked, credentials_expired, disabled) 
VALUES ('user', '$2a$10$X5ptfnTJdFiIZJDOSjdjXuSuFWkOWU3EAN4A5Yj0VQuZSdZgqp5dG', false, false, false, false);

-- Inserir as associações de roles para o usuário admin
INSERT INTO app_user_role (app_user_id, role_id)
VALUES (1, (SELECT id FROM role WHERE role = 'ROLE_ADMIN'));

INSERT INTO app_user_role (app_user_id, role_id)
VALUES (2, (SELECT id FROM role WHERE role = 'ROLE_USER'));