
var projectName = '基于vue的木里风景文化管理平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '旅游公告',
	url: './pages/lvyougonggao/list.html'
}, 
{
	name: '景区',
	url: './pages/jingqu/list.html'
}, 
{
	name: '景区商品',
	url: './pages/jingqushangpin/list.html'
}, 
{
	name: '景区美食',
	url: './pages/jingqumeishi/list.html'
}, 
{
	name: '旅游交通工具',
	url: './pages/lvyoujiaotonggongju/list.html'
}, 
{
	name: '红黑榜',
	url: './pages/hongheibang/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssmd4uh5/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"旅游公告","menuJump":"列表","tableName":"lvyougonggao"}],"menu":"旅游公告管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论","购票"],"menu":"景区","menuJump":"列表","tableName":"jingqu"}],"menu":"景区管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"景区商品","menuJump":"列表","tableName":"jingqushangpin"}],"menu":"景区商品管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除","审核","支付","查看评论"],"menu":"门票","menuJump":"列表","tableName":"menpiao"}],"menu":"门票管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","查看评论"],"menu":"景区美食","menuJump":"列表","tableName":"jingqumeishi"}],"menu":"景区美食管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"旅游交通工具","menuJump":"列表","tableName":"lvyoujiaotonggongju"}],"menu":"旅游交通工具管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","查看评论"],"menu":"红黑榜","menuJump":"列表","tableName":"hongheibang"}],"menu":"红黑榜管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","删除"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-link","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"旅游公告列表","menuJump":"列表","tableName":"lvyougonggao"}],"menu":"旅游公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"景区列表","menuJump":"列表","tableName":"jingqu"}],"menu":"景区模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"景区商品列表","menuJump":"列表","tableName":"jingqushangpin"}],"menu":"景区商品模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"景区美食列表","menuJump":"列表","tableName":"jingqumeishi"}],"menu":"景区美食模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"旅游交通工具列表","menuJump":"列表","tableName":"lvyoujiaotonggongju"}],"menu":"旅游交通工具模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"红黑榜列表","menuJump":"列表","tableName":"hongheibang"}],"menu":"红黑榜模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"旅游公告","menuJump":"列表","tableName":"lvyougonggao"}],"menu":"旅游公告管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","购票","查看评论"],"menu":"景区","menuJump":"列表","tableName":"jingqu"}],"menu":"景区管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"景区商品","menuJump":"列表","tableName":"jingqushangpin"}],"menu":"景区商品管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","支付","查看评论"],"menu":"门票","menuJump":"列表","tableName":"menpiao"}],"menu":"门票管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"景区美食","menuJump":"列表","tableName":"jingqumeishi"}],"menu":"景区美食管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"旅游交通工具","menuJump":"列表","tableName":"lvyoujiaotonggongju"}],"menu":"旅游交通工具管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看评论","查看"],"menu":"红黑榜","menuJump":"列表","tableName":"hongheibang"}],"menu":"红黑榜管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"旅游公告列表","menuJump":"列表","tableName":"lvyougonggao"}],"menu":"旅游公告模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"景区列表","menuJump":"列表","tableName":"jingqu"}],"menu":"景区模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"景区商品列表","menuJump":"列表","tableName":"jingqushangpin"}],"menu":"景区商品模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"景区美食列表","menuJump":"列表","tableName":"jingqumeishi"}],"menu":"景区美食模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"旅游交通工具列表","menuJump":"列表","tableName":"lvyoujiaotonggongju"}],"menu":"旅游交通工具模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"红黑榜列表","menuJump":"列表","tableName":"hongheibang"}],"menu":"红黑榜模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
