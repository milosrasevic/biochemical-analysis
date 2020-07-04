import React, { Component } from 'react'
import { handleChange } from '../../store/actions/resultsActions';
import { connect } from 'react-redux';

class UrineAnalysis extends Component {
    
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    handleCheck = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.checked
        });
    }

    render() {
        return (
            <div className="row mt-1">
                <div className="container mt-2 mx-2 pb-2">
                    <h6>Urine analysis</h6>
                    <div className="row border background-white rounded pt-2">
                        <div className="col">
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputUrobilinogen">Urobilinogen:</label>
                                    <input type="checkbox" name="urobilinogen" checked={this.props.urobilinogen} onChange={this.handleCheck} className="form-control my-form-control" id="inputUrobilinogen"/>
                                </div>
                            
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputBilirubin">Bilirubin:</label>
                                    <input type="checkbox" name="bilirubinUrine" checked={this.props.bilirubinUrine} onChange={this.handleCheck} className="form-control my-form-control" id="inputBilirubin"/>
                                </div>
                            </div>
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputKetones">Ketones:</label>
                                    <input type="checkbox" name="ketones" checked={this.props.ketones} onChange={this.handleCheck} className="form-control my-form-control" id="inputKetones"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputLeukocytes">Leukocytes:</label>
                                    <input type="checkbox" name="leukocytesUrine" checked={this.props.leukocytesUrine} onChange={this.handleCheck} className="form-control my-form-control" id="inputLeukocytes"/>
                                </div>
                            </div>
                            <div className="row mb-3">
                                <div className="form-group my-form-group col mx-5 text-left">
                                    <label htmlFor="inputProtein" className="ml-4">Protein:</label>
                                    <div className="row">
                                        <div className="col">
                                            <input type="text" name="protein" value={this.props.protein} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputProtein"/>
                                        </div>
                                        <div className="col-2 mr-2">
                                            mg/D
                                        </div>
                                    </div>
                                </div>
                                <div className="form-group my-form-group col text-left">
                                    <label htmlFor="inputGlucoseUrine" className="ml-4">Glucose:</label>
                                    <div className="row">
                                        <div className="col">
                                            <input type="text" name="glucoseUrine" value={this.props.glucoseUrine} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputGlucoseUrine"/>
                                        </div>
                                        <div className="col-2 mr-2">
                                            mg/D
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col">
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputBacteria">Bacteria:</label>
                                    <input type="checkbox" name="bacteria" checked={this.props.bacteria} onChange={this.handleCheck} className="form-control my-form-control" id="inputBacteria"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputYeast">Yeast:</label>
                                    <input type="checkbox" name="yeast" checked={this.props.yeast} onChange={this.handleCheck} className="form-control my-form-control" id="inputYeast"/>
                                </div>
                            </div>
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputCylinders">Cylinders:</label>
                                    <input type="checkbox" name="cylinders" checked={this.props.cylinders} onChange={this.handleCheck} className="form-control my-form-control" id="inputCylinders"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputSemen">Semen:</label>
                                    <input type="checkbox" name="semen" checked={this.props.semen} onChange={this.handleCheck} className="form-control my-form-control" id="inputSemen"/>
                                </div>
                            </div>
                            <div className="row mx-5 mb-3">
                                <div className="form-group my-form-group col mx-5 text-left">
                                <label htmlFor="inputSerumLook">Urine color:</label>
                                <select name="urineColor" value={this.props.urineColor} onChange={this.handleChange} className="form-control w-75 mx-auto" id="urineColor">
                                    <option value="NORMAL">CLEAR</option>
                                    <option value="YELLOW">YELLOW</option>
                                    <option value="PINK">PINK</option>
                                    <option value="ORANGE">ORANGE</option>
                                    <option value="DARK_BROWN">DARK_BROWN</option>
                                </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        urineColor: state.results.urineColor,
        protein: state.results.protein,
        glucoseUrine: state.results.glucoseUrine,
        urobilinogen: state.results.urobilinogen,
        bilirubinUrine: state.results.bilirubinUrine,
        ketones: state.results.ketones,
        leukocytesUrine: state.results.leukocytesUrine,
        bacteria: state.results.bacteria,
        yeast: state.results.yeast,
        cylinders: state.results.cylinders,
        semen: state.results.semen
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(UrineAnalysis);