<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/16
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/upload/uploadImgs.do" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="files" />
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
