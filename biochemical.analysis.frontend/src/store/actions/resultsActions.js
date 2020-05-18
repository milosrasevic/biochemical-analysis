import { SEND_RESULTS, HANDLE_CHANGE, SET_CHANGE, HANDLE_SUBMIT } from './actionTypes';

export const sendResults = payload => {
    return {
        type: SEND_RESULTS,
        payload
    }
}

export const handleChange = payload => {
    return {
        type: HANDLE_CHANGE,
        payload
    }
}

export const setChange = payload => {
    return {
        type: SET_CHANGE,
        payload
    }
}

export const handleSubmit = () => {
    return {
        type: HANDLE_SUBMIT
    }
}