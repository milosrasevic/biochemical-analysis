import React, { Component } from 'react'
import EN from '../../locale-en'
import { sendSymptoms } from '../../store/actions/symptomsActions'
import { connect } from 'react-redux';
import { Link } from 'react-router-dom';

class SymptomsQuestions extends Component {
    constructor(props) {
        super(props);

        this.state = {
            diseases: [],
            symptoms: []
        }
    }
    componentDidMount() {
        let symptoms = JSON.parse(localStorage.getItem("symptoms"));
        this.setState({
            diseases: JSON.parse(localStorage.getItem("diseases")),
            symptoms: symptoms
        });
        symptoms.forEach(symptom => {
            this.setState({
                [symptom]: false
            })
        })
    }

    getDiagnose = () => {
        let presentSymptoms = [];
        let symptom;
        for (symptom in this.state) {
            if (this.state[symptom] === true){
                presentSymptoms.push(symptom);
            }
        }
        let data = {
            diseasesList: this.state.diseases,
            symptoms: presentSymptoms
        }
        this.props.sendSymptoms(data);
    }

    handleCheck = (e) => {
        this.setState({
            [e.target.name]: e.target.checked
        });
    }

    render() {
        return (
            <div className="mx-5 px-5">
                {this.state.diseases.length > 0 ? 
                    (<div>
                        <h3 className="text-center mt-3 mb-3">You could be suffering from the following diseases:</h3>
                        <ul className="list-group text-center mx-5 px-5 mb-3">
                            {this.state.diseases.map(disease => {
                                return (<li className="list-group-item mx-5" key={disease}>{EN.DISEASE[disease]}</li>)
                            })}
                        </ul>
                        
                        <h3 className="mt-5 pt-4 text-center">Please check all the symptoms you are experiencing:</h3>
                        <ul className="row mt-4 mb-3">
                            {this.state.symptoms.map(symptom => {
                                return (
                                    <li className="list-group-item border-top col-xs-6 col-sm-4 col-md-3" key={symptom}>
                                        <div className="container">
                                            <div className="row">
                                                <div className="col-sm-8">
                                                    <label htmlFor={symptom} className="mt-3">{EN.SYMPTOM[symptom]}:</label>
                                                </div>
                                                <div className="col-sm">
                                                    <input type="checkbox" name={symptom} checked={this.state[symptom]} onChange={this.handleCheck} className="form-control my-form-control mt-3" id={symptom}/>
                                                </div>
                                                
                                            </div>
                                        </div>
                                    </li>
                                )
                            })}
                        </ul>
                        <div className="container text-center">
                            <div className="row">
                                <div className="col text-right">
                                    <Link to="/"><button className="btn btn-outline-danger">Back</button></Link>
                                </div>
                                <div className="col text-left">
                                    <button className="btn btn-primary" onClick={this.getDiagnose}>Get diagnose</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    ) : (
                    <div className='text-center mt-5'>
                        <h3 className="text-center mt-3 mb-3 text-success">Everything seems to be okay with your results!</h3>
                        <Link to="/"><button className="btn btn-outline-primary mt-5">Go back</button></Link>
                    </div>
                    )
                }
            </div>
        )
    }
}

const mapDispatchToProps = {
    sendSymptoms
}

export default connect(null, mapDispatchToProps)(SymptomsQuestions)