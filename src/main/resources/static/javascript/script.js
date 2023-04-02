$(document).ready(function(){
	$("#product").click(function(){
		$(".pro").animate({
			height: $(".pro").height() == 0 ? "70%" : 0,
			"border-width": $(".pro").height() == 0 ? "1px" : "0px"
		}, 300);
	});
	$("#category").click(function(){
		$(".cat").animate({
			height: $(".cat").height() == 0 ? "24%" : 0,
			"border-width": $(".cat").height() == 0 ? "1px" : "0px"
		}, 300);
	});
});