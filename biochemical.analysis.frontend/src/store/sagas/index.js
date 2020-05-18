import { all, takeLatest } from 'redux-saga/effects';
import { SEND_RESULTS, HANDLE_CHANGE } from '../actions/actionTypes';
import { resultsSend, changeHandle } from './resultsSagas';

export default function* rootSaga() {
    yield all([
        takeLatest(SEND_RESULTS, resultsSend),
        takeLatest(HANDLE_CHANGE, changeHandle)
    ])
}