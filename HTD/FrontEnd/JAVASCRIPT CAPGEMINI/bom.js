let latitude;
let longitude;

//getting current position
navigator.geolocation.getCurrentPosition((position) => {
    console.log(position.coords.latitude)
    latitude = position.coords.latitude;
    console.log(position.coords.longitude)
    longitude= position.coords.longitude;
});


let heading = document.getElementById('heading');
heading.style.background = 'pink' ;
heading.style.color = 'white' ;

function acceptProposal(){
    document.getElementById('proposal').src = "https://cdn.pixabay.com/photo/2019/12/07/04/24/doodle-4678658__340.png"

}

function rejectProposal() {
    document.getElementById('proposal'). src = "https://cdn.pixabay.com/photo/2019/12/28/19/09/new-years-eve-4725484__340.jpg"
}

localStorage.setItem('class','capgemini')
