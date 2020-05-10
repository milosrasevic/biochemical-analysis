import React, { Component } from 'react'

class OtherParameters extends Component {
    constructor(props) {
        super(props)

        this.state = {
            fibrinogen: '',
            proteins: false
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white">
                <h6 className="mt-2">Other parameters</h6>
                <div className="form-group my-form-group  text-left">
                    <label htmlFor="inputFibrinogen" className="mt-2 ml-4">Fibrinogen:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="fibrinogen" value={this.state.fibrinogen} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputFibrinogen"/>
                        </div>
                        <div className="col-2 mr-5">
                            mg/dL
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group mb-4">
                    <label htmlFor="inputProteins" className="mt-3">Proteins:</label>
                    <input type="checkbox" name="proteins" value={this.state.proteins} onChange={this.handleChange} className="form-control my-form-control" id="inputProteins"/>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputPT" className="mt-4 ml-4">PT:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="PT" value={this.state.PT} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputPT"/>
                        </div>
                        <div className="col-2 mr-5">
                            seconds
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default OtherParameters;
