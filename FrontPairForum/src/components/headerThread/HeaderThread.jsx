/** @format */
import "./HeaderThread.scss";
import React from "react";

function HeaderThread(props) {
  return (
    <div>
      <div class="card-header" id="headingThree">
        <h2 class="mb-0">
          <button
            class="btn btn-link collapsed title"
            type="button"
            data-toggle="collapse"
            data-target={props.target}
            aria-expanded={false}
            aria-controls={props.controls}
          >
            {props.title}
          </button>
        </h2>
      </div>
    </div>
  );
}

export default HeaderThread;
