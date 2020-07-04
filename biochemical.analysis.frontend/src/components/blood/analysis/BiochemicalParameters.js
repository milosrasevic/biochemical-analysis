import React, { Component } from 'react'
import { connect } from 'react-redux';
import { handleChange } from '../../../store/actions/resultsActions';


class BiochemicalParameters extends Component {
    
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white">
                <h6 className="mt-2">Biochemical parameters</h6>
                <div className="form-group my-form-group mt-3">
                    <label htmlFor="inputSerumLook">Serum look:</label>
                    <select name="serumLook" value={this.props.serumLook} onChange={this.handleChange} className="form-control w-75 mx-auto" id="inputSerumLook">
                        <option value="NORMAL">NORMAL</option>
                        <option value="HEMOLYTIC">HEMOLYTIC</option>
                        <option value="ICTERIC">ICTERIC</option>
                        <option value="LIPEMIC">LIPEMIC</option>
                    </select>
                </div>
                <div className="form-group my-form-group mt-5 text-left">
                    <label htmlFor="inputGlucose" className="ml-4">Glucose:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="glucose" value={this.props.glucose} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputGlucose"/>
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
        serumLook: state.results.serumLook,
        glucose: state.results.glucose
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(BiochemicalParameters)