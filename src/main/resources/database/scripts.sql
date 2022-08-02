create table if not  exists animals(
id bigint not null auto increment,
breed varchar(255),
sex_of_animal varchar(10),
type varchar(255),
pet_id bigint not null,
primary key(animal_id),
foreign key(pet_id) refrences user_pet(id)
) engine = innodb char set = "utf8";

create table if not exists user_pet (
id bigint not null auto increment,
birth_date datetime not null,
nickname varchar(255) not null,
user_id bigint not null,
animal_id  bigint not null,
unique (nickname),
primary key (pet_id),
foreign key(user_id) references users(id),
foreign key(animal_id) references user_pet(id)
) engine = innodb char set = "utf8";

create table if not exists users(
id bigint not null auto increment,
email varchar(255) not null,
first_name varchar(255) not null,
last_name varchar(255) not null,
login varchar(255) not null,
password varchar(255) not null,
user_pet_id bigint not null,
primary key(id),
foreign key(user_pet_id) references user_pet(id)
)engine = innodb char set = "utf8";