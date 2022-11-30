//LANDING PAGE LOAD

function displayFunction() { 
  document.getElementById("icon").style.display="none";  
  document.getElementById("filter").style.display="block";
  document.getElementById("sections").style.display="block";
  document.getElementById("myBtn").style.display="block";
  document.getElementById("paginate").style.visibility="visible";
}

//CHANGING BACKGROUND ON CLICK

function about() {
  document.getElementById("background").style.backgroundImage = "url(https://i.ibb.co/tXRPmGs/about.png)";
}

function contact() {
  document.getElementById("background").style.backgroundImage = "url(https://i.ibb.co/KhVTqnk/contact.png)";
}
function login() {
  document.getElementById("background").style.backgroundImage = "url('https://i.ibb.co/5smwFLc/login.png')";
}


//SCROLL TOP FUNCTION

let mybutton = document.getElementById("myBtn");

function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}


