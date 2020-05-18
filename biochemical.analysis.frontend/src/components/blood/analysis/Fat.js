import React, { Component } from 'react';
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class Fat extends Component {
    
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded background-white">
                <h6 className="mt-2">Fat</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputCholesterol" className="ml-4">Cholesterol:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="cholesterol" value={this.props.cholesterol} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputCholesterol"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputHDLcholesterol" className="ml-4">HDL Cholesterol:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="HDLcholesterol" value={this.props.HDLcholesterol} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputHDLcholesterol"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputLDLcholesterol" className="ml-4">LDL Cholesterol:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="LDLcholesterol" value={this.props.LDLcholesterol} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputLDLcholesterol"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputTriglycerides" className="ml-4">Triglycerides:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="triglycerides" value={this.props.triglycerides} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputTriglycerides"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        cholesterol: state.cholesterol,
        HDLcholesterol: state.HDLcholesterol,
        LDLcholesterol: state.LDLcholesterol,
        triglycerides: state.triglycerides
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(Fat);
