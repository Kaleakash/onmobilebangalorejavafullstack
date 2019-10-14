$(document).ready(function () {
   // alert("document is ready");    
   $("#b1").draggable({containment:"#dd1",cancel:false});
   $("#b2").draggable({containment:"#dd2",cancel:false});
   $("#b3").draggable({containment:"#dd1",cancel:false});
   $("#b4").draggable({containment:"#dd2",cancel:false});
   $("#b5").draggable({containment:"#dd1",cancel:false});
   $("#b6").draggable({containment:"#dd2",cancel:false});

   $("#dd1").droppable({
    accept:".odd"
   });
   
   $("#dd2").droppable({
    accept:".even"
    });
});