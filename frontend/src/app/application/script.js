//Date Picker





//when the file inside the drag area
const dragArea = document.querySelector('.drag-area');
const dragText= document.querySelector('header');


let button = document.querySelector('.button')
let input = document.querySelector('.input')

let file;

button.onclick = () => {
    input.click();
};

//when browse

input.addEventListener('change', function(){
    file.this.files [0];
})

//when the file is inside the drag area
dragArea.addEventListener('dragover',(event)=>{
    dragText.textContent = 'Release to apload';
    dragArea.classList.remove('active')
    // console.log('File is inside the drag area');
});

//when the file leaves the drag area

dragArea.addEventListener('dragleave',()=>{
  dragText.textContent = 'Drag & Drop';
    // console.log('file has left the dragArea')
});

//when the file has been dropped in the drag area

dragArea.addEventListener('drop',()=>{
    Event.preventDefault();
    // console.log('the file is dropped the drag Area')

    File = event.File.type;
    //console.log(file);

    let fileType = file.type;
    // console.log(fileType);
    //console.log('the file has been ')

    let validExtensions = ['image/jpeg','image/jpg','iamge/png']
    if(validExtensions.includes(fileType)){
        let fileReader = new fileReader.result;
        console.log(fileURL);

    };

    fileReader.readAsDataURL
});

