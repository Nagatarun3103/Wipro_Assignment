import React, { useState } from "react";

const BakingItemForm = () =>{  //arrow functional
    const [form, setform] = useState({  //
        itemName:'',
        quantity:'',
         ingredients:'',
         bakingTime:'',
         category:'Cake',
         
    });
    const [bakinItems, setBakingItems] = useState([]); //list of submitted items

    const handleChange = (e) =>{ //Handle change in form inputs
        const {name, value } = e.target; 
        setform({
            ...form,[name]:value  //spread operator
        });

    };

    const handleSubmit = (e) =>{
        e.preventDefault();
        setBakingItems([...setBakingItems, form]); //for adding new item to array
        setform({
            itemName:'',
            quantity:'',
            ingredients:'',
            bakingTime:'',
            category:'Cake'
        });
    };


  return (
    <div className="container mt-4">
      <div className="card p-4">
        <h3>🧁 Baking Items Form</h3>
        {/* Form start */}
        <form onSubmit={handleSubmit}>
          {/* Text input */}
          <div className="mb-2">
            <label>Item Name</label>
            <input
              type="text"
              className="form-control"
              name="itemName"
              value={form.itemName}
              onChange={handleChange}
              required
            />
          </div>

          {/* Number input */}
          <div className="mb-2">
            <label>Quantity</label>
            <input
              type="number"
              className="form-control"
              name="quantity"
              value={form.quantity}
              onChange={handleChange}
              min="1"
              required
            />
          </div>

          {/* Textarea */}
          <div className="mb-2">
            <label>Ingredients</label>
            <textarea
              className="form-control"
              name="ingredients"
              value={form.ingredients}
              onChange={handleChange}
              required
            />
          </div>

          {/* Number input */}
          <div className="mb-2">
            <label>Baking Time (minutes)</label>
            <input
              type="number"
              className="form-control"
              name="bakingTime"
              value={form.bakingTime}
              onChange={handleChange}
              min="1"
              required
            />
          </div>

          {/* Select dropdown */}
          <div className="mb-2">
            <label>Category</label>
            <select
              className="form-control"
              name="category"
              value={form.category}
              onChange={handleChange}
            >
              <option value="Cake">Cake</option>
              <option value="Bread">Bread</option>
              <option value="Pastry">Pastry</option>
            </select>
          </div>

          {/* Submit button */}
          <button className="btn btn-success mt-2" type="submit">
            Add Baking Item
          </button>
        </form>
      </div>

      {/* Display submitted baking items in table */}
      <div className="mt-4">
        <h4>Baking Items List</h4>
        <table className="table table-striped table-bordered">
          <thead>
            <tr>
              <th>#</th>
              <th>Item Name</th>
              <th>Quantity</th>
              <th>Ingredients</th>
              <th>Baking Time (mins)</th>
              <th>Category</th>
            </tr>
          </thead>
          <tbody>
            {bakingItems.map((item, idx) => (
              <tr key={idx}>
                <td>{idx + 1}</td>
                <td>{item.itemName}</td>
                <td>{item.quantity}</td>
                <td>{item.ingredients}</td>
                <td>{item.bakingTime}</td>
                <td>{item.category}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default BakingItemsForm;


