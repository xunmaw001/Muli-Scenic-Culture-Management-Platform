import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jingqu from '@/views/modules/jingqu/list'
    import lvyoujiaotonggongju from '@/views/modules/lvyoujiaotonggongju/list'
    import discussmenpiao from '@/views/modules/discussmenpiao/list'
    import discusshongheibang from '@/views/modules/discusshongheibang/list'
    import storeup from '@/views/modules/storeup/list'
    import lvyougonggao from '@/views/modules/lvyougonggao/list'
    import discussjingqumeishi from '@/views/modules/discussjingqumeishi/list'
    import jingqumeishi from '@/views/modules/jingqumeishi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjingqu from '@/views/modules/discussjingqu/list'
    import orders from '@/views/modules/orders/list'
    import hongheibang from '@/views/modules/hongheibang/list'
    import jingqushangpin from '@/views/modules/jingqushangpin/list'
    import config from '@/views/modules/config/list'
    import menpiao from '@/views/modules/menpiao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jingqu',
        name: '景区',
        component: jingqu
      }
      ,{
	path: '/lvyoujiaotonggongju',
        name: '旅游交通工具',
        component: lvyoujiaotonggongju
      }
      ,{
	path: '/discussmenpiao',
        name: '门票评论',
        component: discussmenpiao
      }
      ,{
	path: '/discusshongheibang',
        name: '红黑榜评论',
        component: discusshongheibang
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/lvyougonggao',
        name: '旅游公告',
        component: lvyougonggao
      }
      ,{
	path: '/discussjingqumeishi',
        name: '景区美食评论',
        component: discussjingqumeishi
      }
      ,{
	path: '/jingqumeishi',
        name: '景区美食',
        component: jingqumeishi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussjingqu',
        name: '景区评论',
        component: discussjingqu
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/hongheibang',
        name: '红黑榜',
        component: hongheibang
      }
      ,{
	path: '/jingqushangpin',
        name: '景区商品',
        component: jingqushangpin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/menpiao',
        name: '门票',
        component: menpiao
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
