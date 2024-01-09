$(document).ready(function() {  
                $('#photoButton').click(
                    function(){             
                        $('#content').load('photo.html #photo');          
                    }   
                ); //end click photoButton
                $('#audioButton').click(
                    function(){             
                        $('#content').load('photo.html #audio');          
                    }   
                ); //end click audioButton		
      $('#videoButton').click(
                    function(){             
                        $('#content').load('photo.html #video');          
                    }   
                ); //end click videoButton					
                				
            }); //end ready    			
	  
     window.onscroll = function() {scrollFunction()};

         function scrollFunction() {
             if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
             document.getElementById("myBtn").style.display = "block";
             } else {
             document.getElementById("myBtn").style.display = "none";
         }
     }
         function topFunction() {
         document.body.scrollTop = 0; //  Chrome, Safari & Opera 
         document.documentElement.scrollTop = 0; // IE // Firefox
         }