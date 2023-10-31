import './VenueList.css';

let maxNoOfVenues=20;

function VenueList(){

    let VenueCount=10;

   

    return(

        <div className="VenueList">

        <center ><b>count of venue</b>  {VenueCount}<br></br>    

                <b> Maximum values allowed</b>{maxNoOfVenues}<br></br>

                <b> List of venues</b><br></br>

        <ol>

            <li>DY Patil stadium,mumbai</li>

            <li>Mahindra Sports Complex, mumbai </li>

            <li>chepauk, Chennai</li>

            <li>Eden Gardens,Kolkata </li>

            <li> chinnaswamy Stadium, banglore</li>

            <li>Wankhede, mumbai</li>

            <li>Feroze ahah kolkata, New delhi</li>

        <li>Dharmasgala , Himachal Pradesh</li>

 

 

        </ol>

        </center></div>

    )

}

export default VenueList;