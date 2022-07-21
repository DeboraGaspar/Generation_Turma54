-- exercicio 02 / Bloco II
CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT auto_increment,
    nome VARCHAR(255) not null,
    tipo VARCHAR(255) not null,
    quantidade int,
    preco DECIMAL(9,2) not null,
    
    PRIMARY KEY (id)
);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome, tipo, quantidade, preco)VALUES("Miojo Galinha Caipira", "Macarrão instantaneo", 15, 4.55);

UPDATE tb_produtos
SET preco = 854.91
WHERE id = 8;

DELETE FROM tb_produtos WHERE id = 6;

SELECT * FROM tb_produtos where preco > 500.00;

SELECT * FROM tb_produtos where preco < 500.00;
