$(document).ready(function() {
    alert("document is ready....");

    $("#abc").keyup(function () { 
            var obj = $("#abc").val();    
            //alert(obj);
            //$.get(url,callback);
            $.get("http://localhost:9999/AjaxDemo/display.jsp?msg="+obj,
            function(data){
                    alert(data);
            });
    });

});