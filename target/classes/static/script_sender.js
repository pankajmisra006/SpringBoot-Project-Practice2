$( document ).ready(function() {
    
	$('#send').click(function(e) {
		var domain = "http://localhost:8082/receiver";
       var message = "message is passing from sender to receiver";
    window.postMessage(message,domain);


	});
	

});
