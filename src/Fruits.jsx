
import React, { Component } from 'react';

// Functional Component
function FruitList({ fruits }) { // fruits as props
  return (
    <div>
      <h3>FruitList</h3>
      <ul>
        {fruits.map((item, idx) => (  
          <li key={idx}>{item}</li> //needs keys for list 
        ))}
      </ul>
    </div>
  );
}

// Class Component
class Fruits extends Component {
  constructor(props) {
    super(props); //
    this.state = { //component state as object
      fruits: ['Apple', 'Banana', 'orange'],
      newFruit: ''
    };
  }
//handleChange method
  handleChange = (e) => {   //update new state as user type
    this.setState({ newFruit: e.target.value });
  };
  //handleAddFruit method 
  handleAddFruit = (e) => { //
    e.preventDefault();
    const { newFruit, fruits } = this.state;
    if (newFruit.trim() !== '') { //prevent adding empty or duplicate fruits
      this.setState({
        fruits: [...fruits, newFruit],
        newFruit: ''
      });
    }
  };

  render() {
    return (
      <div style={{ width: '250px', margin: '40px auto', fontFamily: 'Arial' }}>
        <h3>Fruits</h3>
        <form onSubmit={this.handleAddFruit}>
          <input
            type="text"
            value={this.state.newFruit}
            onChange={this.handleChange}
            placeholder="Enter fruit name"
            style={{ width: '70%' }}
          />
          <button type="submit">Add</button>
        </form>
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

export default Fruits;
