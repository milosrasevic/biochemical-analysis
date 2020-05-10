import React from 'react';
// import Homepage from './components/Homepage';
import Homepage from './components/Homepage';
import { Provider } from 'react-redux';
import store from './store';

function App() {
  return (
    <Provider store={store}>
      <Homepage/>
    </Provider>
  );
}

export default App;
