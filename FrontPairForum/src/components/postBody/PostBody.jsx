/** @format */

import React from "react";
import "./PostBody.scss";

function PostBody(props) {
  return (
    <div className="postBody">
      <table className="postBody">
        <tbody className="postBody">
          <tr className="postBody">
            <td className="postBody">{props.content}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default PostBody;
