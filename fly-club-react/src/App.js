import logo from './logo.svg';
import './App.css';

import React, {useState, useEffect} from 'react';
import axios from 'axios';
function App() {
    const [users, setUsers] = useState(undefined);

    useEffect(() => {
      const fetchData = async () => {
          const result  = await axios(
              `/user`);
          setUsers(result.data);
      };
      fetchData();
    }, []);

    return (
        <div className="App">
            <ul>
                {!users ? "Loading..." : users.map((user) =>
                    <li key={user.id}>
                        {user.name}
                        {user.id}
                    </li>
                )}
            </ul>
        </div>
    );
}
export default App;


{/*<header className="App-header">*/
}
{/*  <img src={logo} className="App-logo" alt="logo" />*/
}
{/*  <p>*/
}
{/*    Edit <code>src/App.js</code> and save to reload.*/
}
{/*  </p>*/
}
{/*  <a*/
}
{/*    className="App-link"*/
}
{/*    href="https://reactjs.org"*/
}
{/*    target="_blank"*/
}
{/*    rel="noopener noreferrer"*/
}
{/*  >*/
}
{/*    Learn React*/
}
{/*  </a>*/
}
{/*</header>*/
}

// useEffect(() => {
//     fetch(`http://localhost:8080/user`)
//         .then(res => (res.json()))
//         .then(({users}) => setUsers((users)))
// });