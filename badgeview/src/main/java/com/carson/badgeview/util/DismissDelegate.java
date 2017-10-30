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

/**
 * 作者:carson2440 邮件:981385016@qq.com
 * 创建时间:15/7/12 下午6:33
 * 描述:拖动大于BGABadgeViewHelper.mMoveHiddenThreshold后抬起手指徽章消失的代理
 */
public interface DismissDelegate {

    /**
     * 拖动大于BGABadgeViewHelper.mMoveHiddenThreshold后抬起手指徽章消失的回调方法
     *
     * @param badgeable
     */
    void onDismiss(BadgeDragable badgeable);
}