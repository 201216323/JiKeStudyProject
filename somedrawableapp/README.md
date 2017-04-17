# ClipDrawable（裁剪）:

通过裁剪源 Drawable 得到的 Drawable ，进度条是一个使用场景，

通过设置 level 决定裁剪区域大小，，0----10000；


ClipDrawable 的属性 | 说明
---|---
drawable  | 源 Drawable ，也可是  drawable 类型的子标签
clipOriention | 裁剪的方向，horizontal 或者  vertical
gravity | 裁剪的位置，如 left ：图片放于容器左边裁剪方向为 horizontal ，裁掉图片右边部分。其它属性还有：top、bottom、right、center_vertical、fill_vertical、center_horizontal、fill_horizontal、center、fill、clip_vertical、clip_horizontal、start、end



# InsetDrawable 

通过设置源 Drawable 的边距得到的 Drawable ，和 Padding 类似。

Padding 是内容和边框的距离，而 Inset 是背景 Drawable 与边框的距离

InsetDrawable 的属性 | 说明
---|---
drawable  | 源 Drawable ，也可是  drawable 类型的子标签
visible | 初始的可见状态，默认为是 false
insetLeft | 左边距：其它属性还有：insetTop、insetRight、insetBottom、inset（这个在API21以上有用）


# RotateDrawable
设置源 Drawable 的旋转得到的 Drawable

根据 level 控制旋转角度


RotateDrawable 的属性 | 说明
---|---
drawable  | 源 Drawable ，也可是  drawable 类型的子标签
fromDegrees | 起始角度，
toDegrees | 结束角度，正的表示顺时针……
pivotX | 旋转中心 X 坐标，浮点数或是百分比
pivotY | 旋转中心 Y 坐标，
visible | 初始可见性，默认为 false
