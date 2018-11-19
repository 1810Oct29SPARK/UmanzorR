var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}


function  initMap() {
    var location = {lat: 39.8283, lng: -98.5795};
    var map = new google.maps.Map(document.getElementById("map"), {
        zoom: 50,
        center: location
    });
}



function initMap() {
    var locations = [
        ['Passage Island', 28.4369, -99.2350],
        ['Point Atkinson', 27.9506, -82.4572],
        ['Point Pleasant', 38.8445, -82.1371],
        ['Loveland', 39.2689, -84.2638],
        ['Pine Barrens',  39.7500,  -74.7500],
        ['Kirtland', 41.6289, -81.3615],
        ['Beltsville', 39.0348, -76.9075],
        ['Portland', 45.5122, -122.6587],
        ['Honey Island', 30.2171, -89.6498]
    ];
    console.log('in')
    var mapOptions = {
        center: new google.maps.LatLng(28.4369, -99.2350),
        zoom: 4,
        mapTypeControl: false,
        panControl: false,
        streetViewControl: false,
        zoomControl: false,
        disableDoubleClickZoom: true,
    };
    var map = new google.maps.Map(document.getElementById('map'), mapOptions);
    var marker, i;

    for (i = 0; i < locations.length; i++) {
        var p = new google.maps.LatLng(locations[i][1], locations[i][2]);
        marker = new google.maps.Marker({
            position: p,
            map: map
        });
    }
}
