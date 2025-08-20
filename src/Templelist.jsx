import React from 'react';

const temples = [
  {
    id: 1,
    name: "Meenakshi Amman Temple",
    location: "Madurai, Tamil Nadu",
    deities: ["Meenakshi", "Sundareswarar"]
  },
  {
    id: 2,
    name: "Sri Venkateswara Temple",
    location: "Tirupati, Andhra Pradesh",
    deities: ["Venkateswara", "Lakshmi"]
  },
  {
    id: 3,
    name: "Jagannath Temple",
    location: "Puri, Odisha",
    deities: ["Jagannath", "Balabhadra", "Subhadra"]
  }
];

const TempleList = () => (
  <div style={{ maxWidth: "700px", margin: "0 auto", fontFamily: "sans-serif" }}>
    <h3>🕉️ Famous Temples in India</h3>
    <table style={{ width: "100%", borderCollapse: "collapse" }}>
      <thead>
        <tr style={{ borderBottom: "1px solid #ccc" }}>
          <th align="left">ID</th>
          <th align="left">Temple Name</th>
          <th align="left">Location</th>
          <th align="left">Deities</th>
        </tr>
      </thead>
      <tbody>
        {temples.map(temple => (
          <tr key={temple.id} style={{ borderBottom: "1px solid #eee" }}>
            <td>{temple.id}</td>
            <td>{temple.name}</td>
            <td>{temple.location}</td>
            <td>
              {temple.deities.map(deity => (
                <div key={deity}>• {deity}</div>
              ))}
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>
);

export default TempleList;

