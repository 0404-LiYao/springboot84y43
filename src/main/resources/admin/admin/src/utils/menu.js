const menu = {
  list() {
    return [
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-goods",
                buttons: ["新增", "查看", "修改", "删除", "统计考勤"],
                menu: "学生",
                menuJump: "列表",
                tableName: "xuesheng",
              },
            ],
            menu: "学生管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-vip",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "教师",
                menuJump: "列表",
                tableName: "jiaoshi",
              },
            ],
            menu: "教师管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-copy",
                buttons: ["新增", "查看", "修改", "删除", "排课程表"],
                menu: "班级信息",
                menuJump: "列表",
                tableName: "banjixinxi",
              },
            ],
            menu: "班级信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: ["新增","查看", "修改", "删除"],
                menu: "课程信息",
                menuJump: "列表",
                tableName: "kechengxinxi",
              },
            ],
            menu: "课程信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["查看", "修改", "删除"],
                menu: "签到信息",
                menuJump: "列表",
                tableName: "qiandaoxinxi",
              },
            ],
            menu: "签到信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-camera",
                buttons: ["查看", "修改", "删除"],
                menu: "考勤信息",
                menuJump: "列表",
                tableName: "kaoqinxinxi",
              },
            ],
            menu: "考勤信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-shop",
                buttons: ["查看", "修改", "删除"],
                menu: "请假信息",
                menuJump: "列表",
                tableName: "qingjiaxinxi",
              },
            ],
            menu: "请假信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: ["查看", "修改", "删除", "报表"],
                menu: "考勤统计",
                menuJump: "列表",
                tableName: "kaoqintongji",
              },
            ],
            menu: "考勤统计管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "管理员",
        tableName: "users",
      },
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-copy",
                buttons: ["查看"],
                menu: "班级信息",
                menuJump: "列表",
                tableName: "banjixinxi",
              },
            ],
            menu: "班级信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: ["查看", "签到", "请假"],
                menu: "课程信息",
                menuJump: "列表",
                tableName: "kechengxinxi",
              },
            ],
            menu: "课程信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["查看", "签到", "请假"],
                menu: "签到信息",
                menuJump: "列表",
                tableName: "qiandaoxinxi",
              },
            ],
            menu: "签到信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-camera",
                buttons: ["查看"],
                menu: "考勤信息",
                menuJump: "列表",
                tableName: "kaoqinxinxi",
              },
            ],
            menu: "考勤信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-shop",
                buttons: ["查看"],
                menu: "请假信息",
                menuJump: "列表",
                tableName: "qingjiaxinxi",
              },
            ],
            menu: "请假信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: ["查看", "报表"],
                menu: "考勤统计",
                menuJump: "列表",
                tableName: "kaoqintongji",
              },
            ],
            menu: "考勤统计管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "学生",
        tableName: "xuesheng",
      },
      {
        backMenu: [
          {
            child: [
              {
                appFrontIcon: "cuIcon-goods",
                buttons: ["查看", "统计考勤"],
                menu: "学生",
                menuJump: "列表",
                tableName: "xuesheng",
              },
            ],
            menu: "学生管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-copy",
                buttons: ["查看"],
                menu: "班级信息",
                menuJump: "列表",
                tableName: "banjixinxi",
              },
            ],
            menu: "班级信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: [ "查看", "发起签到"],
                menu: "课程信息",
                menuJump: "列表",
                tableName: "kechengxinxi",
              },
            ],
            menu: "课程信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["查看", "删除"],
                menu: "签到信息",
                menuJump: "列表",
                tableName: "qiandaoxinxi",
              },
            ],
            menu: "签到信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-camera",
                buttons: ["查看"],
                menu: "考勤信息",
                menuJump: "列表",
                tableName: "kaoqinxinxi",
              },
            ],
            menu: "考勤信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-shop",
                buttons: ["查看", "审核"],
                menu: "请假信息",
                menuJump: "列表",
                tableName: "qingjiaxinxi",
              },
            ],
            menu: "请假信息管理",
          },
          {
            child: [
              {
                appFrontIcon: "cuIcon-paint",
                buttons: ["查看", "报表", "删除"],
                menu: "考勤统计",
                menuJump: "列表",
                tableName: "kaoqintongji",
              },
            ],
            menu: "考勤统计管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "教师",
        tableName: "jiaoshi",
      },
    ];
  },
};
export default menu;
