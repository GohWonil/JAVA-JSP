<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	.areal{
		border : 1px solid;
		width : 500px;
		height : 300px;
		overflow : scroll;
	}
</style>

</head>
<body>


<script type="text/javascript">
window.onload = function(){
	btn1.addEventListener('click', function(){
		//�����ڸ� �̿��� ���� ǥ���� ��ü ����
		//�������� �Ű��� : ���Ϲ��ڿ� ����
		let regExp = new RegExp('script');
	
		console.log(regExp, typeof(regExp), regExp instanceof RegExp);
	});
}
</script>

<h1>���� ǥ����</h1>
    <p>
        ���� ǥ����(Regular Expresison)�̶�, <br>
        Ư�� ��Ģ�� ���� ���ڿ��� �˻��ϰų� ġȯ�� �� ����ϴ� ���� ����̴�. <br><br>

        ���� ǥ���� �̿��ϸ� �Էµ� ���ڿ��� ���� Ư�� ���� �˻��̳� ġȯ ��
        ������ ������ ������ �ʿ� ���� �����ϰ� ó���� �����ϴ�.
    </p> 
    
    
<h2>1. ���� ǥ���� ��ü ����</h2>
<p>
    ���� ǥ���� ��ü�� �����ϱ� ���ؼ��� ���� ǥ���� ���ͷ��� RegExp ������ �Լ��� ����Ѵ�. <br>
    ���ͷ��� ����ϴ� ���� �Ϲ����̴�. (/����/�÷���)
</p> 

<button id="btn1"/>
<div id="areal" class="areal"></div>

</body>
</html>