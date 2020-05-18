import React, { Component } from 'react'
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class ElectrolytesAnalysis extends Component {
   
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }


    render() {
        return (
            <div className="col border rounded background-white">
                <h6 className="mt-2">Electrolytes</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputSodium" className="ml-4">Sodium:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="sodium" value={this.props.sodium} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputSodium"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputPotassium" className="ml-4">Potassium:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="potassium" value={this.props.potassium} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputPotassium"/>
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
        sodium: state.sodium,
        potassium: state.potassium
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(ElectrolytesAnalysis);