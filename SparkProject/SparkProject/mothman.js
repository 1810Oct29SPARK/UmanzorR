/*let belmarWeather = {};


let weatherApiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Belmar,us&units=imperial&APPID=d0afa425214adac85ad5ee86d1710cbc';
function getBelmarWeather() {
    fetch(weatherApiUrl).then((response) => {return response.json();
    }).then((data) => {
        belmarWeather = data;
        console.log(data);
        console.log('Usually appears at: '+belmarWeather.main.temp+' degrees farenheit');
        updateWeather();
    });
}

function updateWeather() {
    let newPara = document.createElement('p')
    newPara.innerText = 'Usually appears at '+belmarWeather.main.temp+' degrees farenheit';
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

window.load(getBelmarWeather())*/

let portlandWeather = {};


let weatherApiUrl2 = 'http://api.openweathermap.org/data/2.5/weather?q=Portland,us&units=imperial&APPID=d0afa425214adac85ad5ee86d1710cbc';
function getPortlandWeather() {
    fetch(weatherApiUrl2).then((response) => {return response.json();
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
    document.getElementById('weatherDiv').appendChild(newPara)
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
