/** @format */

import React, { useState, useCallback } from "react";
import "./Switch.scss";
import Alert from "@mui/material/Alert";
import Fade from "@mui/material/Fade";

//npm install @mui/material

function Switch() {
  const [showInfo, setShowInfo] = useState(false);
  const [link, setLink] = useState("/editTeams");

  const editHandler = () => {
    if (link == "/") {
      setLink("/editTeams");
      setShowInfo(false);
    } else {
      setLink("/");
      setShowInfo(true);
      setTimeout(() => {
        setShowInfo(false);
      }, 5000);
    }

    // if (showInfo) {
    //   setShowInfo(false);
    // } else {
    //   setShowInfo(true);
    //   setTimeout(() => {
    //     setShowInfo(false);
    //   }, 10000);
    // }
  };

  return (
    <div class="main-container">
      <div class="btn-container">
        {/* <i class="fa fa-sun-o" aria-hidden="true"></i> */}
        <label class="switch btn-color-mode-switch">
          <input
            type="checkbox"
            name="color_mode"
            id="color_mode"
            value="1"
            onClick={editHandler}
          />
          <label
            for="color_mode"
            data-on="Private"
            data-off="Public"
            class="btn-color-mode-switch-inner"
          ></label>
        </label>
        <Fade in={showInfo}>
          <Alert id="lined" variant="outlined" severity="info">
            Solo los usuarios registrados podrán ver tu hilo
          </Alert>
        </Fade>
        {/* <i class="fa fa-moon-o" aria-hidden="true"></i> */}
      </div>

      {/* <div className="unddiv"></div> */}
    </div>
  );
}

export default Switch;
