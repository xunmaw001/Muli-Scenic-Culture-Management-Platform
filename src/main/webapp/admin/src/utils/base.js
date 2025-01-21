const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmd4uh5/",
            name: "ssmd4uh5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmd4uh5/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于vue的木里风景文化管理平台"
        } 
    }
}
export default base
