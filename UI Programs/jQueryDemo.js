//alert("Welcome to External JavaScript File");
$(document).ready(function(){
    //alert("document is ready to do the task");

   // var leng = $("*").length;

   // alert("Number of tags are "+leng);
   //var leng = $("p").length;
   //alert("Number of paragram tags are "+leng);
   /*$("p").css("color", "red");
   $("h1").css("background-color", "yellow").
   css("fontSize","40px");
   //$("div").addClass("d1");
   $("#b1").click(function() {
    $("div").addClass("d1");
   })

   $("#b2").click(function() {
    $("div").removeClass("d1");
   })*/
   //$("body i:last-child").css("color","red");
   //$("body:nth-child(3)").css("color","green");
   //$("div").css("background-color","green");
   //jQuery effect methods 
   /*$("#b1").click(function() {
    $("div").slideUp();
    //$("div").toggle();
    //$("div").hide();
   })*/

   /*$("#dd1").mouseenter(function (e) { 
       // values: e.clientX, e.clientY, e.pageX, e.pageY
       //alert("Hi")
       //$("#dd2").slideDown();
       $("#dd2").fadeIn();
   });
   $("#dd1").mouseout(function () { 
    //$("#dd2").slideUp(); 
    $("#dd2").fadeOut();
   });
   var i=0;
   $("p").delay(2000).animate({"fontSize":(i+40)+"px"},10000);*/
   //var obj = $("p").val();    //hTML component 
   //var obj = $("p").text();     // normal tag values. 

   //alert(obj);
   //$("p").text("Value set through jquery");
   //$("p").append("value appended....");
   //$("p").prepend("Starting message set");
   //$("p").text("<b>Value set through jquery</b>");
   //$("p").html("<b>Value set through jquery</b>");
   $("#b1").click(function() {
       var name = $("#user").val();
      // alert(name);
      
       $("#user").val("Mr"+name);

      
   })
});




