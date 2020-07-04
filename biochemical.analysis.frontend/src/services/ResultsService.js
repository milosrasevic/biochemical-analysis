import ApiService from './ApiService';

const ENDPOINTS = {
    RESULTS: '/results'
}

class ResultsService extends ApiService {
    sendResults = (results) => {
        let nonEmptyFields = [];
        let field;
        for (field in results) {
            let fieldValue = results[field]; 
            if(!(/\s/.test(fieldValue) || fieldValue === '')) {
                nonEmptyFields[field] = fieldValue
            }
        }

        let data = {
            bloodAnalysis: {
                blood: {
                    leukocytes: nonEmptyFields.leukocytes || null,
                    erythrocytes: nonEmptyFields.erythrocytes || null,
                    thrombocytes: nonEmptyFields.thrombocytes || null,
                    hematocrit: nonEmptyFields.hematocrit || null,
                    hemoglobin: nonEmptyFields.hemoglobin || null
                },
                biochemicalParameters: {
                    serumLook: nonEmptyFields.serumLook || null,
                    glucose: nonEmptyFields.glucose || null
                },
                fat: {
                    cholesterol: nonEmptyFields.cholesterol || null,
                    hdlCholesterol: nonEmptyFields.hdlCholesterol || null,
                    ldlCholesterol: nonEmptyFields.ldlCholesterol || null,
                    triglycerides: nonEmptyFields.triglycerides || null
                },
                otherParameters: {
                    fibrinogen: nonEmptyFields.fibrinogen || null,
                    proteins: nonEmptyFields.proteins || null,
                    pt: nonEmptyFields.pt || null
                }
            },
            bonesAnalysis: {
                boneMarrow: {
                    iron: nonEmptyFields.iron || null,
                },
                bonesCondition: {
                    alkalinePhosphatase: nonEmptyFields.alkalinePhosphatase || null,
                },
                jointsCondition: {
                    uricAcid: nonEmptyFields.uricAcid || null
                }
            },
            electrolytes: {
                sodium: nonEmptyFields.sodium || null,
                potassium: nonEmptyFields.potassium || null
            },
            organsAnalysis: {
                kidneysCondition: {
                    urea: nonEmptyFields.urea || null,
                    creatinine: nonEmptyFields.creatinine || null
                },
                liverCondition: {
                    ALT: nonEmptyFields.ALT || null,
                    AST: nonEmptyFields.AST || null,
                    gamaGT: nonEmptyFields.gamaGT || null,
                    bilirubin: nonEmptyFields.bilirubin || null
                }
            },
            urineAnalysis: {
                urine: {
                    urineColor: nonEmptyFields.urineColor || null,
                    protein: nonEmptyFields.protein || null,
                    glucose: nonEmptyFields.glucoseUrine || null,
                    urobilinogen: nonEmptyFields.urobilinogen || null,
                    bilirubinUrine: nonEmptyFields.bilirubinUrine || null,
                    ketones: nonEmptyFields.ketones || null,
                    leukocytesUrine: nonEmptyFields.leukocytesUrine || null,
                    bacteria: nonEmptyFields.bacteria || null,
                    yeast: nonEmptyFields.yeast || null,
                    cylinders: nonEmptyFields.cylinders || null,
                    semen: nonEmptyFields.semen || null
                }
            },
            gender: 0
        }

        return this.apiClient.post(ENDPOINTS.RESULTS, data);
    }
}

export const resultsService = new ResultsService();