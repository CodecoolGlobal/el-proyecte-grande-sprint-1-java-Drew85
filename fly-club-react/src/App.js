import './App.css';
import ButtonAppBar from "./components/Navbar";
import DropdownList from "./components/Dropdown";
import fahegy from "./static/Fahegy3.jpg";

import React, {useState, useEffect} from 'react';
import axios from 'axios';
import {Route, Router} from "@mui/icons-material";
import {Switch} from "@mui/joy";
import ClubPage from "./components/ClubPage";

function App() {
    const [users, setUsers] = useState(undefined);

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios(
                `/user`);
            setUsers(result.data);
        };
        fetchData();
    }, []);

    return (

        <div className="App">
            <ButtonAppBar />
            <DropdownList/>
            <img style={{width:"80%", height:"80%"}} src={fahegy}/>
        </div>

);
}

export default App;
