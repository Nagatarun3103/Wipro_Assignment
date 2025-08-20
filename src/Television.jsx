import React, { Component } from 'react';

// Functional Component 
function TelevisionList({ models }) {
  return (
    <div>
      <h3>Television Models</h3>
      <ul>
        {models.map((model, index) => (
          <li key={index}>{model}</li>
        ))}
      </ul>
    </div>
  );
}

// Class Component 
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    this.state = {
      models: ['Sony Bravia', 'Samsung QLED', 'LG OLED'],
      newModel: '' //empty new modle
    };
  }

  handleChange = (event) => {  //arrow funtional
    this.setState({ newModel: event.target.value });//set the new value in current input field
  }

  handleAddModel = (event) => {
    event.preventDefault();//prevent from pagereload
    const { newModel, models } = this.state;
    if (newModel.trim() !== '') { //check if the new value is empty
      this.setState({
        models: [...models, newModel.trim()],  //setstate
        newModel: ''
      });
    }
  }

  render() {
    return (
      <div style={{ width: '300px', margin: '40px auto', fontFamily: 'Arial' }}>
        <h2>Television Manager</h2>
        <form onSubmit={this.handleAddModel}>
          <input
            type="text"
            value={this.state.newModel}
            onChange={this.handleChange}
            placeholder="Add a television model"
            style={{ width: '70%', marginRight: '10px' }}
          />
          <button type="submit">Add</button>
        </form>
        <TelevisionList models={this.state.models} />
      </div>
    );
  }
}

export default TelevisionManager;
