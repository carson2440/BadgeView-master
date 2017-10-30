package com.carson.badgeview.sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;

import com.carson.badgeview.BadgeImageView;
import com.carson.badgeview.BadgeView;
import com.carson.badgeview.sample.util.ToastUtil;
import com.carson.badgeview.sample.view.BadgeLinearLayout;
import com.carson.badgeview.sample.view.BadgeTextView;
import com.carson.badgeview.util.BadgeDragable;
import com.carson.badgeview.util.DismissDelegate;

public class MainActivity extends AppCompatActivity {
    private BadgeView badgeView;
    private BadgeImageView badgeImageView;
    private BadgeTextView badgeTextView;
    private BadgeLinearLayout badgeLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToastUtil.init(MainActivity.this);
        setContentView(R.layout.activity_main);
        initView();
        intBadgeView();
    }

    private void initView() {
        badgeView = (BadgeView)findViewById(R.id.badge_view);
        badgeImageView = (BadgeImageView)findViewById(R.id.badge_imageview);
        badgeTextView = (BadgeTextView)findViewById(R.id.badge_textview);
        badgeLinearLayout = (BadgeLinearLayout)findViewById(R.id.badge_linear);
    }

    private void intBadgeView(){
        badgeView.showBadge("1000");
        badgeView.getBadgeFactory().setBadgePaddingDp(5);
        badgeView.getBadgeFactory().setBadgeTextSizeSp(12);
        badgeView.getBadgeFactory().setBadgeHorizontalMarginDp(5);
        badgeView.getBadgeFactory().setBadgeBorderWidthDp(2);
        badgeView.getBadgeFactory().setBadgeBorderColorInt(Color.parseColor("#0000FF"));
//        badgeView.showBadgePoint();
        badgeView.getBadgeFactory().setDragable(true);
        badgeView.setDragDismissDelegage(new DismissDelegate() {
            @Override
            public void onDismiss(BadgeDragable badgeable) {
                ToastUtil.show("数据清除中，请稍后");
            }
        });

        Bitmap avatarBadgeBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.avatar_vip);
        RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(), R.mipmap.avator));
        roundedDrawable.getPaint().setAntiAlias(true);
        roundedDrawable.setCornerRadius(30);
        badgeImageView.setImageDrawable(roundedDrawable);
        badgeImageView.showBadge(avatarBadgeBitmap);
        badgeImageView.getBadgeFactory().setIsResumeTravel(true);


        badgeTextView.setText("hello carson.");
        badgeTextView.showBadgePoint();

        badgeLinearLayout.showBadge("VIP");

    }
}
