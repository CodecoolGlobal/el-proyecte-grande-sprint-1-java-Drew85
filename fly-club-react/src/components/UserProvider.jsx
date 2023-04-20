import {
  createContext,
  useCallback,
  useContext,
  useEffect,
  useState,
} from "react";

const UserContext = createContext({});

const getToken = () => window.localStorage.getItem("token");
const setToken = (token) => window.localStorage.setItem("token", token);

const UserProvider = ({ children }) => {
  const [user, setUser] = useState();
  const [loading, setLoading] = useState(true);

  const getMe = useCallback((token) => {
    fetch("/login", {
      headers: {
        authorization: `bearer ${token}`,
      },
    })
      .then((r) => r.json())
      .then((user) => {
        setUser(user);
      })
      .finally(() => {
        setLoading(false);
      });
  }, []);

  const login = (creds) => {
    fetch("/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(creds),
    })
        .then((res) => res.json())
        .then((res) => {
          const { token } = res;
          if (token) {
            setToken(token);
            getMe(token);
          }
        });
  };

  useEffect(() => {
    const token = getToken();

    if (!token) {
      setLoading(false);
      return;
    }

    getMe(token);
  }, []);

    const logout = () => {
      setUser(null);
      setToken("");
    }

  return (
    <UserContext.Provider value={{ user, login, logout }}>
      {!loading && children}
    </UserContext.Provider>
  );
};

export const useUser = () => useContext(UserContext);

export default UserProvider;
