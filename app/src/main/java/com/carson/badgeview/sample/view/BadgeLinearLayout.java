package com.carson.badgeview.sample.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.carson.badgeview.util.BadgeDragable;
import com.carson.badgeview.util.BadgeFactory;
import com.carson.badgeview.util.DismissDelegate;

/**
 * Created by carson on 2017/10/30.
 */

public class BadgeLinearLayout extends LinearLayout implements BadgeDragable {
    private BadgeFactory mBadgeViewHeler;

    public BadgeLinearLayout(Context context) {
        this(context, null);
    }

    public BadgeLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BadgeLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
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
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
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
