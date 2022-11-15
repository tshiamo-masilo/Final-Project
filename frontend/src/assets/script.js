// function myFunction() { 
//     document.getElementById("icon").style.display="none";  
//     document.getElementById("filter").style.display="block";
//     document.getElementById("sections").style.display="flex";
//   }

//   //Date Picker





// //when the file inside the drag area
// const dragArea = document.querySelector('.drag-area');
// const dragText = document.querySelector('header');


// let button = document.querySelector('.button')
// let input = document.querySelector('.input')

// let file;

// button.onclick = () => {
//     input.click();
// };

// //when browse

// input.addEventListener('change', function () {
//     file = this.files[0];
//     dragArea.classList.add('active');
//     displayFile();
// })

// //when the file is inside the drag area
// dragArea.addEventListener('dragover', (event) => {
//     dragText.textContent = 'Release to apload';
//     dragArea.classList.remove('active')
//     // console.log('File is inside the drag area');
// });

// //when the file leaves the drag area

// dragArea.addEventListener('dragleave', () => {
//     dragText.textContent = 'Drag & Drop';
//     // console.log('file has left the dragArea')
// });

// //when the file has been dropped in the drag area

// dragArea.addEventListener('drop', () => {
//     Event.preventDefault();
//     // console.log('the file is dropped the drag Area')

//     File = event.File.type;
//     //console.log(file);
// displayFile();
// });

// function displayFile(){
    
//     let fileType = file.type;
//     // console.log(fileType);
//     //console.log('the file has been ')

//     let validExtensions = ['image/jpeg', 'image/jpg', 'image/png']

//     if (validExtensions.includes(fileType)) {
//         let fileReader = new fileReader();

//         fileReader.onload = () => {
//             let fileURL = fileReader.result;
//             // console.log(fileURL);
//             let imgTag = '<img src ="${fileURL}" alt = "">';
//             dragArea.innerHTML = imgTag;

//         };

//         fileReader.readAsDataURL(file);

//     } else {
//         alert('This is not an image');
//         dragArea.classList.remove('active');
//     }
//     //console.log('The file is dropped in drag area')
// }
    
const name = document.getElementById('name');
const identificationNumber = document.getElementById('Identification number');
const Nationality = document.getElementById('Nationality');
const Gender = document.getElementById('Gender');
const emailAddress = document.getElementById('Language');
const mobileNumber = document.getElementById('Mobile Number');
const Language = document.getElementById('Language');
const homeAddress= document.getElementById('Home address');

form.addListeners('submit', function(e){
    e.preventDefault();
});

//Show error function

function ShowError(input, message){
    const row = input.parentElement;
    row.className = 'row error'
    const small = row.querySelector('small');
    small.innerText = message;
}

//show success 
function showSuccess(){
    row = input.parentElement;
    row.className = 'row success';

}

//Event listeners
form.addListeners('submit', function (e){
    if(name.value===''){
        ShowError(name,'name is required')
    } else{
        showSuccess(name);
    }
})