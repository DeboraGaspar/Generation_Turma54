CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id BIGINT auto_increment,
tipo VARCHAR (255) not null,
tamanho VARCHAR(255)not null,
borda BOOLEAN,

PRIMARY KEY(id)
);

CREATE TABLE tb_pizza(
id BIGINT auto_increment,
nome VARCHAR(255) not null,
precos DECIMAL(8,2) not null,
ingredientes VARCHAR(255) not null,
categoria_id BIGINT,
ativo BOOLEAN,

PRIMARY KEY(id),
FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza;

INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("salgada","grande",true);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("salgada","broto",true);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("salgada","grande",false);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("salgada","broto",false);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("doce","grande",true);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("doce","broto",true);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("doce","grande",false);
INSERT INTO tb_categoria(tipo, tamanho, borda)VALUES("doce","broto",false);

INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Portuguesa",40.00,"Ovo,Mussarela e calabresa",1,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Mussarela",45.00,"Mussarela",2,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Calabresa",60.00,"Calabresa e Cebola",3,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Frango Catupiry",65.00,"frango e catupiry",4,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Brigadeiro",25.00,"Brigadeiro",5,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Romeu e Julieta",30.00,"Queijo e Goiabada",6,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Prestigio",35.00,"Coco e chocolate",7,true);
INSERT INTO tb_pizza(Nome, Precos, Ingredientes,Categoria_id,Ativo)VALUES("Sensação",35.00,"chocolate e morango",8,true);

SELECT * FROM tb_pizza WHERE precos > 45.00;

SELECT * FROM tb_pizza WHERE precos BETWEEN 29.00 AND 60.00;

SELECT * FROM tb_pizza WHERE Nome LIKE 'c%';

SELECT a.nome, b.tipo FROM tb_pizza a
INNER JOIN tb_categoria b
ON a.categoria_id = b.id
WHERE b.tipo = "doce";