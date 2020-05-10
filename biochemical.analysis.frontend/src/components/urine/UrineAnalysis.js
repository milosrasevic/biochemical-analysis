import React, { Component } from 'react'

class UrineAnalysis extends Component {
    constructor(props) {
        super(props)

        this.state = {
            protein: '',
            glucose: '',
            urobilinogen: false,
            bilirubin: false,
            ketones: false,
            leukocytes: false,
            bacteria: false,
            yeast: false,
            cylinders: false,
            semen: false
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="row mt-2">
                <div className="container mt-4 mx-2 pb-2">
                    <h6>Urine analysis</h6>
                    <div className="row border rounded">
                        <div className="col">
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputUrobilinogen">Urobilinogen:</label>
                                    <input type="checkbox" name="urobilinogen" value={this.state.urobilinogen} onChange={this.handleChange} className="form-control my-form-control" id="inputUrobilinogen"/>
                                </div>
                            
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputBilirubin">Bilirubin:</label>
                                    <input type="checkbox" name="bilirubin" value={this.state.bilirubin} onChange={this.handleChange} className="form-control my-form-control" id="inputBilirubin"/>
                                </div>
                            </div>
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputKetones">Ketones:</label>
                                    <input type="checkbox" name="ketones" value={this.state.ketones} onChange={this.handleChange} className="form-control my-form-control" id="inputKetones"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputLeukocytes">Leukocytes:</label>
                                    <input type="checkbox" name="leukocytes" value={this.state.leukocytes} onChange={this.handleChange} className="form-control my-form-control" id="inputLeukocytes"/>
                                </div>
                            </div>
                            <div className="row mx-5 mb-3">
                                <div className="form-group my-form-group col mx-5 text-left">
                                    <label htmlFor="inputProtein" className="ml-4">Protein:</label>
                                    <div className="row">
                                        <div className="col">
                                            <input type="text" name="protein" value={this.state.protein} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputProtein"/>
                                        </div>
                                        <div className="col-2 mr-5">
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
                                    <input type="checkbox" name="bacteria" value={this.state.bacteria} onChange={this.handleChange} className="form-control my-form-control" id="inputBacteria"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputYeast">Yeast:</label>
                                    <input type="checkbox" name="yeast" value={this.state.yeast} onChange={this.handleChange} className="form-control my-form-control" id="inputYeast"/>
                                </div>
                            </div>
                            <div className="row">
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputCylinders">Cylinders:</label>
                                    <input type="checkbox" name="cylinders" value={this.state.cylinders} onChange={this.handleChange} className="form-control my-form-control" id="inputCylinders"/>
                                </div>
                                <div className="form-group my-form-group mb-4 col">
                                    <label htmlFor="inputSemen">Semen:</label>
                                    <input type="checkbox" name="semen" value={this.state.semen} onChange={this.handleChange} className="form-control my-form-control" id="inputSemen"/>
                                </div>
                            </div>
                            <div className="row mx-5 mb-3">
                                <div className="form-group my-form-group col mx-5 text-left">
                                    <label htmlFor="inputGlucose" className="ml-4">Glucose:</label>
                                    <div className="row">
                                        <div className="col">
                                            <input type="text" name="glucose" value={this.state.glucose} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputGlucose"/>
                                        </div>
                                        <div className="col-2 mr-5">
                                            mg/D
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default UrineAnalysis;