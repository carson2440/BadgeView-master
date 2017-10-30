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

package com.carson.badgeview.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/**
 * 作者:carson2440 邮件:981385016@qq.com
 * 创建时间:15/7/6 下午10:42
 * 描述:forked from https://github.com/bingoogolapple/BGABadgeView-Android
 */
public interface BadgeDragable {
    /**
     * 显示圆点徽章
     */
    void showBadgePoint();

    /**
     * 显示文字徽章
     *
     * @param text
     */
    void showBadge(String text);


    /**
     * 显示图像徽章
     *
     * @param bitmap
     */
    void showBadge(Bitmap bitmap);

    /**
     * 调用父类的onTouchEvent方法
     *
     * @param event
     * @return
     */
    boolean callSuperOnTouchEvent(MotionEvent event);

    /**
     * 拖动大于BGABadgeViewHelper.mMoveHiddenThreshold后抬起手指徽章消失的代理
     *
     * @param delegate
     */
    void setDragDismissDelegage(DismissDelegate delegate);

    /**
     * 隐藏徽章
     */
    void hiddenBadge();

    /**
     * 是否显示徽章
     *
     * @return
     */
    boolean isShowBadge();

    BadgeFactory getBadgeFactory();

    int getWidth();

    int getHeight();

    void postInvalidate();

    ViewParent getParent();

    int getId();

    boolean getGlobalVisibleRect(Rect r);

    Context getContext();

    View getRootView();
}