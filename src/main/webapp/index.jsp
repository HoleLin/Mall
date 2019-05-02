<html>
<%@ page contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<body>
<h2>Hello World!</h2>
Spring 上传文件
<form action="/Mall/manage/product/upload.do" method="post" enctype="multipart/form-data">

    <input type="file" name="upload_file"/>
    <input type="submit" value="Spring 上传文件">
</form>

富文本 上传文件
<form action="/Mall/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">

    <input type="file" name="upload_file"/>
    <input type="submit" value="富文本上传文件">
</form>
</body>
</html>
