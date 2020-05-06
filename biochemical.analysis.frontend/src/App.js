import React from 'react';
import Homepage from './components/Homepage';
import { Provider } from 'react-redux';
import store from './store';

function App() {
  return (
    <Provider store={store}>
      <div className="text-center mt-4">
        <h1>Welcome</h1>
        <Homepage/>
      </div>
    </Provider>
  );
}

export default App;
