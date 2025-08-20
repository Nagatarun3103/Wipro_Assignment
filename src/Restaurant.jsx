import React, { Component } from 'react';
import Menulist from './Menulist';

class Restaurant extends Component {
  constructor(props) {
    super(props);
    this.menu = [
      { name: "Paneer Butter Masala", price: 150, category: "Main Course", available: true },
      { name: "Chicken Biryani", price: 200, category: "Main Course", available: true },
      { name: "Masala Dosa", price: 80, category: "Breakfast", available: true },
      { name: "Gulab Jamun", price: 40, category: "Dessert", available: false },
      { name: "Veg Thali", price: 120, category: "Combo", available: true }
    ];
  }

  render() {
    const restaurantName = "Spice Hub";
    const location = "Block B, First Floor";
    const openHours = "10:00 AM - 10:00 PM";
    return (
      <div>
        <h2>Restaurant Name: {restaurantName}</h2>
        <p>Location: {location}</p>
        <p>Open Hours: {openHours}</p>
        <h3>Restaurant Menu:</h3>
        <ul>
          {this.menu.map((item, index) => (
            <Menulist
              key={index}
              name={item.name}
              price={item.price}
              category={item.category}
              available={item.available}
            />
          ))}
        </ul>
      </div>
    );
  }
}

export default Restaurant;