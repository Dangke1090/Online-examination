function show(id) {
		if(id==0){
			document.getElementById("systemmessage_Professional").style.display = "block";
			document.getElementById("systemmessage_Job").style.display = "none";
			document.getElementById("systemmessage_State").style.display = "none";
			document.getElementById("systemmessage_Department").style.display = "none";
			document.getElementById("systemmessage_Type").style.display = "none";
		}else if(id==1){
			document.getElementById("systemmessage_Professional").style.display = "none";
			document.getElementById("systemmessage_Job").style.display = "block";
			document.getElementById("systemmessage_State").style.display = "none";
			document.getElementById("systemmessage_Department").style.display = "none";
			document.getElementById("systemmessage_Type").style.display = "none";
		}else if(id==2){
			document.getElementById("systemmessage_Professional").style.display = "none";
			document.getElementById("systemmessage_Job").style.display = "none";
			document.getElementById("systemmessage_State").style.display = "block";
			document.getElementById("systemmessage_Department").style.display = "none";
			document.getElementById("systemmessage_Type").style.display = "none";
		} else if(id==3){
			document.getElementById("systemmessage_Professional").style.display = "none";
			document.getElementById("systemmessage_Job").style.display = "none";
			document.getElementById("systemmessage_State").style.display = "none";
			document.getElementById("systemmessage_Department").style.display = "block";
			document.getElementById("systemmessage_Type").style.display = "none";
		} else if(id==4){
			document.getElementById("systemmessage_Professional").style.display = "none";
			document.getElementById("systemmessage_Job").style.display = "none";
			document.getElementById("systemmessage_State").style.display = "none";
			document.getElementById("systemmessage_Department").style.display = "none";
			document.getElementById("systemmessage_Type").style.display = "block";
		}
	}