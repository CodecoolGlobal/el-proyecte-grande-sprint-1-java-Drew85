import React, {useEffect, useState} from 'react';
import Button from "@mui/material/Button";
import axios from "axios";

export default function DropdownList() {
    const [club, setClub] = useState('');
    const [clubs, setClubs] = useState([]);

    function handleSave() {
        fetch('/user/add-club', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ club: club })
        })
            .then(response => {
                if (response.ok) {
                    console.log('Club added to user!');
                } else {
                    console.error('Error adding club to user:', response.status);
                }
            })
            .catch(error => {
                console.error('Error adding club to user:', error);
            });
    }

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios(
                `/club`);
            setClubs(result.data);
        };
        fetchData();
    }, []);

    return (
        <div>
            <select value={club} onChange={e => setClub(e.target.value)}>
                <option value="">Choose a club</option>
                {clubs.map(cclub => (
                    <option value={cclub.id}>{cclub.name}</option>
                ))}
            </select>
            <Button onClick={handleSave} size="sm">Select</Button>
        </div>
    );
}
