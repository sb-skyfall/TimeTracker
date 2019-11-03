<!DOCTYPE html>
<html >
<head>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/javascript.js"></script>
</head>
<body>



<form method="post" action="upload">
<div class="box">
<h1>Time Tracker</h1>
<input type="text" name="name" value="EMPLOYEE NAME" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />
<input type="text" name="team" value="TEAM NAME" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />
<input type="text" name="login" value="VDI LOG IN" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />
  
<input type="text" name="logout" value="VDI LOG OUT" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />

<input type="text" name="loggedTime" value="VDI HOURS" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />

<input id="date" name="logDate" type="text" class="email"> 
<div class="btn"><Input type="submit" value="Log Time" name="submit"></div> <!-- End Btn -->

<div id="btn2"><Input type="reset" value="Reset" name="reset"></</div> <!-- End Btn2 -->
  
</div> <!-- End Box -->
  
</form>


  

</body>
</html>