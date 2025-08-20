import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

//class component
class MarriageForm extends Component {
  constructor(props) {
    super(props);
    this.state = { //empty string
      bride: '',
      groom: '',
      date: '',
      venue: '',
      submitted: false,
      details: {} //object to hold submitted form data
    };
  }

  handleChange = (e) => { //arrow functional 
    this.setState({ 
      [e.target.name]: e.target.value 
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { bride, groom, date, venue } = this.state;
    this.setState({
      submitted: true,
      details: { bride, groom, date, venue },
      
      
    });
  };

  render() {
    const { bride, groom, date, venue, submitted, details } = this.state;
    return (
      //bootstrap
      <div className="container mt-4">  
        <div className="card p-4 mb-4">
          <h3 className="text-center mb-3">Marriage Form</h3>
          <form onSubmit={this.handleSubmit}>
            <div className="form-group mb-3">
              <label>Bride Name</label>
              <input
                type="text"
                className="form-control"
                name="bride"
                value={bride}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="form-group mb-3">
              <label>Groom Name</label>
              <input
                type="text"
                className="form-control"
                name="groom"
                value={groom}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="form-group mb-3">
              <label>Marriage Date</label>
              <input
                type="date"
                className="form-control"
                name="date"
                value={date}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="form-group mb-4">
              <label>Venue</label>
              <input
                type="text"
                className="form-control"
                name="venue"
                value={venue}
                onChange={this.handleChange}
                required
              />
            </div>
            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
        </div>

        {submitted && (
          <div className="card p-4">
            <h4 className="text-center mb-3">Marriage Details</h4>
            <table className="table">
              <tbody>
                <tr>
                  <th>Bride Name:</th>
                  <td>{details.bride}</td>
                </tr>
                <tr>
                  <th>Groom Name:</th>
                  <td>{details.groom}</td>
                </tr>
                <tr>
                  <th>Date:</th>
                  <td>{details.date}</td>
                </tr>
                <tr>
                  <th>Venue:</th>
                  <td>{details.venue}</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default MarriageForm;
