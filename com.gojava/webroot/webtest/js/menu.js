var Header = React.createElement("li", {className:"header"},null);
var array=new Array();
array.push(Header);
	console.log("_______________________");
function CreateSubMenu(Name,Sub){
	var I1=React.createElement("i", {className:"fa fa-angle-left pull-right"},null);
	var SPAN=React.createElement("span", {className:"pull-right-container"},I1);
	var SPANNAME = React.createElement("span", null,Name);
	var I = React.createElement("i", {className:"fa fa-link"},null);
	var A = React.createElement("a", {href:"#"},I,SPANNAME,SPAN);
	var LI =  React.createElement("li", {className:"treeview"},A,Sub);
	return LI;
}
function smallMenu(PName,Name,data){
	var A =React.createElement("a", {onClick:function(){
		var mdata=data;
		console.log("open test"+JSON.stringify(mdata));
		console.log("open id"+$("#content"));
		var MB = CreateForm(mdata,PName+"/"+Name);
   		ReactDOM.render(MB,document.getElementById("content"))
	//	$("#content").load("pages/temp.html?"+ encodeURI(JSON.stringify(data)));
	}},Name);
	var LI = React.createElement("li",null,A);
	return LI
}
function smallParentMenu(arrSub){
   var LI = React.createElement("ul",{className:"treeview-menu"},arrSub);
   return LI;

}
$.getJSON("./data/menu.json",function(data){ 
	console.log(JSON.stringify(data));
	console.log("-------");
	$.each(data,function(index,info){
		var subArray=new Array();
		$.each(info.List,function(sbindex,sbInfo){
		     // var sub2Array=new Array();
		     // 	console.log("____Menu___"+sbInfo.Name);
		     // $.each(sbInfo.List,function(sb2INdex,sb2info){
				//      var b=smallMenu(sb2info.Name,sb2info);
			//		  sub2Array.push(b);
		    //  });
		     // var SubMenu = smallParentMenu(subArray);
		    //  var ParentMenu = CreateSubMenu(sbInfo.Name,SubMenu);
			 // subArray.push(ParentMenu);
			  var b=smallMenu(info.Name,sbInfo.Name,sbInfo);
			  subArray.push(b);
		});
		var SubMenu = smallParentMenu(subArray);
		var ParentMenu = CreateSubMenu(info.Name,SubMenu);
		array.push(ParentMenu);		 
	});
	var UL = React.createElement("ul", {className:"sidebar-menu"},array);
	ReactDOM.render(UL,document.getElementById("menuSidebar"));
});