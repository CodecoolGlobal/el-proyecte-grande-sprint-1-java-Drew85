// import {useState, useContext, createContext} from "react";
//
// const UserContext = createContext({});
// const getToken = () => window.localStorage.getItem("token");
// const setToken = (token) => window.localStorage.setItem(token);
//
// const UserProviderOld = ({children}) => {
//     const [user, setUser] = useState();
//
//
//     const login = (creds) => {
//         fetch("/login", {
//             method: "POST",
//             headers: {
//                 "Content-Type": "application/json",
//             },
//             body: JSON.stringify(creds),
//         })
//             .then((res) => res.json())
//             .then((res) => {
//                 const { token } = res;
//                 if (token) {
//                     setToken(token);
//                 }
//             });
//     };
//     const logout = () => {
//         setUser(null);
//         setToken("");
//     }
//
//     return (
//         <UserContext.Provider value={{ user, login, logout }}>
//             {children}
//         </UserContext.Provider>
//     );
// }
// export const useUser = () => useContext(UserContext)
// export default UserProviderOld;
