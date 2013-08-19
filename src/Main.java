



<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link rel="icon" type="image/vnd.microsoft.icon" href="http://www.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = "gYxeKEugEKb2NT3b5qDyGNfywI0:1376910189894";
 
 
 var CS_env = {"assetVersionPath":"http://www.gstatic.com/codesite/ph/16876283342775096309","profileUrl":"/u/101147021809914525860/","projectHomeUrl":"/p/landmarkloc","token":"gYxeKEugEKb2NT3b5qDyGNfywI0:1376910189894","relativeBaseUrl":"","domainName":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","projectName":"landmarkloc","loggedInUserEmail":"rahulveera2009@gmail.com"};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
 
 </script>
 
 
 <title>Main.java - 
 landmarkloc -
 
 
 Get your location just by taking picture of the nearest landmark - Google Project Hosting
 </title>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 window.___gcfg = {lang: 'en'};
 (function() 
 {var po = document.createElement("script");
 po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
 var s = document.getElementsByTagName("script")[0];
 s.parentNode.insertBefore(po, s);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 
 
 <a href="#" id="multilogin-dropdown" onclick="return false;"
 ><u><b>rahulveera2009@gmail.com</b></u> <small>&#9660;</small></a>
 
 
 | <a href="/u/101147021809914525860/" id="projects-dropdown" onclick="return false;"
 ><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="/u/101147021809914525860/" onclick="_CS_click('/gb/ph/profile');"
 title="Profile, Updates, and Settings"
 ><u>Profile</u></a>
 | <a href="https://www.google.com/accounts/Logout?continue=http%3A%2F%2Fcode.google.com%2Fp%2Flandmarkloc%2Fsource%2Fbrowse%2Ftrunk%2FMain.java" 
 onclick="_CS_click('/gb/ph/signout');"
 ><u>Sign out</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->



 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 
 
 <td id="plogo">
 <link itemprop="url" href="/p/landmarkloc">
 <a href="/p/landmarkloc/">
 
 <img src="http://www.gstatic.com/codesite/ph/images/defaultlogo.png" alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/landmarkloc/"><span itemprop="name">landmarkloc</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/landmarkloc/"><span itemprop="description">Get your location just by taking picture of the nearest landmark</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/landmarkloc/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 <a href="/p/landmarkloc/downloads/list" class="tab ">Downloads</a>
 
 
 
 
 
 <a href="/p/landmarkloc/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 <a href="/p/landmarkloc/issues/list"
 class="tab ">Issues</a>
 
 
 
 
 
 <a href="/p/landmarkloc/source/browse/"
 class="tab active">Source</a>
 
 
 
 
 
 <a href="/p/landmarkloc/admin"
 class="tab inactive">Administer</a>
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/landmarkloc/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/landmarkloc/source/browse/">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/landmarkloc/source/list">Changes</a></span> &nbsp;
 
 
 
 
 
 <a href="/p/landmarkloc/issues/entry?show=review&former=sourcelist">Request code review</a>
 
 
 
 </form>
 <script type="text/javascript">
 
 function codesearchQuery(form) {
 var query = document.getElementById('q').value;
 if (query) { form.action += '%20' + query; }
 }
 </script>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/landmarkloc/source/browse/">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/landmarkloc/source/browse/trunk/">trunk</a><span class="sp">/&nbsp;</span>Main.java</span>
 
 


 </td>
 
 
 <td nowrap="nowrap" width="33%" align="center">
 <a href="/p/landmarkloc/source/browse/trunk/Main.java?edit=1"
 ><img src="http://www.gstatic.com/codesite/ph/images/pencil-y14.png"
 class="edit_icon">Edit file</a>
 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper"><b>r4</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(http://www.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
onmouseout="gutterOut()"><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn4_1"

 onmouseover="gutterOver(1)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',1);">&nbsp;</span
></td><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn4_2"

 onmouseover="gutterOver(2)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',2);">&nbsp;</span
></td><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn4_3"

 onmouseover="gutterOver(3)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',3);">&nbsp;</span
></td><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn4_4"

 onmouseover="gutterOver(4)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',4);">&nbsp;</span
></td><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn4_5"

 onmouseover="gutterOver(5)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',5);">&nbsp;</span
></td><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn4_6"

 onmouseover="gutterOver(6)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',6);">&nbsp;</span
></td><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn4_7"

 onmouseover="gutterOver(7)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',7);">&nbsp;</span
></td><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn4_8"

 onmouseover="gutterOver(8)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',8);">&nbsp;</span
></td><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn4_9"

 onmouseover="gutterOver(9)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',9);">&nbsp;</span
></td><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn4_10"

 onmouseover="gutterOver(10)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',10);">&nbsp;</span
></td><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn4_11"

 onmouseover="gutterOver(11)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',11);">&nbsp;</span
></td><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn4_12"

 onmouseover="gutterOver(12)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',12);">&nbsp;</span
></td><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn4_13"

 onmouseover="gutterOver(13)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',13);">&nbsp;</span
></td><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn4_14"

 onmouseover="gutterOver(14)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',14);">&nbsp;</span
></td><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn4_15"

 onmouseover="gutterOver(15)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',15);">&nbsp;</span
></td><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn4_16"

 onmouseover="gutterOver(16)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',16);">&nbsp;</span
></td><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn4_17"

 onmouseover="gutterOver(17)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',17);">&nbsp;</span
></td><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn4_18"

 onmouseover="gutterOver(18)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',18);">&nbsp;</span
></td><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn4_19"

 onmouseover="gutterOver(19)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',19);">&nbsp;</span
></td><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn4_20"

 onmouseover="gutterOver(20)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',20);">&nbsp;</span
></td><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn4_21"

 onmouseover="gutterOver(21)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',21);">&nbsp;</span
></td><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn4_22"

 onmouseover="gutterOver(22)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',22);">&nbsp;</span
></td><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn4_23"

 onmouseover="gutterOver(23)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',23);">&nbsp;</span
></td><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn4_24"

 onmouseover="gutterOver(24)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',24);">&nbsp;</span
></td><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn4_25"

 onmouseover="gutterOver(25)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',25);">&nbsp;</span
></td><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn4_26"

 onmouseover="gutterOver(26)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',26);">&nbsp;</span
></td><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn4_27"

 onmouseover="gutterOver(27)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',27);">&nbsp;</span
></td><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn4_28"

 onmouseover="gutterOver(28)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',28);">&nbsp;</span
></td><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn4_29"

 onmouseover="gutterOver(29)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',29);">&nbsp;</span
></td><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn4_30"

 onmouseover="gutterOver(30)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',30);">&nbsp;</span
></td><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn4_31"

 onmouseover="gutterOver(31)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',31);">&nbsp;</span
></td><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn4_32"

 onmouseover="gutterOver(32)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',32);">&nbsp;</span
></td><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn4_33"

 onmouseover="gutterOver(33)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',33);">&nbsp;</span
></td><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn4_34"

 onmouseover="gutterOver(34)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',34);">&nbsp;</span
></td><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn4_35"

 onmouseover="gutterOver(35)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',35);">&nbsp;</span
></td><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn4_36"

 onmouseover="gutterOver(36)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',36);">&nbsp;</span
></td><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn4_37"

 onmouseover="gutterOver(37)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',37);">&nbsp;</span
></td><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn4_38"

 onmouseover="gutterOver(38)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',38);">&nbsp;</span
></td><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn4_39"

 onmouseover="gutterOver(39)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',39);">&nbsp;</span
></td><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn4_40"

 onmouseover="gutterOver(40)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',40);">&nbsp;</span
></td><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn4_41"

 onmouseover="gutterOver(41)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',41);">&nbsp;</span
></td><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn4_42"

 onmouseover="gutterOver(42)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',42);">&nbsp;</span
></td><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn4_43"

 onmouseover="gutterOver(43)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',43);">&nbsp;</span
></td><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn4_44"

 onmouseover="gutterOver(44)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',44);">&nbsp;</span
></td><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn4_45"

 onmouseover="gutterOver(45)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',45);">&nbsp;</span
></td><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn4_46"

 onmouseover="gutterOver(46)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',46);">&nbsp;</span
></td><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn4_47"

 onmouseover="gutterOver(47)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',47);">&nbsp;</span
></td><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn4_48"

 onmouseover="gutterOver(48)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',48);">&nbsp;</span
></td><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn4_49"

 onmouseover="gutterOver(49)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',49);">&nbsp;</span
></td><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn4_50"

 onmouseover="gutterOver(50)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',50);">&nbsp;</span
></td><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn4_51"

 onmouseover="gutterOver(51)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',51);">&nbsp;</span
></td><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn4_52"

 onmouseover="gutterOver(52)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',52);">&nbsp;</span
></td><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn4_53"

 onmouseover="gutterOver(53)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',53);">&nbsp;</span
></td><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn4_54"

 onmouseover="gutterOver(54)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',54);">&nbsp;</span
></td><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn4_55"

 onmouseover="gutterOver(55)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',55);">&nbsp;</span
></td><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn4_56"

 onmouseover="gutterOver(56)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',56);">&nbsp;</span
></td><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn4_57"

 onmouseover="gutterOver(57)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',57);">&nbsp;</span
></td><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn4_58"

 onmouseover="gutterOver(58)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',58);">&nbsp;</span
></td><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn4_59"

 onmouseover="gutterOver(59)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',59);">&nbsp;</span
></td><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn4_60"

 onmouseover="gutterOver(60)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',60);">&nbsp;</span
></td><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn4_61"

 onmouseover="gutterOver(61)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',61);">&nbsp;</span
></td><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn4_62"

 onmouseover="gutterOver(62)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',62);">&nbsp;</span
></td><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn4_63"

 onmouseover="gutterOver(63)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',63);">&nbsp;</span
></td><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn4_64"

 onmouseover="gutterOver(64)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',64);">&nbsp;</span
></td><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn4_65"

 onmouseover="gutterOver(65)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',65);">&nbsp;</span
></td><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn4_66"

 onmouseover="gutterOver(66)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',66);">&nbsp;</span
></td><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn4_67"

 onmouseover="gutterOver(67)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',67);">&nbsp;</span
></td><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn4_68"

 onmouseover="gutterOver(68)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',68);">&nbsp;</span
></td><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn4_69"

 onmouseover="gutterOver(69)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',69);">&nbsp;</span
></td><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn4_70"

 onmouseover="gutterOver(70)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',70);">&nbsp;</span
></td><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn4_71"

 onmouseover="gutterOver(71)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',71);">&nbsp;</span
></td><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn4_72"

 onmouseover="gutterOver(72)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',72);">&nbsp;</span
></td><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn4_73"

 onmouseover="gutterOver(73)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',73);">&nbsp;</span
></td><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn4_74"

 onmouseover="gutterOver(74)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',74);">&nbsp;</span
></td><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn4_75"

 onmouseover="gutterOver(75)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',75);">&nbsp;</span
></td><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn4_76"

 onmouseover="gutterOver(76)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',76);">&nbsp;</span
></td><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn4_77"

 onmouseover="gutterOver(77)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',77);">&nbsp;</span
></td><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn4_78"

 onmouseover="gutterOver(78)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',78);">&nbsp;</span
></td><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn4_79"

 onmouseover="gutterOver(79)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',79);">&nbsp;</span
></td><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn4_80"

 onmouseover="gutterOver(80)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',80);">&nbsp;</span
></td><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn4_81"

 onmouseover="gutterOver(81)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',81);">&nbsp;</span
></td><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn4_82"

 onmouseover="gutterOver(82)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',82);">&nbsp;</span
></td><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn4_83"

 onmouseover="gutterOver(83)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',83);">&nbsp;</span
></td><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn4_84"

 onmouseover="gutterOver(84)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',84);">&nbsp;</span
></td><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn4_85"

 onmouseover="gutterOver(85)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',85);">&nbsp;</span
></td><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn4_86"

 onmouseover="gutterOver(86)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',86);">&nbsp;</span
></td><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn4_87"

 onmouseover="gutterOver(87)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',87);">&nbsp;</span
></td><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn4_88"

 onmouseover="gutterOver(88)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',88);">&nbsp;</span
></td><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn4_89"

 onmouseover="gutterOver(89)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',89);">&nbsp;</span
></td><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn4_90"

 onmouseover="gutterOver(90)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',90);">&nbsp;</span
></td><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn4_91"

 onmouseover="gutterOver(91)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',91);">&nbsp;</span
></td><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn4_92"

 onmouseover="gutterOver(92)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',92);">&nbsp;</span
></td><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn4_93"

 onmouseover="gutterOver(93)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',93);">&nbsp;</span
></td><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn4_94"

 onmouseover="gutterOver(94)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',94);">&nbsp;</span
></td><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn4_95"

 onmouseover="gutterOver(95)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',95);">&nbsp;</span
></td><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn4_96"

 onmouseover="gutterOver(96)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',96);">&nbsp;</span
></td><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn4_97"

 onmouseover="gutterOver(97)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',97);">&nbsp;</span
></td><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn4_98"

 onmouseover="gutterOver(98)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',98);">&nbsp;</span
></td><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn4_99"

 onmouseover="gutterOver(99)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',99);">&nbsp;</span
></td><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn4_100"

 onmouseover="gutterOver(100)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',100);">&nbsp;</span
></td><td id="100"><a href="#100">100</a></td></tr
><tr id="gr_svn4_101"

 onmouseover="gutterOver(101)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',101);">&nbsp;</span
></td><td id="101"><a href="#101">101</a></td></tr
><tr id="gr_svn4_102"

 onmouseover="gutterOver(102)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',102);">&nbsp;</span
></td><td id="102"><a href="#102">102</a></td></tr
><tr id="gr_svn4_103"

 onmouseover="gutterOver(103)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',103);">&nbsp;</span
></td><td id="103"><a href="#103">103</a></td></tr
><tr id="gr_svn4_104"

 onmouseover="gutterOver(104)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',104);">&nbsp;</span
></td><td id="104"><a href="#104">104</a></td></tr
><tr id="gr_svn4_105"

 onmouseover="gutterOver(105)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',105);">&nbsp;</span
></td><td id="105"><a href="#105">105</a></td></tr
><tr id="gr_svn4_106"

 onmouseover="gutterOver(106)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',106);">&nbsp;</span
></td><td id="106"><a href="#106">106</a></td></tr
><tr id="gr_svn4_107"

 onmouseover="gutterOver(107)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',107);">&nbsp;</span
></td><td id="107"><a href="#107">107</a></td></tr
><tr id="gr_svn4_108"

 onmouseover="gutterOver(108)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',108);">&nbsp;</span
></td><td id="108"><a href="#108">108</a></td></tr
><tr id="gr_svn4_109"

 onmouseover="gutterOver(109)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',109);">&nbsp;</span
></td><td id="109"><a href="#109">109</a></td></tr
><tr id="gr_svn4_110"

 onmouseover="gutterOver(110)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',110);">&nbsp;</span
></td><td id="110"><a href="#110">110</a></td></tr
><tr id="gr_svn4_111"

 onmouseover="gutterOver(111)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',111);">&nbsp;</span
></td><td id="111"><a href="#111">111</a></td></tr
><tr id="gr_svn4_112"

 onmouseover="gutterOver(112)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',112);">&nbsp;</span
></td><td id="112"><a href="#112">112</a></td></tr
><tr id="gr_svn4_113"

 onmouseover="gutterOver(113)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',113);">&nbsp;</span
></td><td id="113"><a href="#113">113</a></td></tr
><tr id="gr_svn4_114"

 onmouseover="gutterOver(114)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',114);">&nbsp;</span
></td><td id="114"><a href="#114">114</a></td></tr
><tr id="gr_svn4_115"

 onmouseover="gutterOver(115)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',115);">&nbsp;</span
></td><td id="115"><a href="#115">115</a></td></tr
><tr id="gr_svn4_116"

 onmouseover="gutterOver(116)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',116);">&nbsp;</span
></td><td id="116"><a href="#116">116</a></td></tr
><tr id="gr_svn4_117"

 onmouseover="gutterOver(117)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',117);">&nbsp;</span
></td><td id="117"><a href="#117">117</a></td></tr
><tr id="gr_svn4_118"

 onmouseover="gutterOver(118)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',118);">&nbsp;</span
></td><td id="118"><a href="#118">118</a></td></tr
><tr id="gr_svn4_119"

 onmouseover="gutterOver(119)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',119);">&nbsp;</span
></td><td id="119"><a href="#119">119</a></td></tr
><tr id="gr_svn4_120"

 onmouseover="gutterOver(120)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',120);">&nbsp;</span
></td><td id="120"><a href="#120">120</a></td></tr
><tr id="gr_svn4_121"

 onmouseover="gutterOver(121)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',121);">&nbsp;</span
></td><td id="121"><a href="#121">121</a></td></tr
><tr id="gr_svn4_122"

 onmouseover="gutterOver(122)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',122);">&nbsp;</span
></td><td id="122"><a href="#122">122</a></td></tr
><tr id="gr_svn4_123"

 onmouseover="gutterOver(123)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',123);">&nbsp;</span
></td><td id="123"><a href="#123">123</a></td></tr
><tr id="gr_svn4_124"

 onmouseover="gutterOver(124)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',124);">&nbsp;</span
></td><td id="124"><a href="#124">124</a></td></tr
><tr id="gr_svn4_125"

 onmouseover="gutterOver(125)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',125);">&nbsp;</span
></td><td id="125"><a href="#125">125</a></td></tr
><tr id="gr_svn4_126"

 onmouseover="gutterOver(126)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',126);">&nbsp;</span
></td><td id="126"><a href="#126">126</a></td></tr
><tr id="gr_svn4_127"

 onmouseover="gutterOver(127)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',127);">&nbsp;</span
></td><td id="127"><a href="#127">127</a></td></tr
><tr id="gr_svn4_128"

 onmouseover="gutterOver(128)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',128);">&nbsp;</span
></td><td id="128"><a href="#128">128</a></td></tr
><tr id="gr_svn4_129"

 onmouseover="gutterOver(129)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',129);">&nbsp;</span
></td><td id="129"><a href="#129">129</a></td></tr
><tr id="gr_svn4_130"

 onmouseover="gutterOver(130)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',130);">&nbsp;</span
></td><td id="130"><a href="#130">130</a></td></tr
><tr id="gr_svn4_131"

 onmouseover="gutterOver(131)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',131);">&nbsp;</span
></td><td id="131"><a href="#131">131</a></td></tr
><tr id="gr_svn4_132"

 onmouseover="gutterOver(132)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',132);">&nbsp;</span
></td><td id="132"><a href="#132">132</a></td></tr
><tr id="gr_svn4_133"

 onmouseover="gutterOver(133)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',133);">&nbsp;</span
></td><td id="133"><a href="#133">133</a></td></tr
><tr id="gr_svn4_134"

 onmouseover="gutterOver(134)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',134);">&nbsp;</span
></td><td id="134"><a href="#134">134</a></td></tr
><tr id="gr_svn4_135"

 onmouseover="gutterOver(135)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',135);">&nbsp;</span
></td><td id="135"><a href="#135">135</a></td></tr
><tr id="gr_svn4_136"

 onmouseover="gutterOver(136)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',136);">&nbsp;</span
></td><td id="136"><a href="#136">136</a></td></tr
><tr id="gr_svn4_137"

 onmouseover="gutterOver(137)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',137);">&nbsp;</span
></td><td id="137"><a href="#137">137</a></td></tr
><tr id="gr_svn4_138"

 onmouseover="gutterOver(138)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',138);">&nbsp;</span
></td><td id="138"><a href="#138">138</a></td></tr
><tr id="gr_svn4_139"

 onmouseover="gutterOver(139)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',139);">&nbsp;</span
></td><td id="139"><a href="#139">139</a></td></tr
><tr id="gr_svn4_140"

 onmouseover="gutterOver(140)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',140);">&nbsp;</span
></td><td id="140"><a href="#140">140</a></td></tr
><tr id="gr_svn4_141"

 onmouseover="gutterOver(141)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',141);">&nbsp;</span
></td><td id="141"><a href="#141">141</a></td></tr
><tr id="gr_svn4_142"

 onmouseover="gutterOver(142)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',142);">&nbsp;</span
></td><td id="142"><a href="#142">142</a></td></tr
><tr id="gr_svn4_143"

 onmouseover="gutterOver(143)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',143);">&nbsp;</span
></td><td id="143"><a href="#143">143</a></td></tr
><tr id="gr_svn4_144"

 onmouseover="gutterOver(144)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',144);">&nbsp;</span
></td><td id="144"><a href="#144">144</a></td></tr
><tr id="gr_svn4_145"

 onmouseover="gutterOver(145)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',145);">&nbsp;</span
></td><td id="145"><a href="#145">145</a></td></tr
><tr id="gr_svn4_146"

 onmouseover="gutterOver(146)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',146);">&nbsp;</span
></td><td id="146"><a href="#146">146</a></td></tr
><tr id="gr_svn4_147"

 onmouseover="gutterOver(147)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',147);">&nbsp;</span
></td><td id="147"><a href="#147">147</a></td></tr
><tr id="gr_svn4_148"

 onmouseover="gutterOver(148)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',148);">&nbsp;</span
></td><td id="148"><a href="#148">148</a></td></tr
><tr id="gr_svn4_149"

 onmouseover="gutterOver(149)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',149);">&nbsp;</span
></td><td id="149"><a href="#149">149</a></td></tr
><tr id="gr_svn4_150"

 onmouseover="gutterOver(150)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',150);">&nbsp;</span
></td><td id="150"><a href="#150">150</a></td></tr
><tr id="gr_svn4_151"

 onmouseover="gutterOver(151)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',151);">&nbsp;</span
></td><td id="151"><a href="#151">151</a></td></tr
><tr id="gr_svn4_152"

 onmouseover="gutterOver(152)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',152);">&nbsp;</span
></td><td id="152"><a href="#152">152</a></td></tr
><tr id="gr_svn4_153"

 onmouseover="gutterOver(153)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',153);">&nbsp;</span
></td><td id="153"><a href="#153">153</a></td></tr
><tr id="gr_svn4_154"

 onmouseover="gutterOver(154)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',154);">&nbsp;</span
></td><td id="154"><a href="#154">154</a></td></tr
><tr id="gr_svn4_155"

 onmouseover="gutterOver(155)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',155);">&nbsp;</span
></td><td id="155"><a href="#155">155</a></td></tr
><tr id="gr_svn4_156"

 onmouseover="gutterOver(156)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',156);">&nbsp;</span
></td><td id="156"><a href="#156">156</a></td></tr
><tr id="gr_svn4_157"

 onmouseover="gutterOver(157)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',157);">&nbsp;</span
></td><td id="157"><a href="#157">157</a></td></tr
><tr id="gr_svn4_158"

 onmouseover="gutterOver(158)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',158);">&nbsp;</span
></td><td id="158"><a href="#158">158</a></td></tr
><tr id="gr_svn4_159"

 onmouseover="gutterOver(159)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',159);">&nbsp;</span
></td><td id="159"><a href="#159">159</a></td></tr
><tr id="gr_svn4_160"

 onmouseover="gutterOver(160)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',160);">&nbsp;</span
></td><td id="160"><a href="#160">160</a></td></tr
><tr id="gr_svn4_161"

 onmouseover="gutterOver(161)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',161);">&nbsp;</span
></td><td id="161"><a href="#161">161</a></td></tr
><tr id="gr_svn4_162"

 onmouseover="gutterOver(162)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',162);">&nbsp;</span
></td><td id="162"><a href="#162">162</a></td></tr
><tr id="gr_svn4_163"

 onmouseover="gutterOver(163)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',163);">&nbsp;</span
></td><td id="163"><a href="#163">163</a></td></tr
><tr id="gr_svn4_164"

 onmouseover="gutterOver(164)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',164);">&nbsp;</span
></td><td id="164"><a href="#164">164</a></td></tr
><tr id="gr_svn4_165"

 onmouseover="gutterOver(165)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',165);">&nbsp;</span
></td><td id="165"><a href="#165">165</a></td></tr
><tr id="gr_svn4_166"

 onmouseover="gutterOver(166)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',166);">&nbsp;</span
></td><td id="166"><a href="#166">166</a></td></tr
><tr id="gr_svn4_167"

 onmouseover="gutterOver(167)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',167);">&nbsp;</span
></td><td id="167"><a href="#167">167</a></td></tr
><tr id="gr_svn4_168"

 onmouseover="gutterOver(168)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',168);">&nbsp;</span
></td><td id="168"><a href="#168">168</a></td></tr
><tr id="gr_svn4_169"

 onmouseover="gutterOver(169)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',169);">&nbsp;</span
></td><td id="169"><a href="#169">169</a></td></tr
><tr id="gr_svn4_170"

 onmouseover="gutterOver(170)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',170);">&nbsp;</span
></td><td id="170"><a href="#170">170</a></td></tr
><tr id="gr_svn4_171"

 onmouseover="gutterOver(171)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',171);">&nbsp;</span
></td><td id="171"><a href="#171">171</a></td></tr
><tr id="gr_svn4_172"

 onmouseover="gutterOver(172)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',172);">&nbsp;</span
></td><td id="172"><a href="#172">172</a></td></tr
><tr id="gr_svn4_173"

 onmouseover="gutterOver(173)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',173);">&nbsp;</span
></td><td id="173"><a href="#173">173</a></td></tr
><tr id="gr_svn4_174"

 onmouseover="gutterOver(174)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',174);">&nbsp;</span
></td><td id="174"><a href="#174">174</a></td></tr
><tr id="gr_svn4_175"

 onmouseover="gutterOver(175)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',175);">&nbsp;</span
></td><td id="175"><a href="#175">175</a></td></tr
><tr id="gr_svn4_176"

 onmouseover="gutterOver(176)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',176);">&nbsp;</span
></td><td id="176"><a href="#176">176</a></td></tr
><tr id="gr_svn4_177"

 onmouseover="gutterOver(177)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',177);">&nbsp;</span
></td><td id="177"><a href="#177">177</a></td></tr
><tr id="gr_svn4_178"

 onmouseover="gutterOver(178)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',178);">&nbsp;</span
></td><td id="178"><a href="#178">178</a></td></tr
><tr id="gr_svn4_179"

 onmouseover="gutterOver(179)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',179);">&nbsp;</span
></td><td id="179"><a href="#179">179</a></td></tr
><tr id="gr_svn4_180"

 onmouseover="gutterOver(180)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',180);">&nbsp;</span
></td><td id="180"><a href="#180">180</a></td></tr
><tr id="gr_svn4_181"

 onmouseover="gutterOver(181)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',181);">&nbsp;</span
></td><td id="181"><a href="#181">181</a></td></tr
><tr id="gr_svn4_182"

 onmouseover="gutterOver(182)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',182);">&nbsp;</span
></td><td id="182"><a href="#182">182</a></td></tr
><tr id="gr_svn4_183"

 onmouseover="gutterOver(183)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',183);">&nbsp;</span
></td><td id="183"><a href="#183">183</a></td></tr
><tr id="gr_svn4_184"

 onmouseover="gutterOver(184)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',184);">&nbsp;</span
></td><td id="184"><a href="#184">184</a></td></tr
><tr id="gr_svn4_185"

 onmouseover="gutterOver(185)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',185);">&nbsp;</span
></td><td id="185"><a href="#185">185</a></td></tr
><tr id="gr_svn4_186"

 onmouseover="gutterOver(186)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',186);">&nbsp;</span
></td><td id="186"><a href="#186">186</a></td></tr
><tr id="gr_svn4_187"

 onmouseover="gutterOver(187)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',187);">&nbsp;</span
></td><td id="187"><a href="#187">187</a></td></tr
><tr id="gr_svn4_188"

 onmouseover="gutterOver(188)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',188);">&nbsp;</span
></td><td id="188"><a href="#188">188</a></td></tr
><tr id="gr_svn4_189"

 onmouseover="gutterOver(189)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',189);">&nbsp;</span
></td><td id="189"><a href="#189">189</a></td></tr
><tr id="gr_svn4_190"

 onmouseover="gutterOver(190)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',190);">&nbsp;</span
></td><td id="190"><a href="#190">190</a></td></tr
><tr id="gr_svn4_191"

 onmouseover="gutterOver(191)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',191);">&nbsp;</span
></td><td id="191"><a href="#191">191</a></td></tr
><tr id="gr_svn4_192"

 onmouseover="gutterOver(192)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',192);">&nbsp;</span
></td><td id="192"><a href="#192">192</a></td></tr
><tr id="gr_svn4_193"

 onmouseover="gutterOver(193)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',193);">&nbsp;</span
></td><td id="193"><a href="#193">193</a></td></tr
><tr id="gr_svn4_194"

 onmouseover="gutterOver(194)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',194);">&nbsp;</span
></td><td id="194"><a href="#194">194</a></td></tr
><tr id="gr_svn4_195"

 onmouseover="gutterOver(195)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',195);">&nbsp;</span
></td><td id="195"><a href="#195">195</a></td></tr
><tr id="gr_svn4_196"

 onmouseover="gutterOver(196)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',196);">&nbsp;</span
></td><td id="196"><a href="#196">196</a></td></tr
><tr id="gr_svn4_197"

 onmouseover="gutterOver(197)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',197);">&nbsp;</span
></td><td id="197"><a href="#197">197</a></td></tr
><tr id="gr_svn4_198"

 onmouseover="gutterOver(198)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',198);">&nbsp;</span
></td><td id="198"><a href="#198">198</a></td></tr
><tr id="gr_svn4_199"

 onmouseover="gutterOver(199)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',199);">&nbsp;</span
></td><td id="199"><a href="#199">199</a></td></tr
><tr id="gr_svn4_200"

 onmouseover="gutterOver(200)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',200);">&nbsp;</span
></td><td id="200"><a href="#200">200</a></td></tr
><tr id="gr_svn4_201"

 onmouseover="gutterOver(201)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',201);">&nbsp;</span
></td><td id="201"><a href="#201">201</a></td></tr
><tr id="gr_svn4_202"

 onmouseover="gutterOver(202)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',202);">&nbsp;</span
></td><td id="202"><a href="#202">202</a></td></tr
><tr id="gr_svn4_203"

 onmouseover="gutterOver(203)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',203);">&nbsp;</span
></td><td id="203"><a href="#203">203</a></td></tr
><tr id="gr_svn4_204"

 onmouseover="gutterOver(204)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',204);">&nbsp;</span
></td><td id="204"><a href="#204">204</a></td></tr
><tr id="gr_svn4_205"

 onmouseover="gutterOver(205)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',205);">&nbsp;</span
></td><td id="205"><a href="#205">205</a></td></tr
><tr id="gr_svn4_206"

 onmouseover="gutterOver(206)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',206);">&nbsp;</span
></td><td id="206"><a href="#206">206</a></td></tr
><tr id="gr_svn4_207"

 onmouseover="gutterOver(207)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',207);">&nbsp;</span
></td><td id="207"><a href="#207">207</a></td></tr
><tr id="gr_svn4_208"

 onmouseover="gutterOver(208)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',208);">&nbsp;</span
></td><td id="208"><a href="#208">208</a></td></tr
><tr id="gr_svn4_209"

 onmouseover="gutterOver(209)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',209);">&nbsp;</span
></td><td id="209"><a href="#209">209</a></td></tr
><tr id="gr_svn4_210"

 onmouseover="gutterOver(210)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',210);">&nbsp;</span
></td><td id="210"><a href="#210">210</a></td></tr
><tr id="gr_svn4_211"

 onmouseover="gutterOver(211)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',211);">&nbsp;</span
></td><td id="211"><a href="#211">211</a></td></tr
><tr id="gr_svn4_212"

 onmouseover="gutterOver(212)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',212);">&nbsp;</span
></td><td id="212"><a href="#212">212</a></td></tr
><tr id="gr_svn4_213"

 onmouseover="gutterOver(213)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',213);">&nbsp;</span
></td><td id="213"><a href="#213">213</a></td></tr
><tr id="gr_svn4_214"

 onmouseover="gutterOver(214)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',214);">&nbsp;</span
></td><td id="214"><a href="#214">214</a></td></tr
><tr id="gr_svn4_215"

 onmouseover="gutterOver(215)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',215);">&nbsp;</span
></td><td id="215"><a href="#215">215</a></td></tr
><tr id="gr_svn4_216"

 onmouseover="gutterOver(216)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',216);">&nbsp;</span
></td><td id="216"><a href="#216">216</a></td></tr
><tr id="gr_svn4_217"

 onmouseover="gutterOver(217)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',217);">&nbsp;</span
></td><td id="217"><a href="#217">217</a></td></tr
><tr id="gr_svn4_218"

 onmouseover="gutterOver(218)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',218);">&nbsp;</span
></td><td id="218"><a href="#218">218</a></td></tr
><tr id="gr_svn4_219"

 onmouseover="gutterOver(219)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',219);">&nbsp;</span
></td><td id="219"><a href="#219">219</a></td></tr
><tr id="gr_svn4_220"

 onmouseover="gutterOver(220)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',220);">&nbsp;</span
></td><td id="220"><a href="#220">220</a></td></tr
><tr id="gr_svn4_221"

 onmouseover="gutterOver(221)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',221);">&nbsp;</span
></td><td id="221"><a href="#221">221</a></td></tr
><tr id="gr_svn4_222"

 onmouseover="gutterOver(222)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',222);">&nbsp;</span
></td><td id="222"><a href="#222">222</a></td></tr
><tr id="gr_svn4_223"

 onmouseover="gutterOver(223)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',223);">&nbsp;</span
></td><td id="223"><a href="#223">223</a></td></tr
><tr id="gr_svn4_224"

 onmouseover="gutterOver(224)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',224);">&nbsp;</span
></td><td id="224"><a href="#224">224</a></td></tr
><tr id="gr_svn4_225"

 onmouseover="gutterOver(225)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',225);">&nbsp;</span
></td><td id="225"><a href="#225">225</a></td></tr
><tr id="gr_svn4_226"

 onmouseover="gutterOver(226)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',226);">&nbsp;</span
></td><td id="226"><a href="#226">226</a></td></tr
><tr id="gr_svn4_227"

 onmouseover="gutterOver(227)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',227);">&nbsp;</span
></td><td id="227"><a href="#227">227</a></td></tr
><tr id="gr_svn4_228"

 onmouseover="gutterOver(228)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',228);">&nbsp;</span
></td><td id="228"><a href="#228">228</a></td></tr
><tr id="gr_svn4_229"

 onmouseover="gutterOver(229)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn4',229);">&nbsp;</span
></td><td id="229"><a href="#229">229</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre class="prettyprint lang-java"><table id="src_table_0"><tr
id=sl_svn4_1

 onmouseover="gutterOver(1)"

><td class="source">package com.rahulsharma.proapp;<br></td></tr
><tr
id=sl_svn4_2

 onmouseover="gutterOver(2)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_3

 onmouseover="gutterOver(3)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_4

 onmouseover="gutterOver(4)"

><td class="source">import java.io.BufferedReader;<br></td></tr
><tr
id=sl_svn4_5

 onmouseover="gutterOver(5)"

><td class="source">import java.io.InputStream;<br></td></tr
><tr
id=sl_svn4_6

 onmouseover="gutterOver(6)"

><td class="source">import java.io.InputStreamReader;<br></td></tr
><tr
id=sl_svn4_7

 onmouseover="gutterOver(7)"

><td class="source">import java.util.ArrayList;<br></td></tr
><tr
id=sl_svn4_8

 onmouseover="gutterOver(8)"

><td class="source">import java.util.List;<br></td></tr
><tr
id=sl_svn4_9

 onmouseover="gutterOver(9)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_10

 onmouseover="gutterOver(10)"

><td class="source">import org.apache.http.HttpEntity;<br></td></tr
><tr
id=sl_svn4_11

 onmouseover="gutterOver(11)"

><td class="source">import org.apache.http.HttpResponse;<br></td></tr
><tr
id=sl_svn4_12

 onmouseover="gutterOver(12)"

><td class="source">import org.apache.http.StatusLine;<br></td></tr
><tr
id=sl_svn4_13

 onmouseover="gutterOver(13)"

><td class="source">import org.apache.http.client.HttpClient;<br></td></tr
><tr
id=sl_svn4_14

 onmouseover="gutterOver(14)"

><td class="source">import org.apache.http.client.methods.HttpPost;<br></td></tr
><tr
id=sl_svn4_15

 onmouseover="gutterOver(15)"

><td class="source">import org.apache.http.entity.StringEntity;<br></td></tr
><tr
id=sl_svn4_16

 onmouseover="gutterOver(16)"

><td class="source">import org.apache.http.impl.client.DefaultHttpClient;<br></td></tr
><tr
id=sl_svn4_17

 onmouseover="gutterOver(17)"

><td class="source">import org.apache.http.message.BasicHeader;<br></td></tr
><tr
id=sl_svn4_18

 onmouseover="gutterOver(18)"

><td class="source">import org.apache.http.params.HttpConnectionParams;<br></td></tr
><tr
id=sl_svn4_19

 onmouseover="gutterOver(19)"

><td class="source">import org.apache.http.protocol.HTTP;<br></td></tr
><tr
id=sl_svn4_20

 onmouseover="gutterOver(20)"

><td class="source">import org.json.JSONException;<br></td></tr
><tr
id=sl_svn4_21

 onmouseover="gutterOver(21)"

><td class="source">import org.json.JSONObject;<br></td></tr
><tr
id=sl_svn4_22

 onmouseover="gutterOver(22)"

><td class="source">import org.opencv.android.Utils;<br></td></tr
><tr
id=sl_svn4_23

 onmouseover="gutterOver(23)"

><td class="source">import org.opencv.core.Mat;<br></td></tr
><tr
id=sl_svn4_24

 onmouseover="gutterOver(24)"

><td class="source">import org.opencv.features2d.FeatureDetector;<br></td></tr
><tr
id=sl_svn4_25

 onmouseover="gutterOver(25)"

><td class="source">import org.opencv.features2d.KeyPoint;<br></td></tr
><tr
id=sl_svn4_26

 onmouseover="gutterOver(26)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_27

 onmouseover="gutterOver(27)"

><td class="source">import android.app.Activity;<br></td></tr
><tr
id=sl_svn4_28

 onmouseover="gutterOver(28)"

><td class="source">import android.app.AlertDialog;<br></td></tr
><tr
id=sl_svn4_29

 onmouseover="gutterOver(29)"

><td class="source">import android.app.ProgressDialog;<br></td></tr
><tr
id=sl_svn4_30

 onmouseover="gutterOver(30)"

><td class="source">import android.content.DialogInterface;<br></td></tr
><tr
id=sl_svn4_31

 onmouseover="gutterOver(31)"

><td class="source">import android.content.Intent;<br></td></tr
><tr
id=sl_svn4_32

 onmouseover="gutterOver(32)"

><td class="source">import android.graphics.Bitmap;<br></td></tr
><tr
id=sl_svn4_33

 onmouseover="gutterOver(33)"

><td class="source">import android.graphics.BitmapFactory;<br></td></tr
><tr
id=sl_svn4_34

 onmouseover="gutterOver(34)"

><td class="source">import android.os.Bundle;<br></td></tr
><tr
id=sl_svn4_35

 onmouseover="gutterOver(35)"

><td class="source">import android.os.Handler;<br></td></tr
><tr
id=sl_svn4_36

 onmouseover="gutterOver(36)"

><td class="source">import android.util.Log;<br></td></tr
><tr
id=sl_svn4_37

 onmouseover="gutterOver(37)"

><td class="source">import android.view.Menu;<br></td></tr
><tr
id=sl_svn4_38

 onmouseover="gutterOver(38)"

><td class="source">import android.view.MenuInflater;<br></td></tr
><tr
id=sl_svn4_39

 onmouseover="gutterOver(39)"

><td class="source">import android.view.MenuItem;<br></td></tr
><tr
id=sl_svn4_40

 onmouseover="gutterOver(40)"

><td class="source">import android.view.View;<br></td></tr
><tr
id=sl_svn4_41

 onmouseover="gutterOver(41)"

><td class="source">import android.view.View.OnClickListener;<br></td></tr
><tr
id=sl_svn4_42

 onmouseover="gutterOver(42)"

><td class="source">import android.widget.Button;<br></td></tr
><tr
id=sl_svn4_43

 onmouseover="gutterOver(43)"

><td class="source">import android.widget.ImageView;<br></td></tr
><tr
id=sl_svn4_44

 onmouseover="gutterOver(44)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_45

 onmouseover="gutterOver(45)"

><td class="source">public class Main extends Activity implements Runnable{<br></td></tr
><tr
id=sl_svn4_46

 onmouseover="gutterOver(46)"

><td class="source">    <br></td></tr
><tr
id=sl_svn4_47

 onmouseover="gutterOver(47)"

><td class="source">	ImageView iv;<br></td></tr
><tr
id=sl_svn4_48

 onmouseover="gutterOver(48)"

><td class="source">	List&lt;KeyPoint&gt; kp = new ArrayList&lt;KeyPoint&gt;();<br></td></tr
><tr
id=sl_svn4_49

 onmouseover="gutterOver(49)"

><td class="source">	Bitmap bm;<br></td></tr
><tr
id=sl_svn4_50

 onmouseover="gutterOver(50)"

><td class="source">	Mat img;<br></td></tr
><tr
id=sl_svn4_51

 onmouseover="gutterOver(51)"

><td class="source">	FeatureDetector fd;<br></td></tr
><tr
id=sl_svn4_52

 onmouseover="gutterOver(52)"

><td class="source">	int size;<br></td></tr
><tr
id=sl_svn4_53

 onmouseover="gutterOver(53)"

><td class="source">	String url;<br></td></tr
><tr
id=sl_svn4_54

 onmouseover="gutterOver(54)"

><td class="source">    @Override<br></td></tr
><tr
id=sl_svn4_55

 onmouseover="gutterOver(55)"

><td class="source">    public void onCreate(Bundle savedInstanceState) {<br></td></tr
><tr
id=sl_svn4_56

 onmouseover="gutterOver(56)"

><td class="source">        super.onCreate(savedInstanceState);<br></td></tr
><tr
id=sl_svn4_57

 onmouseover="gutterOver(57)"

><td class="source">        setContentView(R.layout.main);<br></td></tr
><tr
id=sl_svn4_58

 onmouseover="gutterOver(58)"

><td class="source">        <br></td></tr
><tr
id=sl_svn4_59

 onmouseover="gutterOver(59)"

><td class="source">        iv = (ImageView) findViewById(R.id.imageView1);<br></td></tr
><tr
id=sl_svn4_60

 onmouseover="gutterOver(60)"

><td class="source">        <br></td></tr
><tr
id=sl_svn4_61

 onmouseover="gutterOver(61)"

><td class="source">        final ProgressDialog pd = new ProgressDialog(this);<br></td></tr
><tr
id=sl_svn4_62

 onmouseover="gutterOver(62)"

><td class="source">        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);<br></td></tr
><tr
id=sl_svn4_63

 onmouseover="gutterOver(63)"

><td class="source">        pd.setMessage(&quot;Getting Your Location...Please Wait!&quot;);<br></td></tr
><tr
id=sl_svn4_64

 onmouseover="gutterOver(64)"

><td class="source">        pd.setIndeterminate(true);<br></td></tr
><tr
id=sl_svn4_65

 onmouseover="gutterOver(65)"

><td class="source">        pd.setCancelable(true);<br></td></tr
><tr
id=sl_svn4_66

 onmouseover="gutterOver(66)"

><td class="source">        <br></td></tr
><tr
id=sl_svn4_67

 onmouseover="gutterOver(67)"

><td class="source">        bm = BitmapFactory.decodeResource(getResources(), R.drawable.iit_kharagpur_main_building);<br></td></tr
><tr
id=sl_svn4_68

 onmouseover="gutterOver(68)"

><td class="source">        iv.setImageBitmap(bm);<br></td></tr
><tr
id=sl_svn4_69

 onmouseover="gutterOver(69)"

><td class="source">        <br></td></tr
><tr
id=sl_svn4_70

 onmouseover="gutterOver(70)"

><td class="source">        Button b1 = (Button) findViewById(R.id.button1);<br></td></tr
><tr
id=sl_svn4_71

 onmouseover="gutterOver(71)"

><td class="source">        b1.setOnClickListener(new OnClickListener() {<br></td></tr
><tr
id=sl_svn4_72

 onmouseover="gutterOver(72)"

><td class="source">			<br></td></tr
><tr
id=sl_svn4_73

 onmouseover="gutterOver(73)"

><td class="source">			@Override<br></td></tr
><tr
id=sl_svn4_74

 onmouseover="gutterOver(74)"

><td class="source">			public void onClick(View v) {<br></td></tr
><tr
id=sl_svn4_75

 onmouseover="gutterOver(75)"

><td class="source">				Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);<br></td></tr
><tr
id=sl_svn4_76

 onmouseover="gutterOver(76)"

><td class="source">				startActivityForResult(intent, 0);				<br></td></tr
><tr
id=sl_svn4_77

 onmouseover="gutterOver(77)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn4_78

 onmouseover="gutterOver(78)"

><td class="source">		});<br></td></tr
><tr
id=sl_svn4_79

 onmouseover="gutterOver(79)"

><td class="source">        <br></td></tr
><tr
id=sl_svn4_80

 onmouseover="gutterOver(80)"

><td class="source">        Button b2 = (Button) findViewById(R.id.button2);<br></td></tr
><tr
id=sl_svn4_81

 onmouseover="gutterOver(81)"

><td class="source">        b2.setOnClickListener(new OnClickListener() {<br></td></tr
><tr
id=sl_svn4_82

 onmouseover="gutterOver(82)"

><td class="source">			<br></td></tr
><tr
id=sl_svn4_83

 onmouseover="gutterOver(83)"

><td class="source">        Handler transThreadHandler = new Handler();<br></td></tr
><tr
id=sl_svn4_84

 onmouseover="gutterOver(84)"

><td class="source">        JSONObject jsonobject = null;<br></td></tr
><tr
id=sl_svn4_85

 onmouseover="gutterOver(85)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_86

 onmouseover="gutterOver(86)"

><td class="source">			@Override<br></td></tr
><tr
id=sl_svn4_87

 onmouseover="gutterOver(87)"

><td class="source">			public void onClick(View v) {<br></td></tr
><tr
id=sl_svn4_88

 onmouseover="gutterOver(88)"

><td class="source">				if(bm != null){<br></td></tr
><tr
id=sl_svn4_89

 onmouseover="gutterOver(89)"

><td class="source">					pd.show();<br></td></tr
><tr
id=sl_svn4_90

 onmouseover="gutterOver(90)"

><td class="source">					//Log.v(&quot;#1&quot;, &quot;Working till now!&quot; + url);<br></td></tr
><tr
id=sl_svn4_91

 onmouseover="gutterOver(91)"

><td class="source">					//Log.v(&quot;#2&quot;, &quot;Working till now!&quot; + size);<br></td></tr
><tr
id=sl_svn4_92

 onmouseover="gutterOver(92)"

><td class="source">					new Thread(new Runnable(){<br></td></tr
><tr
id=sl_svn4_93

 onmouseover="gutterOver(93)"

><td class="source">				        public void run(){<br></td></tr
><tr
id=sl_svn4_94

 onmouseover="gutterOver(94)"

><td class="source">				        	img = Utils.bitmapToMat(bm);<br></td></tr
><tr
id=sl_svn4_95

 onmouseover="gutterOver(95)"

><td class="source">				        	fd = FeatureDetector.create(FeatureDetector.SURF);<br></td></tr
><tr
id=sl_svn4_96

 onmouseover="gutterOver(96)"

><td class="source">				        	fd.detect(img, kp);<br></td></tr
><tr
id=sl_svn4_97

 onmouseover="gutterOver(97)"

><td class="source">				        	//Log.v(&quot;#3&quot;, &quot;Working till now!&quot;);<br></td></tr
><tr
id=sl_svn4_98

 onmouseover="gutterOver(98)"

><td class="source">				        	JSONObject obj = new JSONObject();<br></td></tr
><tr
id=sl_svn4_99

 onmouseover="gutterOver(99)"

><td class="source">				        	Log.v(&quot;#4&quot;, &quot;Working till now!&quot; + size);<br></td></tr
><tr
id=sl_svn4_100

 onmouseover="gutterOver(100)"

><td class="source">				        	<br></td></tr
><tr
id=sl_svn4_101

 onmouseover="gutterOver(101)"

><td class="source">				        	try {<br></td></tr
><tr
id=sl_svn4_102

 onmouseover="gutterOver(102)"

><td class="source">				        		for(int i=0; i&lt;size; i++){<br></td></tr
><tr
id=sl_svn4_103

 onmouseover="gutterOver(103)"

><td class="source">				        			KeyPoint keypoint = kp.get(i);<br></td></tr
><tr
id=sl_svn4_104

 onmouseover="gutterOver(104)"

><td class="source">				        			JSONObject object = new JSONObject();<br></td></tr
><tr
id=sl_svn4_105

 onmouseover="gutterOver(105)"

><td class="source">				        			object.put(&quot;x&quot;, keypoint.pt.x);<br></td></tr
><tr
id=sl_svn4_106

 onmouseover="gutterOver(106)"

><td class="source">				        			object.put(&quot;y&quot;, keypoint.pt.y);<br></td></tr
><tr
id=sl_svn4_107

 onmouseover="gutterOver(107)"

><td class="source">				        			object.put(&quot;size&quot;, keypoint.size);<br></td></tr
><tr
id=sl_svn4_108

 onmouseover="gutterOver(108)"

><td class="source">				        			object.put(&quot;angle&quot;, keypoint.angle);<br></td></tr
><tr
id=sl_svn4_109

 onmouseover="gutterOver(109)"

><td class="source">				        			object.put(&quot;response&quot;, keypoint.response);<br></td></tr
><tr
id=sl_svn4_110

 onmouseover="gutterOver(110)"

><td class="source">				        			object.put(&quot;octave&quot;, keypoint.octave);<br></td></tr
><tr
id=sl_svn4_111

 onmouseover="gutterOver(111)"

><td class="source">				        			object.put(&quot;class_id&quot;, keypoint.class_id);<br></td></tr
><tr
id=sl_svn4_112

 onmouseover="gutterOver(112)"

><td class="source">				        			obj.put(&quot;keypoint&quot;, object);<br></td></tr
><tr
id=sl_svn4_113

 onmouseover="gutterOver(113)"

><td class="source">				        		}<br></td></tr
><tr
id=sl_svn4_114

 onmouseover="gutterOver(114)"

><td class="source">				        	} catch (JSONException e) {<br></td></tr
><tr
id=sl_svn4_115

 onmouseover="gutterOver(115)"

><td class="source">				        		// TODO Auto-generated catch block<br></td></tr
><tr
id=sl_svn4_116

 onmouseover="gutterOver(116)"

><td class="source">				        		e.printStackTrace();<br></td></tr
><tr
id=sl_svn4_117

 onmouseover="gutterOver(117)"

><td class="source">				        	}<br></td></tr
><tr
id=sl_svn4_118

 onmouseover="gutterOver(118)"

><td class="source">				        	//Log.v(&quot;#5&quot;, &quot;Working till now!&quot; + url);<br></td></tr
><tr
id=sl_svn4_119

 onmouseover="gutterOver(119)"

><td class="source">				        	HttpClient client = new DefaultHttpClient();<br></td></tr
><tr
id=sl_svn4_120

 onmouseover="gutterOver(120)"

><td class="source">				        	HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000); //Timeout Limit<br></td></tr
><tr
id=sl_svn4_121

 onmouseover="gutterOver(121)"

><td class="source">				        	StringBuilder builder = new StringBuilder();<br></td></tr
><tr
id=sl_svn4_122

 onmouseover="gutterOver(122)"

><td class="source">				        	try{<br></td></tr
><tr
id=sl_svn4_123

 onmouseover="gutterOver(123)"

><td class="source">				        		HttpPost post = new HttpPost(url);<br></td></tr
><tr
id=sl_svn4_124

 onmouseover="gutterOver(124)"

><td class="source">				        		StringEntity se = new StringEntity( &quot;JSON: &quot; + obj.toString());  <br></td></tr
><tr
id=sl_svn4_125

 onmouseover="gutterOver(125)"

><td class="source">				        		se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, &quot;application/json&quot;));<br></td></tr
><tr
id=sl_svn4_126

 onmouseover="gutterOver(126)"

><td class="source">				        		post.setEntity(se);<br></td></tr
><tr
id=sl_svn4_127

 onmouseover="gutterOver(127)"

><td class="source">				        		HttpResponse response = client.execute(post);<br></td></tr
><tr
id=sl_svn4_128

 onmouseover="gutterOver(128)"

><td class="source">				        		HttpEntity entity = response.getEntity();<br></td></tr
><tr
id=sl_svn4_129

 onmouseover="gutterOver(129)"

><td class="source">				        		StatusLine statusline = response.getStatusLine();<br></td></tr
><tr
id=sl_svn4_130

 onmouseover="gutterOver(130)"

><td class="source">				        		int statuscode = statusline.getStatusCode();<br></td></tr
><tr
id=sl_svn4_131

 onmouseover="gutterOver(131)"

><td class="source">				        		if(statuscode == 200){<br></td></tr
><tr
id=sl_svn4_132

 onmouseover="gutterOver(132)"

><td class="source">				        			InputStream instream = entity.getContent();                    <br></td></tr
><tr
id=sl_svn4_133

 onmouseover="gutterOver(133)"

><td class="source">				        			BufferedReader reader = new BufferedReader(<br></td></tr
><tr
id=sl_svn4_134

 onmouseover="gutterOver(134)"

><td class="source">				        					new InputStreamReader(instream));<br></td></tr
><tr
id=sl_svn4_135

 onmouseover="gutterOver(135)"

><td class="source">				        			String line;<br></td></tr
><tr
id=sl_svn4_136

 onmouseover="gutterOver(136)"

><td class="source">				        			while ((line = reader.readLine()) != null) {<br></td></tr
><tr
id=sl_svn4_137

 onmouseover="gutterOver(137)"

><td class="source">				        				builder.append(line);<br></td></tr
><tr
id=sl_svn4_138

 onmouseover="gutterOver(138)"

><td class="source">				        			}	<br></td></tr
><tr
id=sl_svn4_139

 onmouseover="gutterOver(139)"

><td class="source">				        			jsonobject = new JSONObject(builder.toString());<br></td></tr
><tr
id=sl_svn4_140

 onmouseover="gutterOver(140)"

><td class="source">				        		}<br></td></tr
><tr
id=sl_svn4_141

 onmouseover="gutterOver(141)"

><td class="source">				        		else{<br></td></tr
><tr
id=sl_svn4_142

 onmouseover="gutterOver(142)"

><td class="source">				        			Log.e(&quot;TAG&quot;, &quot;Failed to download file!&quot;);<br></td></tr
><tr
id=sl_svn4_143

 onmouseover="gutterOver(143)"

><td class="source">				        		}<br></td></tr
><tr
id=sl_svn4_144

 onmouseover="gutterOver(144)"

><td class="source">				        	}catch(Exception e){<br></td></tr
><tr
id=sl_svn4_145

 onmouseover="gutterOver(145)"

><td class="source">				        		e.printStackTrace();<br></td></tr
><tr
id=sl_svn4_146

 onmouseover="gutterOver(146)"

><td class="source">				        	}<br></td></tr
><tr
id=sl_svn4_147

 onmouseover="gutterOver(147)"

><td class="source">				        transThreadHandler.post(new Runnable(){<br></td></tr
><tr
id=sl_svn4_148

 onmouseover="gutterOver(148)"

><td class="source">				        	public void run(){<br></td></tr
><tr
id=sl_svn4_149

 onmouseover="gutterOver(149)"

><td class="source">				        		//KeyPoint key = kp.get(0);<br></td></tr
><tr
id=sl_svn4_150

 onmouseover="gutterOver(150)"

><td class="source">				        		//double valx = key.pt.x;<br></td></tr
><tr
id=sl_svn4_151

 onmouseover="gutterOver(151)"

><td class="source">				        		//double valy = key.pt.y;<br></td></tr
><tr
id=sl_svn4_152

 onmouseover="gutterOver(152)"

><td class="source">				        		//Log.v(&quot;keypoint&quot;, &quot;X coordinate&quot; + valx);<br></td></tr
><tr
id=sl_svn4_153

 onmouseover="gutterOver(153)"

><td class="source">				        		//Log.v(&quot;keypoint&quot;, &quot;Y coordinate&quot; + valy);<br></td></tr
><tr
id=sl_svn4_154

 onmouseover="gutterOver(154)"

><td class="source">				        		double latitude = 0, longitude = 0;<br></td></tr
><tr
id=sl_svn4_155

 onmouseover="gutterOver(155)"

><td class="source">								try{<br></td></tr
><tr
id=sl_svn4_156

 onmouseover="gutterOver(156)"

><td class="source">									latitude = jsonobject.getDouble(&quot;latitude&quot;);<br></td></tr
><tr
id=sl_svn4_157

 onmouseover="gutterOver(157)"

><td class="source">									longitude = jsonobject.getDouble(&quot;longitude&quot;);<br></td></tr
><tr
id=sl_svn4_158

 onmouseover="gutterOver(158)"

><td class="source">								}catch (Exception e) {<br></td></tr
><tr
id=sl_svn4_159

 onmouseover="gutterOver(159)"

><td class="source">									e.printStackTrace();<br></td></tr
><tr
id=sl_svn4_160

 onmouseover="gutterOver(160)"

><td class="source">								}<br></td></tr
><tr
id=sl_svn4_161

 onmouseover="gutterOver(161)"

><td class="source">								Intent map_intent = new Intent(Main.this, Osmmap.class);<br></td></tr
><tr
id=sl_svn4_162

 onmouseover="gutterOver(162)"

><td class="source">								map_intent.putExtra(&quot;latitude&quot;, latitude);<br></td></tr
><tr
id=sl_svn4_163

 onmouseover="gutterOver(163)"

><td class="source">								map_intent.putExtra(&quot;longitude&quot;, longitude);<br></td></tr
><tr
id=sl_svn4_164

 onmouseover="gutterOver(164)"

><td class="source">								startActivity(map_intent);<br></td></tr
><tr
id=sl_svn4_165

 onmouseover="gutterOver(165)"

><td class="source">				        		pd.dismiss();<br></td></tr
><tr
id=sl_svn4_166

 onmouseover="gutterOver(166)"

><td class="source">				        	}<br></td></tr
><tr
id=sl_svn4_167

 onmouseover="gutterOver(167)"

><td class="source">				        });<br></td></tr
><tr
id=sl_svn4_168

 onmouseover="gutterOver(168)"

><td class="source">				    }<br></td></tr
><tr
id=sl_svn4_169

 onmouseover="gutterOver(169)"

><td class="source">				}).start();<br></td></tr
><tr
id=sl_svn4_170

 onmouseover="gutterOver(170)"

><td class="source">			<br></td></tr
><tr
id=sl_svn4_171

 onmouseover="gutterOver(171)"

><td class="source">				}<br></td></tr
><tr
id=sl_svn4_172

 onmouseover="gutterOver(172)"

><td class="source">				else{<br></td></tr
><tr
id=sl_svn4_173

 onmouseover="gutterOver(173)"

><td class="source">					AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);<br></td></tr
><tr
id=sl_svn4_174

 onmouseover="gutterOver(174)"

><td class="source">					builder.setMessage(&quot;You must take a photo!&quot;);<br></td></tr
><tr
id=sl_svn4_175

 onmouseover="gutterOver(175)"

><td class="source">					builder.setCancelable(true);<br></td></tr
><tr
id=sl_svn4_176

 onmouseover="gutterOver(176)"

><td class="source">					builder.setPositiveButton(&quot;Ok&quot;, new DialogInterface.OnClickListener() {<br></td></tr
><tr
id=sl_svn4_177

 onmouseover="gutterOver(177)"

><td class="source">						<br></td></tr
><tr
id=sl_svn4_178

 onmouseover="gutterOver(178)"

><td class="source">						@Override<br></td></tr
><tr
id=sl_svn4_179

 onmouseover="gutterOver(179)"

><td class="source">						public void onClick(DialogInterface dialog, int which) {<br></td></tr
><tr
id=sl_svn4_180

 onmouseover="gutterOver(180)"

><td class="source">							dialog.cancel();							<br></td></tr
><tr
id=sl_svn4_181

 onmouseover="gutterOver(181)"

><td class="source">						}<br></td></tr
><tr
id=sl_svn4_182

 onmouseover="gutterOver(182)"

><td class="source">					});<br></td></tr
><tr
id=sl_svn4_183

 onmouseover="gutterOver(183)"

><td class="source">					builder.show();<br></td></tr
><tr
id=sl_svn4_184

 onmouseover="gutterOver(184)"

><td class="source">				}<br></td></tr
><tr
id=sl_svn4_185

 onmouseover="gutterOver(185)"

><td class="source">									<br></td></tr
><tr
id=sl_svn4_186

 onmouseover="gutterOver(186)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn4_187

 onmouseover="gutterOver(187)"

><td class="source">		});<br></td></tr
><tr
id=sl_svn4_188

 onmouseover="gutterOver(188)"

><td class="source">    }<br></td></tr
><tr
id=sl_svn4_189

 onmouseover="gutterOver(189)"

><td class="source">    <br></td></tr
><tr
id=sl_svn4_190

 onmouseover="gutterOver(190)"

><td class="source">    @Override<br></td></tr
><tr
id=sl_svn4_191

 onmouseover="gutterOver(191)"

><td class="source">    protected void onActivityResult(int requestCode, int resultCode, Intent data) {<br></td></tr
><tr
id=sl_svn4_192

 onmouseover="gutterOver(192)"

><td class="source">    	// TODO Auto-generated method stub<br></td></tr
><tr
id=sl_svn4_193

 onmouseover="gutterOver(193)"

><td class="source">    	super.onActivityResult(requestCode, resultCode, data);<br></td></tr
><tr
id=sl_svn4_194

 onmouseover="gutterOver(194)"

><td class="source">    	switch(requestCode){<br></td></tr
><tr
id=sl_svn4_195

 onmouseover="gutterOver(195)"

><td class="source">    		case(0):{<br></td></tr
><tr
id=sl_svn4_196

 onmouseover="gutterOver(196)"

><td class="source">    			Bitmap btm = (Bitmap) data.getExtras().get(&quot;data&quot;);<br></td></tr
><tr
id=sl_svn4_197

 onmouseover="gutterOver(197)"

><td class="source">    			bm = btm.copy(Bitmap.Config.ARGB_8888, false);<br></td></tr
><tr
id=sl_svn4_198

 onmouseover="gutterOver(198)"

><td class="source">    			iv.setImageBitmap(bm);<br></td></tr
><tr
id=sl_svn4_199

 onmouseover="gutterOver(199)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn4_200

 onmouseover="gutterOver(200)"

><td class="source">    		case(1):{<br></td></tr
><tr
id=sl_svn4_201

 onmouseover="gutterOver(201)"

><td class="source">    			if(resultCode == Activity.RESULT_OK){<br></td></tr
><tr
id=sl_svn4_202

 onmouseover="gutterOver(202)"

><td class="source">    				url = data.getExtras().getString(&quot;url&quot;);<br></td></tr
><tr
id=sl_svn4_203

 onmouseover="gutterOver(203)"

><td class="source">        			size = data.getExtras().getInt(&quot;num&quot;);<br></td></tr
><tr
id=sl_svn4_204

 onmouseover="gutterOver(204)"

><td class="source">    			}<br></td></tr
><tr
id=sl_svn4_205

 onmouseover="gutterOver(205)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn4_206

 onmouseover="gutterOver(206)"

><td class="source">    	}<br></td></tr
><tr
id=sl_svn4_207

 onmouseover="gutterOver(207)"

><td class="source">    }<br></td></tr
><tr
id=sl_svn4_208

 onmouseover="gutterOver(208)"

><td class="source">    <br></td></tr
><tr
id=sl_svn4_209

 onmouseover="gutterOver(209)"

><td class="source">    @Override<br></td></tr
><tr
id=sl_svn4_210

 onmouseover="gutterOver(210)"

><td class="source">    public boolean onCreateOptionsMenu(Menu menu) {<br></td></tr
><tr
id=sl_svn4_211

 onmouseover="gutterOver(211)"

><td class="source">    	MenuInflater inflater = getMenuInflater();<br></td></tr
><tr
id=sl_svn4_212

 onmouseover="gutterOver(212)"

><td class="source">    	inflater.inflate(R.menu.mymenu, menu);<br></td></tr
><tr
id=sl_svn4_213

 onmouseover="gutterOver(213)"

><td class="source">    	return true;<br></td></tr
><tr
id=sl_svn4_214

 onmouseover="gutterOver(214)"

><td class="source">    }<br></td></tr
><tr
id=sl_svn4_215

 onmouseover="gutterOver(215)"

><td class="source">    <br></td></tr
><tr
id=sl_svn4_216

 onmouseover="gutterOver(216)"

><td class="source">    @Override<br></td></tr
><tr
id=sl_svn4_217

 onmouseover="gutterOver(217)"

><td class="source">    public boolean onOptionsItemSelected(MenuItem item) {<br></td></tr
><tr
id=sl_svn4_218

 onmouseover="gutterOver(218)"

><td class="source">    	if(item.getItemId() == R.id.settingsitem){<br></td></tr
><tr
id=sl_svn4_219

 onmouseover="gutterOver(219)"

><td class="source">    		startActivityForResult(new Intent(this, Settings.class), 1);<br></td></tr
><tr
id=sl_svn4_220

 onmouseover="gutterOver(220)"

><td class="source">    	}<br></td></tr
><tr
id=sl_svn4_221

 onmouseover="gutterOver(221)"

><td class="source">    	return super.onOptionsItemSelected(item);<br></td></tr
><tr
id=sl_svn4_222

 onmouseover="gutterOver(222)"

><td class="source">    }<br></td></tr
><tr
id=sl_svn4_223

 onmouseover="gutterOver(223)"

><td class="source"><br></td></tr
><tr
id=sl_svn4_224

 onmouseover="gutterOver(224)"

><td class="source">	@Override<br></td></tr
><tr
id=sl_svn4_225

 onmouseover="gutterOver(225)"

><td class="source">	public void run() {<br></td></tr
><tr
id=sl_svn4_226

 onmouseover="gutterOver(226)"

><td class="source">		// TODO Auto-generated method stub<br></td></tr
><tr
id=sl_svn4_227

 onmouseover="gutterOver(227)"

><td class="source">		<br></td></tr
><tr
id=sl_svn4_228

 onmouseover="gutterOver(228)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn4_229

 onmouseover="gutterOver(229)"

><td class="source">}<br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn4_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn4_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta(this); return false">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta(this); return false">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/landmarkloc/source/detail?spec=svn4&amp;r=2">r2</a>
 by rahulveera2009@gmail.com
 on Mar 29, 2012
 &nbsp; <a href="/p/landmarkloc/source/diff?spec=svn4&r=2&amp;format=side&amp;path=/trunk/Main.java&amp;old_path=/trunk/Main.java&amp;old=">Diff</a>
 </div>
 <pre>Main Activity</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/landmarkloc/source/detail?r=2&spec=svn4';
 var publish_url = '/p/landmarkloc/source/detail?r=2&spec=svn4#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/trunk/Main.java');
 changed_urls.push('/p/landmarkloc/source/browse/trunk/Main.java?r\x3d2\x26spec\x3dsvn4');
 
 var selected_path = '/trunk/Main.java';
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/landmarkloc/source/browse/trunk/Main.java?r=2&amp;spec=svn4"
 selected="selected"
 >/trunk/Main.java</option>
 
 </select>
 </td></tr></table>
 
 
 <div id="review_instr" class="closed">
 <a class="ifOpened" href="/p/landmarkloc/source/detail?r=2&spec=svn4#publish">Publish your comments</a>
 <div class="ifClosed">Double click a line to add a comment</div>
 </div>
 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 <a href="/p/landmarkloc/source/list?path=/trunk/Main.java&start=2">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 7754 bytes,
 229 lines</div>
 
 <div><a href="//landmarkloc.googlecode.com/svn/trunk/Main.java">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>

<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/prettify/prettify.js"></script>
<script type="text/javascript">prettyPrint();</script>


<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/kibbles.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 kibbles.keys.addKeyPressListener('h', toggleComments);
 
 }
 </script>
<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn4': '/trunk/Main.java'}
 codereviews = CR_controller.setup(
 {"assetVersionPath":"http://www.gstatic.com/codesite/ph/16876283342775096309","profileUrl":"/u/101147021809914525860/","projectHomeUrl":"/p/landmarkloc","token":"gYxeKEugEKb2NT3b5qDyGNfywI0:1376910189894","relativeBaseUrl":"","domainName":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","projectName":"landmarkloc","loggedInUserEmail":"rahulveera2009@gmail.com"}, '', 'svn4', paths,
 CR_BrowseIntegrationFactory);
 
 // register our source container with the commenting code
 // in this case we're registering the container and the revison
 // associated with the contianer which may be the primary revision
 // or may be a previous revision against which the primary revision
 // of the file is being compared.
 codereviews.registerSourceContainer(document.getElementById('lines'), 'svn4');
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/ph_core.js"></script>
 
 
 
 
</div> 

<div id="footer" dir="ltr">
 <div class="text">
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>

 
 


 
 </body>
</html>

