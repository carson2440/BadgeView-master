/**
 * Copyright 2015 bingoogolapple
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.carson.badgeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.carson.badgeview.util.BadgeDragable;
import com.carson.badgeview.util.BadgeFactory;
import com.carson.badgeview.util.DismissDelegate;

/**
 * 作者:carson2440 邮件:981385016@qq.com
 * 创建时间:15/7/7 14:07
 * 描述:这里继承FrameLayout，还可以继承RelativeLayout,LinearLayout.etc
 */
public class BadgeFrameLayout extends FrameLayout implements BadgeDragable {
    private BadgeFactory mBadgeViewHeler;

    public BadgeFrameLayout(Context context) {
        this(context, null);
    }

    public BadgeFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BadgeFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mBadgeViewHeler = new BadgeFactory(this, context, attrs, BadgeFactory.BadgeGravity.RightCenter);
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