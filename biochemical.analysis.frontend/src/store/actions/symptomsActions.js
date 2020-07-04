import { SEND_SYMPTOMS } from "./actionTypes"

export const sendSymptoms = payload => {
    return {
        type: SEND_SYMPTOMS,
        payload
    }
}