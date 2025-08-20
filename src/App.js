import React from 'react';
import GroceryList from './Grocery';
import Car from './Car'
import Phone from './Phone';
import Sweetlist from './Sweets';
import Electronic from './Electronic';
import JuiceList from './Juicelist';
import Fruits from './Fruits';
import TelevisionManager from './Television';
import MarriageForm from './MarriageForm';
import Restaurant from './Restaurant';
import TempleList from './Templelist';



const sweets = [
  { id: 1, name: "Laddu", price: 50 },
  { id: 2, name: "Jalebi", price: 40 },
  { id: 3, name: "Rasgulla", price: 60 },
  { id: 4, name: "Gulab Jamun", price: 70 }
];

function App() {
  const groceries = ['Rice', 'Wheat', 'Sugar', 'Milk', 'Oil'];

  return (
    <div style={{textAlign: "center"}}> 
      <GroceryList items={groceries} /> {/*added items*/}
      <Car
        brand="Toyota"
        model="Fortuner"
        colour="Blue"
        year="2022"
      />
      <Phone/>
       <Sweetlist sweets={sweets} />
       <Electronic/>
       <JuiceList/>
      <Restaurant/> 
     <TempleList/>
     <Fruits/>
     <TelevisionManager/>
     <MarriageForm/>
    </div>
  );
}

export default App;