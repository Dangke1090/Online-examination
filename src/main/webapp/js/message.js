

 /**
  在之前进行添加.
 */
 var count = 1; //定义全局变量，进行区别,当前是第几个被插入。。。
 /**
  在之后进行插入....
 */
 function addAfter(obj){
  var table = document.getElementById("mytable");//获取表格对象
  /*
   obj:  <a>
   obj.parentNode:  <td>
   obj.parnetNode.parentNode: <tr>
   obj.parentNode.parentNode.rowIndex: 所在表格中的行数---表头算一行.
  */
  var currentRow = obj.parentNode.parentNode.rowIndex;
  
  //添加行
  var new_tr =  table.insertRow(currentRow+1);//新增加一行.
  
  //设置tr的高度
  new_tr.style.height ="30px";
  
  //添加列
  var td_name = new_tr.insertCell(0);
  var input=document.createElement("input");
  input.name="studybackground";
  input.size="120";
  td_name.appendChild(input);
  count +=1;
  var td_operation = new_tr.insertCell(1);
  td_operation.innerHTML = 
               '<a href="#"  onclick="addAfter(this)">添加</a>&nbsp;'  +
             '<a href="#" onclick="deleteCurrentRow(this)">删除</a>&nbsp;'+
               '<a href="#"  onclick="moveToUp(this)">上移</a>&nbsp;'+
              '<a href="#"  onclick="moveToDown(this)">下移</a>';
 }
 
 /**
  删除当前行
 */
 function deleteCurrentRow(obj){
  var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
  var table = document.getElementById("mytable");//获取表格对象
  table.deleteRow(row_tr);
 }
 
 /**
  上移一行
 */
 function moveToUp(obj){
  var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
  if(row_tr<=0){
   alert("已经是第一行了，无法进行移动!");
   return;
  }
  changeRow(row_tr-1,row_tr);
 }
 
 
 /**
  下移一行
 */
 function moveToDown(obj){
  var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
  if(row_tr>=document.getElementById("mytable").rows.length-1){
   alert("已经是最后一行了，无法进行移动!");
   return;
  }
  changeRow(row_tr,row_tr+1);
 }
 
 
 /**
 交换行
 */
 function changeRow(row1,row2){
   var table = document.getElementById("mytable");//获取表格对象
   
   if(table.rows[row1].swapNode){//FireFox不可用，IE可用
    table.rows[row1].swapNode(table.rows[row2]);
   }else{
    swapNode(table.rows[row1],table.rows[row2]);
   }
 }
 
   //交换2个DOM节点---火狐等中实现IE中的swapNode方法 
function swapNode(node1,node2)
{
  var parent = node1.parentNode;//父节点
  var t1 = node1.nextSibling;//两节点的相对位置
  var t2 = node2.nextSibling;
  
  //如果是插入到最后就用appendChild
  if(t1) parent.insertBefore(node2,t1);
  else parent.appendChild(node2);
  if(t2) parent.insertBefore(node1,t2);
  else parent.appendChild(node1);
} 
 


/**
 在之前进行添加.
*/
var count = 1; //定义全局变量，进行区别,当前是第几个被插入。。。
/**
 在之后进行插入....
*/
function addAfter1(obj){
 var table = document.getElementById("mytable1");//获取表格对象
 /*
  obj:  <a>
  obj.parentNode:  <td>
  obj.parnetNode.parentNode: <tr>
  obj.parentNode.parentNode.rowIndex: 所在表格中的行数---表头算一行.
 */
 var currentRow = obj.parentNode.parentNode.rowIndex;
 
 //添加行
 var new_tr =  table.insertRow(currentRow+1);//新增加一行.
 
 //设置tr的高度
 new_tr.style.height ="30px";
 
 //添加列
 var td_name = new_tr.insertCell(0);
 var input=document.createElement("input");
 input.name="rewardpunishment";
 input.size="120";
 td_name.appendChild(input);
 count +=1;
 var td_operation = new_tr.insertCell(1);
 td_operation.innerHTML = 
              '<a href="#"  onclick="addAfter1(this)">添加</a>&nbsp;'  +
            '<a href="#" onclick="deleteCurrentRow1(this)">删除</a>&nbsp;'+
              '<a href="#"  onclick="moveToUp1(this)">上移</a>&nbsp;'+
             '<a href="#"  onclick="moveToDown1(this)">下移</a>';
}

/**
 删除当前行
*/
function deleteCurrentRow1(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 var table = document.getElementById("mytable1");//获取表格对象
 table.deleteRow(row_tr);
}

/**
 上移一行
*/
function moveToUp1(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 if(row_tr<=0){
  alert("已经是第一行了，无法进行移动!");
  return;
 }
 changeRow(row_tr-1,row_tr);
}


/**
 下移一行
*/
function moveToDown1(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 if(row_tr>=document.getElementById("mytable1").rows.length-1){
  alert("已经是最后一行了，无法进行移动!");
  return;
 }
 changeRow(row_tr,row_tr+1);
}


/**
交换行
*/
function changeRow1(row1,row2){
  var table = document.getElementById("mytable1");//获取表格对象
  
  if(table.rows[row1].swapNode){//FireFox不可用，IE可用
   table.rows[row1].swapNode(table.rows[row2]);
  }else{
   swapNode(table.rows[row1],table.rows[row2]);
  }
}

  //交换2个DOM节点---火狐等中实现IE中的swapNode方法 
function swapNode1(node1,node2)
{
 var parent = node1.parentNode;//父节点
 var t1 = node1.nextSibling;//两节点的相对位置
 var t2 = node2.nextSibling;
 
 //如果是插入到最后就用appendChild
 if(t1) parent.insertBefore(node2,t1);
 else parent.appendChild(node2);
 if(t2) parent.insertBefore(node1,t2);
 else parent.appendChild(node1);
} 





/**
 在之前进行添加.
*/
var count = 1; //定义全局变量，进行区别,当前是第几个被插入。。。
/**
 在之后进行插入....
*/
function addAfter2(obj){
 var table = document.getElementById("mytable2");//获取表格对象
 /*
  obj:  <a>
  obj.parentNode:  <td>
  obj.parnetNode.parentNode: <tr>
  obj.parentNode.parentNode.rowIndex: 所在表格中的行数---表头算一行.
 */
 var currentRow = obj.parentNode.parentNode.rowIndex;
 
 //添加行
 var new_tr =  table.insertRow(currentRow+1);//新增加一行.
 
 //设置tr的高度
 new_tr.style.height ="30px";
 
 //添加列
 var td_name = new_tr.insertCell(0);

 var input=document.createElement("input");
 input.name="office";
 input.size="120";
 td_name.appendChild(input);
 count +=1;
 var td_operation = new_tr.insertCell(1);
 td_operation.innerHTML = 
              '<a href="#"  onclick="addAfter2(this)">添加</a>&nbsp;'  +
            '<a href="#" onclick="deleteCurrentRow2(this)">删除</a>&nbsp;'+
              '<a href="#"  onclick="moveToUp2(this)">上移</a>&nbsp;'+
             '<a href="#"  onclick="moveToDown2(this)">下移</a>';
}

/**
 删除当前行
*/
function deleteCurrentRow2(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 var table = document.getElementById("mytable2");//获取表格对象
 table.deleteRow(row_tr);
}

/**
 上移一行
*/
function moveToUp2(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 if(row_tr<=0){
  alert("已经是第一行了，无法进行移动!");
  return;
 }
 changeRow(row_tr-1,row_tr);
}


/**
 下移一行
*/
function moveToDown2(obj){
 var row_tr = obj.parentNode.parentNode.rowIndex;//获取当前行数
 if(row_tr>=document.getElementById("mytable2").rows.length-1){
  alert("已经是最后一行了，无法进行移动!");
  return;
 }
 changeRow(row_tr,row_tr+1);
}


/**
交换行
*/
function changeRow2(row1,row2){
  var table = document.getElementById("mytable2");//获取表格对象
  
  if(table.rows[row1].swapNode){//FireFox不可用，IE可用
   table.rows[row1].swapNode(table.rows[row2]);
  }else{
   swapNode(table.rows[row1],table.rows[row2]);
  }
}

  //交换2个DOM节点---火狐等中实现IE中的swapNode方法 
function swapNode2(node1,node2)
{
 var parent = node1.parentNode;//父节点
 var t1 = node1.nextSibling;//两节点的相对位置
 var t2 = node2.nextSibling;
 
 //如果是插入到最后就用appendChild
 if(t1) parent.insertBefore(node2,t1);
 else parent.appendChild(node2);
 if(t2) parent.insertBefore(node1,t2);
 else parent.appendChild(node1);
} 






