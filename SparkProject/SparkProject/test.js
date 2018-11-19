/*let getUniversityWithPromise = function(){
    fetch("https://www.dictionaryapi.com/api/v3/references/collegiate/json/voluminous?key=your-api-key")
    .then(r => r.json())
    .then(response => {
        let myArray=[];
        for(i=0;i<10;i++){
            const resultQuestion = document.getElementById(i);
            myArray.push(response.results[i].question);
        }
        var ul = document.createElement("ul");
        document.getElementById("myList").appendChild(ul);

        for (i=0;i<myArray.length;i++) {
            var li = document.createElement("li");
            ul.appendChild(li);
            li.innerText = myArray[i];
        }


      console.log(response.results);
      console.log(myArray)
    });
}

window.onload(getUniversityWithPromise());

$('.carousel').carousel({
    keyboard
  })

jQuery(document.documentElement).keyup(function (event) {    

    var owl = jQuery(".myCarousel-carousel");

    // handle cursor keys
    if (event.keyCode == 37) {
       // go left
       owl.trigger('myCarousel.prev');
    } else if (event.keyCode == 39) {
       // go right
       owl.trigger('myCarousel.next');
    }

});



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

$('.carouselExampleIndicators').carousel({
   carousel:interval=200
  })

  $(carouselExampleIndicators).ready(function() {
    jQuery.fn.carousel.Constructor.TRANSITION_DURATION = 5000  // 2 seconds
  });

let etsyURL = 'https://openapi.etsy.com/v2/listings/active?api_key={xc29kqrykuk2t820z08t68p1}';

function getInventory() {
    fetch(etsyURL)
        .then(response => response.json())
        .then(data => {
            console.log(data) 
})
.catch(error => console.error(error))

(function($){

    $(document).ready(function(){
        $('#etsy-search').bind('submit', function() {
            api_key = "xc29kqrykuk2t820z08t68p1";
            terms = $('#etsy-terms').val();
            etsyURL = "https://openapi.etsy.com/v2/listings/active.js?keywords="+
                terms+"&limit=12&includes=Images:1&api_key="+api_key;

            $('#etsy-images').empty();
            $('<p></p>').text('Searching for '+terms).appendTo('#etsy-images');

            $.ajax({
                url: etsyURL,
                dataType: 'jsonp',
                success: function(data) {
                    if (data.ok) {
                        $('#etsy-images').empty();
                        if (data.count > 0) {
                            $.each(data.results, function(i,item) {
                                $("<img/>").attr("src", item.Images[0].url_75x75).appendTo("#etsy-images").wrap(
                                    "<a href='" + item.url + "'></a>"
                                );
                                if (i%4 == 3) {
                                    $('<br/>').appendTo('#etsy-images');
                                }
                            });
                        } else {
                            $('<p>No results.</p>').appendTo('#etsy-images');
                        }
                    } else {
                        $('#etsy-images').empty();
                        alert(data.error);
                    }
                    
                }
            });

            return false;
        })
    });

})(jQuery)*/





let portlandWeather = {};


let weatherApiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Portland,us&units=imperial&APPID=d0afa425214adac85ad5ee86d1710cbc';
function getPortlandWeather() {
    fetch(weatherApiUrl).then((response) => {return response.json();
    }).then((data) => {
        portlandWeather = data;
        console.log(data);
        console.log('Usually appears at: '+portlandWeather.main.temp+' degrees farenheit');
        updateWeather();
    });
}

function updateWeather() {
    let newPara = document.createElement('p')
    newPara.innerText = 'Usually appears at '+portlandWeather.main.temp+' degrees farenheit';
    //add new p element as a child of weatherDiv
    document.getElementById('weatherDiv').appendChild(newPara);
}

/*
    What's going on under the hood ^^
*/  
function sendAjaxGet(url, func) {
    //first: obtain xhr
    var xhr = new XMLHttpRequest();
    //second: define onreadystatechange
    xhr.onreadystatechange = function(){
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    }
    //third: prepare request
    xhr.open("GET", url, true);
    //finally: send
    xhr.send();
}

function updateWeatherWithAjax(xhr) {
    //JSON.parse() will convert JSON-formatted string to a JS object
    var res = JSON.parse(xhr.responseText); 
    console.log(res);
    //can use this object however we want! 
}

window.load(getPortlandWeather())

/*let orlandoWeather = {};


let weatherApiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Orlando,us&units=imperial&APPID=d0afa425214adac85ad5ee86d1710cbc';
function getOrlandoWeather() {
    fetch(weatherApiUrl).then((response) => {return response.json();
    }).then((data) => {
        orlandoWeather = data;
        console.log(data);
        console.log('the temperature is: '+orlandoWeather.main.temp+' degrees');
        updateWeather();
    });
}

function updateWeather() {
    let newPara = document.createElement('p')
    newPara.innerText = 'the temperature is: '+orlandoWeather.main.temp+' degrees';
    //add new p element as a child of weatherDiv
    document.getElementById('weatherDiv2').appendChild(newPara);
}

/*
    What's going on under the hood ^^
*/
/*function sendAjaxGet(url, func) {
    //first: obtain xhr
    var xhr = new XMLHttpRequest();
    //second: define onreadystatechange
    xhr.onreadystatechange = function(){
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    }
    //third: prepare request
    xhr.open("GET", url, true);
    //finally: send
    xhr.send();
}

function updateWeatherWithAjax2(xhr) {
    //JSON.parse() will convert JSON-formatted string to a JS object
    var res = JSON.parse(xhr.responseText); 
    console.log(res);
    //can use this object however we want! 
}

window.load(getOrlandoWeather()) */



