
let url = "https://yts.am/api/v2/list_movies.json?limit=20&page=1&sort_by=rating";
let image ="";
fetch(url).then(function(response){
    return response.json();
}).then(function(result){
    console.log(result.data.movies[0].large_cover_image);
    img =result.data.movies[0].large_cover_image;
    let main = document.querySelector("#main");
    main.innerHTML = "<img src='"+img+"'>";

});
