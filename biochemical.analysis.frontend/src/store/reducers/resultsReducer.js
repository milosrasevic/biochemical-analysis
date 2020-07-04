import { SET_CHANGE } from '../actions/actionTypes';
 
const initState = {
    leukocytes: '',
    erythrocytes: '',
    thrombocytes: '',
    hematocrit: '',
    hemoglobin: '',
    serumLook: 'NORMAL',
    glucose: '',
    cholesterol: '',
    hdlCholesterol: '',
    ldlCholesterol: '',
    triglycerides: '',
    fibrinogen: '',
    proteins: false,
    pt: '',
    iron: '',
    alkalinePhosphatase: '',
    uricAcid: '',
    sodium: '',
    potassium: '',
    urea: '',
    creatinine: '',
    ALT: '',
    AST: '',
    gamaGT: '',
    bilirubin: '',
    urineColor: 'CLEAR',
    protein: '',
    glucoseUrine: '',
    urobilinogen: false,
    bilirubinUrine: false,
    ketones: false,
    leukocytesUrine: false,
    bacteria: false,
    yeast: false,
    cylinders: false,
    semen: false
}

const resultsReducer = (state = initState, action) => {
    switch (action.type) {
        case SET_CHANGE:
            return { ...state, [action.payload.name]: action.payload.value };
        default:
            return state;
    }
    
}

export default resultsReducer;