import React, { Component } from 'react'
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class KidneysAnalysis extends Component {
    
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded background-white mx-1">
                <h6 className="mt-2">Kidneys condition</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputUrea" className="ml-4">Urea:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="urea" value={this.props.urea} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputUrea"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputCreatinine" className="ml-4">Creatinine:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="creatinine" value={this.props.creatinine} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputCreatinine"/>
                        </div>
                        <div className="col-2 mr-5">
                            mg/dL
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        urea: state.results.urea,
        creatinine: state.results.creatinine
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(KidneysAnalysis);
