/** @format */

import Post from "../../components/post/Post";
import HeaderThread from "../../components/headerThread/HeaderThread";
import "./Home.scss";
import { Fab } from "@mui/material";

function Home() {
  const text =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
  const posts1 = [text, text, text, text];
  const posts2 = [text, text, text, text];
  const posts3 = [text, text, text, text];
  const posts4 = [text, text, text, text];

  return (

    <div class="accordion containerMain" id="accordionExample">
      <div class="card">
        <Fab color="info" aria-label="add" variant="extended" classes="fab" href="/Modal?thread=hilillo">
          Add a post
        </Fab>
        <HeaderThread
          title={"Backend"}
          target={"#collapseOne"}
          controls={"collapseOne"}/>

        <div className="scroll">
          <Post array={posts1} id="collapseOne" />
        </div>
      </div>
      <div class="card ">
        <Fab color="info" aria-label="add" variant="extended" classes="fab" href="/Modal?thread=hilillo" >
          Add a post
          </Fab>
        <HeaderThread title={"Frontend"} target={"#collapseTwo"} controls={"collapseTwo"}/>
        <div className="scroll">
          <Post array={posts2} id="collapseTwo" />
        </div>
      </div>
      <div class="card">
        <Fab color="info" aria-label="add" variant="extended" classes="fab" href="/Modal?thread=hilillo">
          Add a post
        </Fab>
        <HeaderThread
          title={"Random things"}
          target={"#collapseThree"}
          controls={"collapseThree"}
        />
        <div className="scroll">
          <Post array={posts3} id={"collapseThree"} />
        </div>
      </div>
      <div class="card ">
        <Fab color="info" aria-label="add" variant="extended" classes="fab" href="/Modal?thread=hilillo">
          Add a post
        </Fab>
        <HeaderThread
          title={"Fullstack"}
          target={"#collapseFour"}
          controls={"collapseFour"}
        />
        <div className="scroll">
          <Post array={posts4} id={"collapseFour"} />
        </div>
      </div>
    </div>
  );
}

export default Home;
