/** @format */

import React from "react";
import "./PostHeader.scss";
import image from "../../assets/Img/pencilBlack.png";

function PostHeader(props) {
  return (
    <div className="postHeader">
      <div className="postHeaderLeftDiv">
        <img src={image} className="imagePostHeader" width="40px"></img>
      </div>
      <div className="postHeaderCenterDiv">
        <div className="titleDiv">{props.title}</div>
        <div className="categoryDiv">{props.category}</div>
      </div>
      <div className="postHeaderRightDiv"></div>
    </div>
  );
}

export default PostHeader;
