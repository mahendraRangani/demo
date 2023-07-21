<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> Signup Form </title>
     <script defer src="./script.js"></script>

        <!-- CSS -->
<link rel="stylesheet" href="style.css">
<link href="/style.css" rel="stylesheet">
  <script defer src="./index.js"></script>
<!-- Boxicons CSS -->
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body >
 
	<div class="wrapper">
	<div class="form-box login">
	<h2>Contact</h2>  
                    <form action="contact"method="post">
                        <div class="field input-field">
                            <input type="text" name="firstName" placeholder="First Name" class="input">
                        </div>
                        <div class="field input-field">
                            <input type="text" name="lastName" placeholder="Last Name" class="input">
                        </div>
                        <div class="field input-field">
                          <select id="country" name="country">
                           <option value="india">India</option>
						<option value="england">England</option>
						<option value="australia">Australia</option>
						<option value="canada">Canada</option>
						<option value="usa">USA</option>
					</select>
				</div>
                        <div class="field input-field">
                            <input type="text" name="subject"placeholder="Subject" class="password">
                        </div>

                        <div class="field button-field">
                            <button>Signup</button>
                        </div>
                    </form>

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
        