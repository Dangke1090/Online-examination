



        
        
        //实操题
        var count = 1;

        //用来判断是删除 还是增加按钮 以便count值进行计算
        function checkCount(boolOK, coun) {
           if (boolOK == true) {
                return count++;
            }
           else {
            count--;
         }
        }
        //添加一个input标签 同时也对它的ID和Name进行赋值。
        function AddInput5() {
        countAA = checkCount(true, count);
           var question = document.getElementById("question_po");
          //创建input
           var br = document.createElement("br");
          question.appendChild(br);
          var input=document.createElement("input");
          	input.type="checkbox";
          	input.id = "questions[" + count + "]";
            input.name = "questions[" + count + "].name";
          question.appendChild(input);
          var node=document.createTextNode("步骤"+count);
          // 把文本节点添加到p节点里
          question.appendChild(node);
          var br = document.createElement("br");
          question.appendChild(br);
          var node=document.createTextNode("条件");
          // 把文本节点添加到p节点里
          question.appendChild(node);
        
            var input = document.createElement("input");
            input.type = "text";
            input.size="120";
            input.id = "questions[" + count + "]";
            input.name = "questions[" + count + "].name";
            question.appendChild(input);                                     //向元素增加子节点 最为最后一个子节点

            //创建一个空格
            var br = document.createElement("br");
            question.appendChild(br);
            var node=document.createTextNode("图片");
            // 把文本节点添加到p节点里
            question.appendChild(node);
            var input = document.createElement("input");
            input.type = "file";
            input.id = "questions[" + count + "]";
            input.name = "questions[" + count + "].name";
            question.appendChild(input);
            var node=document.createTextNode("视频");
            // 把文本节点添加到p节点里
            question.appendChild(node);
            var input = document.createElement("input");
            input.type = "file";
            input.id = "questions[" + count + "]";
            input.name = "questions[" + count + "].name";
            question.appendChild(input);
            var br = document.createElement("br");
            question.appendChild(br);
            var node=document.createTextNode("执行");
            // 把文本节点添加到p节点里
            question.appendChild(node);
          
              var input = document.createElement("input");
              input.type = "text";
              input.size="120";
              input.id = "questions[" + count + "]";
              input.name = "questions[" + count + "].name";
              question.appendChild(input);                                     //向元素增加子节点 最为最后一个子节点

              //创建一个空格
              var br = document.createElement("br");
              question.appendChild(br);
              var node=document.createTextNode("图片");
              // 把文本节点添加到p节点里
              question.appendChild(node);
              var input = document.createElement("input");
              input.type = "file";
              input.id = "questions[" + count + "]";
              input.name = "questions[" + count + "].name";
              question.appendChild(input);
              var node=document.createTextNode("视频");
              // 把文本节点添加到p节点里
              question.appendChild(node);
              var input = document.createElement("input");
              input.type = "file";
              input.id = "questions[" + count + "]";
              input.name = "questions[" + count + "].name";
              question.appendChild(input);
              
              var br = document.createElement("br");
              question.appendChild(br);
              var node=document.createTextNode("结果");
              // 把文本节点添加到p节点里
              question.appendChild(node);
            
                var input = document.createElement("input");
                input.type = "text";
                input.size="120";
                input.id = "questions[" + count + "]";
                input.name = "questions[" + count + "].name";
                question.appendChild(input);                                     //向元素增加子节点 最为最后一个子节点

                //创建一个空格
                var br = document.createElement("br");
                question.appendChild(br);
                var node=document.createTextNode("图片");
                // 把文本节点添加到p节点里
                question.appendChild(node);
                var input = document.createElement("input");
                input.type = "file";
                input.id = "questions[" + count + "]";
                input.name = "questions[" + count + "].name";
                question.appendChild(input);
                var node=document.createTextNode("视频");
                // 把文本节点添加到p节点里
                question.appendChild(node);
                var input = document.createElement("input");
                input.type = "file";
                input.id = "questions[" + count + "]";
                input.name = "questions[" + count + "].name";
                question.appendChild(input);
                var input = document.createElement("input");
                input.type = "button";
                input.id = "questions[" + count + "]";
                input.name = "questions[" + count + "].name";
                input.value="删除";
                question.appendChild(input);
                var input = document.createElement("input");
                input.type = "button";
                input.id = "questions[" + count + "]";
                input.name = "questions[" + count + "].name";
                input.value="上移";
                question.appendChild(input);
        }
        
        
        
        
        
        
        
        
      //判断题
        var count = 1;

      //用来判断是删除 还是增加按钮 以便count值进行计算
      function checkCount(boolOK, coun) {
       if (boolOK == true) {
            return count++;
        }
       else {
        count--;
      }
      }
      //添加一个input标签 同时也对它的ID和Name进行赋值。
      function AddInput4() {
      countAA = checkCount(true, count);
       var question = document.getElementById("question1_more");
      //创建input
      var input =document.createElement("input");
      input.type="text";
      input.size="1";
      input.id = "questions4[" + count + "]";
      input.name = "questions4[" + count + "].name";
      question.appendChild(input);  
       var input = document.createElement("input");
        input.type = "checkbox";
        input.id = "questions5[" + count + "]";
        question.appendChild(input);           
                               //向元素增加子节点 最为最后一个子节点
      }
//多选题
      var count = 1;

      //用来判断是删除 还是增加按钮 以便count值进行计算
      function checkCount(boolOK, coun) {
         if (boolOK == true) {
              return count++;
          }
         else {
          count--;
       }
      }
      //添加一个input标签 同时也对它的ID和Name进行赋值。
      function AddInput3() {
      countAA = checkCount(true, count);
         var question = document.getElementById("question_more");
        //创建input
           //创建一个空格
          var br = document.createElement("br");
          question.appendChild(br);
          
         var input = document.createElement("input");
          input.type = "text";
          input.size="1";
          input.id = "questions[" + count + "]";
          input.name = "questions[" + count + "].name";
          question.appendChild(input);           
          var input = document.createElement("input");
          input.type = "text";
          input.size="120";
          input.id = "questions1[" + count + "]";
          input.name = "questions1[" + count + "].name";
          question.appendChild(input);                                     //向元素增加子节点 最为最后一个子节点

          //创建一个空格
          var br = document.createElement("br");
          question.appendChild(br);
          
          var node1=document.createTextNode("图片");
          // 把文本节点添加到p节点里
             question.appendChild(node1);
          var input = document.createElement("input");
          input.type = "file";
          input.id = "questions2[" + count + "]";
          input.name = "questions2[" + count + "].name";

          question.appendChild(input);
          var node=document.createTextNode("视频");
          // 把文本节点添加到p节点里
          question.appendChild(node);
          var input = document.createElement("input");
          input.type = "file";
          input.id = "questions3[" + count + "]";
          input.name = "questions3[" + count + "].name";
          
          question.appendChild(input);
          var input = document.createElement("input");
          input.type = "button";
          input.id = "questions[" + count + "]";
          input.name = "questions[" + count + "].name";
          input.value="删除";
          question.appendChild(input);
      }
//单选题
      var count = 1;

      //用来判断是删除 还是增加按钮 以便count值进行计算
      function checkCount(boolOK, coun) {
         if (boolOK == true) {
              return count++;
          }
         else {
          count--;
       }
      }
      //添加一个input标签 同时也对它的ID和Name进行赋值。
      function AddInput() {
      countAA = checkCount(true, count);
         var question = document.getElementById("question");
        //创建input
           //创建一个空格
          var br = document.createElement("br");
          question.appendChild(br);
          
         var input = document.createElement("input");
          input.type = "text";
          input.size="1";
          input.id = "questions[" + count + "]";
          input.name = "questions[" + count + "].name";
          question.appendChild(input);           
          var input = document.createElement("input");
          input.type = "text";
          input.size="120";
          input.id = "questions1[" + count + "]";
          input.name = "questions1[" + count + "].name";
          question.appendChild(input);                                     //向元素增加子节点 最为最后一个子节点

          //创建一个空格
          var br = document.createElement("br");
          question.appendChild(br);
          
          var node1=document.createTextNode("图片");
          // 把文本节点添加到p节点里
             question.appendChild(node1);
          var input = document.createElement("input");
          input.type = "file";
          input.id = "questions2[" + count + "]";
          input.name = "questions2[" + count + "].name";

          question.appendChild(input);
          var node=document.createTextNode("视频");
          // 把文本节点添加到p节点里
          question.appendChild(node);
          var input = document.createElement("input");
          input.type = "file";
          input.id = "questions3[" + count + "]";
          input.name = "questions3[" + count + "].name";
          
          question.appendChild(input);
          var input = document.createElement("input");
          input.type = "button";
          input.id = "questions[" + count + "]";
          input.name = "questions[" + count + "].name";
          input.value="删除";
          question.appendChild(input);
      }
   // 上传图片
      var i=0;
      function changepic(obj) {
    	  if(i<6){
         	 //首先插入一个图片标签，src属性为空，宽高设置为100px，暂时设为不可见
             document.getElementById("img_span").innerHTML+="<img src=\"\" id=\"show"+i+"\" width=\"200\" style=\"opacity: 0;\">"; 
             //调用getObjectURL函数，返回上传的图片的地址
             var newsrc=getObjectURL(obj.files[0]);
             document.getElementById('show'+i).src=newsrc;//将图片的路径设置为返回上传的图片的地址
             document.getElementById("show"+i).style.opacity=1;//将图片设置为可见
             i++;
         }else {
         	alert("最多上传6张图");
         }
      }
      // 上传图片
      var i=0;
      function changepic1(obj) {
    	  if(i<6){
         	 //首先插入一个图片标签，src属性为空，宽高设置为100px，暂时设为不可见
             document.getElementById("img_span1").innerHTML+="<img src=\"\" id=\"show"+i+"\" width=\"200\" style=\"opacity: 0;\">"; 
             //调用getObjectURL函数，返回上传的图片的地址
             var newsrc=getObjectURL(obj.files[0]);
             document.getElementById('show'+i).src=newsrc;//将图片的路径设置为返回上传的图片的地址
             document.getElementById("show"+i).style.opacity=1;//将图片设置为可见
             i++;
         }else {
         	alert("最多上传6张图");
         }
      }
      //建立一个可存取到该file的url
      function getObjectURL(file) {
          var url = null ;
          // 下面函数执行的效果是一样的，只是需要针对不同的浏览器执行不同的 js 函数而已
          if (window.createObjectURL!=undefined) { // basic
              url = window.createObjectURL(file) ;
          } else if (window.URL!=undefined) { // mozilla(firefox)
              url = window.URL.createObjectURL(file) ;
          } else if (window.webkitURL!=undefined) { // webkit or chrome
              url = window.webkitURL.createObjectURL(file) ;
          }
          return url ;
      }
      
      
      