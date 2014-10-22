<!DOCTYPE HTML>
<html>
    <head>
        <title>Jersey App</title>
        <link href="/public/custom/styles/css/style.css" rel="stylesheet"/>
        <script type="text/javascript" src="/public/custom/scripts/js/script.js"></script>
    </head>
    <body>
        <p>This is the index page.</p>
        <p>${model}</p>
        <button id="example-button">Click me!</button>
        <script type="text/javascript">
            document.getElementById("example-button").addEventListener('click', function(evt){
               callAlert();
            });
        </script>
    </body>
</html>