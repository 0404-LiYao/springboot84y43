<template>
  <div class="content">
    <div class="text main-text"
      >
      欢迎使用 {{ this.$project.projectName }}</div>
    <div class="cardView">
      <div class="cards"
        :style='{ "margin": "20px 0 20px 0", "alignItems": "center", "flexWrap": "wrap", "justifyContent": "center", "display": "flex" }'>
        <div
          :style='{ "width": "400px", "boxShadow": "0 1px 6px rgba(0,0,0,.3)", "margin": "0 10px", "borderRadius": "4px", "display": "flex" }'>
          <div :style='{ "width": "150px", "background": "#A5DDDD", "height": "120px" }'></div>
          <div
            :style='{ "width": "calc(100% - 120px)", "alignItems": "center", "flexDirection": "column", "justifyContent": "center", "display": "flex" }'>
            <div
              :style='{ "margin": "5px 0", "lineHeight": "24px", "fontSize": "15px", "color": "#333", "fontWeight": "bold", "height": "24px" }'>
               {{ count }}</div>
            <div
              :style='{ "margin": "5px 0", "lineHeight": "24px", "fontSize": "15px", "color": "#666", "height": "24px" }'>
              预定信息总数
            </div>
          </div>
        </div>
      </div>

    </div>
    <div style="display: flex;align-items: center;width: 100%;margin-bottom: 10px;">
      <el-card style="width: 33.3%;margin: 0 10px;">
        <div id="ketixinxiChart1" style="width:100%;height:400px;"></div>
      </el-card>
      <el-card style="width: 33.3%;margin: 0 10px;">
        <div id="ketixinxiChart2" style="width:100%;height:400px;"></div>
      </el-card>
      <el-card style="width: 33.3%;margin: 0 10px;">
        <div id="ketixinxiChart3" style="width:100%;height:400px;"></div>
      </el-card>
    </div>
  </div>
</template>
<script>
import router from '@/router/router-static'
export default {
  data() {
    return {
count: 0,
    };
  },
  mounted() {
    this.init();
    this.getketixinxiCount();
    this.ketixinxiChat1();
    this.ketixinxiChat2();
    this.ketixinxiChat3();
  },
  methods: {
    getketixinxiCount() {
      this.$http({
        url: `kaoqintongji/count`,
        method: "get"
      }).then(({
        data
      }) => {
        if (data && data.code == 0) {
     
          this.count = data.data
          console.log(this.count)
        }
      })
    },
    ketixinxiChat1() {
      this.$nextTick(() => {

        var ketixinxiChart1 = this.$echarts.init(document.getElementById("ketixinxiChart1"), 'macarons');//echarts.init(document.getElementById("ketixinxiChart1"),'macarons');
        this.$http({
          url: "kaoqintongji/group/xuehao",
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              xAxis.push(res[i].xuehao);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].xuehao
              })
            }
            var option = {};
            option = {
              title: {
                text: '签到统计',
                left: 'center'
              },
              tooltip: {
                trigger: 'item',
                formatter: '{b} : {c} ({d}%)'
              },
              series: [
                {
                  type: 'pie',
                  radius: '55%',
                  center: ['50%', '60%'],
                  data: pArray,
                  emphasis: {
                    itemStyle: {
                      shadowBlur: 10,
                      shadowOffsetX: 0,
                      shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                  }
                }
              ]
            };
            // 使用刚指定的配置项和数据显示图表。
            ketixinxiChart1.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              ketixinxiChart1.resize();
            };
          }
        });
      })
    },
    ketixinxiChat2() {
      this.$nextTick(() => {
        // ketimingcheng ketimingcheng
        //  renshu

        var ketixinxiChart2 = this.$echarts.init(document.getElementById("ketixinxiChart2"), 'macarons');// echarts.init(document.getElementById("ketixinxiChart2"),'macarons');
        this.$http({
          url: `kaoqintongji/value/xuehao/cishu`,
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              xAxis.push(res[i].xuehao);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].xuehao
              })
            }
            var option = {};
            option = {
              title: {
                text: '签到人数',
                left: 'center'
              },
              tooltip: {
                trigger: 'item',
                formatter: '{b} : {c}'
              },
              xAxis: {
                type: 'category',
                data: xAxis
              },
              yAxis: {
                type: 'value'
              },
              series: [{
                data: yAxis,
                type: 'bar'
              }]
            };
            // 使用刚指定的配置项和数据显示图表。
            ketixinxiChart2.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              ketixinxiChart2.resize();
            };
          }
        });
      })
    },
    ketixinxiChat3() {
      this.$nextTick(() => {

        var ketixinxiChart3 = this.$echarts.init(document.getElementById("ketixinxiChart3"), 'macarons');//echarts.init(document.getElementById("ketixinxiChart3"),'macarons');
        this.$http({
          url: "kaoqintongji/group/jiaoshigonghao",
          method: "get",
        }).then(({ data }) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              xAxis.push(res[i].jiaoshigonghao);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].jiaoshigonghao
              })
            }
            var option = {};
            option = {
              title: {
                text: '教师统计',
                left: 'center'
              },
              tooltip: {
                trigger: 'item',
                formatter: '{b} : {c}'
              },
              xAxis: {
                type: 'category',
                data: xAxis
              },
              yAxis: {
                type: 'value'
              },
              series: [{
                data: yAxis,
                type: 'bar'
              }]
            };
            // 使用刚指定的配置项和数据显示图表。
            ketixinxiChart3.setOption(option);
            //根据窗口的大小变动图表
            window.onresize = function () {
              ketixinxiChart3.resize();
            };
          }
        });
      })
    },
    init() {
      if (this.$storage.get('Token')) {
        this.$http({
          url: `${this.$storage.get('sessionTable')}/session`,
          method: "get"
        }).then(({ data }) => {
          if (data && data.code != 0) {
            router.push({ name: 'login' })
          }
        });
      } else {
        router.push({ name: 'login' })
      }
    }
  }
};
</script>

<style lang="scss" scoped>
.content {
  display: flex;
  align-items: center;
  flex-direction: column;
  width: 100%;
  height: 100%;
  min-height: 500px;
  text-align: center;
  background: transparent;

  .main-text {
    font-size: 28px;
    font-weight: bold;
    margin-top: 0%;
  }

  .text {
    font-size: 24px;
    font-weight: bold;
    color: #333;
  }
}
</style>