import React, {useEffect, useState} from 'react';
import Button from "@mui/material/Button";

export default function DropdownPlaneTypes() {
    const [selectedPlane, selectPlane] = useState();
    const [planes, setPlanes] = useState([]);
    useEffect(() => {
        fetch('http://localhost:8080/planes').then(response => response.json()).then(json => setPlanes(json));
    }, []);

    function handleSave() {
        fetch('/planes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({planes: selectedPlane})
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

            <select value={selectedPlane} onChange={e => selectPlane(+(e.target.value))}>

                <option value="">Choose a plane</option>
                {planes.map((item, index) => {return <option key={item.id}
                    value={item.id}>{item.planeType.name} ({item.planeType.registrationNumber})</option>})}
            </select>
            <Button onClick={handleSave} size="sm">Select</Button>

        </div>
    );
}
