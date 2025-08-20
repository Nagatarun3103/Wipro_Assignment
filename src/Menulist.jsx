import React, { Component } from 'react';

class Menulist extends Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <li>
        {name} - ₹{price} ({category}), {available ? 'Available' : 'Not Available'}
      </li>
    );
  }
}

export default Menulist;
