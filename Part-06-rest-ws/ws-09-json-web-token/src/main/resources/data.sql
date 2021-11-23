   create table user_dtls
   (
   id integer,
   username varchar(120),
   password varchar(100),
   role varchar(99),
   enabled integer
   );
   
 insert into user_dtls values(101,'shreya','$2a$10$IBYCK71Go66xj.A8SmkCRedEOqz.v/59cus2ATx6mmqXoLUyBp9wq','ADMIN',1);

 insert into user_dtls values(102,'sonali','$2a$10$IBYCK71Go66xj.A8SmkCRedEOqz.v/59cus2ATx6mmqXoLUyBp9wq','USER',1);

   