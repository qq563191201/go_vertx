

function DbUpdate(me){
	alert("单价"+me);
}	
var array=new Array();
var HeaderRoomId= React.createElement("th", null,"房间ID");
var HeaderName= React.createElement("th", null,"房间名字");
var HeaderLimit= React.createElement("th", null,"入场限制");
var HeaderCCYID= React.createElement("th", null,"消费类型");
var HeaderDESKS= React.createElement("th", null,"桌子数量");
var HeaderSCORE= React.createElement("th", null,"房间积分限制");
var HeaderTIME= React.createElement("th", null,"清场后间隔时间(毫秒)");
var HeaderHR = React.createElement("tr", null,HeaderRoomId,HeaderName,HeaderLimit,HeaderCCYID,HeaderDESKS,HeaderSCORE,HeaderTIME);
var Header = React.createElement("thead", null,HeaderHR);
var FOOT = React.createElement("tfoot", null,HeaderHR);
//<input type="text" class="form-control" id="inputWarning" placeholder="Enter //<div class="form-group has-warning">
      //            <label class="control-label" for="inputWarning"><i class="fa fa-bell-o"></i> Input with
     //               warning</label>
     //             <input type="text" class="form-control" id="inputWarning" placeholder="Enter ...">
       //           <span class="help-block">Help block with warning</span>
     //           </div>
var InputText=React.createElement("input", {Type:"text",className:"form-control"},null);
for(var i=0;i<10;i++){
	var RoomId = React.createElement("td", {name:"row_1002_id"+i,onDoubleClick:function(){
				ReactDOM.render(InputText,document.getElementById("row_1002_id"+i));
		// DbUpdate($("#"+"row_1002_id"+i));
	},id:"row_1002_id"+i},"1002"+i);
	var RoomName = React.createElement("td", null,"新手房间");
	var LimitScore=React.createElement("td", null,"2000");
	var CCYID=React.createElement("td", null,"金豆");
	var DESKS=React.createElement("td", null,"5");
	var SCOREMAX=React.createElement("td", null,"50000");
	var DESKTIME=React.createElement("td", null,"50000");
	var One= React.createElement("tr", null,RoomId,RoomName,LimitScore,CCYID,DESKS,SCOREMAX,DESKTIME);
	array.push(One);
}
var TBODY=  React.createElement("tbody", null,array);
var Table = React.createElement("table", {className:"table table-bordered table-hover"},Header,TBODY,FOOT);
ReactDOM.render(Table,document.getElementById("datadiv"));
//ReactDOM.render(InputText,document.getElementById("datadiv"));
