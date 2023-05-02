import * as React from 'react';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Modal from '@mui/material/Modal';
import {Grid, TextField} from "@mui/material";
import {useContext, useState} from "react";
import UserProvider, {useUser} from "./UserProvider";


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
    const [userName, setUserName] = useState('')
    const [password, setPassword] = useState('')
    const {login} = useUser()


    const data = {
        username: userName,
        password: password,
    }
    const config ={
        headers:{
            'Content-type': 'application/json'
        }
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        login(data)
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
                                name="user-name"
                                required
                                fullWidth
                                id="user-name"
                                label="User Name"
                                variant="filled"
                                autoFocus
                                onChange={(e) => {
                                    setUserName(e.target.value)
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
