import React,{Component} from 'react';
import '.././App.css';

class About extends Component{


    
  
    render(){
        return(<div >
        
<div className="container col-sm-6 p-5 ">
<div className="container p-5" >
<h2 class="h2contact">Contact Information</h2>
<h2 class="contactinfo">Tek Bhattarai, B.S</h2>
<h2 class="contactinfo">Syracuse NY</h2>
<h2 class="contactinfo">315-278-6984</h2>
<h2 class="contactinfo">tbhatta2@oswego.edu</h2>
<h2 class="contactinfo"><a href="http://pi.cs.oswego.edu/~tbhatta2/res.html">View resume</a></h2>
<h2 class="contactinfo"><a href="https://www.linkedin.com/in/tek-bhattarai-4364181a6/"><i class="fa fa-linkedin-square" style={{fontSize:"50px",color:"black"}}></i></a>
<a class="p-5" href="https://github.com/tekbhattarai"><i class="fa fa-github" style={{fontSize:"50px",color:"black"}}></i></a>
<a href="https://www.facebook.com/bkrem/"><i class="fa fa-facebook-official" style={{fontSize:"50px",color:"black"}}></i></a>
</h2>
</div>
</div>
<div class="col-sm-3 " id="joke">
    
<h2 class="h2contact">Joke of the Day</h2>
<h2 class="contactinfo">A reporter ask programmer what makes the code bad?</h2>
<h2 class="contactinfo pb-5">Programmer:- No comment </h2>
</div>






<div class="footer">
<p>Copyright &copy; Your Website</p>
</div>

</div>)
    }


}

export default About