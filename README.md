:heartpulse:BadgeView-Android:heartpulse:
============

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-BadgeView-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/2106)
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)


[![images](https://github.com/carson2440/BadgeView-master/blob/master/app/demo.gif)](https://github.com/carson2440/BadgeView-master)


**demo中演示了:**
* 列表用户头像显示显示右下角vip
* 消息界面用户新消息
* 消息界面订阅号新消息
* 使用v4包中的RoundedBitmapDrawable制作圆角头像
* 拖拽删除

### 爆炸效果参考的 [ExplosionField](https://github.com/tyrantgit/ExplosionField) 改成了只有一个View的情况,只刷新附近的区域


### Gradle依赖

### 目前支持的类

类名 | 应用场景
:----------- | :-----------
BadgeRadioButton | 首页底部导航
BadgeImageView | 列表用户头像
BadgeTextView | 其实这个可以用BadgeCheckedTextView代替
BadgeLinearLayout | 列表item右侧消息条数
BadgeRelativeLayout | 列表item右侧消息条数
BadgeFrameLayout | 列表item右侧消息条数

### 接口说明

```java
/**
 * 显示圆点
 */
void showBadgePoint();

/**
 * 显示文字
 *
 * @param text
 */
void showBadge(String text);

/**
 * 隐藏
 */
void hiddenBadge();

/**
 * 显示图像
 *
 * @param bitmap
 */
void showBadge(Bitmap bitmap);

/**
 * 设置拖动删除的代理
 *
 * @param delegate
 */
void setDismissDelegage(DismissDelegate delegate);

/**
 * 是否显示
 *
 * @return
 */
boolean isShowBadge();
```

### 自定义属性说明

属性名 | 说明 | 默认值
:----------- | :----------- | :-----------
badge_bgColor         | 背景色        | Color.RED
badge_textColor         | 文本的颜色        | Color.WHITE
badge_textSize         | 文本字体大小        | 10sp
badge_verticalMargin         | 背景与宿主控件上下边缘间距离        | 4dp
badge_horizontalMargin         | 背景与宿主控件左右边缘间距离        | 4dp
badge_padding         | 文本边缘与背景边缘间的距离        | 4dp
badge_gravity         | 在宿主控件中的位置        | BadgeImageView和BadgeRadioButton是右上方，其他控件是右边垂直居中
badge_dragable         | 是否开启拖拽删除        | false
badge_isResumeTravel         | 拖拽超出轨迹范围后，再次放回到轨迹范围时，是否恢复轨迹        | false
badge_borderWidth         | 描边宽度        | 0dp
badge_borderColor         | 描边颜色        | Color.WHITE
badge_dragExtra         | 触发开始拖拽事件的扩展触摸距离        | 4dp

### 扩展自己的BadgeView

继承特定的控件，实现[BadgeDragable]()接口中相应的方法，并调用[BadgeFactory]()中相应的方法，自定义控件实现方式请参考[BadgeRadioButton]()，自定义组合控件实现方式请参考[BadgeLinearLayout]()

## 关于我

| 个人主页 | 邮箱 | 
| ------------- | ------------ |
| <a  href="http://blog.csdn.net/carson2440" target="_blank">http://blog.csdn.net/carson2440</a>  | <a href="mailto:981385016@qq.com" target="_blank">981385016@qq.com</a> |

## License

    Copyright 2017 carson2440

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
