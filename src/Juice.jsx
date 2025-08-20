import React from 'react';

// Arrow functional presentational component
const Juice = ({ id, name, price }) => (
  <tr>
    <td>{id}</td>
    <td>{name}</td>
    <td>₹{price}</td>
  </tr>
);

export default Juice;
