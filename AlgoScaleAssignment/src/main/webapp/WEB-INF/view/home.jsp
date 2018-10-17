<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
 <html>
 <head>
     <meta charset="utf-8" />
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Page Title</title>
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no, user-scalable=no" >
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
     
     <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
     <script src="main.js"></script>

 </head>
 <body>

        <nav class="navbar  bg-primary navbar-light">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                        <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                        <ul class="navbar-nav">
                          <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                          </li> 
                        </ul>
                </div>
        </nav> 
        
        <div class="container-fluid">
            <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 container-fluid" style="background-color:#f2f2f2;">
                            <div class="col-sm-12 container-fluid" style="background-color:white; padding-bottom: 50px;">
                                <div class="col-sm-3">
                                        <h2 style="color:blue;">Stock Analysis</h2>
                                </div>
                                <div class="col-sm-9">
                                        <a href="">Home</a>
                                        >
                                        <a href="" class="text-muted"> Stock Analysis</a>
                                </div>    
                        </div>
                        <br>
                        <div class="col-sm-12 container" style="background-color:white; padding:20px;">
                            <p>Most Predicted Stocks</p>
                            <button type="button" class="btn btn-info">AMD 120% &uarr;</button>
                            <button type="button" class="btn btn-danger">BAC 2.78% &darr;</button>
                            <button type="button" class="btn btn-danger">FB 4.58% &darr;</button>       
                            <button type="button" class="btn btn-success">AAPL 2.48% &uarr;</button>
                            <button type="button" class="btn btn-danger">F 4.04% &darr;</button>       
                            <button type="button" class="btn btn-info">CBOE 3.27% &uarr;</button>

                        </div>
                        <br>
                        <div class="container-fluid form-group" style="padding: 20px;">
                                <label class="form-check-label" style="padding-right: 50px; padding-left: 100px;">
                                        <input type="radio" class="form-check-input" name="optradio">BTC
                                </label>
                                <label class="form-check-label" style="padding-right: 50px;">
                                        <input type="radio" class="form-check-input" name="optradio">ETH
                                </label>
                                <input type="radio" class="form-check-input" name="optradio">
                                <div class="col-sm-4">
                                        <input type="text" class="form-control" id="usr">
                                </div>
                                
                        </div>
                        <br>
                        <div class="container">
                            <h5>Predictive Overview </h5>
                            <h6 class="text-center">M--1 WEEK</h6>
                            <p>Probability of % Gain/Loss</p>




                        </div>
                        <div class="container" style="background-color:white;"> 
                            <h6>Useful Matrix</h6>
                            <table class="table table-bordered">
                                <thead>
                                        <tr>PreviousClose</tr>
                                        <tr>Ticker</tr>
                                </thead>
                                    <tbody>
                                        <tr>
                                                <p>prev</p>	
                                        </tr>
                                        <tr></tr>
                                        <tr>
                                                <c:forEach var ="ticker" items="${ tickers }">
                                                        <tr>
                                                                <td>${ ticker }</td>
                                                        </tr>
                                                                
                                                </c:forEach>	
                                        </tr>                                        
                                    </tbody>
                                  </table> 
                        </div>

                    </div><!--  section End -->
            </div>
        </div>


 </body>
 </html>