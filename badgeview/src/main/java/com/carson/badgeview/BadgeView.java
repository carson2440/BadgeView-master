package com.carson.badgeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.carson.badgeview.util.BadgeDragable;
import com.carson.badgeview.util.BadgeFactory;
import com.carson.badgeview.util.DismissDelegate;

/**
 * 作者:carson2440 邮件:981385016@qq.com
 * 创建时间:16/3/14 上午2:46
 * 描述:这里是继承View,还可以继承自TextView,ImageView,RadioButton,FloatingActionButton .etc
 */
public class BadgeView extends View implements BadgeDragable {
    private BadgeFactory mBadgeViewHeler;

    public BadgeView(Context context) {
        this(context, null);
    }

    public BadgeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BadgeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mBadgeViewHeler = new BadgeFactory(this, context, attrs, BadgeFactory.BadgeGravity.RightTop);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mBadgeViewHeler.onTouchEvent(event);
    }

    @Override
    public boolean callSuperOnTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mBadgeViewHeler.drawBadge(canvas);
    }


    @Override
    public void showBadgePoint() {
        mBadgeViewHeler.showBadgePoint();
    }

    @Override
    public void showBadge(String badgeText) {
        mBadgeViewHeler.showBadge(badgeText);
    }

    @Override
    public void hiddenBadge() {
        mBadgeViewHeler.hiddenBadge();
    }

    @Override
    public void showBadge(Bitmap bitmap) {
        mBadgeViewHeler.showDrawable(bitmap);
    }

    @Override
    public void setDragDismissDelegage(DismissDelegate delegate) {
        mBadgeViewHeler.setDragDismissDelegage(delegate);
    }

    @Override
    public boolean isShowBadge() {
        return mBadgeViewHeler.isShowBadge();
    }

    @Override
    public BadgeFactory getBadgeFactory() {
        return mBadgeViewHeler;
    }
}