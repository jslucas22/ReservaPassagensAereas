# Prova FATEC Mococa (Programação Orientada a Objetos)

### 1 ->  Desenvolver um programa que efetue a reserva de passagens aéreas de uma companhia.

### 2 -> Requisitos do programa: 

| Cadastro  |  Consulta  | Extra |
|-----------|------------|-------|
| Voo | Voo | SQL Server | Sair  |
| Reserva   |            |       |

## Banco de Dados

• Foi utilizado o SQL Server para realizar essa tarefa
• SQL Server JDBC Driver -> https://docs.microsoft.com/pt-br/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15

## Como preparar o  🏦(banco) de 🎲 (dados) ? 🤔

```sql
-------------------------------------
-- Criação do Banco
------------------------------------- 
CREATE DATABASE BANCO_FATEC

USE BANCO_FATEC

-------------------------------------
-- Criação da tabela
-------------------------------------

CREATE TABLE VOO (
	NUMERO_VOO INT PRIMARY KEY,
	ORIGEM NVARCHAR(60),
	DESTINO NVARCHAR(60),
	QTD_LUGARES_DISPONIVEIS INT
)

------------------------------------- 


```
