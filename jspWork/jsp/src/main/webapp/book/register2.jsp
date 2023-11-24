<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>

 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Register</title>

    <!-- Custom fonts for this template-->
    <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="../css/sb-admin-2.min.css" rel="stylesheet">


<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	window.onload = function(){
		submitBtn.addEventListener('click', function(){
			console.log('event', event)
			event.preventDefault(); 
			console.log('기본 이벤트 제거');
			
			let res = validateForm(testForm);
			if(res){
				testForm.submit();
			}
		});
	}
	
	function validateForm(form){
		if(form.id.value == ''){
			alert('id');
			form.id.focus();
			return false;
		}
		if(form.name.value == ''){
			alert('name');
			form.name.focus();
			return false;
		}
		if(form.email.value == ''){
			alert('email');
			form.email.focus();
			return false;
		}
		if(form.pw.value == ''){
			alert('pw');
			form.pw.focus();
			return false;
		}
		return true;
	}
</script>
<!-- 
<form name="testForm">
	이름: <input type="text" name="name"><br>

	국어: <input type="text" name="kor" ><br>
	영어: <input type="text" name="eng" ><br>
	수학: <input type="text" name="math" ><br>
	<button id="submitBtn">전송</button>
</form>

id, name, email, pw
 -->

<body class="bg-gradient-primary">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">회원가입</h1>
                            </div>
                            <form name="testForm">
                                <div class="form-group row">
                                        <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="id" name="id" placeholder="id">
                                </div>
                                <div class="form-group row">
                                        <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="name" name="name" placeholder="이름을 입력해주세요">
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control form-control-user" id="email"
                                        name="email" placeholder="email">
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="password" class="form-control form-control-user"
                                            id="pw" name="pw" placeholder="Password">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control form-control-user"
                                            id="pwCheck" placeholder="Repeat Password">
                                    </div>
                                </div>
                                <button id ="submitBtn" class="btn btn-primary btn-user btn-block">전송</button>
                                
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    회원가입
                                </a>
                                <hr>
                                <a href="index.html" class="btn btn-google btn-user btn-block">
                                    <i class="fab fa-google fa-fw"></i> Register with Google
                                </a>
                                <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                    <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                                </a>
                            </form>
                           
                            <hr>
                            <div class="text-center">
                                <a class="small" href="forgot-password.html">Forgot Password?</a>
                            </div>
                            <div class="text-center">
                                <a class="small" href="login.html">Already have an account? Login!</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="../vendor/jquery/jquery.min.js"></script>
    <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="../js/sb-admin-2.min.js"></script>

</body>
</html>