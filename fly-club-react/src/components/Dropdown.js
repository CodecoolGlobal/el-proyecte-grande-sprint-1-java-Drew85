import React, { useState } from 'react';
import Button from "@mui/material/Button";

export default function DropdownList() {
    const [club, setClub] = useState('');

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

    return (
        <div>
            <select value={club} onChange={e => setClub(e.target.value)}>
                <option value="">Choose a club</option>
                <option value="Option 1">Budaörs LHBS</option>
                <option value="Option 2">Farkashegy LHFH</option>
                <option value="Option 3">Esztergom LHEM</option>
            </select>
            <Button onClick={handleSave} size="sm">Select</Button>
        </div>
    );
}
