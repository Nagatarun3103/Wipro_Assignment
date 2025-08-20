import React from "react";

function GroceryList({items}){  // functional component with items properties
    const handleAddtocart =() =>{
        alert('Groceries Added to Cart!');
    }

return (
    <div> GroceryList : 
    <ul style={{
  listStylePosition: "inside", //moves the bull point
  textAlign: "center",  // which center the text
  paddingLeft: 0
}}>
        {items.map((item, index) => (  //
          <li key={item + index}>{item}</li>
        ))}
      </ul>

    <button onClick={handleAddtocart}>Add to cart</button>
</div>
);
}
export default GroceryList;