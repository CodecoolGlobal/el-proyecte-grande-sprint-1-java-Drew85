import React, { useState } from 'react';
import Button from "@mui/material/Button";

export default function DropdownPlaneTypes() {
    const [plane, setPlane] = useState(undefined);

    function handleSave() {
        fetch('/planes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ planes: plane })
        })
            .then(response => {
                if (response.ok) {
                    console.log('Plane added!');
                } else {
                    console.error('Error adding palne:', response.status);
                }
            })
            .catch(error => {
                console.error('Error adding palne:', error);
            });
    }

    return (
        <div>

            <select value={plane} onChange={e => setPlane(e.target.value)}>
                <option value="">Choose a plane</option>
                <option value="Option 1">FALKE</option>
                <option value="Option 2">CESSNA152</option>
                <option value="Option 3">CESSNA172</option>
                <option value="Option 3">GLIDER</option>
            </select>
            <Button onClick={handleSave} size="sm">Select</Button>

        </div>
    );
}
