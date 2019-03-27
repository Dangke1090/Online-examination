function edit1(element){

	var oldhtml = element.innerHTML;//获得元素之前的内容
	var newobj = document.createElement('input');//创建一个input元素
	newobj.type ='text';//为newobj元素添加类型
	newobj.name ='name';
	newobj.value=oldhtml;
	element.innerHTML='';
	element.appendChild(newobj);//添加子元素
	newobj.focus();//获得焦点
	
	//设置newobj失去焦点的事件
	newobj.onblur = function(){
	//下面应该判断是否做了修改并使用ajax代码请求服务端将id与修改后的数据提交
	
	//当触发时判断newobj的值是否为空，为空则不修改，并返回oldhtml
	element.innerHTML = this.value ? this.value : oldhtml;
	}
}
function edit2(element){

	var oldhtml = element.innerHTML;//获得元素之前的内容
	var newobj = document.createElement('input');//创建一个input元素
	newobj.type ='text';//为newobj元素添加类型
	newobj.name ='sex';
	newobj.value=oldhtml;
	element.innerHTML='';
	element.appendChild(newobj);//添加子元素
	newobj.focus();//获得焦点
	
	//设置newobj失去焦点的事件
	newobj.onblur = function(){
	//下面应该判断是否做了修改并使用ajax代码请求服务端将id与修改后的数据提交
	
	//当触发时判断newobj的值是否为空，为空则不修改，并返回oldhtml
	element.innerHTML = this.value ? this.value : oldhtml;
	}
}
function edit3(element){

	var oldhtml = element.innerHTML;//获得元素之前的内容
	var newobj = document.createElement('input');//创建一个input元素
	newobj.type ='text';//为newobj元素添加类型
	newobj.name ='birthday';
	newobj.value=oldhtml;
	element.innerHTML='';
	element.appendChild(newobj);//添加子元素
	newobj.focus();//获得焦点
	
	//设置newobj失去焦点的事件
	newobj.onblur = function(){
	//下面应该判断是否做了修改并使用ajax代码请求服务端将id与修改后的数据提交
	
	//当触发时判断newobj的值是否为空，为空则不修改，并返回oldhtml
	element.innerHTML = this.value ? this.value : oldhtml;
	}
}
function edit4(element){

	var oldhtml = element.innerHTML;//获得元素之前的内容
	var newobj = document.createElement('input');//创建一个input元素
	newobj.type ='text';//为newobj元素添加类型
	newobj.name ='adddress';
	newobj.value=oldhtml;
	element.innerHTML='';
	element.appendChild(newobj);//添加子元素
	newobj.focus();//获得焦点
	
	//设置newobj失去焦点的事件
	newobj.onblur = function(){
	//下面应该判断是否做了修改并使用ajax代码请求服务端将id与修改后的数据提交
	
	//当触发时判断newobj的值是否为空，为空则不修改，并返回oldhtml
	element.innerHTML = this.value ? this.value : oldhtml;
	}
}
function edit5(element){

	var oldhtml = element.innerHTML;//获得元素之前的内容
	var newobj = document.createElement('input');//创建一个input元素
	newobj.type ='text';//为newobj元素添加类型
	newobj.name ='idcard';
	newobj.value=oldhtml;
	element.innerHTML='';
	element.appendChild(newobj);//添加子元素
	newobj.focus();//获得焦点
	
	//设置newobj失去焦点的事件
	newobj.onblur = function(){
	//下面应该判断是否做了修改并使用ajax代码请求服务端将id与修改后的数据提交
	
	//当触发时判断newobj的值是否为空，为空则不修改，并返回oldhtml
	element.innerHTML = this.value ? this.value : oldhtml;
	}
}
$(".change_username").click(function(){
	var parent = $(".rs_username").parent();
	$(parent).children(".rs_username").hide();
	var name = $(parent).children(".rs_username").html();
	$(parent).children(".ed_username").val(name);
	$(parent).children(".ed_username").show();
})
