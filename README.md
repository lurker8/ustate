开发实现过程记录
=================
## 前提：该作品已经开发20多天了，怕晚了之前的回忆不起来，今天补上到现在进度的记录
### 初衷：大二就快剩个暑假了，从去年开始学习java-->javaee、前端基础、mysql、jdbc...-->主流javaee框架SSM-->jquery、ajax-->现在也已经有一年多了，前后也算是做了两次简单的后台管理系统，想独立从头到尾彻彻底底完成一个综合项目，心里也一直有想做一个校园社交类型的平台。最初手头上的javaee和jquery也无从下手，直到今年4月开始学习vue，到当时也快1个月了，也理所应当的想开始实现它，并把它作为一个综合项目来综合练习所学的技术并从中获得经验提升自己

### ps：一个菜鸟新手

#### 以下是总结的开发过程，有些部分时间久了写的简单
1.	初步设想该作品（项目）定位，并思考其名称、logo
2.	思考移动端页面如何排版，搜索并参考优秀移动端页面结构
3.	使用vue-cli脚手架，尝试初步编写页面，模拟json数据来渲染页面
4.	初步编写了路由跳转，以及index，profile页面（后重写）
5.	初步思考如何设计处理发表点赞评论问题（后修改）
6.	初步设计数据库表，模拟数据，使用sql检验合理性
7.	配置javaee框架，简单测试后台成功运行
8.	尝试深入编写后台API
9.	为进行更好地数据渲染，根据后台返回的json数据重新修改前端页面结构
10.	封装了部分重复功能的组件，并重新修改了页面结构
11.	编写基础功能
12.	尝试增加模拟登陆功能（重写后暂时去掉了）
13.	因为设计不合理导致部分重要功能无法实现、资源浪费严重、效率低决定进行大重写
14.	一次推倒大重写（包括前端页面、后端API、数据库表设计）
>a)	参考了微博移动端、scuinfo、移动版虎扑体育的后台请求以及api返回的数据格式，全部推倒重新编写了RESTful风格的API，重写后的API更加清晰明了

>b)	参考了scuinfo的页面结构，去掉了不必要的功能（比如查看点赞列表），使用最初的页面，在此基础上保留部分样式，修改页面结构

>c)	根据前后端的修改，重新设计数据库表，修改了数据库表的结构
15.	期间对部分mybatis中sql语句进行简单优化查询、纠正未成功返回所需要的数据的sql
16.	整理vuex相关代码，按照vuex文档中推荐的文件结构进行整理完善
17.	将api调用全部按照vuex文档中推荐文件结构整理并写到了特定的api文件夹中
18.	购买腾讯云服务器，并配置jdk、tomcat、mysql、nginx
19.	打包vue、javaweb project并尝试部署到服务器上，测试设备能否访问
20.	根据习惯，参考、编写消息通知功能，并进行多次修改渐趋向合理
21.	修改了发表、评论、喜欢等三个页面的后台API、数据库查询语句、前端页面结构修复错误查询、api调用带来的bug
22.	尝试增加滚动条、下拉刷新、上拉加载、loading提示时因为路由跳转第三方组件没达到需求等带来了问题，三天的时间里使用了数款类似的vue的滚动组件，以失败告终
23.	经过三天的尝试，积累的部分经验，使用最初的组件根据自己明确的需求成功实现了滚动以及loading提示
24.	乘势增加了下拉刷新、上拉加载
25.	继续完善基础功能
26.	处理多次异步调用带来的资源浪费，修复其他bug
27. 完善更多菜单，增加举报功能<br>
28. 增加反馈功能
29.	增加各项操作后的通知栏
30.	增加模拟登录退出功能
31.	修改通知表结构并修改mybatis消息部分sql
32. 增了账号密码登录，并将登录相关整理到vuex，并将api放到api文件夹中
33.	增加了校园卡寻找模块…
34.	未完待续......

2017-06-05
准备刷题考试，暂时不写了，准备在暑假写后台并重新整理api

#### 以下是使用到的技术

前端渲染：vue.js+vue-router+vuex+axios

后端API(RESTful风格API)：Java+ssm(springmvc+spring+mybatis)

第三方接口：暂时未使用

数据库：MySQL

服务器：nginx + Tomcat

#### 腾讯云主机配置（每月一块钱）
地域：上海（上海一区）

机型：系列1、标准型S1、1核CPU、1G内存

镜像：CentOS 7.2 64位

存储：系统盘（20G云硬盘）无数据盘

网络：基础网络

带宽：宽带1Mbps

### ----------------------2017年9月28日15:11:37-------------------------
第二版都写完好久了，今天全部一起上传...因为有很多地方写的不好
第一版写到6月5号就结束了...
