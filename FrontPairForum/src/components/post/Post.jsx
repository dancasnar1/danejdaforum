/** @format */

import React from "react";
import PostHeader from "../postHeader/PostHeader";
import PostBody from "../postBody/PostBody";
import "./Post.scss";

function Post(props) {
  return (
    <div>
      {props.array.map((element) => (
        <div
          id={props.id}
          class="collapse "
          aria-labelledby="headingOne"
          data-parent="#accordionExample"
        >
          <div class="card-body">
            <div className="content">
              <PostHeader title="Enejda and Daniel" category="Developers" />
              <hr className="hr" />
              <PostBody content={element} />
            </div>
          </div>
          <hr className="separator" />
        </div>
      ))}
    </div>
  );
}

export default Post;
