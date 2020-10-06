import React,{Component} from 'react';
import{Link} from 'react-router-dom';
import "./App.css"

class Nav extends Component{


  

    render(){
        return(<div>


<nav class="navbar navbar-expand-md navbar-light bg-light navbar-fixed-top ">
   
<h1><a class="navbar-brand justify-content-around" href="Home">
    T  e  k   B  h  a  t  t  a  r  a  i</a> </h1>


   <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
     <span class="navbar-toggler-icon"></span>
   </button>
   
   <div class="collapse navbar-collapse" id="navbarNav">

   <ul class=" navbar ">
       <li class="nav-item ">
   
       <Link to="home">  <li class="nav-link text-dark" ><span class="glyphicon glyphicon-home"></span><span class="sr-only">(current)</span></li></Link> 
</li>

       <li class="nav-item">
            <Link to="project">  <li class="nav-link text-dark" ><h4>Project</h4></li></Link> 
            </li>


        
       <li class="nav-item">
            <Link to="about">  <li class="nav-link text-dark" ><h4>Contact</h4></li></Link> 
            </li>
            <li class="nav-item">
            <li class="nav-link text-dark" ><a href="https://www.linkedin.com/in/tek-bhattarai-4364181a6/"><i class="fa fa-linkedin-square" style={{fontSize:"50px",color:"black"}}></i></a></li>
            </li>
            

  </ul>
  
  </div>
      </nav>



  </div>
            )    }

   
}
export default Nav