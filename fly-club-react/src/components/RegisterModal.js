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

export default function RegisterModal({handleRegisterOpen, handleRegisterClose, registerOpen}) {

        const [userName, setUserName] = useState('')
        const [password, setPassword] = useState('')
        const [email, setEmail] = useState('')

        const data = {
            name: userName,
            password: password,
            email: email
        }
        const config ={
            headers:{
                'Content-type': 'application/json'
            }
        }
        const handleSubmit = (event) => {
          event.preventDefault();
          axios.post('/user', data, config)
              .then((response) => {
                  console.log(response.data)
              })
              .catch((error) => {
                  console.error(error)
              })
        }
    {



        return (
            <div>
                <Button sx={{color:"inherit"}}>Join Club</Button>
                <Button sx={{color: "inherit"}} onClick={handleRegisterOpen}>Register</Button>

                <Modal
                    open={registerOpen}
                    onClose={handleRegisterClose}
                    aria-labelledby="modal-modal-title"
                    aria-describedby="modal-modal-description"
                >

                    <Box component={"form"} noValidate sx={style}>
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
                            sx={{mt: 3, mb: 2}}
                            color="secondary"
                            onClick={handleSubmit}


                        >
                            Register
                        </Button>
                    </Box>
                </Modal>
            </div>
        );
    }}