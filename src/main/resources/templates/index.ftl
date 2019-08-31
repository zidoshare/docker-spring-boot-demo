<#-- @ftlvariable name="movies" type="site.zido.movie.Movie[]" -->
<html lang="zh">
<head>
    <title>很随意的标题</title>
    <meta charset="UTF-8"/>
</head>
<body>
<ul>
    <#list movies as movie>
        <li><a href="${movie.url}">${movie.name}</a></li>
    </#list>
</ul>
</body>
</html>