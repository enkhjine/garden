$(function(){navigator.userAgent.toLowerCase().match(/iphone|ipad|ipod|opera/)&&$("a").bind("click",function(r){var a=$(r.target).closest("a").attr("href");if(void 0!==a&&!a.match(/^#/)&&""!=a.trim()){var e=$(window).triggerHandler("beforeunload",e);if(e&&""!=e){var t=e+"\n\nPress OK to leave this page or Cancel to stay.";if(!confirm(t))return!1}return window.location.href=a,!1}})});