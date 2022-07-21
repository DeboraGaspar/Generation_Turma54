-- exercicio 03 / BlocoII
CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id BIGINT auto_increment,
    nome VARCHAR(255) not null,
    idade INT,
    ano VARCHAR(255),
    nota DECIMAL(8,2),
    
    PRIMARY KEY (id)
);

SELECT * FROM tb_alunos;

INSERT INTO tb_alunos(nome, idade, ano, nota)VALUES("Matheus Vicente", 7, "2º ANO", 9.75);

SELECT * FROM tb_alunos WHERE nota > 7.00;
SELECT * FROM tb_alunos WHERE nota < 7.00;