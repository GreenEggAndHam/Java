let songs, info;

async function init(){
  let link = "https://cautious-waffle-q74qjv9p76vqcxxrq-8500.app.github.dev"; //replace with your Dev URL
  let route= "/members";

  info = await fetch(link+route);
  members = await info.json();

  generateCards(members);
}

function generateCards(members){  
  let output = document.getElementById("centerpanel");
  let build ="";
  
  for(let i=0; i<members.length; i++){
    let Members = members[i];
    build += `<div class="card" >`
    build += `<h3> Member Id </h3>`;
    build += `<p> ${Members.MemberID} </p>`;
    build += `<h3> Name </h3>`;
    build += `<p> ${Members.FirstName} ${Members.LastName}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }
  // Now inject the build content into the output container
  output.innerHTML = build;
}

function filter(){
  let name = document.getElementById("firstname").value;

  let mebers = []; 
  
  for(let i=0; i<members.length;i++){
    let members = members[i] 
    if( members.FirstName == name ) {
          //add to the new list
          mebers.push(name);
       }
  }
  generateCards(mebers);  
}