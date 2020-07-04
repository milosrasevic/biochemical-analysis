import React, { Component } from 'react'
import { Link } from 'react-router-dom';

class Diagnose extends Component {
    constructor(props) {
        super(props);

        this.state = {
            highChanceDiseases: [],
            possibleDiseases: [],
            mostLikelyDisease: ''
        }
    }

    componentDidMount() {
        this.setState({
            highChanceDiseases: JSON.parse(localStorage.getItem("highChanceDiseases")),
            possibleDiseases: JSON.parse(localStorage.getItem("possibleDiseases")),
            mostLikelyDisease: JSON.parse(localStorage.getItem("mostLikelyDisease"))
        });
    }

    render() {
        return (
            <div className="mx-5 px-5">
                {this.state.mostLikelyDisease !== '' && <div className="border-bottom "> 
                    <h3 className="text-center mt-5 mb-3">You are most likely suffering from: </h3> 
                    <h2 className="text-center text-danger">{this.state.mostLikelyDisease}</h2>
                </div>
                }
                {this.state.highChanceDiseases.length > 0 && <div className="border-bottom">
                    <h3 className="mt-5 pt-4 text-center pb-2 border-bottom">All diseases with high chance of having: </h3>
                    <ul className="list-group text-center mx-5 px-5 mb-3">
                        {this.state.highChanceDiseases.map(disease => {
                            return (<li className="list-group-item mx-5" key={disease}>{disease}</li>)
                        })}
                    </ul>
                    </div>
                }
                 {this.state.possibleDiseases.length > 0 && <div className="border-bottom">
                    <h3 className="mt-5 pt-4 text-center pb-2 border-bottom">All diseases with a possibility of having: </h3>
                    <ul className="list-group text-center mx-5 px-5 mb-3">
                        {this.state.possibleDiseases.map(disease => {
                            return (<li className="list-group-item mx-5" key={disease}>{disease}</li>)
                        })}
                    </ul>
                    </div>
                }
                {(this.state.possibleDiseases.length === 0 && this.state.highChanceDiseases.length === 0) && <div className="border-bottom">
                    <h3 className="mt-5 pt-4 text-center pb-2 border-top">Judging by the symptoms you have selected, it seems that you are not suffering
                        from any illness. </h3>
                    <h3 className="text-center mt-5">
                        You should still see a doctor because some of your results were not okay.
                    </h3>
                    </div>
                }
                <div className="text-center">
                    <Link to="/"><button className="btn btn-outline-primary mt-5">Back to homepage</button></Link>
                </div>
            </div>
        )
    }
}

export default Diagnose