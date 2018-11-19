/*let phoenixWeather = {};


let weatherApiUrl2 = 'http://api.openweathermap.org/data/2.5/weather?q=Phoenix,us&units=imperial&APPID=d0afa425214adac85ad5ee86d1710cbc';
function getPhoenixWeather() {
    fetch(weatherApiUrl2).then((response) => {return response.json();
    }).then((data) => {
        phoenixWeather = data;
        console.log(data);
        console.log('the temperature is: '+phoenixWeather.main.temp+' degrees');
        updateWeather();
    });
}

function updateWeather() {
    let newPara = document.createElement('p')
    newPara.innerText = 'the temperature is: '+phoenixWeather.main.temp+' degrees';
    //add new p element as a child of weatherDiv
    document.getElementById('weatherDiv').appendChild(newPara);
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

function updateWeatherWithAjax(xhr) {
    //JSON.parse() will convert JSON-formatted string to a JS object
    var res = JSON.parse(xhr.responseText); 
    console.log(res);
    //can use this object however we want! 
}

window.load(getPhoenixWeather())*/



