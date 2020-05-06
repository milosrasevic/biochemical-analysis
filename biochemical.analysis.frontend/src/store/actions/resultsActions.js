import { SEND_RESULTS } from './actionTypes';

export const sendResults = payload => {
    return {
        type: SEND_RESULTS,
        payload
    }
}