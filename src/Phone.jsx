import React,{useState} from "react"; //changeable data in line 5

const Phone =() =>{   //using arrow fuction

    const[price ,setprice]=useState(7999);

    const model = 'iphone15';
    const brand = 'Apple';

    const handleIncreaseprice = () =>{
        setprice(prevPrice => prevPrice+1000); 
    };


return (
    <div >
      <h1>
        <span role="img" aria-label="phone">📱</span> Phone Details
      </h1>
      <p>Brand: {brand}</p>
      <p>Model: {model}</p>
      <p>Price: ₹{price}</p>
      <button 
        style={{padding: "15px 50px", backgroundColor: "#1877f2", color: "#fff", fontSize: "20px", border: "none", borderRadius: "8px", cursor: "pointer"}}
        onClick={handleIncreaseprice}
      >
        Increase Price
      </button>
    </div>
  );



};

export default Phone;

