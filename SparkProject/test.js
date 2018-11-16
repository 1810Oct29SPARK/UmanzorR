let getUniversityWithPromise = function(){
    fetch(https://www.dictionaryapi.com/api/v3/references/collegiate/json/voluminous?key=your-api-key)
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
