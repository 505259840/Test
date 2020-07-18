<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html>

<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登录</title>
	<style type="text/css">

		   body{
		   	  
		   	  width: 99%;
		   	  height:100%;
		   	   
		   	 background-image: linear-gradient(to right, #2FCFAB 0%, #4887BE 100%);
		   	 
     
		   }
           #box{
                
           	    text-align: center;
           	    margin-top: 16%;
           	    font-size: 18px;
           	    font-family: '宋体';
           	    
           	    height:200px;
           }
           #left{
           	  float:left;
           	  width: 548px;
           	  height:200px;
           	  color:#4169E1;
           	  text-align:right;
           	  line-height: 130px;           	 
           	  

           }
           #center{
             width: 5px;
           	 height:200px;
           	 box-shadow:5px 0px 50px #ccc;
           	 border-right:2px solid  	#E6E6FA;
           	 
           	 float:left;
           }
           #right{
           	      float: right;
                  width: 733px;
                  height:200px;
                  text-align:left;
                  color: white;
                  
           } 
           .inputs{
           	    margin-top:20px;
           	    height:24px;
           	    width:180px;
           	    font-size: 14px;
           	    border:1px solid black;
           	    border-radius: 2px;
                
           }
           #check{
           	    margin-right: 88px;
           	    margin-top:20px;
           	    height:24px;
           	    width:90px;
           	    font-size: 14px;
           	    border:1px solid black;
           	    border-radius: 2px;
           }
           #s{
           	  margin-right: 130px;
           }
           #sub{
           	    margin-top:20px;
           	    margin-left:40px;
           	    height:24px;
           	    width:60px;
           	    background-color:  	#6495ED;
           	    border:0;
           	    border-radius: 5px;
           	    color: white;
           }
	</style>
</head>
<body>
	  <div id="b">

	  	    
           <div id="box">
              
              <div id="left">
                  <h1>客户管理系统</h1>
              </div>
              <div id="center"></div>
              <div id="right">
              <form  action="login" method="post">
  
			    账&nbsp;号:<input class="inputs" type="text"  name="usercode" required="required" placeholder="请输入账号">  <br>
			     
			    密&nbsp;码:<input class="inputs" type="password"  name="password" required="required" placeholder="请输入密码"> <br>
			    
			    验证码:<input id="check" type="text"  name="check" required="required" placeholder="请输入验证码"> <br> 

			    <div id="s">    
			    <input  id="sub" type="submit" name="submit" value="登   录" />
			     <input  id="sub" type="reset" name="submit" value="重   置" />	
			     </div> 	     				 			     
			  </form>
			</div>			   			
          </div>
         </div>
	  </div>
	  ${msg}
</body>
</html>