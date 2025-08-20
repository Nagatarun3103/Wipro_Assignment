import React, { useState } from "react";

function Electronic() {
                                             
  const [name] = useState("Laptop");   // useing usestate hooks to manage item details
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(5500);

  
  const handleBrandChange = () => {  // arrow funtion
    setBrand("HP"); 
  };

  
  const handlePriceIncrease = () => {  // to increase the price
    setPrice(prevPrice => prevPrice + 500);
  };

  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <h2 style={{ fontSize: "2rem" }}>
        <span role="img" aria-label="plug">🔌</span> Electronic Item Details
      </h2>
      <div style={{ fontSize: "1.3rem", margin: "18px 0" }}>
        <div><b>Name:</b> {name}</div>
        <div><b>Brand:</b> {brand}</div>
        <div><b>Price:</b> ₹{price}</div>
      </div>
      <button
        onClick={handleBrandChange}
        style={{
          padding: "10px 25px",
          marginRight: "16px",
          border: "1px solid #bbb",
          borderRadius: "8px",
          background: "#f4f4f4",
          fontSize: "1rem"
        }}
      >
        Change Brand
      </button>
      <button
        onClick={handlePriceIncrease}
        style={{
          padding: "10px 25px",
          background: "#2979ff",
          color: "white",
          border: "1px solid #2979ff",
          borderRadius: "8px",
          fontSize: "1rem"
        }}
      >
        Increase Price
      </button>
    </div>
  );
}

export default Electronic;
