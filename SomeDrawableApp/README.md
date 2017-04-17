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

# ScaleDrawable

缩放源 Drawable 得到的 Drawable；

通过 level 控制缩放比率


ScaleDrawable 属性 | 说明
---|---
drawable | 源 drawable
scaleHeight | 高度缩放，用百分比表示，格式为XX%
scaleWidth | 宽度缩放，用百分比表示，格式为XX%
useIntrinsicSizeAsMininum| 设置源 drawable 原有尺寸作为做小尺寸
scaleGravity| 缩放后的位置，如left：图片放于容器左边。其它的属性还有：top、bottom、right、center_vertical、fill_vertical、center_horizontal、fill_horizontal、center、fill、clip_vertical、clip_horizontal、start、end


# BitmapDrawable

是对bitmap的一种包装

可以设置绘制方式，如平铺、拉伸、或者保持图片原始大小

BitmapDrawable 属性 | 说明
---|---
src | 只能是图片，不能是 xml 定义的drawable
gravity | top、bottom…………
antialias | 是否开启抗锯齿
dither | 是否抖动
filter | 对图片进行滤波
tileMode| repeat  mirror  clamp  disable
tint|着色
mipMap | 是否可以使用mipmap ，api>17
tileModeX | api>21
tileModeY |同上
tintMode|api>=21

# NinePatchDrawable

一种特殊的图片格式，图片拉伸不会失真

点九图只能适用于拉伸的情况


NinePatchDrawable 属性 | 说明
---|---
src | 只能是图片，不能是 xml 定义的drawable
gravity | top、bottom…………
antialias | 是否开启抗锯齿
dither | 是否抖动
tileMode|
tint|着色

# PictureDrawable(不常用 pass)

android.graphics.Picture:Picture

不存储实际的像素，仅仅记录了每个绘制的过程

PictureDrawable(Picture picture)
