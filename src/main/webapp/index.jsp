<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
<style>
	*{
		margin:0;
		padding: 0;
		box-sizing: border-box;
	}
	#but{
		margin:50px;
		padding:20px;
		width: 90%;
		background: red;
	}
	#child_but{
	      size: %; 
	}
	#main{
		width: 100vw;
		height: 400px;
		
	}
	#main_im{
		width: 100%;
		height: 90%;
		background-color: red;
	}
	#main_im img{
		margin:0;
		padding: 0;
	}
	#main_form{
		width: 100vw;
		height: 50px;
		background-color: red;
	}
	#form{
		width: 100%;
		height: 100%;
	}
	#form h3{
		text-align:center;
	}
	#form form{
		text-align:center;
		
	}
	
</style>
</head>
<body>

<div id="main">
	<div id="main_im">
			 <img src="imgfolder/img_2.jpg" width="33%" height="100%">
			 <img src="imgfolder/img_1.jpg" width="33%" height="100%">
			 <img src="imgfolder/img_4.jpg" width="33%" height="100%">
			 
	</div>
<div>

<div id="main_form">
	<div id="form">
		<h3>ADD INVENTORY ITEM</h3>
		<form action="seleadd" method="get">
			<select name="form">
				<option value="no">
					-ANY-
				</option>
				<option value="cat">
					Categories
				</option>
				<option value="cust">
					Customer
				</option>
				
				<option value="emp">
					Employee
				</option>
				
				<option value="pro">
					Product
				</option>
				
				<option value="sup">
					Suppliers
				</option>
				
				<option value="ord">
					Order
				</option>
				
				
			</select>
			<button type="submit">Submit</button>
		</form>
	</div>
</div>
<div id="but_1">
		
		<div  >
			<h3>VIEW INVENTORY ITEM</h3>
			<a href="employee_td" target="_blank"><button>Employee</button></a>
			<a href="supplier" target="_blank"><button>Supplies</button></a>
			<a href="categori" target="_blank"><button>Category</button></a>
			<a href="product" target="_blank"><button>Product</button></a>
			<a href="order" target="_blank"><button>Order</button></a>
			<a href="customer_td" target="_blank"><button >Costomer</button></a>
		</div>
</div>

 
<div id="but" >
	<div id="child_but">
	<button>Total Employee 
		
	</button>
	<button>Total Supplies</button>
	<button>Total Category</button>
	<button>Total Product</button>
	<button>Total Order</button>
	<button>Total Costomer</button>
	</div>
</div>




</body>
</html>