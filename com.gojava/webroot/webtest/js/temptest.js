function CreateFormName(Name){
 
    var H3= React.createElement("h3",{className:"box-title"},Name);
     var LI = React.createElement("div",{className:"box-header with-border"},H3);
   return LI;
}
function getFormForJSON(Data){
		var ObjStr="{";
		$.each(Data,function(index,Info){
		if($("#"+Info.Name).val()!=undefined){
				if(Info.Type=="String"){
					ObjStr = ObjStr+"'"+Info.Name+"':'"+$("#"+Info.Name).val()+"',";
				}else{
						  	ObjStr = ObjStr+"'"+Info.Name+"':"+$("#"+Info.Name).val()+",";
						  	}
			}
		});
		ObjStr+="'objbitTmp':0}";
		return ObjStr;
}
function getFormForQuery(Data){
		var ObjStr="";
		$.each(Data,function(index,Info){
				if($("#"+Info.Name).val()!=undefined){
				if(Info.Type=="String"){
							ObjStr = ObjStr+""+Info.Name+"='"+$("#"+Info.Name).val()+"'&";
				}else{
						  	ObjStr = ObjStr+""+Info.Name+"="+$("#"+Info.Name).val()+"&";
						  	}
						  	}
		});
		ObjStr+="objbitTmp=0";
		return ObjStr;
}
function Decodeuint8arr(uint8array){
    return new TextDecoder("utf-8").decode(uint8array);
}

/**
 * Convert a string into a Uint8Array.
 *
 * @returns {Uint8Array}
 */
function Encodeuint8arr(myString){
    return new TextEncoder("utf-8").encode(myString);
}
function CreateForm(Data,postUrl){
	$("#postRst").empty();
		var array=new Array();
	 $.each(Data.List,function(index,Info){
	  		var B = CreateGroup(Info);
	  		array.push(B);
	 });
	
	
	 
	  
	  var Body= React.createElement("div",{className:"box-body"},array);
	  var Btn=React.createElement("button",{type:"button",className:"btn btn-primary",onClick:function(){
	  var FileList=Data.List;
	     var QS = getFormForQuery(FileList);
	      console.log(QS);
	  	$.post("../../api/"+postUrl, QS,
			   function(data){
			    console.log(data);
			    var datastr = msgpack.decode(Encodeuint8arr(data));			   
			    CreateResult(datastr);
			   });
	  }},"Query提交");
	   var BtnJSON=React.createElement("button",{type:"button",className:"btn btn-primary",onClick:function(){
	    var FileList=Data.List;
	     var JS = getFormForJSON(FileList);
	      console.log(JS);
	  	$.post("../../api/json/"+postUrl,JS,
			   function(data){
			   		  console.log(data);
			    	CreateResult(JSON.stringify(data));
			   }, "json");
	  }},"JSON提交");
	  var RDDiv =  React.createElement("div",{className:"form-group",id:"postRst"},null);
	  array.push(RDDiv);
	  var Foot=React.createElement("div",{className:"box-footer"},Btn,BtnJSON);
	  var form = React.createElement("form",{role:"form"},Body,Foot);
	  var Div =  React.createElement("div",{className:"box box-primary"},CreateFormName(Data.Name),form);
	  return Div;
}
function CreateGroup(data){
	   var INPUT = React.createElement("input",{type:"text",className:"form-control",placeholder:"输入参数",id:data.Name},null);
	   var label =  React.createElement("label",{type:"text",className:"form-control",for:data.Name},data.Name+" 数据类型:"+data.Type);
	   var Div =  React.createElement("div",{className:"form-group"},label,INPUT);
	   return Div;
}
function CreateResult(data){

	   var H4 = React.createElement("h4",null,"执行结果");
	   var P=React.createElement("p",null,data);
	   var RDIV= React.createElement("div",{className:"callout callout-success"},H4,P);
	   ReactDOM.render(RDIV,document.getElementById("postRst"));
}

