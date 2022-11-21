//LANDING PAGE LOAD

function displayFunction() { 
  document.getElementById("icon").style.display="none";  
  document.getElementById("filter").style.display="block";
  document.getElementById("sections").style.display="block";
  document.getElementById("myBtn").style.display="block";
  document.getElementById("paginate").style.visibility="visible";
}



let mybutton = document.getElementById("myBtn");

function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}

