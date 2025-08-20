import React,{Component} from "react"; //gives access class compponents,create our own custom class

class Car extends Component{  // access methods and this.props
    render(){
        const {brand,model,colour,year} =this.props; //object destructuring
        return(

             <div >
        <h1>Car Details:</h1>
        <p>Brand: {brand}</p>
        <p>Model: {model}</p>
        <p>Color: {colour}</p>
        <p>Year: {year}</p>
      </div>

        );
    }

}

export default Car;

