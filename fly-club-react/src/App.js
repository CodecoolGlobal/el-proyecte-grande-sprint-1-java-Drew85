import logo from './logo.svg';
import './App.css';
import ButtonAppBar from "./components/Navbar";
import DropdownList from "./components/Dropdown";


function App() {
  return (
    <div className="App">
      <ButtonAppBar/>
        <DropdownList/>
    </div>
  );
}

export default App;
