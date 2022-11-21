//LANDING PAGE LOAD

function displayFunction() { 
  document.getElementById("icon").style.display="none";  
  document.getElementById("filter").style.display="block";
  document.getElementById("sections").style.display="block";
  document.getElementById("myBtn").style.display="block";
  document.getElementById("paginate").style.visibility="visible";
}



//SEARCH BAR

// function searchSchools() {
// let input = document.getElementById('searchbar').value
// input=input.toLowerCase();
// let schools = document.getElementsByClassName('schools');
  
// for (i = 0; i < schools.length; i++) { 
//     if (!schools[i].innerHTML.toLowerCase().includes(input)) {
//       schools[i].style.display="none";
//     }
//     else {
//       schools[i].style.display="inherit";                 
//     }
// }
// }





let mybutton = document.getElementById("myBtn");

// window.onscroll = function() {scrollFunction()};

// function scrollFunction() {
//   if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
//     mybutton.style.display = "block";
//   } else {
//     mybutton.style.display = "none";
//   }
// }

function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}

