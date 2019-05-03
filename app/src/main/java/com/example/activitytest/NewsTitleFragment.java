package com.example.activitytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsTitleFragment extends Fragment {
    private NewsAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.news_title_frag,container,false);
        RecyclerView newsTitleRecyclerView = (RecyclerView) view.findViewById(R.id.news_title_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        newsTitleRecyclerView.setLayoutManager(layoutManager);
        NewsAdapter adapter = new NewsAdapter(getNews());
        newsTitleRecyclerView.setAdapter(adapter);
        return view;
    }

    private List<News> getNews(){
        List<News> newsList = new ArrayList<>();
        News news1 = new News();
        news1.setTitle("2016新生QQ群推送" );
        news1.setContent(("2016信工院官方新生群：565107079\n" + "16软件工程1班:479025286\n"+"16软件工程2班:367042955\n"+"16电子信息工程1班：452132365\n"+"16电子信息工程2班：56346339\n"+"16电子信息工程3班：300605984\n"+"16通信工程1班：213964027\n"+"16通信工程2班：323422429\n"+"16通信工程3班：544407577\n"+"16自动化1班：571804010\n"+"16自动化2班：132566962\n"+"16自动化3班：172799067\n"+"16网络工程1班：573572599\n"+"16网络工程2班：557966994\n"+"16计算机科学与技术1班:555373707\n"+"16计算机科学与技术2班:555976969\n"+"2016/8/12"));
        newsList.add(news1);
        News news2 = new News();
        news2.setTitle("2019学年度开学通知" );
        news2.setContent(("2月25号-3月3号为开学预备周。其中，3月号和3号为开学报到日。4号为正式开学日。\n" + "2019/2/20"));
        newsList.add(news2);
        News news3 = new News();
        news3.setTitle("信工学第二十届团委学生会专题研讨会" );
        news3.setContent(("       2019年2月27日上午及下午，与会人员有团委书记文林波老师、学工办文磊老师、学工办黄春晖老师、学工办余虹老师、主席团及各部门部长。\n"+"       本次会议是以小组讨论的形式举行的。第一小组在学工办308开展了围绕“思想引领”、“榜样树立”、“创新意思引导”并结合“五四100周年”特色活动的专题会议。第二小组在学工办322开展了以“学风建设”、“毕业生工作”以及“权益维护”为主题的专题会议。会议伊始，各部门的部长首先做了自我介绍，接着汇报了各自部门在上学期的工作中所遇到的问题，针对各部门所存在的问题，大家集思广益，积极发表自己的观点，并获得一些很好的创新点。下午的三个小组分别由文磊老师、余虹老师和文林波书记主持。第三组于308围绕“文体活动”和“素质拓展”的有效展开及“青年志愿服务”进行了专题研讨;第四组开展了围绕“日常生活工作”及“奖助机制”的专题会议；第五组围绕新学期的宣传推进工作及外部联络进行了专题研讨。除了对部门日常工作的开展进行了讨论外，还对如何做好干事培养及信息文化节的方案进行了重点讨论。会议最后，文林波书记嘱咐大家进一步完善新学期的工作计划。\n" + "2019/3/02"));
        newsList.add(news3);
        for(int i = 1;i<=31;i++){
            if( i == 6 ){
                News news4 = new News();
                news4.setTitle("湘潭大学学校发展愿景" );
                news4.setContent(("发展愿景：到2044年，即湘潭大学复校70周年前后，实现全面建成有鲜明特色的高水平现代大学的目标，一批学科进入世界一流，整体向世界一流大学行列迈进。\n" + "中期目标：到2028年，即湘潭大学建校70周年前后，实现基本建成有鲜明特色的高水平现代大学的目标，若干学科进入世界一流，整体进入国内一流大学行列,综合排名在全国60位左右。\n"+"近期目标：到2020年，是学校改革发展蓄势聚能的阶段，围绕实施“十三五”发展规划，全面深化综合改革，做好打基础、利长远的事情，抓好最基本、最短板的方面，争取获得2011协同创新中心、世界一流学科建设等新的国家发展平台。"));
                newsList.add(news4);
            }else if( i == 13 ){
                News news4 = new News();
                news4.setTitle("第七周班团例会通知" );
                news4.setContent(("文磊老师：\n" + "①关于查课情况通知\n" + "内容：选课及习题课不能缺勤，本周若有原因需交情况说明，若无故则交检讨，若不交则电话通知家长\n" + "②全民考勤\n" + "对象：各班副班长\n" + "内容：发到课情况，到课率将纳入优秀班级评选工作\n" + "截止时间：ÿ周日上午8:00\n" + "③补充：\n" + "对象：副班长\n" + "内容：查课包括课前及课后，学习部于课中考勤，副班长交δ到情况，说明原因\n" + "截止时间：本周五之前\n"+"2016/10/12"));
                newsList.add(news4);
            } else if(i==16){
                News news5 = new News();
                news5.setTitle("学生证补(换)发通知" );
                news5.setContent(("各位班长、团支书：\n" + "       你们好！12月份学生证补（换）发工作已经开始，材料要求如下：\n" + "1.需补办的同学请打印并手写《湘潭大学学生证补（换）发学生证申请表》\n" + "2.需补办的同学请准备5元现金、一寸照（请在背面用铅笔写好班级姓名）一张以及身份证复印件（正反两面） \n" + "3.各班班长于19号（今天）晚八点之前收集好信息填入信息登记表单\n" + "4.请各班班长于12月19日，12月20日18：00~21：00将相关材料收集整理好交至信息工程学院学工办金瀚林8栋310进行验收   \n" + "备注：\n" + "1.国防科大转入学生办理手续同上（第一次办理不需上缴5元）\n" + "2.验收各班材料时，请各班负责人确认材料数量是否与信息登记表相符，若材料数量与信息登记表不符，一律退回，不予验收。\n" + "3.请各班相关人员在规定时间内上交材料，逾期作废。\n" + "信息工程学院学生工作办公室\n" + "2018年12月19日\n" ));
                newsList.add(news5);
            }
            News news = new News();
            news.setTitle("停电停水通知" + i);
            news.setContent(("明天将要停电停水。明天将要停电停水。明天将要停电停水。\n"+"受台风“玉兔”影响，停水时间为2018-11-03 06：30——2018-11-03 20:30。停电时间为2018-11-03 08：00——2018-11-03 18:30。停电停水范围：全校。\n"+"2018-11-"+i));
            newsList.add(news);
        }

        return newsList;
    }

    public void refresh(String title,String content){
        List<News> newsList = new ArrayList<>();
        News news =new News();
        news.setTitle(title);
        news.setContent(content);
        adapter =new NewsAdapter(newsList);
        adapter.notifyDataSetChanged();
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
    class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
        private List<News> mNewsList;
        class ViewHolder extends RecyclerView.ViewHolder{
            TextView newsTitleText;
            public ViewHolder(View view){
                super(view);
                newsTitleText = (TextView) view.findViewById(R.id.news_title);
            }
        }


        public NewsAdapter(List<News> newsList){
            mNewsList = newsList;
        }

        public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
            final  ViewHolder holder = new ViewHolder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    News news = mNewsList.get(holder.getAdapterPosition());

                    NewsContentActivity.actionStart(getActivity(),news.getTitle(),news.getContent());
                }
            });
            return holder;
        }

        public void onBindViewHolder(ViewHolder holder,int position){
            News news = mNewsList.get(position);
            holder.newsTitleText.setText(news.getTitle());
        }
        public int getItemCount(){
            return mNewsList.size();
        }
    }
}
