import { useState } from "react";
function TeamDetailsWithUseState(){
    const [TeamName,setTeamName] = useState("Delhi Capitals");
    const [TeamCaptain,setCaptainName] = useState("David Warner");
    const [BaseLocation,setBaseLocation] = useState("New Delhi");
    function validate(){
        let vstatus=false;
        if (TeamName ==="")
           window.alert("Name cannot be Blank");
        else
            vstatus=true;

        if (TeamCaptain ==="")
           window.alert("Captain Name cannot be blank");
        else
            vstatus=true;
        return vstatus;
    
    }
        return<div><center>
            <form action="javascript::window.alert('All OK')" onSubmit="return validate()">  
                <label><b>Team Name</b></label>
                <input type="text" onChange={e=>{setTeamName(e.target.value)}}defaultValue={TeamName}/><br></br>
                <label><b>Team Captain</b></label>
                <input type="text" onChange={e=>{setCaptainName(e.target.value)}}defaultValue={TeamCaptain}/><br></br>
                <label><b>Base Location</b></label>
                <select size="1" onChange={e=>{setBaseLocation(e.target.value)}}defaultValue={BaseLocation}/><br></br>
                <select size="1" name="BaseLocation" defaultValue={BaseLocation}>
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
               </select><br></br>
               <input type="submit" value="Save" />
            </form><br></br>
            <b> Team Name </b> {TeamName}<br></br>
            <b> Team Captain </b> {TeamCaptain}<br></br>
            <b> Base Location </b> {BaseLocation}<br></br><br></br>
            </center>
        </div>
}
export default TeamDetailsWithUseState;