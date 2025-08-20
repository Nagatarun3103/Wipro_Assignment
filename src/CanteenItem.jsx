import React from "react";

const CanteenItem = ({ name, price , category, available}) =>
    (//presentational component
    <li>
        <b>{name}</b> – Price: ₹{price} – Category: {category}  {/*b is to bold */}
{available === "No" ? " – Not Available" : ""}
    </li>

);
export default CanteenItem;