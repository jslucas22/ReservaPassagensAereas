# Prova FATEC Mococa (Programação Orientada a Objetos)

### 1 -> Proposta da tarefa: 
######   • Desenvolver um programa que efetue a reserva de passagens aéreas de uma companhia.
######   • Cadastro Voo: Informar Número de Voo, Origem, Destino e Quantidade de lugares disponíveis
```java

//--> Regras: 

String regexApenasNumeros = "[0-9]+";

//# Validar se usuário informou o campo numérico corretamente
if (!foo.getText().matches(regexApenasNumeros)) {
    println("informe bar corretamente");
}


//# Validar se usuário informou algo
if (!foo.getText().length() < 1) {
    println("informe bar!");
}

```

######   • Reserva : Deverá ser perguntado o número do voo no qual a pessoa deseja viajar
```java

//--> Casos: 

if (qtdLugaresDisponiveis > 0) { 
    printf ("Reserva Efetuada!")
} else if (!vooExiste()){
    printf ("Voo Inexistente!")
} else {
    printf ("Voo Lotado!")
}

```
######   • Consulta: Exibir dados de cadastro do voo.

### 2 -> Funcionalidades do sistema: 

| Cadastro  |  Consulta  | Extra |
|-----------|------------|-------|
| Voo | Voo | SQL Server | Sair  |
| Reserva   |            |       |

## Banco de Dados

• Foi utilizado o SQL Server para realizar essa tarefa </p>
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
