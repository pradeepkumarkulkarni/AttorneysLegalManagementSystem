<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="myCarousel" class="carousel slide">
			<ol class="carousel-indicators">
				<!--         <li data-target="#myCarousel" data-slide-to="0" class="active"></li> -->
				<li data-target="#myCarousel" data-slide-to="0"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- Carousel items -->
			<div class="carousel-inner">
				<!--         <div class="active item"><img  src="pages/lib/bootstrap/css/" alt="banner1" /></div> -->
				<div class="item">
					<img src="pages/lib/bootstrap/img/elHombre.PNG" alt="" />
					<div class="carousel-caption">
              <h3>Third slide label</h3>
              <p>blablalba 1.</p>
            </div>
				</div>
				<div class="item">
					<img src="pages/lib/bootstrap/img/cosmoVitral.PNG" alt="" />
					<div class="carousel-caption">
              <h3>Third slide label</h3>
              <p>shahlha 2.</p>
            </div>
				</div>
				<div class="item">
					<img src="pages/lib/bootstrap/img/jaguar.PNG" alt="" />
					<div class="carousel-caption">
              <h3>Third slide label</h3>
              <p>dedededed3.</p>
            </div>
				</div>
			</div>
			<!-- Carousel nav -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			<a class="carousel-control right" href="#myCarousel"
				data-slide="next">&rsaquo;</a>
		</div>
</body>
<script>
	$(document).ready(function() {
		$('.carousel').carousel({
			interval : 3000
		});
	});
</script>
</html>
