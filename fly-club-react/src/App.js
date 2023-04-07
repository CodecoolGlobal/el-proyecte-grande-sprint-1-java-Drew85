import './App.css';

import ButtonAppBar from "./components/Navbar";
import DropdownList from "./components/Dropdown";
import DropdownPlaneTypes from "./components/DropdownPlaneTypes";


import "./index.css";



import React, {useState, useEffect} from 'react';
import axios from 'axios';

import fahegy from "./static/Fahegy3.jpg";

function App() {
    const [users, setUsers] = useState(undefined);
    const [planes, setPlanes] = useState(undefined);

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios(
                `/user`);
            setUsers(result.data);
        };
        fetchData();

        const fetchPlanes = async () => {
            const result = await axios(
                `/planes`);
            setPlanes(result.data);
        };
        fetchPlanes();
    }, []);

    return (

        <div className="App">

            <ButtonAppBar/>
            <DropdownList/>
            <DropdownPlaneTypes/>
            <ul>
                {!users ? "Loading..." : users.map((user) =>
                    <li key={user.id}>
                        {"| "}
                        {user.name}
                        {"| "}
                        {user.id}
                    </li>
                )}
            </ul>

            <ul>
                {!planes ? "Loading planes..." : planes.map((plane) =>
                    <table key={plane.id}>
                        <td>
                            <tr>
                                {plane.planeType}
                                {" | -Registration num: "}
                                {plane.id}
                                {" | -Cost: "}
                                {plane.flightCost}
                                {" | -OnAir: "}
                                {plane.onAir}
                            </tr>
                        </td>
                    </table>



                )}
            </ul>
            <img style={{width:"80%", height:"80%"}} src={fahegy}/>
        </div>

);
}

export default App;
