<!DOCTYPE html>
<html>
    <head>
        <title>Wiki Parser</title>
        <meta charset="utf-8">
        <style type="text/css">
        p {
          margin-bottom: 1em;
          }
        .wikimodel-emptyline {
          height: 1em;
        }
        
        .twr {
            padding: 5px;
            border: solid 2px black;
        }
        
        </style>
    </head>
    
    <body>
        <g:form action="index">
            Syntax: <g:textField name="syntax" value="${params.syntax}"/> / OutputFormat:<g:textField name="format" value="${params.format}"/><br>
            <g:textArea id="source" name="source" value="${ params.source }" cols="90" rows="10" /><br>
            <input type="submit" value="Parse" />
        </g:form>

        <div class="twr">
        <xwiki:renderer syntax="${params.syntax}" format="${params.format}">${ params.source }</xwiki:renderer>
        </div>

    </body>
</html>
