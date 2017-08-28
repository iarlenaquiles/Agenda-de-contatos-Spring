<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="url_base" value="/" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserir Cliente</title>
<link href="${url_base}css/bootstrap.min.css" rel="stylesheet">
<script src="https://use.fontawesome.com/d91313ced9.js"></script>
<script src="${url_base}js/jquery.min.js"></script>
<script src="${url_base}js/jquery.easy-autocomplete.min.js"></script>
<link href="${url_base}css/easy-autocomplete.min.css" rel="stylesheet">
</head>
<body>
	<c:import url="header.jsp"></c:import>

	<div class="container">
		<h2>Inserir Contato</h2>
		<form method="POST" action="/contatos">
			<div class="form-group">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" name="nome">
			</div>

			<div class="form-group">
				<label for="endereco">Endereço:</label> <input type="text"
					class="form-control" id="endereco" name="endereco">
			</div>

			<div class="form-group">
				<label for="telefone">Telefone:</label> <input type="text"
					class="form-control telefone" id="telefone" name="telefone">
			</div>

			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" name="email">
			</div>
			
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
	<br>
	<br>
	<br>
	<script src="${url_base}js/bootstrap.min.js"></script>
	<script src="${url_base}js/formzin-1.0.4.js"></script>
	<script type="text/javascript">
		Formzin.iniciar();
	</script>
</body>
</html>