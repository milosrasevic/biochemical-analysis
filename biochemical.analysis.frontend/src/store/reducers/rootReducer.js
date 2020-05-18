import { SET_CHANGE } from '../actions/actionTypes';
 
const initState = {
    // leukocytes: '',
    // erythrocytes: '',
    // thrombocytes: '',
    // hematocrit: '',
    // hemoglobin: '',
    // serumLook: '',
    // glucose: '',
    // cholesterol: '',
    // HDLcholesterol: '',
    // LDLcholesterol: '',
    // triglycerides: '',
    // fibrinogen: '',
    // proteins: false,
    // PT: '',
    // iron: '',
    // alkalinePhospatase: '',
    // uricAcid: '',
    // sodium: '',
    // potassium: '',
    // urea: '',
    // creatinine: '',
    // ALT: '',
    // AST: '',
    // gamaGT: '',
    // bilirubin: '',
    // protein: '',
    // glucoseUrine: '',
    // urobilinogen: false,
    // bilirubinUrine: false,
    // ketones: false,
    // leukocytesUrine: false,
    // bacteria: false,
    // yeast: false,
    // cylinders: false,
    // semen: false
}

const rootReducer = (state = initState, action) => {
    switch (action.type) {
        case SET_CHANGE:
            return { ...state, [action.payload.name]: action.payload.value }
        default:
            return state;
    }
    
}

export default rootReducer;