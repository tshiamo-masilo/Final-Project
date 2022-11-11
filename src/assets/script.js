function myFunction() { 
    document.getElementById("icon").style.display="none";  
    document.getElementById("filter").style.display="block";
    document.getElementById("sections").style.display="flex";
  }

  $('#typePassword2, #typePassword3').on('keyup', function () {
    if ($('#typePassword2').val() == $('#typePassword3').val()) {
      $('#message').html('Matching').css('color', 'green');
    } else 
      $('#message').html('Not Matching').css('color', 'red');
  });