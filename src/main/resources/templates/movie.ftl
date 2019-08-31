<#-- @ftlvariable name="name" type="java.lang.String" -->
<html lang="zh">
<head>
    <title>${name}</title>
    <meta charset="UTF-8"/>
    <style rel="stylesheet">
        html, body {
            width: 100%;
            margin: 0;
            padding: 0;
            background: black;
        }

        video {
            height: 100%;
            width: 100%;
            position: absolute;
            top: 0;
            bottom: 0;
        }
    </style>
</head>
<body>
<video controls="controls" src="${path}"></video>
</body>
</html>