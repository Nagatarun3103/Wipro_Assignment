import React from 'react';
import Juice from './Juice'; // Capital "J", singular, matches Juice.jsx

const juices = [
  { id: 1, name: 'Orange Juice', price: 80 },
  { id: 2, name: 'Apple Juice', price: 100 },
  { id: 3, name: 'Mango Juice', price: 120 },
];

const JuiceList = () => (
  <div style={{ textAlign: 'center' }}>
    <h2>
      <span role="img" aria-label="juice">🥤</span> Juice Menu
    </h2>
    <table style={{ margin: '0 auto', borderCollapse: 'collapse' }}>
      <thead>
        <tr>
          <th style={{ border: '1px solid black', padding: '10px' }}>ID</th>
          <th style={{ border: '1px solid black', padding: '10px' }}>Juice Name</th>
          <th style={{ border: '1px solid black', padding: '10px' }}>Price</th>
        </tr>
      </thead>
      <tbody>
        {juices.map(juice => (
          <Juice key={juice.id} {...juice} />
        ))}
      </tbody>
    </table>
  </div>
);

export default JuiceList;
