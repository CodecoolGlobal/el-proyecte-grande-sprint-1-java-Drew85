import logo from './logo.svg';
import './App.css';
import ButtonAppBar from "./components/Navbar";
import DropdownList from "./components/Dropdown";
import {BrowserRouter, Route, Router, Routes} from "react-router-dom";
import Button from "@mui/material/Button";
import LinkToFlights from "./components/RoutleLink";


function App() {
  return (
    <div className={"App"}>

      <ButtonAppBar/>

        <DropdownList/>
        <BrowserRouter>
            <LinkToFlights/>
            <Routes>
                <Route path={"/flights"} element={<LinkToFlights/>}></Route>
            </Routes>
        </BrowserRouter>



    </div>
  );
}

export default App;
