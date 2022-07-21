-- Exer 01 / Bloco II 
CREATE DATABASE db_rhgeneration;

USE db_rhgeneration;


CREATE TABLE tb_funcionarios(

	id BIGINT auto_increment,
    nome VARCHAR(255),
    salario DECIMAL(9,2),
	setor VARCHAR(255),
    matricula INT,

	PRIMARY KEY (id)
);

SELECT * FROM tb_funcionarios;

INSERT INTO tb_funcionarios(nome, salario, setor,matricula)VALUES("Pedro Alves", 7700.40, "tecnologia", 05);

UPDATE tb_funcionarios
SET salario = 1870.50
WHERE id = 3;

DELETE FROM tb_funcionarios WHERE id = 5;

SELECT * FROM tb_funcionarios where salario > 2000.00;

SELECT * FROM tb_funcionarios where salario < 2000.00;
