package com.example.activitytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QueqinTitleFragment extends Fragment {
   private NewsAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.news_title_frag,container,false);
        RecyclerView newsTitleRecyclerView = (RecyclerView) view.findViewById(R.id.news_title_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        newsTitleRecyclerView.setLayoutManager(layoutManager);
        adapter = new NewsAdapter(getNews());
        newsTitleRecyclerView.setAdapter(adapter);
        return view;
    }

    public List<News> getNews(){
        List<News> newsList = new ArrayList<>();
        for(int i = 1;i<25;i++){
            if(i %2 ==0){
                News news = new News();
                news.setTitle("金翰林5栋2019年3月"+i+"日" );
                news.setContent(("        晚上10-11点随机检查宿舍，未在寝室的学生名单如下：\n"+"       106陈臣，311王凯，401王援、403邓小宝、424宋江。\n"+"2019+03-0"+i));
                newsList.add(news);
            }else{
                News news = new News();
                news.setTitle("琴湖18栋2019年3月"+i+"日" );
                news.setContent(("        晚上10-11点随机检查宿舍，未在寝室的学生名单如下：\n"+"       206张三丰，319张恺，521姚敏、603邓小宝、624王源。\n"+"2019+03-0"+i));
                newsList.add(news);
            }
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
