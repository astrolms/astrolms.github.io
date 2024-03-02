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
	  
     
	//1	 
	$(function() {
         $('#1st').hover(function() {
         $('#1s').css('color', 'white');
		 $('#1st').css('color', '#030303');
		 $('#1').attr('src','photo/gemini2.png');
         }, function() {
        // on mouseout, reset the background colour
         $('#1s').css('color', '#333');
		 $('#1').attr('src','photo/gemini.png');
		 $('#1st').css('color', 'white');
         });
         });
		 
	//2	 
	$(function() {
         $('#2nd').hover(function() {
         $('#2s').css('color', 'white');
		 $('#2nd').css('color', '#030303');
		 $('#2').attr('src','photo/leo2.png');
         }, function() {
        // on mouseout, reset the background colour
         $('#2s').css('color', '#333');
		 $('#2').attr('src','photo/leo.png');
		 $('#2nd').css('color', 'white');
         });
         });
		 
	//3	 
	$(function() {
         $('#3rd').hover(function() {
         $('#3s').css('color', 'white');
		 $('#3rd').css('color', '#030303');
		 $('#3').attr('src','photo/taurus2.png');
         }, function() {
        // on mouseout, reset the background colour
         $('#3s').css('color', '#333');
		 $('#3').attr('src','photo/taurus.png');
		 $('#3rd').css('color', 'white');
         });
         });
		 
	//aries 
	$(function() {
         $('#4th').hover(function() {
         $('#4s').css('color', 'white');
		 $('#4th').css('color', '#030303');
		 $('#4').attr('src','photo/aries2.png');
         }, function() {
        // on mouseout, reset the background colour
         $('#4s').css('color', '#333');
		 $('#4').attr('src','photo/aries.png');
		 $('#4th').css('color', 'white');
         });
         });
		 
	$("a[href='#top']").click(function() {
    $("html, body").animate({ scrollTop: 0 }, "slow");
    return false;
    });
	
	//cancer 
	$(function() {
         $('#5th').hover(function() {
         $('#5s').css('color', 'white');
		 $('#5th').css('color', '#030303');
		 $('#5').attr('src','photo/cancer2.png');
         }, function() {
        // on mouseout, reset the background colour
         $('#5s').css('color', '#333');
		 $('#5').attr('src','photo/cancer.png');
		 $('#5th').css('color', 'white');
         });
         });