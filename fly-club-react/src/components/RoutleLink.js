import {Link} from "react-router-dom";
import React from "react";

export default function LinkToFlights() {
    return(
        <div>
        <Link to={"/flights"}><button>FLIGHTS</button></Link>
        </div>
    )
}