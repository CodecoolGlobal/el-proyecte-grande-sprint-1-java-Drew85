import './App.css';
import ButtonAppBar from "./components/Navbar";
import DropdownList from "./components/Dropdown";


import React, {useState, useEffect} from 'react';
import axios from 'axios';
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
            <ButtonAppBar/>
            <DropdownList/>
            <ul>
                {!users ? "Loading..." : users.map((user) =>
                    <li key={user.id}>
                        {user.name}
                        {" "}
                        {user.id}
                    </li>

                )}
            </ul>
        </div>
    );
}
export default App;
