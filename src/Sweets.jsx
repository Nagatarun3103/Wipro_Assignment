import React from "react";


const Sweetlist = ({ sweets = [] }) => (
  <div>
    <h2 style={{ fontWeight: 'bold' }}>Sweets List:</h2>
    <ul style={{listStylePosition: "inside", textAlign: "center", paddingLeft: 0}}>
      {sweets.map((sweet) => (
        <li key={sweet.id}>
          Sweet Name: {sweet.name} - Price: ₹{sweet.price}
        </li>
      ))}
    </ul>
  </div>
);


export default Sweetlist;