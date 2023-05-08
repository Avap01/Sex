<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Formulário de Informações</title>
</head>
<body>
	<h1>Preencha suas informações</h1>
	<form action="SalvarInformacoes" method="post">
		<label for="username">Usuário:</label>
		<input type="text" name="username" id="username" required><br>

		<label for="password">Senha:</label>
		<input type="password" name="password" id="password" required><br>

		<label for="nome">Nome:</label>
		<input type="text" name="nome" id="nome" required><br>

		<label for="email">E-mail:</label>
		<input type="email" name="email" id="email" required><br>

		<label for="idade">Idade:</label>
		<input type="number" name="idade" id="idade" required><br>

		<label for="curso">Curso:</label>
		<input type="text" name="curso" id="curso" required><br>

		<label for="ano">Ano:</label>
		<input type="number" name="ano" id="ano" required><br>

		<label for="empresa">Empresa:</label>
		<input type="text" name="empresa" id="empresa" required><br>

		<label for="cargo">Cargo:</label>
		<input type="text" name="cargo" id="cargo" required><br>

		<input type="submit" value="Enviar">
	</form>
</body>
</html>