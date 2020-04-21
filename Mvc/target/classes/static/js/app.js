function validate() {
	var name=document.getElementBYId("name");
	if(name==''){
		alert("Please enter a valid name")	;
		return false;
	}else{
		return true;
	}
}