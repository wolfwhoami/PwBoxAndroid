package com.pw.box.ui.fragments.setting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pw.box.R;
import com.pw.box.ui.base.BaseFragment;


/**
 * 帮助，功能说明
 * Created by danger on 16/8/28.
 */
public class HelpFragment extends BaseFragment {

    ViewHolder holder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        holder = new ViewHolder(inflater, container);

        return holder.rootView;
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }

    private class ViewHolder {

        View rootView;


        public ViewHolder(LayoutInflater inflater, ViewGroup container) {
            rootView = inflater.inflate(R.layout.fragment_help, container, false);
        }
    }
}
