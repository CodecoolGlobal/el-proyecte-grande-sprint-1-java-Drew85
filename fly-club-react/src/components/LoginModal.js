import * as React from 'react';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Modal from '@mui/material/Modal';
import {Grid, TextField} from "@mui/material";
import axios from "axios";
import {useState} from "react";

const style = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 400,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 24,
    p: 4,
};

export default function LoginModal({handleOpen, handleClose, open}) {
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')

    const data = {
        email: email,
        password: password,
    }
    const config ={
        headers:{
            'Content-type': 'application/json'
        }
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        axios.post('/login', data, config)
            .then((response) => {
                console.log(response.data)
            })
            .catch((error) => {
                console.error(error)
            })
    }

    return (
        <div>
            <Button sx={{color:"inherit"}} onClick={handleOpen}>Login</Button>
            <Modal
                open={open}
                onClose={handleClose}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box component={"form"} noValidate sx = {style}>
                    <Grid container spacing={1}>
                        <Grid item xs={12}>
                            <TextField
                                autoComplete="email"
                                name="email"
                                required
                                fullWidth
                                id="email"
                                label="Email"
                                autoFocus
                                variant={"filled"}
                                onChange={(e) => {
                                    setEmail(e.target.value)
                                }}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                name="password"
                                required
                                fullWidth
                                id="password"
                                label="Password"
                                autoFocus
                                variant={"filled"}
                                onChange={(e) => {
                                    setPassword(e.target.value)
                                }}
                            />
                        </Grid>
                    </Grid>
                    <Button
                        type="submit"
                        fullWidth
                        variant="contained"
                        sx={{ mt: 3, mb: 2 }}
                        color="secondary"
                        onClick={handleSubmit}
                    >
                        Log In
                    </Button>
                </Box>
            </Modal>
        </div>
    );
}
