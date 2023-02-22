// LocalStorage keys
export const TOKEN_OBJECT_KEY = "TokenObject";
export const TOKEN_KEY = "Token";
// 站点相关信息

// SideBar 测试数据
export const user = [
	
	{
		title: "个人中心",
		path: "/user",
		icon: "el-icon-user-solid",
		subItems: [
			{
				title: "个人详情",
				path: "/user/Setting",
			},
			{
				title: "个人设置",
				path: "/user/update"
			},
		],
	},
	{
		title: "动漫管理",
		path: "/history",
		icon: "el-icon-user-solid",
		subItems: [
			{
				title: "点赞",
				path: "/comic/like",
			},
			{
				title: "浏览记录",
				path: "/comic/record",
			}
		]
	}
	
];
export const permission = [
	
	{
		title: "管理员",
		path: "/permission",
		icon: "el-icon-user-solid",
		subItems: [
			{
				title: "用户管理",
				path: "/permission/user",
			},
			{
				title: "动漫管理",
				path: "/permission/comic"
			},
		],
	}
	
	
];

