//LANDING PAGE LOAD

function displayFunction() { 
  document.getElementById("icon").style.display="none";  
  document.getElementById("filter").style.display="block";
  document.getElementById("sections").style.display="block";
  document.getElementById("myBtn").style.display="block";
  document.getElementById("paginate").style.visibility="visible";
}



//SEARCH BAR

function search_schools() {
let input = document.getElementById('searchbar').value
input=input.toLowerCase();
let x = document.getElementsByClassName('schools');
  
for (i = 0; i < x.length; i++) { 
    if (!x[i].innerHTML.toLowerCase().includes(input)) {
        x[i].style.display="none";
    }
    else {
        x[i].style.display="inherit";                 
    }
}
}

//SCROLL TOP

let mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};



// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}

//Filter

// $('#dropdownmenu').on('change',function() {
//   var value = $(this).val();
//   if(value=='active'){
//     $('div.item').show();
//   }else{
//     $('div.item').hide();
//     $('.'+value).show();
//   }
// });

// fetch("./schools.json")
//  .then(resp => resp.json()) 
//  .then(data =>
//   {
//   data.forEach(el=>console.log(el.NatEmis) )
//   })