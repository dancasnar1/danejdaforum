/** @format */

import React from "react";
import "./Button.scss";

function Button(props) {
  return <button className="rounded-button"> {props.message} </button>;
}

export default Button;
