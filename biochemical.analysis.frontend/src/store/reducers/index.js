import { combineReducers } from 'redux';
import { connectRouter } from 'connected-react-router';

import resultsReducer from './resultsReducer';

export default history =>
  combineReducers({
    results: resultsReducer,
    router: connectRouter(history)
  });
