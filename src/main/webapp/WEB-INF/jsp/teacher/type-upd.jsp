<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="${ctx}/css/base.css" />
<link rel="stylesheet" href="${ctx}/css/info-reg.css" />
<link rel="stylesheet" href="${ctx}/css/jquery.searchableSelect.css" />
<title>移动办公自动化系统</title>
</head>

<body>
<div class="title"><h2>更新题型</h2></div>
<form action="${ctx}/type/addType.action" method="post" name="myform" id="myform">
<div class="main">
	 <input type="hidden" name="typeId" id="typeId" maxlength="10" value="${type.typeId }"/>
    <p class="short-input ue-clear">
    	<label><span style="color:red">*</span>名称：</label>
        <input type="text" name="typeName" id="typeName" maxlength="10" value="${type.typeName }"/>
    </p>
    <p class="short-input ue-clear">
    	<label>分值：</label>
        <input type="text" id="score" name="score" value="${type.score }"/>
    </p>
    <p class="short-input ue-clear">
    	<label>备注：</label>
        <textarea id="remark" name="remark">${type.remark }</textarea>
    </p>
</div>
</form>
<div class="btn ue-clear">
	<a href="javascript:;" class="confirm" onclick="addType()">确定</a>
    <a href="${ctx}/type/toTypePage.action" class="clear">返回</a>
</div>
</body>
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/js/common.js"></script>
<script type="text/javascript" src="${ctx}/js/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.searchableSelect.js"></script>
<script type="text/javascript">
$(function(){
	$("#grade").searchableSelect();
});
$(".select-title").on("click",function(){
	$(".select-list").toggle();
	return false;
});
$(".select-list").on("click","li",function(){
	var txt = $(this).text();
	$(".select-title").find("span").text(txt);
});
//注册
function addType(){
	document.myform.attributes["action"].value = "${ctx}/type/updType.action";
	$("form").submit();
}
showRemind('input[type=text], textarea','placeholder');
</script>
</html>