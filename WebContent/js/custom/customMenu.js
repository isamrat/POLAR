var menuList = [];
$( document ).ready(function() {
    console.log( "ready!" );
    
    $.get("../service/menu", function(data, status){
    	menuList = data;
    	var tableContent = "<table><thead><tr><th>Id</th><th>Name</th><th>Link</th></tr></thead><tbody><tr><td>"+menuList[0].menuId+"</td>" +
		"<td>"+menuList[0].menuName+"</td><td>"+menuList[0].link+"</td></tbody></table>";
    	$(".menuDiv").html(tableContent)
    });
    
    console.log(menuList);
});