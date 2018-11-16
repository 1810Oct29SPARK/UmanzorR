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
    var location = {lat: 37.090240, lng: -95.712891};
    var map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: location
    });
}


/*function initMap() {
    var myLatLng = {lat: 27.9506, lng: 82.4572};
  
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 4,
      center: myLatLng
    });
  
    var marker = new google.maps.Marker({
      position: myLatLng,
      map: map,
      title: 'Hello World!'
    });
  }

  function initMap() {
    var myLatLng = {lat:28.4369, lng:  -99.2350};
  
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 4,
      center: myLatLng
    });
  
    var marker = new google.maps.Marker({
      position: myLatLng,
      map: map,
      title: 'Hello World!'
    });
  }*/

  function initMap() {
    var locations = [
        ['Passage Island', 28.4369, -99.2350],
        ['Point Atkinson', 27.9506, -82.4572]
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
//google.maps.event.addDomListener(window, 'load', initialize);