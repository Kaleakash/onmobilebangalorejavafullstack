$(document).ready(function() {
    $("#abc").keyup(function () { 
            var obj = $("#abc").val();    
            //$.get(url,callback);
            
            //$.post(url,data,callback);
   /*$.get("http://localhost:9999/AjaxDemo/display.jsp?msg="+obj,
            function(data){
             $("#ee").html(data);
            });*/
   var data = {"msg":obj}
   $.post("http://localhost:9999/AjaxDemo/display.jsp",
                    data, function(data){
                     $("#ee").html(data);
                    });        
    });

});