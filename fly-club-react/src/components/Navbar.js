import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import LoginModal from "./Modal";
import RegisterModal from "./RegisterModal";


export default function ButtonAppBar() {
    const [open, setOpen] = React.useState(false);
    const handleOpen = () => setOpen(true);
    const handleClose = () => setOpen(false);
    const [registerOpen, setRegisterOpen] = React.useState(false);
    const handleRegisterOpen = () => setRegisterOpen(true);
    const handleRegisterClose = () => setRegisterOpen(false);
    return (
        <Box sx={{ flexGrow: 1 }}>
            <AppBar position="static">
                <Toolbar>
                    <IconButton
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="menu"
                        sx={{ mr: 2 }}
                    >
                        <MenuIcon />
                    </IconButton>
                    <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                        FLIGHT CLUB MANAGEMENT
                    </Typography>
                    <RegisterModal registerOpen={registerOpen} handleRegisterOpen={handleRegisterOpen} handleRegisterClose={handleRegisterClose} />
                    <LoginModal open={open} handleOpen={handleOpen} handleClose={handleClose}/>
                </Toolbar>
            </AppBar>
        </Box>
    );
}
