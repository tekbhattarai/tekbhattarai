import React from 'react';

import './App.css';
import Home from './home';
import Project from './project';

import About from './about';
import Nav from './nav'
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';

function App() {  

  return (
    <div className="App">
     <Router>  
       <Nav></Nav>
       <Switch>
   
    <Route path="/home"exact component={Home}></Route>
    <Route path="/project"exact component={Project}></Route>
    
    <Route path="/about"exact component={About}></Route>
    </Switch>
    </Router>
    </div>
  );
}

export default App;
