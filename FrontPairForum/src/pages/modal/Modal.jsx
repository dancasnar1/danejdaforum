/** @format */

import React, { useState } from "react";
import { RiCloseLine } from "react-icons/ri";
import Button from "../../components/button/Button";
import Switch from "../../components/switch/Switch";
import "./Modal.scss";

const Modal = ({ setIsOpen }) => {
  const [checked, setchecked] = useState(false);
  function handleChange(checked) {
    setchecked(!checked);
    this.setState({ checked });
  }
  return (
    <>
      <div className="centered">
        <div className="modal">
          <div className="modalHeader">
            <h5 className="heading">Crear post</h5>
            <Switch onChange={handleChange} checked={checked} />
          </div>
          <button className="closeBtn" onClick={() => setIsOpen(false)}>
            <RiCloseLine style={{ marginBottom: "-3px" }} />
          </button>
          <div className="modalContent">
            <textarea
              placeholder="Escribe aquí el mensaje"
              className="modalInputText"
            />
          </div>
          <div className="modalActions">
            <div className="actionsContainer">
              <button className="cancelBtn" onClick={() => setIsOpen(false)}>
                Cancel
              </button>
              <Button message="Enviar mensaje" />
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Modal;
