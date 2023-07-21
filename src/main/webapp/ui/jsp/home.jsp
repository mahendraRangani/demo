<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Welcome page</title>


        <!-- CSS -->
<link rel="stylesheet" href="/home.style.css">
<link href="/home.style.css" rel="stylesheet">

<!-- Boxicons CSS -->
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body >
<body style="background-color: aqua;">
<h1>Welcome to Home Page ${UserName }</h1>
	<div class="wrapper">
	<div class="form-box login">
	<header style="background-color: red">
    <h1 class="logo"></h1>
		<nav class="navigation">
			<a class="btnLogin-popup" href="/home">Home</a>
			  <a class="btnLogin-popup" href="/about">About</a>
			  <a class="btnLogin-popup" href="/contact">Contact</a>
			  <a class="btnLogin-popup" href="/register">Register</a>
			<a class="btnLogin-popup" href="/login">Login</a>
			
		</nav>
	</header>
	<h2>Home</h2>
			<form action="home"method="post">

	<nav class="navbar background">
		<ul class="nav-list">
			<div class="logo">
			</div>
			<li><a href="web">Web Technology</a></li>
			<li><a href="program">C Programming</a></li>
			<li><a href="java">Java</a></li>
			<li><a href="course">Courses</a></li>
			
			
		</ul>

                         <div class="field input-field">
                            <input type="search" name="search"placeholder="Search" class="input">
                          <select id="courses" name="courses">
                            <option value="Web Technology"></option>
                           <option value="Web Technology">Web Technology</option>
						<option value="C Programming">C Programming</option>
						<option value="Java">Java</option>
					</select>
				</div>
		           

                        <div class="field input-field">
                            <input type="submit" name="submit"placeholder="Submit" class="submit">
                        </div>
	</nav>
	</form>

	<section class="firstsection">
		<div class="box-main">
			<div class="firstHalf">
				<h1 class="text-big" id="web">
					Web Technology
				</h1>
				
				<p class="text-small">
					HTML stands for HyperText Markup
					Language. It is used to design
					web pages using a markup language.
					HTML is the combination of Hypertext
					and Markup language. Hypertext
					defines the link between the web
					pages. A markup language is used
					to define the text document within
					tag which defines the structure of
					web pages. HTML is a markup language
					that is used by the browser to
					manipulate text, images, and other
					content to display it in the required
					format.
				</p>


			</div>
		</div>
	</section>

	<section class="secondsection">
		<div class="box-main">
			<div class="secondHalf">
				<h1 class="text-big" id="program">
					C Programming
				</h1>
				<p class="text-small">
					C is a procedural programming language.
					It was initially developed by Dennis
					Ritchie as a system programming
					language to write operating system.
					The main features of C language include
					low-level access to memory, simple set
					of keywords, and clean style, these
					features make C language suitable for
					system programming like operating system
					or compiler development.
				</p>


			</div>
		</div>
	</section>

	<section class="section">
		<div class="paras">
			<h1 class="sectionTag text-big">Java</h1>

			<p class="sectionSubTag text-small">
				Java has been one of the most
				popular programming language
				for many years. Java is Object
				Oriented. However it is not
				considered as pure object oriented
				as it provides support for primitive
				data types (like int, char, etc) The
				Java codes are first compiled into byte
				code (machine independent code). Then
				the byte code is run on Java Virtual
				Machine (JVM) regardless of the
				underlying architecture.
			</p>


		</div>

		<div class="thumbnail">
			<img src="data:image/jpeg;base64,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" alt="laptop image">
		</div>
	</section>

	<footer class="background">
		<p class="text-footer">
			Copyright ©-All rights are reserved
		</p>


	</footer>



				<div class="form-link">
					<span>Already have an account? <a href="/login"><strong>Login</strong></a></span>
				</div>
		</div>

                <div class="line"></div>

                <div class="media-options">
                    <a href="https://www.facebook.com" class="field facebook">
                        <span>Login with Facebook</span>
                    </a>
                </div>

                <div class="media-options">
                    <a href="https://www.google.com" class="field google">
                        <span>Login with Google</span>
                    </a>

            </div>
             <!-- JavaScript -->
        <script src="/script.js"></script>
            </div>
               
    </body>
</html>
        