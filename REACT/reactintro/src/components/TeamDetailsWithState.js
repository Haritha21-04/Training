import { Component } from "react";
class TeamDetailsWithState extends Component{
    constructor(props){
        super(props);
        this.state={teamName:"Delhi Capitals",
        baselocation:"New Delhi", teamCaptain:"YTA"}
    }
    teamName="Delhi Capitals";
    baselocation="New Delhi";

    teamCaptain="YTA"

    render(){

        return<div><center>

            <form>

                <label>Team Name</label>

                <input type="text" defaultValue={this.state.teamName}/><br></br>

                <label>Team Captain</label>

                <input type="text" defaultValue={this.state.teamCaptain}/><br></br>

                <label>Base location</label>

                <select size="1" name="base_location" defaultValues={this.state.baselocation}>

                    <option value="MI">mumbai</option>

                    <option value="CSK">chennai</option>

                    <option value="RR">rajasthan</option>

                    <option value="KXIP">kolkata</option>

                    <option value="DD">dehradun</option>

                    <option value="DC">durgapur</option>

                    <option value="RPS">pune</option>

                    <option value="RCB">Bangalore Utds</option>

                    <option value="SRH">Delhi Capitals</option>

                    <option value="KKR">Chandigarh</option>

 

               </select>

            </form></center>

        </div>

    }

}

export default TeamDetailsWithState;