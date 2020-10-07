import React,{Component} from 'react';
import './App.css';

class Project extends Component{


    
  
    render(){
        return(<div  >
<div class="container-fluid" id="pmain" >
<div class="col-sm-12 "  >
        
        <div className="container-fluid " id="projectcontainer">
            <h2>OZ Attend</h2>
<h3 > Design, development, and implementation of an on-demand special event attendance system; web application can create event, track user sign-in, and issue tokens for later sign-in if user not online.</h3>
            <a href="https://github.com/tekbhattarai/OZattend-">OZAttend Source Code</a><br></br>
            <a href="http://pi.cs.oswego.edu/~aleague/ozattend/login.php">OZ Attend Web-Site</a>
    </div>
    
      </div>
      <div class="col-sm-12 " >
        
        <div class="container-fluid "id="projectcontainer">
       
    
        <h2 >Mapping oswego</h2>
        <h3 > design, development, and implementation of maping oswego project; web application maps the historical place of Oswego (Oswego Theater) showing history and information about the theater using Artivie tech which produce augmented reality slideshow.  </h3>
        <a href="https://github.com/tekbhattarai/Oswego-Theater">Oswego Theater Source Code</a>
    </div>

        </div>
        <div class="col-sm-12"  >
        
        <div className="container-fluid" id="projectcontainer">
       
<h2>Turing Machine</h2>
<h3>Implementation of a Turing Machine (TM) in C. A TM consists of:<br></br>

- An infinite tape, divided into cells<br></br>
- A read/write head which traverses along the tape, capable of reading the current cell, writing a new value in the current cell, and moving left or right<br></br>
- A state register<br></br>
- A finite table of instructions which, given the current state of the machine, and the value in the tape cell currently being read, retrieves an instruction which tells the machine to :<br></br>
1) Write some (possibly the same) item into the cell<br></br>
2) Move the head left or right one cell<br></br>
3) Change to some (possibly the same) state</h3>
     
   <a href="http://pi.cs.oswego.edu/~tbhatta2/csc344/a1/main.c">Turing MAchine Source Code</a>
 
    </div>
    
      </div>
      <div class="col-sm-12 bg-midnight" >
        
        <div class="container-fluid pb-5 pb-3"id="projectcontainer">
       
        <h2>Pattern Matching Scala</h2>
        <h3> program that performs pattern matching on strings, where patterns are expressed using only the concatenation, alternation (“|”), and optional (“?”) operators of regular expressions</h3>
        <a href="http://pi.cs.oswego.edu/~tbhatta2/csc344/a3/scala.scala">Pattern Matching Source Code</a>

       
    </div>

        </div>
  
        </div>
        <div class="footer">
<p>Copyright &copy; Your Website</p>
</div>

        </div>)
    }


}

export default Project