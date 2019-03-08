package com.sample.myapplication;

import android.widget.TextView;
import butterknife.BindView;

public class OtherActivity extends BaseActivity {

  @BindView(R.id.textView) TextView mTvText;

  @Override protected int getLayoutResource() {
    return R.layout.activity_other;
  }

  @Override protected void setupUI() {
    mTvText.setText("This is Other text");
  }
}
